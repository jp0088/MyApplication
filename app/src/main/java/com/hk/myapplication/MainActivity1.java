package com.hk.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import org.greenrobot.eventbus.EventBus;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }
    public void Send(View view) {
        EventBus.getDefault().post("1");
        Log.e("mm","123");
    }
}
