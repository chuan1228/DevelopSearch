package com.chuan_sir.viewbase.viewdispatch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.widget.AppCompatButton;

/**
 * author : dongxiaochuan
 * date : 2019-09-05 14:50
 * description :
 */
public class CustomSonView extends AppCompatButton implements View.OnTouchListener {


    public CustomSonView(Context context) {
        this(context, null);
    }

    public CustomSonView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomSonView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOnTouchListener(this);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e(CustomSonView.class.getSimpleName(), "dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(CustomSonView.class.getSimpleName(), "onTouchEvent");
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                return true;
            case MotionEvent.ACTION_MOVE:
                break;

            case MotionEvent.ACTION_UP:
                break;
        }

        return false;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
