package com.example.youngjasmine.transitionanimation.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.youngjasmine.transitionanimation.R;
import com.example.youngjasmine.transitionanimation.fragments.SupportFragment;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View v){

        SupportFragment fragment = new SupportFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.setCustomAnimations(R.anim.activity_open_enter,
                R.anim.activity_open_exit,
                R.anim.activity_close_enter,
                R.anim.activity_close_exit);
        ft.replace(R.id.container_fragment, fragment);
        ft.addToBackStack(null);
        ft.commit();


        //Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        //startActivity(intent);

        //overridePendingTransition(R.anim.activity_open_enter, R.anim.activity_open_exit);

        //finish();
        //overridePendingTransition(R.anim.activity_close_enter,R.anim.activity_close_exit);
    }
}
