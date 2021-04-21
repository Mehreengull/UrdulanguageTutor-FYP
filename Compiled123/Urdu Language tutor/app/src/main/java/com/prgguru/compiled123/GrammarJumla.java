package com.prgguru.compiled123;


import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class GrammarJumla extends AppCompatActivity {

    View v;

    TextView textView;
    private Typeface mTypeface;
    ListView       listview;
    int            intCount = 0;
    String[]       my_list;
    // BufferedReader br;
    InputStream    inputStreamCounter;
    BufferedReader bufferedReaderCounter;
    InputStream    inputStreamLoader;
    BufferedReader bufferedReaderLoader;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar_jumla);

        v=findViewById(R.id.activity_thirty);

        textView=(TextView)findViewById(R.id.my_txt);
        textView.setTextColor(Color.WHITE);

        loadsaveInternalCache(v);
        //load(v);

    }

    public void loadsaveInternalCache(View view)
    {



        File dirfolder=getFilesDir();
        File dirfile=new File(dirfolder,"datafile30.txt");

        //File sdfile=new File("/sdcard/datafile0.txt");

        File cachefolder = getCacheDir();
        File cachefile;
        cachefile = new File(cachefolder, "datafile30.txt");

        if(cachefile.exists())
        {
            StringBuilder text=new StringBuilder();

            try
            {
                BufferedReader br = new BufferedReader(new FileReader(cachefile));
                String line;
                while((line=br.readLine())!=null)
                {
                    text.append(line);
                    text.append('\n');


                }

            } catch (IOException e) {
                e.printStackTrace();
            }



            textView.setText(text.toString());

        }
        else if(!cachefile.exists()&&dirfile.exists())
        {
            StringBuilder text=new StringBuilder();

            try
            {
                BufferedReader br = new BufferedReader(new FileReader(dirfile));
                String line;
                while((line=br.readLine())!=null)
                {
                    text.append(line);
                    text.append('\n');


                }

            } catch (IOException e) {
                e.printStackTrace();
            }



            textView.setText(text.toString());
        }
        else if(!cachefile.exists()&&!dirfile.exists())
        {
            StringBuilder text=new StringBuilder();

            try
            {
                inputStreamCounter = this.getAssets().open("grammar_jumla");
                BufferedReader br = new BufferedReader(new InputStreamReader(inputStreamCounter));
                String line;
                while((line=br.readLine())!=null)
                {
                    text.append(line);
                    text.append('\n');


                }

            } catch (IOException e) {
                e.printStackTrace();
            }



            textView.setText(text.toString());
        }

        else
        {

            Toast.makeText(getApplicationContext(),"Not downloaded Properly",Toast.LENGTH_LONG).show();



        }





    }






}
