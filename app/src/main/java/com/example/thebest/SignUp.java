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

public class SignUp extends AppCompatActivity implements View.OnClickListener {

    private Button buttonSignUp;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editText_name;
    private EditText editText_phone;
    private TextView textViewSignin;

    private ProgressDialog  progressDialog;

    private FirebaseAuth firebaseAuth;

    private DatabaseReference mDatabase;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        firebaseAuth=FirebaseAuth.getInstance();
        mDatabase=FirebaseDatabase.getInstance().getReference("Users");

        progressDialog=new ProgressDialog(this);

        buttonSignUp=findViewById(R.id.buttonSignUp);

        editTextEmail=findViewById(R.id.editTextemail);
        editTextPassword=findViewById(R.id.editTextpassword);
        editText_name=findViewById(R.id.editText_Name);
        editText_phone=findViewById(R.id.editText_phone);


        textViewSignin=findViewById(R.id.textsignin);


        buttonSignUp.setOnClickListener(this);
        textViewSignin.setOnClickListener(this);
    }




    private void  registerUser(){
        final String name=editText_name.getText().toString().trim();
        final String phone=editText_phone.getText().toString().trim();
        final String email=editTextEmail.getText().toString().trim();
        final String password=editTextPassword.getText().toString().trim();

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

        firebaseAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            String id=mDatabase.push().getKey();

                            mDatabase.child(id).child("name").setValue(name);
                            mDatabase.child(id).child("Email").setValue(email);
                            mDatabase.child(id).child("Phone").setValue(phone);
                            mDatabase.child(id).child("password").setValue(password);

                            Toast.makeText(SignUp.this, "Welcom im My App", Toast.LENGTH_SHORT).show();

                            startActivity(new Intent(getApplicationContext(),MainActivity.class));

                        }
                        else{
                            Toast.makeText(SignUp.this, "Fail ", Toast.LENGTH_SHORT).show();

                        }
                        progressDialog.cancel();
                    }
                });
    }


    @Override
    public void onClick(View view) {

        if(view==buttonSignUp){
            registerUser();
        }
        if(view==textViewSignin){

            startActivity(new Intent(this,SignIn.class));
        }

    }

}
