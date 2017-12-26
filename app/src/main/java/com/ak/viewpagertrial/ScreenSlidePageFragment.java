package com.ak.viewpagertrial;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ScreenSlidePageFragment extends android.support.v4.app.Fragment {
    TextView text;
    String name;
    Context context;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = (View) inflater.inflate(
                R.layout.fragmentlayout, null);
        text=(TextView)view.findViewById(R.id.text);
        name = getArguments().getString("id");
        text.setText(name);

        /*Bundle bundle = getArguments();
        String msg = bundle.getString(MainActivity.getMessage(1));
        text.setText(msg);*/
        return view;
    }

    public static ScreenSlidePageFragment getName(String name){
        Bundle bundle = new Bundle();
        bundle.putString("id",name);
        ScreenSlidePageFragment screenSlidePageFragment= new ScreenSlidePageFragment();
        screenSlidePageFragment.setArguments(bundle);
        return  screenSlidePageFragment;
    }

}
