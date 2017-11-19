package com.jack.ideaimageloader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * target 1：实现imageloader的基本功能
 *        2：做成library，提供对外方法
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
