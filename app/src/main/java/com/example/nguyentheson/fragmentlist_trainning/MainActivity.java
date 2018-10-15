package com.example.nguyentheson.fragmentlist_trainning;

import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    int displaymode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        displaymode = getResources().getConfiguration().orientation;
        if(displaymode == 1) {
            setContentView(R.layout.activity_main);
        } else {
            setContentView(R.layout.activity_main_land);
        }



        fragment = new Fragment_StudentList();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.ll_first_container, fragment);
        fragmentTransaction.commit();

    }

    @Override
    public void onBackPressed() {

        if(displaymode == 1 && !fragment.isVisible()){
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.ll_first_container, fragment);
            fragmentTransaction.commit();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(!fragmentManager.findFragmentById(R.id.ll_second_container).isVisible()){
            Toast.makeText(MainActivity.this,"visible", Toast.LENGTH_LONG);
        }
    }
}
