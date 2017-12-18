package com.example.aliarouterdemo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by 亮亮 on 2017/12/18.
 */

public class MyApplication extends Application {
    private boolean debug=true;

    @Override
    public void onCreate() {
        super.onCreate();
        if(islogin()){// 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug(); // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)

        }
        //初始化ARouter
        ARouter.init(this);
    }

    private boolean islogin() {
        return debug;
    }
}
