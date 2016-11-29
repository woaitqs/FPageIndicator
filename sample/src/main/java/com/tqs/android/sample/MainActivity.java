package com.tqs.android.sample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tqs.android.view.FPageIndicator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
    pager.setAdapter(new PicFragmentAdapter(getSupportFragmentManager()));

    FPageIndicator indicator = (FPageIndicator) findViewById(R.id.indicator);
    indicator.attachToViewPager(pager);
  }

  private class PicFragmentAdapter extends FragmentStatePagerAdapter {

    private List<Pair<Integer, Integer>> dataMap;

    PicFragmentAdapter(FragmentManager fm) {
      super(fm);
      dataMap = new ArrayList<>();
      dataMap.add(new Pair<>(R.color.bg_1, R.drawable.img_1));
      dataMap.add(new Pair<>(R.color.bg_2, R.drawable.img_2));
      dataMap.add(new Pair<>(R.color.bg_3, R.drawable.img_3));
      dataMap.add(new Pair<>(R.color.bg_4, R.drawable.img_4));
      dataMap.add(new Pair<>(R.color.bg_5, R.drawable.img_5));
    }

    @Override
    public Fragment getItem(int position) {
      return PicFragment.newInstance(dataMap.get(position).first, dataMap.get(position).second);
    }

    @Override
    public int getCount() {
      return dataMap.size();
    }
  }

}
