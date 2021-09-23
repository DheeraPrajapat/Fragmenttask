package com.example.fragmenttask.AlbumTab;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class AlbumPageAdapter extends FragmentPagerAdapter {
    int tabs;

    public AlbumPageAdapter(@NonNull FragmentManager fm,int tabs) {
        super(fm);
        this.tabs=tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new AlbumTab1();
            case 1:
                return new AlbumTab2();
            case 2:
                return new AlbumTab3();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs;
    }
}
