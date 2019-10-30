package com.example.thebest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DetailsActivity extends AppCompatActivity {



     private TextView tvtitle,tvdescription,tvprice;
    private ImageView img;

    ElegantNumberButton numberButton;
    Button add_to_order;


    FirebaseDatabase database;
    DatabaseReference item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //firebase

        database=FirebaseDatabase.getInstance();
        item=database.getReference("Item");


        tvtitle = (TextView) findViewById(R.id.detail_movie_title);
        tvdescription = (TextView) findViewById(R.id.detail_movie_desc);
        tvprice = (TextView) findViewById(R.id.detail_movie_price);
        img = (ImageView) findViewById(R.id.detail_movie_cover);



        numberButton=findViewById(R.id.number_button);
        add_to_order=findViewById(R.id.addTOorder);

        add_to_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        // Recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String price = intent.getExtras().getString("price");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("img") ;

        // Setting values

        tvtitle.setText(Title);
        tvdescription.setText(Description);
        img.setImageResource(image);
        tvprice.setText(price);


    }
    }
