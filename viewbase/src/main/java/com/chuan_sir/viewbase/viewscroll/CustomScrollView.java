package com.chuan_sir.viewbase.viewscroll;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Scroller;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

/**
 * author : dongxiaochuan
 * date : 2019-09-05 11:37
 * description :
 */
public class CustomScrollView extends AppCompatImageView {


    private Scroller mScroller;

    public CustomScrollView(Context context) {
        this(context, null);
    }

    public CustomScrollView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomScrollView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context mContext) {
        mScroller = new Scroller(mContext);
    }


    /**
     * 平稳滑动
     *
     * @param destX 目标x
     * @param destY 目标y
     */
    public void smoothScrollTo(int destX, int destY) {

        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int deltX = destX - scrollX;
        int deltY = destY - scrollY;
        mScroller.startScroll(scrollX, scrollY, deltX, deltY, 1000);
        invalidate();
    }

    @Override
    public void computeScroll() {
        if (mScroller != null) {
            if (mScroller.computeScrollOffset()) {
                scrollTo(mScroller.getCurrX(), mScroller.getCurrY());
                postInvalidate();
            }
        }
    }


    private int lastX, lastY;

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int x = (int) event.getRawX();
        int y = (int) event.getRawY();


        switch (event.getAction()) {

            case MotionEvent.ACTION_DOWN:
                break;

            case MotionEvent.ACTION_MOVE:
                int deltaX = x - lastX;
                int deltaY = y - lastY;
                move(deltaX, deltaY);
                break;

            case MotionEvent.ACTION_UP:

                break;
        }

        lastX = x;
        lastY = y;

        return true;
    }


    private void move(int x, int y) {
        Log.e(CustomScrollView.class.getSimpleName(), "translationX: " + getTranslationX());
        Log.e(CustomScrollView.class.getSimpleName(), "x: " + (getTranslationX() + x));

        ObjectAnimator.ofFloat(this, "translationX", getTranslationX(), getTranslationX() + x).setDuration(100).start();
        ObjectAnimator.ofFloat(this, "translationY", getTranslationY(), getTranslationY() + y).setDuration(100).start();
    }
}
