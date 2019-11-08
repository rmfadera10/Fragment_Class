package com.letstravel.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import adapter.ViewPagerAdapter;
import fragment.FirstFragment;
import fragment.SecondFragment;

public class ViewPagerActivity extends AppCompatActivity {
private TabLayout tabLayout;
private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        tabLayout=(TabLayout)findViewById(R.id.tabId);
        viewPager=(ViewPager)findViewById(R.id.viewPager);

        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new FirstFragment(),"Sum");
        viewPagerAdapter.addFragment(new SecondFragment(),"Area of Circle");


        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
