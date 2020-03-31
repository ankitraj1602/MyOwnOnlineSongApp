package com.example.myownonlinesongapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.parse.Parse;
import com.parse.ParseObject;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ParseObject myFirstClass = new ParseObject("MyFirstClass");
        myFirstClass.put("name", "I'm able to save objects!");
        myFirstClass.saveInBackground();

        mTabLayout= findViewById(R.id.tabLayout);
        mViewPager = findViewById(R.id.viewPager);


        TabAdapter tabAdapter = new TabAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(tabAdapter);
        mTabLayout.setupWithViewPager(mViewPager,true);
    }
}
