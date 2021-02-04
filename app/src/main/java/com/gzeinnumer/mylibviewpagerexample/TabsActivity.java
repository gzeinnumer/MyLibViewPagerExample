package com.gzeinnumer.mylibviewpagerexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.gzeinnumer.mylibviewpager.SimpleViewPager;
import com.gzeinnumer.mylibviewpager.adapter.ViewPagerAdapter;
import com.gzeinnumer.mylibviewpagerexample.fr.FirstFragment;
import com.gzeinnumer.mylibviewpagerexample.fr.SecondFragment;

public class TabsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        SimpleViewPager simpleViewPager = findViewById(R.id.vp);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        viewPagerAdapter.addFragment(FirstFragment.newInstance(), "First");
        viewPagerAdapter.addFragment(SecondFragment.newInstance(), "Second");

        simpleViewPager.setAdapter(viewPagerAdapter)
                .setTabLayout(tabLayout)
                //.enableSwipe(false) // true/false -> use this if you want to disable swipe left and right to change page
                .build();
    }
}