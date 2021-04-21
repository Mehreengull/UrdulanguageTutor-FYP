package com.prgguru.compiled123;

import android.graphics.PointF;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.tensorflow.contrib.android.TensorFlowInferenceInterface;

public class PracticeGhain extends AppCompatActivity implements View.OnTouchListener {


    private static final String    TAG         = "FirstActivity";
    private static final int       PIXEL_WIDTH = 28;
    private              TextView  mResultTextFirst;
    private              TextView  mResultTextConvnet;
    private              float     mLastX;
    private              float     mLastY;
    private              DrawModel mModel;
    private              DrawView  mDrawView;
    private              PointF    mTmpPiont   = new PointF();

    // Tensorflow related code
    private              TensorFlowInferenceInterface inferenceInterface_convnet1;
    private              TensorFlowInferenceInterface inferenceInterface_convnet2;
    private static final String                       MODEL_FILE_MNIST   = "_frozen_TFonAndroidModel1.pb";
    private static final String                       MODEL_FILE_CONVNET = "_frozen_TFonAndroidModel2.pb";
    private static final String[]                     INPUT_NODES        = {"modelInput"};
    private static final String[]                     OUTPUT_NODES       = {"modelOutput"};
    private static final int[]                        INPUT_DIM          = {1, PIXEL_WIDTH*PIXEL_WIDTH};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mnist);

        inferenceInterface_convnet1 = new TensorFlowInferenceInterface(getAssets(), MODEL_FILE_MNIST);
        inferenceInterface_convnet2 = new TensorFlowInferenceInterface(getAssets(), MODEL_FILE_CONVNET);

        mModel = new DrawModel(PIXEL_WIDTH, PIXEL_WIDTH);
        mDrawView = (DrawView)findViewById(R.id.view_draw);
        mDrawView.setModel(mModel);
        mDrawView.setOnTouchListener(this);

        View detectButton = findViewById(R.id.button_detect);
        detectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDetectClicked();
            }
        });

        View clearButton = findViewById(R.id.button_clear);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClearClicked();
            }
        });

        mResultTextFirst= (TextView)findViewById(R.id.text_result_mnist);
     //   mResultTextSecond = (TextView)findViewById(R.id.text_result_convnet);
    }

    @Override
    protected void onResume() {
        mDrawView.onResume();
        super.onResume();
    }

    @Override
    protected void onPause() {
        mDrawView.onPause();
        super.onPause();
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int action = event.getAction() & MotionEvent.ACTION_MASK;

        if (action == MotionEvent.ACTION_DOWN) {
            processTouchDown(event);
            return true;

        } else if (action == MotionEvent.ACTION_MOVE) {
            processTouchMove(event);
            return true;

        } else if (action == MotionEvent.ACTION_UP) {
            processTouchUp();
            return true;
        }
        return false;
    }

    private void processTouchDown(MotionEvent event) {
        mLastX = event.getX();
        mLastY = event.getY();
        mDrawView.calcPos(mLastX, mLastY, mTmpPiont);
        float lastConvX = mTmpPiont.x;
         float lastConvY = mTmpPiont.y;
          mModel.startLine(lastConvX, lastConvY);
    }

    private void processTouchMove(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        mDrawView.calcPos(x, y, mTmpPiont);
        float newConvX = mTmpPiont.x;
        float newConvY = mTmpPiont.y;
        mModel.addLineElem(newConvX, newConvY);

        mLastX = x;
        mLastY = y;
        mDrawView.invalidate();
    }

    private void processTouchUp() {
        mModel.endLine();
    }

    private void onDetectClicked() {

        float pixels[] = mDrawView.getPixelData();
        String[] labels = new String[]{"alif","alif mad aa","ayn","baa","bari yaa","cheey","choti yaa","daal","dhaal","faa","gaaf","ghain","haa1","haa2","haa3","hamza","jeem","kaaf","khaa","laam","meem","noon","noonghunna","paa","qaaf","raa","rhraa","seen","seey","sheen","swaad","taa","ttaa","twaa","waw","zaaa","zaal","zhaa","zwaa","zwaad"};
        float[] modelOutputFirst = new float[labels.length];
        float[] modelOutputSecond = new float[labels.length];

        // Feed in the values
        inferenceInterface_convnet1.feed(INPUT_NODES[0],pixels,INPUT_DIM[0], INPUT_DIM[1]);
        inferenceInterface_convnet2.feed(INPUT_NODES[0],pixels,INPUT_DIM[0], INPUT_DIM[1]);

        // Run a session over the fed in data
        inferenceInterface_convnet1.run(OUTPUT_NODES);
        inferenceInterface_convnet2.run(OUTPUT_NODES);

        // Fetch the result at output node
        inferenceInterface_convnet1.fetch(OUTPUT_NODES[0], modelOutputFirst);
        inferenceInterface_convnet2.fetch(OUTPUT_NODES[0], modelOutputSecond);

        int indexFirst = 0;
        int indexSecond = 0;
        for (int i=0; i<40; i++){
            Log.i(TAG, ""+modelOutputFirst[i]);
            if (modelOutputFirst[i] > modelOutputFirst[indexFirst]){
                indexFirst=i;
            }
            Log.i(TAG, ""+modelOutputSecond[i]);
            if (modelOutputSecond[i] > modelOutputSecond[indexSecond]){
                indexSecond=i;
            }
        }
        Log.i(TAG, "First model says digit is " + indexFirst);
        Log.i(TAG, "Second model says digit is " + indexSecond);

        String s="غ";

        if(indexSecond==11&& indexFirst==11)
        {
            mResultTextFirst.setText("Label:"+ s+"Accuracy:"+modelOutputSecond[indexSecond]+"%");

        }
        else if(indexSecond==11)
        {
            mResultTextFirst.setText("Label:"+ s+"Accuracy:"+modelOutputSecond[indexSecond]+"%");
        }
        else if(indexFirst==11) {
            mResultTextFirst.setText("Label:"+ s+"Accuracy:"+modelOutputFirst[indexFirst]+"%");
        }
        else
        {
            mResultTextFirst.setText("Sorry!Unable to detect");
        }


    }

    private void onClearClicked() {
        mModel.clear();
        mDrawView.reset();
        mDrawView.invalidate();
        mResultTextFirst.setText("");
        //mResultTextConvnet.setText("");

    }
}
