package com.example.myownonlinesongapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class TabAdapter extends FragmentPagerAdapter {


    public TabAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    private String[] titles = {"ARIJIT,KAKKAR,BADSHAH"};

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ArijitFragSongs();


            case 1:
                return new NehaFragmentSongs();


            case 2:
                return new BadshahFragSongs();

                default:
                    return null;



        }

    }

    @Override
    public int getCount() {
        return 3;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "ARIJIT'S";

            case 1:
                return "NEHA'S";

            case 2:
                return "BADSHAH'S'";

                default:
                    return null;
        }

    }
}
