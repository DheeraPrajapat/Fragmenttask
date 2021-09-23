package com.example.fragmenttask.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmenttask.HomeTab.HomePageAdapter;
import com.example.fragmenttask.R;
import com.google.android.material.tabs.TabLayout;

public class Home_Fragment extends Fragment {
    TabLayout homeTablayout;
    ViewPager homeViewPager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home_, container, false);
        homeTablayout=view.findViewById(R.id.tabLayout1);
        homeViewPager=view.findViewById(R.id.pager1);

        homeTablayout.addTab(homeTablayout.newTab().setText("Home 1"));
        homeTablayout.addTab(homeTablayout.newTab().setText("Home 2"));
        homeTablayout.addTab(homeTablayout.newTab().setText("Home 3"));
        homeTablayout.setTabGravity(TabLayout.GRAVITY_FILL);

        HomePageAdapter homePageAdapter=new HomePageAdapter(getFragmentManager(),homeTablayout.getTabCount());
        homeViewPager.setAdapter(homePageAdapter);
        homeViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(homeTablayout));
        homeTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                homeViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;
    }
}