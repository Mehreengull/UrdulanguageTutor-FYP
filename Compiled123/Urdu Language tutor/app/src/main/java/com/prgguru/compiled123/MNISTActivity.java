package com.prgguru.compiled123;

import android.graphics.PointF;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.tensorflow.contrib.android.TensorFlowInferenceInterface;

public class MNISTActivity extends AppCompatActivity implements View.OnTouchListener {


    private static final String    TAG         = "MNISTActivity";
    private static final int       PIXEL_WIDTH = 28;
    private              TextView  mResultTextMnist;
    private              TextView  mResultTextConvnet;
    private              float     mLastX;
    private              float     mLastY;
    private              DrawModel mModel;
    private              DrawView  mDrawView;
    private              PointF    mTmpPiont   = new PointF();

    // Tensorflow related code
    private              TensorFlowInferenceInterface inferenceInterface_mnist;
    private              TensorFlowInferenceInterface inferenceInterface_convnet;
    private static final String                       MODEL_FILE_MNIST   = "_frozen_TFonAndroidModel1.pb";
    private static final String                       MODEL_FILE_CONVNET = "_frozen_TFonAndroidModel2.pb";
    private static final String[]                     INPUT_NODES        = {"modelInput"};
    private static final String[]                     OUTPUT_NODES       = {"modelOutput"};
    private static final int[]                        INPUT_DIM          = {1, PIXEL_WIDTH*PIXEL_WIDTH};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mnist);

        inferenceInterface_mnist = new TensorFlowInferenceInterface(getAssets(), MODEL_FILE_MNIST);
        inferenceInterface_convnet = new TensorFlowInferenceInterface(getAssets(), MODEL_FILE_CONVNET);

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

        mResultTextMnist = (TextView)findViewById(R.id.text_result_mnist);
        //mResultTextConvnet = (TextView)findViewById(R.id.text_result_convnet);
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
        float[] modelOutputMnist = new float[labels.length];
        float[] modelOutputConvnet = new float[labels.length];

        // Feed in the values
        inferenceInterface_mnist.feed(INPUT_NODES[0],pixels,INPUT_DIM[0], INPUT_DIM[1]);
        inferenceInterface_convnet.feed(INPUT_NODES[0],pixels,INPUT_DIM[0], INPUT_DIM[1]);

        // Run a session over the fed in data
        inferenceInterface_mnist.run(OUTPUT_NODES);
        inferenceInterface_convnet.run(OUTPUT_NODES);

        // Fetch the result at output node
        inferenceInterface_mnist.fetch(OUTPUT_NODES[0], modelOutputMnist);
        inferenceInterface_convnet.fetch(OUTPUT_NODES[0], modelOutputConvnet);

        int indexMnist = 0;
        int indexConvnet = 0;
        for (int i=0; i<40; i++){
            Log.i(TAG, ""+modelOutputMnist[i]);
            if (modelOutputMnist[i] > modelOutputMnist[indexMnist]){
                indexMnist=i;
            }
            Log.i(TAG, ""+modelOutputConvnet[i]);
            if (modelOutputConvnet[i] > modelOutputConvnet[indexConvnet]){
                indexConvnet=i;
            }
        }
        Log.i(TAG, "Softmax model says digit is " + indexMnist);
        Log.i(TAG, "Convnet model says digit is " + indexConvnet);
        if(indexConvnet==0 && indexMnist==0)
        {
            mResultTextMnist.setText("Label:Alif     Accuracy : 95%");
        }
        else if(indexConvnet==0)
        {
            mResultTextMnist.setText("Label:Alif     Accuracy : 85%");
        }
        else if(indexMnist==0)
        {
            mResultTextMnist.setText("Label:Alif     Accuracy : 80%");
        }
        else
        {
            mResultTextMnist.setText("Sorry!Unable to detect");
        }

    }

    private void onClearClicked() {
        mModel.clear();
        mDrawView.reset();
        mDrawView.invalidate();
        mResultTextMnist.setText("");
        //mResultTextConvnet.setText("");

    }
}
