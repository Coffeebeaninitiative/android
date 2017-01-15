package com.coffeebean.slide.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by steven on 2016-12-23.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences prefs = getSharedPreferences("login", Context.MODE_PRIVATE);
        Log.d("splash", "here");
        Intent intent = new Intent();
        if(prefs.getBoolean("logged", false)){
            intent.setClass(this, MainActivity.class);
        }else {
            intent.setClass(this, LoginActivity.class);
        }
        startActivity(intent);
        finish();
    }
}
