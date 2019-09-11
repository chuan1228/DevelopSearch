package com.chuan_sir.viewbase.viewdispatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.chuan_sir.viewbase.R;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(Main3Activity.class.getSimpleName(), "dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(Main3Activity.class.getSimpleName(), "onTouchEvent");
        return super.onTouchEvent(event);
    }

    public void mainBtnOnclick3(View view) {
        Log.e(Main3Activity.class.getSimpleName(), "onClick");

    }
}
