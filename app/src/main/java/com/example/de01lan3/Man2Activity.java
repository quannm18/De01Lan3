package com.example.de01lan3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.de01lan3.adapter.PageTabAdapter;
import com.google.android.material.tabs.TabLayout;

public class Man2Activity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager vpMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man2);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        vpMain = (ViewPager) findViewById(R.id.vpMain);


        PageTabAdapter pta = new PageTabAdapter(getSupportFragmentManager());

        vpMain.setAdapter(pta);
        tabLayout.setupWithViewPager(vpMain);
    }
}