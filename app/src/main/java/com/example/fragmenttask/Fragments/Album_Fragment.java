package com.example.fragmenttask.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.fragmenttask.AlbumTab.AlbumPageAdapter;
import com.example.fragmenttask.R;
import com.google.android.material.tabs.TabLayout;

public class Album_Fragment extends Fragment {
    TabLayout albumTablayout;
    ViewPager albumViewPager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_album_, container, false);
        initView(view);
        albumTablayout.addTab(albumTablayout.newTab().setText("Album 1"));
        albumTablayout.addTab(albumTablayout.newTab().setText("Album 2"));
        albumTablayout.addTab(albumTablayout.newTab().setText("Album 3"));
        albumTablayout.setTabGravity(TabLayout.GRAVITY_FILL);

        AlbumPageAdapter albumPageAdapter=new AlbumPageAdapter(getFragmentManager(),albumTablayout.getTabCount());
        albumViewPager.setAdapter(albumPageAdapter);
        albumViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(albumTablayout));
        albumTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                albumViewPager.setCurrentItem(tab.getPosition());
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

    private void initView(View view) {
        albumTablayout=view.findViewById(R.id.tabLayout3);
        albumViewPager=view.findViewById(R.id.Viewpager3);
    }
}