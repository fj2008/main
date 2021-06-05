package com.example.eating.lunch.daemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activity_food extends AppCompatActivity {
    TextView foodView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        TextView foodView = findViewById(R.id.textViewFood);


    }
}