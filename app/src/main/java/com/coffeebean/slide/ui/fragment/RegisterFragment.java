package com.coffeebean.slide.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coffeebean.slide.R;
import com.coffeebean.slide.ui.activity.MainActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by steven on 2016-12-23.
 */

public class RegisterFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.bt_sign_in)
    public void onSignInClicked(){
        if(getActivity() != null){
            SharedPreferences prefs = getActivity().getSharedPreferences("login", Context.MODE_PRIVATE);
            prefs.edit().putBoolean("logged", true).apply();
            Intent intent = new Intent(getContext(), MainActivity.class);
            startActivity(intent);
            getActivity().finish();
        }
    }
}
