package com.example.eating.lunch.daemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable()  {
            public void run() {
                // 시간 지난 후 실행할 코딩
                // 로그인 화면이 나타남
                Intent intent = new Intent(getApplicationContext(), activity_login1.class);
                startActivity(intent);
            }
        }, 5000); // 5초후
    }
}