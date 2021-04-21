package com.prgguru.compiled123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WriteHurrfTypes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_hurrf_types);
    }
    public void sendWriteHaraf(View view) {
        Intent intent = new Intent(this, ActivityListHaroofTracing.class);
        startActivity(intent);
    }
    public void sendPractice(View view) {
        Intent intent = new Intent(this, ActivityListHaroofOfPractice.class);
        startActivity(intent);
    }
}
