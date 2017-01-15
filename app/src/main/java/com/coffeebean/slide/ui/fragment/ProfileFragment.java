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
import com.coffeebean.slide.ui.activity.LoginActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by steven on 2016-12-23.
 */

public class ProfileFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.tv_logout)
    public void onLogoutClicked(){
        SharedPreferences prefs = getActivity().getSharedPreferences("login", Context.MODE_PRIVATE);
        prefs.edit().putBoolean("logged", false).apply();
        Intent intent = new Intent(getContext(), LoginActivity.class);
        getActivity().startActivity(intent);
        getActivity().finish();
    }
}
