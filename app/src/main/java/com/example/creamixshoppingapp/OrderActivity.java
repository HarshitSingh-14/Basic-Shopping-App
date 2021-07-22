package com.example.creamixshoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        //msg inside activity
        String message = intent.getStringExtra(MainActivity.msg);

        TextView textView = findViewById(R.id.textView3);
        textView.setText(message);   // using .
    }
}