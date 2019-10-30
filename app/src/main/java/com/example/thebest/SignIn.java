package com.example.thebest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SignIn extends AppCompatActivity implements View.OnClickListener {

    private Button buttonsignIn;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private TextView textViewSignUp;

    private ProgressDialog progressDialog;


    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);



        firebaseAuth=FirebaseAuth.getInstance();

        if(firebaseAuth.getCurrentUser()!=null){
            // Start the profile
            finish();
            startActivity(new Intent(getApplicationContext(),MainActivity.class));


        }

        progressDialog=new ProgressDialog(this);


        buttonsignIn=findViewById(R.id.buttonSignin);
        editTextEmail=findViewById(R.id.editTextemail);
        editTextPassword=findViewById(R.id.editTextpassword);
        textViewSignUp=findViewById(R.id.textsignup);


        buttonsignIn.setOnClickListener(this);
        textViewSignUp.setOnClickListener(this);
    }


    private void  Userlogin(){
        String email=editTextEmail.getText().toString().trim();
        String password=editTextPassword.getText().toString().trim();


        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "Pleas enter email", Toast.LENGTH_SHORT).show();

            return;
        }

        if(TextUtils.isEmpty(password)){
            Toast.makeText(this, "Pleas enter password", Toast.LENGTH_SHORT).show();
            return;

        }

        progressDialog.setMessage("Registering User...");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        progressDialog.dismiss();

                        if(task.isSuccessful()){
                            // Start the profile
                            finish();
                            startActivity(new Intent(getApplicationContext(),MainActivity.class));

                        }

                        if(task.isSuccessful()==false){

                            Toast.makeText(SignIn.this, "Yor Email or Password False Try again", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }


    @Override
    public void onClick(View view) {

        if(view==buttonsignIn){
            Userlogin();
        }
        if(view==textViewSignUp){
            finish();
            startActivity(new Intent(this,SignUp.class));
        }



    }
}
