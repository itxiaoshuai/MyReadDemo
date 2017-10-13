package com.edu.boyue.myreaddemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.viewpager)
    ViewPager mViewpager;
    private List<Fragment> mListFragment = new ArrayList<Fragment>();
    private FragmentPagerAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        initFragment();
        initView();
        initData();
    }

    private void initFragment() {
        mListFragment.add(new RecommendFragment());
        mListFragment.add(new CommunityFragment());
        mListFragment.add(new FindFragment());
        mAdapter=new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mListFragment.get(position);
            }

            @Override
            public int getCount() {
                return mListFragment.size();
            }
        };
        mViewpager.setAdapter(mAdapter);
    }

    private void initData() {
    }

    private void initView() {
    }
}
