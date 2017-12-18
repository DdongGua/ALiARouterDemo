package com.example.aliarouterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

//在支持路由的页面上添加注解
@Route(path="/test/bActivity")
public class BActivity extends AppCompatActivity {
    @Autowired
    public String name;
    @Autowired
    public boolean isLogin;
    @Autowired
    public int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        ARouter.getInstance().inject(this);
        Toast.makeText(this, "哈哈哈"+name+"--"+isLogin+"--"+age, Toast.LENGTH_SHORT).show();

    }
}
