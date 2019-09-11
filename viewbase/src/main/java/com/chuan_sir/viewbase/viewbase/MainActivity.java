package com.chuan_sir.viewbase.viewbase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;

import com.chuan_sir.viewbase.R;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity.class";

    //手势事件
    private GestureDetector mGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGestureDetector = new GestureDetector(this, onGestureListener);
//        mGestureDetector.setIsLongpressEnabled(false);


    }


    public void mainViewOnClick(View view) {

        Log.e(TAG, "Left: " + view.getLeft() + " Right: " + view.getRight() + " Top: " + view.getTop() + " Bottom: " + view.getBottom());

        Log.e(TAG, "x: " + view.getX() + " y: " + view.getY());

        Log.e(TAG, "translationX: " + view.getTranslationX() + " translationY:" + view.getTranslationX());

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

//        Log.e(TAG, "TouchSlop: " + ViewConfiguration.get(getApplicationContext()).getScaledTouchSlop());

        //查看X、Y轴滑动速度
//        VelocityTracker velocityTracker = VelocityTracker.obtain();
//        velocityTracker.addMovement(event);
//        velocityTracker.computeCurrentVelocity(1000);
//        int xVelocity = (int) velocityTracker.getXVelocity();
//        int yVelocity = (int) velocityTracker.getYVelocity();
//        Log.e(TAG, "xVelocity: " + xVelocity);
//        Log.e(TAG, "yVelocity: " + yVelocity);
//        velocityTracker.clear();
//        velocityTracker.recycle();

        //接管TouchEvent的事件
        boolean consume = mGestureDetector.onTouchEvent(event);
        return consume;
    }


    private GestureDetector.OnGestureListener onGestureListener = new GestureDetector.SimpleOnGestureListener() {
        @Override
        public boolean onDown(MotionEvent motionEvent) {
            Log.e(TAG, "onDown");
            return false;
        }

        @Override
        public void onShowPress(MotionEvent motionEvent) {
            Log.e(TAG, "onShowPress");

        }

        @Override
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            Log.e(TAG, "onSingleTapUp");
            return false;
        }

        @Override
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
            Log.e(TAG, "onScroll");
            return false;
        }

        @Override
        public void onLongPress(MotionEvent motionEvent) {
            Log.e(TAG, "onLongPress");

        }

        @Override
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
            Log.e(TAG, "onFling");
            return false;
        }

        @Override
        public boolean onDoubleTap(MotionEvent e) {
            Log.e(TAG, "onDoubleTap");
            return super.onDoubleTap(e);
        }

        @Override
        public boolean onDoubleTapEvent(MotionEvent e) {
            Log.e(TAG, "onDoubleTapEvent");
            return super.onDoubleTapEvent(e);
        }

        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            Log.e(TAG, "onSingleTapConfirmed");
            return super.onSingleTapConfirmed(e);
        }

        @Override
        public boolean onContextClick(MotionEvent e) {
            Log.e(TAG, "ononContextClickFling");
            return super.onContextClick(e);
        }
    };


}
