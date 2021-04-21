package com.prgguru.compiled123;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MyCanvas extends View {
    Context context;
    int width,height;
    Bitmap bitmap;
    Paint paint;
    Path path;
    Canvas canvas;
    float mX,mY;
    static final float TOLERANCE=4;
    ImageView imageView;



    public MyCanvas(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        path=new Path();
        paint=new Paint();

        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(25f);
        imageView=(ImageView)findViewById(R.id.imageView1);
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        bitmap=Bitmap.createBitmap(w,h,Bitmap.Config.ARGB_8888);
        canvas=new Canvas(bitmap);
    }


    public void startTouch(float x,float y)
    {
        path.moveTo(x,y);
        mX=x;
        mY=y;

    }
    public void moveTouch(float x,float y)
    {
        float dx = Math.abs(x-mX);
        float dy=Math.abs(y-mY);

        if(dx>=TOLERANCE || dy>=TOLERANCE)
        {
            path.quadTo(mX,mY,(x+mX)/2,(y+mY)/2);
            mX=x;
            mY=y;

        }
    }
    public void ClearCanvas()
    {
        path.reset();
        invalidate();
    }
    public void upTouch()
    {
        path.lineTo(mX,mY);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(path,paint);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x=event.getX();
        float y=event.getY();
        switch(event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                startTouch(x,y);
                invalidate();
                break;
            case MotionEvent.ACTION_MOVE:
                moveTouch(x,y);
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                upTouch();
                invalidate();
                break;
            default:
                return false;
        }
        return true;
    }
}
