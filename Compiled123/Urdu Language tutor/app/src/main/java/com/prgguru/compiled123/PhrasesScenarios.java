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


public class PhrasesScenarios extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


        listView = (ListView) findViewById(R.id.my_list);

        String[] items = {"Asking For Help                   مدد کے لیے پوچھنا",
                " Greetings               آداب و تسلیمات ",
                "Say Thanks         شکریہ ادا کرنا",
                "Solving A Misunderstanding              غلط فہمی کو دور کرنا",
                "Wish Someone Something               کسی کے لیے کوئی خواہش کرنا"

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

             /*   String[]  array={"ا","آ","ب","پ","ت","ٹ","ث","ج","چ","ح","خ","د","ڈ","ذ","ر","ڑ","ز","ژ","س","ش","ص","ض","ط","ظ","ع","غ","ف","ق","ک","گ","ل","م","ن","و","ہ","ء","ی","ے"};
                for(int i=0;i<array.length;i++)
                {
                    if(position==i)
                    {
                        tv.setText(array[i]);


                    }



                }*/// Get the Layout Parameters for ListView Current Item View
                ViewGroup.LayoutParams params = view.getLayoutParams();

                // Set the height of the Item View/rows of list
                params.height = 300;
                view.setLayoutParams(params);
                //set size of text
                tv.setTextSize(20);

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
                    Intent i=new Intent(PhrasesScenarios.this,PhrasesAskingForHelp.class);
                    startActivity(i);
                }
                else if(position==1)
                {
                    Intent i=new Intent(PhrasesScenarios.this,PhrasesGreetings.class);
                    startActivity(i);
                }
                else if(position==2)
                {
                    Intent i=new Intent(PhrasesScenarios.this,PhrasesSayThanks.class);
                    startActivity(i);
                }
                else if(position==3)
                {
                    Intent i=new Intent(PhrasesScenarios.this,PhrasesSolvingAMisunderstanding.class);
                    startActivity(i);
                }
                else if(position==4)
                {
                    Intent i=new Intent(PhrasesScenarios.this,PhrasesWishSomeoneSomething.class);
                    startActivity(i);
                }

            }


        });






    }
}
