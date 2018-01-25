package com.example.angoo.list;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private int[] setIcons = {
            R.drawable.user_home,
            R.drawable.user_heart,
            R.drawable.user_view,
            R.drawable.user_person
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        //getSupportFragmentManager()管理活動內的區塊物件
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setTabTextColors(Color.GRAY,Color.argb(255,23,189,161));

        // 在viewpager增加區塊
        adapter.addFragment(new Fragment1(), "首頁");
        adapter.addFragment(new Fragment2(), "收藏");
        adapter.addFragment(new Fragment3(), "查看物件");
        adapter.addFragment(new Fragment4(), "個人資料");
        viewPager.setAdapter(adapter);


        //讓tablayout與viewpager連動
        tabLayout.setupWithViewPager(viewPager);

        for(int i =0; i < setIcons.length;i++){
            tabLayout.getTabAt(i).setIcon(setIcons[i]);


    }


    }


    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();



        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override //獲取需要的view 數量
        public int getCount() {
            return mFragmentList.size();
        }
        //增加區塊
        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);


        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
