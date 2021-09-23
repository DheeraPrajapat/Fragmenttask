package com.example.fragmenttask.DriveTab;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class DrivePageAdapter extends FragmentStatePagerAdapter
{
    int tabs;

    public DrivePageAdapter(@NonNull FragmentManager fm, int tabs) {
        super(fm);
        this.tabs = tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new DriveTab1();
            case 1:
                return new DriveTab2();
            case 2:
                return new DriveTab3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}
