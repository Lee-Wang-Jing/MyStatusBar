package com.wangjing.mystatusbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_demo1,btn_demo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initView() {
        btn_demo1 = (Button) findViewById(R.id.btn_demo1);
        btn_demo2 = (Button) findViewById(R.id.btn_demo2);

    }

    private void initListener() {
        btn_demo1.setOnClickListener(this);
        btn_demo2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_demo1:
                startActivity(new Intent(this, Test1Activity.class));
                break;
            case R.id.btn_demo2:
                startActivity(new Intent(this, Test2Activity.class));
                break;
        }
    }
}
