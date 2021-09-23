package com.example.fragmenttask.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmenttask.GroupTab.GroupPageAdapter;
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

        GroupPageAdapter groupPageAdapter=new GroupPageAdapter(getFragmentManager(),groupTablayout.getTabCount());
        groupViewPager.setAdapter(groupPageAdapter);
        groupViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(groupTablayout));
        groupTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                groupViewPager.setCurrentItem(tab.getPosition());
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