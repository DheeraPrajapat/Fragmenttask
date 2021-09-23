package com.example.fragmenttask.GroupTab;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class GroupPageAdapter extends FragmentStatePagerAdapter
{
    int tabs;
    public GroupPageAdapter(@NonNull FragmentManager fm,int tabs) {
        super(fm);
        this.tabs=tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new GroupTab1();
            case 1:
                return new GroupTab2();
            case 2:
                return new GroupTab3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabs;
    }
}
