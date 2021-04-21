package com.prgguru.compiled123;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.prgguru.compiled123.R;

public class ActivityWrite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);
    }
    public void sendWriteHaraf(View view) {
        Intent intent = new Intent(this, WriteHurrfTypes.class);
        startActivity(intent);
    }
    public void sendWriteLafaz(View view) {
        Intent intent = new Intent(this, ActivityWriteLafaz.class);
        startActivity(intent);
    }
    public void sendWriteHelp(View view) {
        Intent intent = new Intent(this, ActivityWriteHelp.class);
        startActivity(intent);
    }
}