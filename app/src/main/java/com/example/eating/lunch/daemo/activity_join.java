package com.example.eating.lunch.daemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_join extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        // ID 체크 버튼
        Button btnCheckId = findViewById(R.id.CheckId);
        // 회원가입 버튼
        Button btnJoinInServer = findViewById(R.id.Join);
        
        // ID 체크 버튼 기능
        btnCheckId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // DB에 있는 아이디를 체크
            }
        });

        btnJoinInServer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // 비밀번호 동일 체크 되어있는지 확인

                // 비밀번호 ok 이메일 확인 ok

                // 완벽하다면 통과되어 DB에 저장

            }
        });

    }
}