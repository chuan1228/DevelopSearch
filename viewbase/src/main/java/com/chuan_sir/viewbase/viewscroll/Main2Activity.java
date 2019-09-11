package com.chuan_sir.viewbase.viewscroll;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Log;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Scroller;

import com.chuan_sir.viewbase.R;

public class Main2Activity extends AppCompatActivity {


    private CustomScrollView mView;
    private Scroller scroller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mView = findViewById(R.id.mainV2);
        scroller = new Scroller(this);
    }

    public void mainViewOnClick2(View view) {

        //改变View内容位置，不改变View本身位置

        //相对自身滑动
//        view.scrollBy(100,100);
//        view.scrollBy(-100,-100);

        //滑动到指定位置
//        view.scrollTo(100, 100);
//        view.scrollTo(-100, -100);

        //视图动画滑动到指定位置
//        Animation translate = AnimationUtils.loadAnimation(this, R.anim.translate);
//        mView.startAnimation(translate);

        //属性动画滑动到指定位置
//        ObjectAnimator.ofFloat(mView, "translationX", 0, 100).setDuration(500).start();


        //改变布局参数到指定位置
//        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) mView.getLayoutParams();
//        layoutParams.width += 100;
//        layoutParams.leftMargin = 100;
//        mView.requestLayout();

        //使用Scroller平稳的弹性滑动到某个位置
//        mView.smoothScrollTo(100,100);

        //使用属性动画实现平稳的弹性滑动
//        ValueAnimator animator = ValueAnimator.ofInt(0, 1).setDuration(1000);
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                float fraction = animation.getAnimatedFraction();
//                mView.scrollTo((int) (100 * fraction), (int) (100 * fraction));
//            }
//        });
//        animator.start();

        //使用延时策略
        //使用Handler 定时发送消息 改变View的位置

    }

}
