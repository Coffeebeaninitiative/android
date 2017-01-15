package com.coffeebean.slide.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.coffeebean.slide.R;
import com.coffeebean.slide.ui.fragment.FeedFragment;
import com.coffeebean.slide.ui.fragment.LogFragment;
import com.coffeebean.slide.ui.fragment.MessageFragment;
import com.coffeebean.slide.ui.fragment.ProfileFragment;
import com.coffeebean.slide.ui.fragment.TripFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener{

    private int tabPosition = 0;
    private FragmentManager fragmentManager;


    @Bind(R.id.tab_layout)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Log.d("main", "here");
        fragmentManager = getSupportFragmentManager();
        this.tabLayout.setOnTabSelectedListener(this);
        changeTabs(0);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        tabPosition = tab.getPosition();
        //tabHost.getTabWidget().getChildAt(tabPosition).setBackgroundColor(Color.WHITE);
        changeTabs(tabPosition);
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    private void changeTabs(int position){
        tabLayout.getTabAt(position).select();
        //hideFragments(false);
        switch (position){
            case 0: //feed
                fragmentManager.beginTransaction().replace(R.id.fragment_container, new FeedFragment()).commitAllowingStateLoss();
                break;
            case 1: // log
                fragmentManager.beginTransaction().replace(R.id.fragment_container, new LogFragment()).commitAllowingStateLoss();
                break;
            case 2: // trip
                fragmentManager.beginTransaction().replace(R.id.fragment_container, new TripFragment()).commitAllowingStateLoss();
                break;
            case 3: // messages
                fragmentManager.beginTransaction().replace(R.id.fragment_container, new MessageFragment()).commitAllowingStateLoss();
                break;
            case 4: // profile
                fragmentManager.beginTransaction().replace(R.id.fragment_container, new ProfileFragment()).commitAllowingStateLoss();
        }
    }
}
