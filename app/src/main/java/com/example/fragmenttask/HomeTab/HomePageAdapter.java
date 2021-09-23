package com.example.fragmenttask.HomeTab;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class HomePageAdapter extends FragmentStatePagerAdapter {
    int tabs;
    public HomePageAdapter(@NonNull FragmentManager fm, int tabs) {
        super(fm);
        this.tabs=tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return new HomeTab1();
            case 1:
                return new HomeTab2();
            case 2:
                return new HomeTab3();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return tabs;
    }
}
