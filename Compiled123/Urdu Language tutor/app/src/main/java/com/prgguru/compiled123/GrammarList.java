package com.prgguru.compiled123;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class GrammarList extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);


        listView = (ListView) findViewById(R.id.my_list);

        String[] items = {"Fail                 فعل",
                " Hurrf                 حرف",
                "Issm                 اسم",
                "Jumla               جملہ",
                "Kalma              کلمہ",
                "Lafz                       لفظ"
        };

        arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,items)
        {
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                // Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                // Initialize a TextView for ListView each Item
                TextView tv = (TextView) view.findViewById(android.R.id.text1);


                // Set the text color of TextView (ListView Item)
                tv.setTextColor(Color.WHITE);


                ViewGroup.LayoutParams params = view.getLayoutParams();

                // Set the height of the Item View/rows of list
                params.height = 250;
                view.setLayoutParams(params);
                //set size of text
                tv.setTextSize(25);

                //set style of text



                //for changing the background image/color of rows of list view
                if (position%4 == 0){
                    tv.setBackgroundColor(Color.parseColor("#1e86cf"));
                    //  tv.setBackgroundResource(R.drawable.b1);
                } else if (position%4 == 1){
                    tv.setBackgroundColor(Color.parseColor("#2ca0ea"));
                    // tv.setBackgroundResource(R.drawable.b1);
                } else if (position%4 == 2){
                    tv.setBackgroundColor(Color.parseColor("#2cc4ea"));
                    //tv.setBackgroundResource(R.drawable.b1);
                } else if (position%4 == 3){
                    tv.setBackgroundColor(Color.parseColor("#2ceae3"));
                    // tv.setBackgroundResource(R.drawable.b1);
                }

                // Generate ListView Item using TextView
                return view;
            }
        };
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    Intent i=new Intent(GrammarList.this,GrammarFail.class);
                    startActivity(i);
                }
                else if(position==1)
                {
                    Intent i=new Intent(GrammarList.this,GrammarHurrf.class);
                    startActivity(i);
                }
                else if(position==2)
                {
                    Intent i=new Intent(GrammarList.this,GrammarIssm.class);
                    startActivity(i);
                }
                else if(position==3)
                {
                    Intent i=new Intent(GrammarList.this,GrammarJumla.class);
                    startActivity(i);
                }
                else if(position==4)
                {
                    Intent i=new Intent(GrammarList.this,GrammarKalma.class);
                    startActivity(i);
                }
                 else if(position==5)
                {
                    Intent i=new Intent(GrammarList.this,GrammarLafz.class);
                    startActivity(i);
                }

            }


        });






    }
}
