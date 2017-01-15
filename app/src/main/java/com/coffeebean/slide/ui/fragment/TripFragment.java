package com.coffeebean.slide.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coffeebean.slide.R;

import butterknife.ButterKnife;

/**
 * Created by steven on 2016-12-23.
 */

public class TripFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_current_location, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
