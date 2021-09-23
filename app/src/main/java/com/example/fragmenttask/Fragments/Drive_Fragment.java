package com.example.fragmenttask.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmenttask.R;
import com.google.android.material.tabs.TabLayout;

public class Drive_Fragment extends Fragment {
    TabLayout driveTabLayout;
    ViewPager driveViewPager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_drive_, container, false);
        driveTabLayout=view.findViewById(R.id.tabLayout4);
        driveViewPager=view.findViewById(R.id.pager4);

        driveTabLayout.addTab(driveTabLayout.newTab().setText("Drive1"));
        driveTabLayout.addTab(driveTabLayout.newTab().setText("Drive2"));
        driveTabLayout.addTab(driveTabLayout.newTab().setText("Drive3"));
        return view;
    }
}