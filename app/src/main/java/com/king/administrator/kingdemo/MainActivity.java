package com.king.administrator.kingdemo;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private ViewPager viewPager;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initViewPager();

    }


    private void initViewPager() {
        //获取ViewPager
        //创建一个FragmentPagerAdapter对象，该对象负责为ViewPager提供多个Fragment
        viewPager = (ViewPager) findViewById(R.id.page);
        FragmentPagerAdapter pagerAdapter = new FragmentPagerAdapter(
                getSupportFragmentManager()) {

            //获取第position位置的Fragment
            @Override
            public Fragment getItem(int position) {
                Fragment fragment = null;
                switch (position) {
                    case 0:
                        fragment = new FirstFragment();
                        break;
                    case 1:
                        fragment = new SecondFragmnt();
                        break;
                    case 2:
                        fragment = new ThirdFragmrnt();
                        break;
                    case 3:
                        fragment = new ForthFragment();
                        break;
                }

                return fragment;
            }

            //该方法的返回值i表明该Adapter总共包括多少个Fragment
            @Override
            public int getCount() {
                return 4;
            }

        };
        //为ViewPager组件设置FragmentPagerAdapter
        viewPager.setAdapter(pagerAdapter);

        //为viewpager组件绑定时间监听器
        viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            //当ViewPager显示的Fragment发生改变时激发该方法
            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    //如果是点击的第一个button，那么就让第一个button的字体变为蓝色
                    //其他的button的字体的颜色变为黑色
                    case 0:
                        one.setTextColor(Color.BLUE);
                        two.setTextColor(Color.BLACK);
                        three.setTextColor(Color.BLACK);
                        four.setTextColor(Color.BLACK);
                        break;
                    case 1:
                        one.setTextColor(Color.BLACK);
                        two.setTextColor(Color.BLUE);
                        three.setTextColor(Color.BLACK);
                        four.setTextColor(Color.BLACK);
                        break;
                    case 2:
                        one.setTextColor(Color.BLACK);
                        two.setTextColor(Color.BLACK);
                        three.setTextColor(Color.BLUE);
                        four.setTextColor(Color.BLACK);
                        break;
                    case 3:
                        one.setTextColor(Color.BLACK);
                        two.setTextColor(Color.BLACK);
                        three.setTextColor(Color.BLACK);
                        four.setTextColor(Color.BLUE);
                        break;
                }
                super.onPageSelected(position);
            }
        });
    }

    private void initView() {
        one = (Button) findViewById(R.id.bt_one);
        two = (Button) findViewById(R.id.bt_two);
        three = (Button) findViewById(R.id.bt_three);
        four = (Button) findViewById(R.id.bt_four);

        //设置点击监听
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);

        //将button中字体的颜色先按照点击第一个button的效果初始化
        one.setTextColor(Color.BLUE);
        two.setTextColor(Color.BLACK);
        three.setTextColor(Color.BLACK);
        four.setTextColor(Color.BLACK);
    }

    //点击主界面上面的button后，将viewpager中的fragment跳转到对应的item
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_one:
                viewPager.setCurrentItem(0);
                break;
            case R.id.bt_two:
                viewPager.setCurrentItem(1);
                break;
            case R.id.bt_three:
                viewPager.setCurrentItem(2);
                break;
            case R.id.bt_four:
                viewPager.setCurrentItem(3);
                break;
        }
    }

}

