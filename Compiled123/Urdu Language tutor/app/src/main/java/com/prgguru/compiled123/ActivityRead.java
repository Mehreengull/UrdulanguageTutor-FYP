package com.prgguru.compiled123;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityRead extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
    }
    public void sendReadHaraf(View view){
        Intent intent = new Intent(this, ActivityReadHaraf.class);
        startActivity(intent);
    }
    public void sendReadLafaz(View view){
        Intent intent = new Intent(this, ActivityReadLafaz.class);
        startActivity(intent);
    }
    public void sendReadCounting(View view){
        Intent intent = new Intent(this, ReadingCounting.class);
        startActivity(intent);
    }
}
