package com.example.myownonlinesongapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class NehaFragmentSongs extends Fragment {



    public NehaFragmentSongs() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



      return inflater.inflate(R.layout.fragment_neha_fragment_songs,container,false);



}


}
