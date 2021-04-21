package com.prgguru.compiled123;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class IdiomsGeem extends AppCompatActivity {

    View v;

    ListView listView;
    int intCount=0;
    String[] my_first_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idioms_geem);

        v=findViewById(R.id.activity_fortyfour);
        listView=(ListView)findViewById(R.id.my_list) ;

        try {
            loadsaveInternalCache(v);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public  void loadsaveInternalCache(View view) throws IOException {


        File dirfolder = getFilesDir();
        File dirfile = new File(dirfolder, "datafile44.txt");


        File cachefolder = getCacheDir();
        File cachefile;
        cachefile = new File(cachefolder, "datafile44.txt");


        if (cachefile.exists()) {
            try {
                BufferedReader brCounter = new BufferedReader(new FileReader(cachefile));
                BufferedReader br = new BufferedReader(new FileReader(cachefile));
                try {
                    while (brCounter.readLine() != null) {
                        intCount++;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                my_first_list = new String[intCount];
                try {
                    for (int i = 0; i <= intCount; i++) {
                        my_first_list[i] = br.readLine();


                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdiomsGeem.this, android.R.layout.simple_list_item_1, my_first_list) {
                @Override
                public
                View getView(int position, View convertView, ViewGroup parent) {
                    // Get the Item from ListView
                    View view = super.getView(position, convertView, parent);

                    // Initialize a TextView for ListView each Item
                    TextView tv = (TextView) view.findViewById(android.R.id.text1);

                    // Set the text color of TextView (ListView Item)
                    tv.setTextColor(Color.WHITE);
                    // Get the Layout Parameters for ListView Current Item View
                    ViewGroup.LayoutParams params = view.getLayoutParams();

                    // Set the height of the Item View/rows of list
                    params.height = 150;
                    view.setLayoutParams(params);
                    //set size of text
                    tv.setTextSize(15);
                    //set style of text


                    //for changing the background image/color of rows of list view
                    if (position % 4 == 0) {
                        tv.setBackgroundColor(Color.parseColor("#1e86cf"));
                        //  tv.setBackgroundResource(R.drawable.b1);
                    }
                    else if (position % 4 == 1) {
                        tv.setBackgroundColor(Color.parseColor("#2ca0ea"));
                        // tv.setBackgroundResource(R.drawable.b1);

                    }
                    else if (position % 4 == 2) {
                        tv.setBackgroundColor(Color.parseColor("#2cc4ea"));
                        //tv.setBackgroundResource(R.drawable.b1);
                    }
                    else if (position % 4 == 3) {

                        tv.setBackgroundColor(Color.parseColor("#2ceae3"));
                        // tv.setBackgroundResource(R.drawable.b1);
                    }


                    // Generate ListView Item using TextView
                    return view;
                }
            };
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public
                void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Toast.makeText(getApplicationContext(), my_first_list[position], Toast.LENGTH_LONG).show();
                }
            });

        }
        else if (!cachefile.exists() && dirfile.exists()) {
            try {
                BufferedReader brCounter = new BufferedReader(new FileReader(dirfile));
                BufferedReader br = new BufferedReader(new FileReader(dirfile));
                try {
                    while (brCounter.readLine() != null) {
                        intCount++;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                my_first_list = new String[intCount];
                try {
                    for (int i = 0; i <= intCount; i++) {
                        my_first_list[i] = br.readLine();


                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdiomsGeem.this, android.R.layout.simple_list_item_1, my_first_list) {
                @Override
                public
                View getView(int position, View convertView, ViewGroup parent) {
                    // Get the Item from ListView
                    View view = super.getView(position, convertView, parent);

                    // Initialize a TextView for ListView each Item
                    TextView tv = (TextView) view.findViewById(android.R.id.text1);

                    // Set the text color of TextView (ListView Item)
                    tv.setTextColor(Color.WHITE);
                    // Get the Layout Parameters for ListView Current Item View
                    ViewGroup.LayoutParams params = view.getLayoutParams();

                    // Set the height of the Item View/rows of list
                    params.height = 150;
                    view.setLayoutParams(params);
                    //set size of text
                    tv.setTextSize(15);
                    //set style of text


                    //for changing the background image/color of rows of list view
                    if (position % 4 == 0) {
                        tv.setBackgroundColor(Color.parseColor("#1e86cf"));
                        //  tv.setBackgroundResource(R.drawable.b1);
                    }
                    else if (position % 4 == 1) {
                        tv.setBackgroundColor(Color.parseColor("#2ca0ea"));
                        // tv.setBackgroundResource(R.drawable.b1);

                    }
                    else if (position % 4 == 2) {
                        tv.setBackgroundColor(Color.parseColor("#2cc4ea"));
                        //tv.setBackgroundResource(R.drawable.b1);
                    }
                    else if (position % 4 == 3) {

                        tv.setBackgroundColor(Color.parseColor("#2ceae3"));
                        // tv.setBackgroundResource(R.drawable.b1);
                    }


                    // Generate ListView Item using TextView
                    return view;
                }
            };
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public
                void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Toast.makeText(getApplicationContext(), my_first_list[position], Toast.LENGTH_LONG).show();
                }
            });

        }
        else if (!cachefile.exists() && !dirfile.exists()) {
            InputStream inputStreamCounter = this.getAssets().open("idiomsgeem.txt");
            InputStream inputStreamLoader = this.getAssets().open("idiomsgeem.txt");
            BufferedReader brCounter = new BufferedReader(new InputStreamReader(inputStreamCounter));
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStreamLoader));
            try {
                while (brCounter.readLine() != null) {
                    intCount++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            my_first_list = new String[intCount];
            try {
                for (int i = 0; i <= intCount; i++) {
                    my_first_list[i] = br.readLine();


                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdiomsGeem.this, android.R.layout.simple_list_item_1, my_first_list) {
                @Override
                public
                View getView(int position, View convertView, ViewGroup parent) {
                    // Get the Item from ListView
                    View view = super.getView(position, convertView, parent);

                    // Initialize a TextView for ListView each Item
                    TextView tv = (TextView) view.findViewById(android.R.id.text1);

                    // Set the text color of TextView (ListView Item)
                    tv.setTextColor(Color.WHITE);
                    // Get the Layout Parameters for ListView Current Item View
                    ViewGroup.LayoutParams params = view.getLayoutParams();

                    // Set the height of the Item View/rows of list
                    params.height = 150;
                    view.setLayoutParams(params);
                    //set size of text
                    tv.setTextSize(15);
                    //set style of text


                    //for changing the background image/color of rows of list view
                    if (position % 4 == 0) {
                        tv.setBackgroundColor(Color.parseColor("#1e86cf"));
                        //  tv.setBackgroundResource(R.drawable.b1);
                    }
                    else if (position % 4 == 1) {
                        tv.setBackgroundColor(Color.parseColor("#2ca0ea"));
                        // tv.setBackgroundResource(R.drawable.b1);

                    }
                    else if (position % 4 == 2) {
                        tv.setBackgroundColor(Color.parseColor("#2cc4ea"));
                        //tv.setBackgroundResource(R.drawable.b1);
                    }
                    else if (position % 4 == 3) {

                        tv.setBackgroundColor(Color.parseColor("#2ceae3"));
                        // tv.setBackgroundResource(R.drawable.b1);
                    }


                    // Generate ListView Item using TextView
                    return view;
                }
            };
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public
                void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Toast.makeText(getApplicationContext(), my_first_list[position], Toast.LENGTH_LONG).show();
                }
            });

        }
        else {

            Toast.makeText(getApplicationContext(), "Not downloaded Properly", Toast.LENGTH_LONG).show();
        }


    }


}




