package com.happycoding.feednews;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.NotNull;

public class PagerAdapter extends FragmentPagerAdapter {


    int tabcount;

    public PagerAdapter(@NonNull @NotNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new HomeFragment();
            case 1:
                return new SportsFragment();
            case 2:
                return new ScienceFragment();
            case 3:
                return new EntertainmentFragment();
            case 4:
                return new BusinessFragment();
            case 5:
                return new HealthFragment();


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
