package com.example.myownonlinesongapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;


/**
 * A simple {@link Fragment} subclass.
 */
public class ArijitFragSongs extends Fragment {

    View view;

    public ArijitFragSongs() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_arijit_frag_songs, container,false);

        return view;
    }



    }

