package com.example.acer.sdmyandroid01;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //当这个界面创建时，会自动的进行回调
        //在其中完成一些初始化工作：设置界面样式（布局文件）设置界面响应
        super.onCreate(savedInstanceState);
        //调用父类的方法，不可省略
        setContentView(R.layout.activity_main);
        //设置界面样式


    }
}

