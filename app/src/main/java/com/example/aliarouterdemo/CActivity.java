package com.example.aliarouterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
@Route(path = "/test/cActivity")
public class CActivity extends AppCompatActivity {
    private static final String TAG = "CActivity";
    @Autowired
    public InfoBean infoBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        ARouter.getInstance().inject(this);
        Log.e(TAG, "onCreate: "+infoBean==null?"infoBean为空":"infoBean"+infoBean.age);

    }
}
