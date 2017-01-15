package com.coffeebean.slide.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.coffeebean.slide.R;
import com.coffeebean.slide.ui.fragment.LoginFragment;

/**
 * Created by steven on 2016-12-23.
 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_container);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new LoginFragment()).commitAllowingStateLoss();
    }

}
