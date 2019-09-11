package com.chuan_sir.viewbase.viewdispatch;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/**
 * author : dongxiaochuan
 * date : 2019-09-05 14:47
 * description :
 */
public class CustomParentView extends LinearLayout {


    public CustomParentView(Context context) {
        super(context);
    }

    public CustomParentView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomParentView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomParentView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(CustomParentView.class.getSimpleName(), "dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(CustomParentView.class.getSimpleName(), "onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(CustomParentView.class.getSimpleName(), "onTouchEvent");
        return super.onTouchEvent(event);
    }
}
