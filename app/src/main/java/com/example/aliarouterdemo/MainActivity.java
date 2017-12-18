package com.example.aliarouterdemo;

import android.app.ActivityOptions;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void to_b(View view) {
        ARouter.getInstance().build(ARouterHelper.toB)
                       .withString("name", "我是谁")
                       .withBoolean("isLogin", false)
                       .withInt("age", 10)
                       //旧版本动画
                       .withTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                       .navigation(this);//添加动画时没有上下文不会有效果
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void to_c(View view) {
        ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeScaleUpAnimation(view, view.getWidth() / 2, view.getHeight() / 2, 0, 0);
        ARouter.getInstance().build(ARouterHelper.toC)
                       //添加infoBean
                       .withParcelable("infoBean", new InfoBean("nihao", 00))
                       //添加新版本动画
                       .withOptionsCompat(activityOptionsCompat)
                       .navigation();
    }
}
