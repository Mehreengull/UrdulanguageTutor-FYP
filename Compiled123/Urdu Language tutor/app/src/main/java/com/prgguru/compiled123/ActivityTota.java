package com.prgguru.compiled123;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTota extends AppCompatActivity {

    MyCanvas canvasView;
    AnimationDrawable animationDrawable;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tota);
        canvasView=(MyCanvas)findViewById(R.id.mycanvasview);
        ImageView imageView=(ImageView)findViewById(R.id.imageanimation_tota);
        imageView.setBackgroundResource(R.drawable.animationtota);
        animationDrawable=(AnimationDrawable)imageView.getBackground();
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        animationDrawable.start();
    }
    public void clearCanvas(View v)
    {
        canvasView.ClearCanvas();
    }
}
