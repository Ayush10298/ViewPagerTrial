package com.ak.viewpagertrial;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ScreenSlidePageFragment extends android.support.v4.app.Fragment {
    TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragmentlayout, container, false);
        text=(TextView)rootView.findViewById(R.id.text);
        Bundle bundle = getArguments();
        String msg = bundle.getString(MainActivity.getMessage(1));
        text.setText(msg);
        return rootView;
    }
}
