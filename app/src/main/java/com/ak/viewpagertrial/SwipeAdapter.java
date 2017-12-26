package com.ak.viewpagertrial;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Ayush on 20-Dec-17.
 */

public class SwipeAdapter extends FragmentStatePagerAdapter {

    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        Fragment fragment = new ScreenSlidePageFragment();
        Bundle bundle = new Bundle();
        bundle.getCharArray(MainActivity.generateList().get(position).toString());
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return MainActivity.generateList().size();
    }


    public CharSequence getPageTitle(int position){
        switch (position){
            case 0 : return "Page1";

            case 1 : return "Page2";

            case 2 : return "Page3";

            case 3 : return "Page4";

            case 4 : return "Page5";

            default: return "Null";
        }
    }

}
