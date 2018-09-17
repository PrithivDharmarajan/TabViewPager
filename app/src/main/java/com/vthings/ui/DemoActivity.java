package com.vthings.ui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.vthings.R;
import com.vthings.fragment.DemoFragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DemoActivity extends AppCompatActivity {


    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mTabLayout = findViewById(R.id.tab_lay);
        mViewPager = findViewById(R.id.view_pager);

        setupViewPager(mViewPager);

        mTabLayout.setupWithViewPager(mViewPager);

        initTabHeaderView();
    }


    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new DemoFragment());
        adapter.addFragment(new DemoFragment());
        adapter.addFragment(new DemoFragment());
        adapter.addFragment(new DemoFragment());

        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(adapter.getCount());
    }

    private class ViewPagerAdapter extends FragmentStatePagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();

        private ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        private void addFragment(Fragment fragment) {
            mFragmentList.add(fragment);
        }

    }

    private void initTabHeaderView() {

        /*set custom tab*/
        View headerView = LayoutInflater.from(this).inflate(R.layout.tab_user_profile_view1, null, false);
        LinearLayout  recentParentTabLay = headerView.findViewById(R.id.demo_parent_tab_lay);
        Objects.requireNonNull(mTabLayout.getTabAt(0)).setCustomView(recentParentTabLay);
        Objects.requireNonNull(mTabLayout.getTabAt(1)).setCustomView(recentParentTabLay);
        Objects.requireNonNull(mTabLayout.getTabAt(2)).setCustomView(recentParentTabLay);
        Objects.requireNonNull(mTabLayout.getTabAt(3)).setCustomView(recentParentTabLay);

    }


}
