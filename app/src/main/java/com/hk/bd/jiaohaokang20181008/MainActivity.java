package com.hk.bd.jiaohaokang20181008;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hk.bd.jiaohaokang20181008.adapter.MyAdapter_1;
import com.hk.bd.jiaohaokang20181008.fragment.ClassFragment;
import com.hk.bd.jiaohaokang20181008.fragment.HomeFragment;
import com.hk.bd.jiaohaokang20181008.fragment.MeFragment;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity {

    private ViewPager main_viewpager;
    private TabLayout main_tablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_viewpager = (ViewPager) findViewById(R.id.main_viewpager);
        main_tablayout = (TabLayout) findViewById(R.id.main_tablayout);

        ArrayList<String> titles = new ArrayList<>();
        titles.add("首页");
        titles.add("分类");
        titles.add("我的");

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new ClassFragment());
        fragments.add(new MeFragment());


        main_viewpager.setAdapter(new MyAdapter_1(getSupportFragmentManager(),titles,fragments));
        main_tablayout.setupWithViewPager(main_viewpager);

    }
}
