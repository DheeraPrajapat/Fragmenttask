package com.example.fragmenttask.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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


        return view;
    }
}