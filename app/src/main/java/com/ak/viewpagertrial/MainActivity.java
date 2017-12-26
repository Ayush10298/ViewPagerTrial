package com.ak.viewpagertrial;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

public class MainActivity extends FragmentActivity {

    ArrayList<Member> memberArrayList;
    private static final int NUM_PAGES= 5;
    private ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPager= (ViewPager)findViewById(R.id.mPager);
        memberArrayList=generateList();
        SwipeAdapter swipeAdapter = new SwipeAdapter(getSupportFragmentManager());
        mPager.setAdapter(swipeAdapter);
        mPager.setPageTransformer(true,new DepthPageTransformer());
    }

    static ArrayList<Member> generateList() {
        ArrayList<Member> members = new ArrayList<>();

        members.add(new Member("Hello, this is just for trial purpose 1st Page"));
        members.add(new Member("Hello, this is just for trial purpose 2nd Page"));
        members.add(new Member("Hello, this is just for trial purpose 3rd Page"));
        members.add(new Member("Hello, this is just for trial purpose 4th Page "));
        members.add(new Member("Hello, this is just for trial purpose 5th Page "));

        return members;
    }

     static String getMessage(int position){
        String msg;
        msg=generateList().get(position).toString();
        return msg;
     }

    @Override
    public void onBackPressed() {
        if(mPager.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }
}