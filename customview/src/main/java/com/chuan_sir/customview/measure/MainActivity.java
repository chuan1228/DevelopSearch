package com.chuan_sir.customview.measure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;

import com.chuan_sir.customview.R;

/**
 * 拿到View的宽高 四种方式
 */
public class MainActivity extends AppCompatActivity {

    private CustomView mainCustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainCustomView = findViewById(R.id.main_custom_view);


    }

    /**
     * 第一种方式
     *
     * @param hasFocus
     */
//    @Override
//    public void onWindowFocusChanged(boolean hasFocus) {
//        super.onWindowFocusChanged(hasFocus);
//        if (hasFocus) {
//            Log.e(MainActivity.class.getSimpleName(), "width: " + mainCustomView.getMeasuredWidth() + " height: " + mainCustomView.getMeasuredHeight());
//        }
//    }
    @Override
    protected void onStart() {
        super.onStart();
        //第二种方式
        //Looper轮询到此runnable的时候，View已经初始化好了
//        mainCustomView.post(new Runnable() {
//            @Override
//            public void run() {
//                Log.e(MainActivity.class.getSimpleName(), "width: " + mainCustomView.getMeasuredWidth() + " height: " + mainCustomView.getMeasuredHeight());
//            }
//        });

        //3、使用ViewTreeObserver
        ViewTreeObserver observer = mainCustomView.getViewTreeObserver();
        observer.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                mainCustomView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Log.e(MainActivity.class.getSimpleName(), "width: " + mainCustomView.getMeasuredWidth() + " height: " + mainCustomView.getMeasuredHeight());
            }
        });

    }


    //手动调用view.measure（int widthMeasureSpec,int heightMeasureSpec）方法测量,不建议使用

}
