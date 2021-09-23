package com.example.fragmenttask.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmenttask.R;
import com.google.android.material.tabs.TabLayout;

public class Group_Fragment extends Fragment {
    TabLayout groupTablayout;
    ViewPager groupViewPager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_group_, container, false);
        groupTablayout=view.findViewById(R.id.tabLayout2);
        groupViewPager=view.findViewById(R.id.pager2);

        groupTablayout.addTab(groupTablayout.newTab().setText("Group1"));
        groupTablayout.addTab(groupTablayout.newTab().setText("Group2"));
        groupTablayout.addTab(groupTablayout.newTab().setText("Group3"));

        return view;
    }
}