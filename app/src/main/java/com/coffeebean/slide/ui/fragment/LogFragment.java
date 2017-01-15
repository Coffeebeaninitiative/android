package com.coffeebean.slide.ui.fragment;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coffeebean.slide.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by steven on 2016-12-23.
 */

public class LogFragment extends Fragment {

    @Bind(R.id.viewPager)
    public ViewPager viewPager;

    @Bind(R.id.top_tabs)
    TabLayout tabLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_feed, container, false);
        ButterKnife.bind(this, view);
        Log.d("FEED", "here");
        FeedViewPager pageAdapter = new FeedViewPager(getChildFragmentManager());
        this.tabLayout.setupWithViewPager(this.viewPager);
        this.viewPager.setAdapter(pageAdapter);
        ColorStateList colors = getResources().getColorStateList(R.color.color);
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            Drawable icon = tab.getIcon();
            if (icon != null) {
                icon = DrawableCompat.wrap(icon);
                DrawableCompat.setTintList(icon, colors);
            }
        }

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int pos) {
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });
        return view;
    }

    /**
     * FragmentPagerAdapter
     */
    private static class FeedViewPager extends FragmentPagerAdapter {

        FeedViewPager(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new LogGeneralFragment();
                case 1:
                    return new LogHistoryFragment();
                default:
                    return new LogGeneralFragment();
            }
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public int getItemPosition(Object object) {
            return super.getItemPosition(object);
        }
    }
}
