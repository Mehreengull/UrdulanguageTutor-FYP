package com.prgguru.compiled123;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityAlifMudAa extends AppCompatActivity {

    MyCanvas canvasView;
    AnimationDrawable animationDrawable2;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alif_mud_aa);
        canvasView=(MyCanvas)findViewById(R.id.mycanvasview);
        ImageView imageView=(ImageView)findViewById(R.id.imageanimation2);
        imageView.setBackgroundResource(R.drawable.animation_alif_mud_aa);
        animationDrawable2=(AnimationDrawable)imageView.getBackground();
    }
    @Override
     public void onWindowFocusChanged(boolean hasFocus) {
         super.onWindowFocusChanged(hasFocus);
         animationDrawable2.start();
     }
    public void clearCanvas(View v)
    {
        canvasView.ClearCanvas();
    }
}
