package com.prgguru.compiled123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Field;
import java.util.ArrayList;
import android.app.Activity;
import android.widget.TextView;


public class ActivityListHaroofTracing extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_haroof_tracing);


        listView = (ListView) findViewById(R.id.my_list);

        String[] items = { "ا","آ","ب","پ","ت","ٹ","ث","ج","چ","ح","خ","د","ڈ","ذ","ر","ڑ","ز","ژ","س","ش","ص","ض","ط","ظ","ع","غ","ف","ق","ک","گ","ل","م","ن","و","ہ","ء","ی","ے" };

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
                params.height = 250;
                view.setLayoutParams(params);
                //set size of text
                tv.setTextSize(35);

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
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityAlif.class);
                    startActivity(i);
                }
               else if(position==1)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityAlifMudAa.class);
                    startActivity(i);
                }
                else if(position==2)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityBay.class);
                    startActivity(i);
                }
                else if(position==3)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityPay.class);
                    startActivity(i);
                }
                else if(position==4)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityTay.class);
                    startActivity(i);
                }
                else if(position==5)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityTtay.class);
                    startActivity(i);
                }
                else if(position==6)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivitySay.class);
                    startActivity(i);
                }
                else if(position==7)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityGeem.class);
                    startActivity(i);
                }
                else if(position==8)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityChay.class);
                    startActivity(i);
                }
                else if(position==9)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityHay.class);
                    startActivity(i);
                }
                else if(position==10)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityKhay.class);
                    startActivity(i);
                }

                else if(position==11)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityDaal.class);
                    startActivity(i);
                }
                else if(position==12)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityDdaal.class);
                    startActivity(i);
                }
                else if(position==13)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityZaal.class);
                    startActivity(i);
                }
                else if(position==14)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityRay.class);
                    startActivity(i);
                }
                else if(position==15)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityRray.class);
                    startActivity(i);
                }
                else if(position==16)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityZay.class);
                    startActivity(i);
                }
                else if(position==17)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivitySayy.class);
                    startActivity(i);
                }
                else if(position==18)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivitySeen.class);
                    startActivity(i);
                }
                else if(position==19)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivitySheen.class);
                    startActivity(i);
                }
                else if(position==20)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivitySwaad.class);
                    startActivity(i);
                }
                else if(position==21)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityZwaad.class);
                    startActivity(i);
                }
                else if(position==22)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityToyain.class);
                    startActivity(i);
                }
                else if(position==23)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityZoyain.class);
                    startActivity(i);
                }
                else if(position==24)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityAayin.class);
                    startActivity(i);
                }
                else if(position==25)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityGhayin.class);
                    startActivity(i);
                }
                else if(position==26)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityFay.class);
                    startActivity(i);
                }
                else if(position==27)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityQaaf.class);
                    startActivity(i);
                }
                else if(position==28)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityKaaf.class);
                    startActivity(i);
                }
                else if(position==29)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityGhaaf.class);
                    startActivity(i);
                }
                else if(position==30)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityLaam.class);
                    startActivity(i);
                }
                else if(position==31)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityMeem.class);
                    startActivity(i);
                }
                else if(position==32)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityNoon.class);
                    startActivity(i);
                }
                else if(position==33)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityWow.class);
                    startActivity(i);
                }
                else if(position==34)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityHayy.class);
                    startActivity(i);
                }
                else if(position==35)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityHamza.class);
                    startActivity(i);
                }
                else if(position==36)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityChotiye.class);
                    startActivity(i);
                }
                else if(position==37)
                {
                    Intent i=new Intent(ActivityListHaroofTracing.this,ActivityBarriye.class);
                    startActivity(i);
                }






            }
        });







    }
}
