package com.example.kkndr131;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class About extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    private DplFragment dplFragment;
    private TtgFragment ttgFragment;
    private Group131Fragment group131Fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        dplFragment = new DplFragment();
        ttgFragment = new TtgFragment();
        group131Fragment = new Group131Fragment();

        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),0);

        viewPagerAdapter.addFragment(dplFragment,"DPL");
        viewPagerAdapter.addFragment(ttgFragment,"Kelompok TTG");
        viewPagerAdapter.addFragment(group131Fragment,"Group 131");
        viewPager.setAdapter(viewPagerAdapter);

    }


    private class ViewPagerAdapter extends FragmentPagerAdapter {
        private List<Fragment> fragmentList = new ArrayList<>();
        private List<String> stringList = new ArrayList<>();

        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior){
            super(fm,behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return stringList.get(position);
        }

        public void addFragment(Fragment fragment, String title){
            fragmentList.add(fragment);
            stringList.add(title);
        }
    }

}