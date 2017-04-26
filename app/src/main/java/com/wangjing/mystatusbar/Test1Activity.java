package com.wangjing.mystatusbar;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by Administrator on 2017/4/26.
 */

public class Test1Activity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Test1Activity");
    }
}
