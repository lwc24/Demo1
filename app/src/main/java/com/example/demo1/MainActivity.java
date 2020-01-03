package com.example.demo1;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @Author luweicheng
 * @Date 2020-01-03-10:24
 */
public class MainActivity extends AppCompatActivity {
    static final String ACTION_CLASS_FORCE_FINISH = "1234567";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_CLASS_FORCE_FINISH);
        registerReceiver(new MyReceiver(), intentFilter);
        getApplication().registerReceiver(new MyReceiver(), intentFilter);
        new Test().test1(1);
        getSupportFragmentManager().beginTransaction().add(R.id.fl,new MyFragment());
    }

    void sendBroadCast(View view) {
        Intent intent = new Intent();
        intent.setAction(ACTION_CLASS_FORCE_FINISH);
        intent.putExtra("test", "lwc");
        sendBroadcast(intent);
    }
}
