package com.prgguru.compiled123;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityBay extends AppCompatActivity {

    MyCanvas canvasView;
    AnimationDrawable animationDrawable1;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bay);
        canvasView=(MyCanvas)findViewById(R.id.mycanvasview);

        ImageView imageView22=(ImageView)findViewById(R.id.imageanimation3);
        imageView22.setBackgroundResource(R.drawable.animation_bay);
        animationDrawable1=(AnimationDrawable)imageView22.getBackground();


    }


    @Override
     public void onWindowFocusChanged(boolean hasFocus) {
         super.onWindowFocusChanged(hasFocus);
         animationDrawable1.start();
     }
    public void clearCanvas(View v)
    {
        canvasView.ClearCanvas();
    }
}
