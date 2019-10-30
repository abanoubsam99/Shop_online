package com.example.thebest;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, NavigationView.OnNavigationItemSelectedListener  {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Toolbar toolbar = findViewById( R.id.toolbar2 );
        setSupportActionBar( toolbar );


       FragmentTransaction Transaction = getSupportFragmentManager().beginTransaction();
       Home_fragment Fregment = new Home_fragment();
       Transaction.add( R.id.fram_t1, Fregment );
       Transaction.commit();

        DrawerLayout drawerLayout = findViewById( R.id.drawer );

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle( this, drawerLayout, toolbar, R.string.open, R.string.close );
        drawerLayout.addDrawerListener( actionBarDrawerToggle );

        actionBarDrawerToggle.syncState();

        NavigationView navigationView = findViewById( R.id.nav );
        navigationView.setNavigationItemSelectedListener(this);





    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawerLayout = findViewById( R.id.drawer);
        if (drawerLayout.isDrawerOpen( GravityCompat.START )) {
            drawerLayout.closeDrawer( GravityCompat.START );
        } else {

            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        Fragment fragment = null;
        Intent intent = null;

        if (itemId == R.id.t13)
        {   fragment=new Home_fragment();

        } else if (itemId == R.id.t1) {
            fragment=new T1();

        } else if (itemId == R.id.t2) {
           fragment=new T2();

        } else if (itemId == R.id.t3) {
            fragment=new T3();

        } else if (itemId == R.id.t4) {
            fragment=new T4();

        } else if(itemId==R.id.t5){
          fragment=new T5();

        }
     else if(itemId==R.id.t6){
        fragment=new T6();

    }

        else if(itemId==R.id.t7){
            fragment=new T7();

        }
        else if(itemId==R.id.t8){
          fragment=new T8();

        }
        else if(itemId==R.id.t9){
            fragment=new T9();

        }
        else{
            fragment=new T10();
        }



        if (fragment != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace( R.id.fram_t1, fragment );
            transaction.commit();


        } else {
            startActivity( intent );
        }
        DrawerLayout drawerLayout= findViewById( R.id.drawer );
        drawerLayout.closeDrawer( GravityCompat.START );
        return true;
    }


    public  static Intent openfacebook(String id){

        try {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/"+id));

        }
        catch (Exception e){
            return new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/"+id));

        }

    }



    }

