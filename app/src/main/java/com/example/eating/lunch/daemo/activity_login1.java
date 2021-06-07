package com.example.eating.lunch.daemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_login1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        // 버튼 구성
        // 로그인 화면 버튼
        Button btnLogin = findViewById(R.id.buttonLogin);
        // ID 찾기 화면 버튼
        Button btnFindId = findViewById(R.id.buttonfindId);
        // PW 찾기 화면 버튼
        Button btnFindPw = findViewById(R.id.buttonfindPw);
        // 회원가입 화면 버튼
        Button btnJoin = findViewById(R.id.buttonJoin);

        // 로그인 버튼 클릭
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // DB 체크 후 로그인
            }
        });

        // ID 찾기 버튼 클릭
        btnFindId.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // ID 찾기 화면으로 이동
                Intent intent = new Intent(getApplicationContext(), activity_findId.class);
                startActivity(intent);
            }
        });

        // PW찾기 버튼 클릭
        btnFindPw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // PW 찾기 화면으로 이동
                Intent intent = new Intent(getApplicationContext(), activity_findPw.class);
                startActivity(intent);
            }
        });

        // 회원가입 버튼 클릭
        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 회원가입 화면으로 이동
                Intent intent = new Intent(getApplicationContext(), activity_join.class);
                startActivity(intent);
            }
        });

    }
}