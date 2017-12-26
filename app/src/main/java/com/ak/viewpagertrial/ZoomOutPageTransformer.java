package com.ak.viewpagertrial;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by Ayush on 15-Dec-17.
 */

public class ZoomOutPageTransformer implements ViewPager.PageTransformer {

    public static final float MIN_SCALE=0.85f;
    public static final float MIN_ALPHA=0.5f;

    @Override
    public void transformPage(View page, float position) {
        int pageWidth=page.getWidth();
        int pageHeight=page.getHeight();

        if(position<-1){
            page.setAlpha(0);
        }
        else if(position<=1){
            float scalefactor= Math.max(MIN_SCALE,1-Math.abs(position));
            float vertMargin= (1-scalefactor)/2;
            float horMargin=(1-scalefactor)/2;
            if(position<0){
                page.setTranslationX(horMargin-vertMargin/2);
            }
            else{
                page.setTranslationX(-horMargin+vertMargin/2);
            }
            page.setScaleX(scalefactor);
            page.setScaleY(scalefactor);


            page.setAlpha(MIN_ALPHA+(scalefactor-MIN_SCALE)/(1-MIN_SCALE)*(1-MIN_ALPHA));
        }
        else{
            page.setAlpha(0);
        }
    }
}
