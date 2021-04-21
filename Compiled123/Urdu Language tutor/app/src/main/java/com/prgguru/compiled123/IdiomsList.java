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


public class IdiomsList extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


        listView = (ListView) findViewById(R.id.my_list);

        String[] items = {"ا","آ","ب","پ","ت","ٹ","ث","ج","چ","ح","خ","د","ڈ","ذ","ر","ڑ","ز","ژ","س","ش","ص","ض","ط","ظ","ع","غ","ف","ق","ک","گ","ل","م","ن","و","ہ","ء","ی","ے"};

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
                    Intent i=new Intent(IdiomsList.this,IdiomsAlif.class);
                    startActivity(i);
                }
                else if(position==1)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsAlifMudAa.class);
                    startActivity(i);
                }
                else if(position==2)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsBay.class);
                    startActivity(i);
                }
                else if(position==3)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsPay.class);
                    startActivity(i);
                }
                else if(position==4)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsTay.class);
                    startActivity(i);
                }
                else if(position==5)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsTtay.class);
                    startActivity(i);
                }
                else if(position==6)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsSay.class);
                    startActivity(i);
                }
                else if(position==7)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsGeem.class);
                    startActivity(i);
                }
                else if(position==8)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomChay.class);
                    startActivity(i);
                }
                else if(position==9)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomHay.class);
                    startActivity(i);
                }
                else if(position==10)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsKhay.class);
                    startActivity(i);
                }

                else if(position==11)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsDaal.class);
                    startActivity(i);
                }
                else if(position==12)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomDdal.class);
                    startActivity(i);
                }
                else if(position==13)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsZaal.class);
                    startActivity(i);
                }
                else if(position==14)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsRay.class);
                    startActivity(i);
                }
                else if(position==15)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsRray.class);
                    startActivity(i);
                }
                else if(position==16)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsZay.class);
                    startActivity(i);
                }
                else if(position==17)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsSsay.class);
                    startActivity(i);
                }
                else if(position==18)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsSeen.class);
                    startActivity(i);
                }
                else if(position==19)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsSheen.class);
                    startActivity(i);
                }
                else if(position==20)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsSwaad.class);
                    startActivity(i);
                }
                else if(position==21)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsZwaad.class);
                    startActivity(i);
                }
                else if(position==22)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsToyain.class);
                    startActivity(i);
                }
                else if(position==23)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsZoyain.class);
                    startActivity(i);
                }
                else if(position==24)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsAayin.class);
                    startActivity(i);
                }
                else if(position==25)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsGhayin.class);
                    startActivity(i);
                }
                else if(position==26)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsFay.class);
                    startActivity(i);
                }
                else if(position==27)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsQaaf.class);
                    startActivity(i);
                }
                else if(position==28)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsKaaf.class);
                    startActivity(i);
                }
                else if(position==29)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsGhaaf.class);
                    startActivity(i);
                }
                else if(position==30)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsLaam.class);
                    startActivity(i);
                }
                else if(position==31)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsMeem.class);
                    startActivity(i);
                }
                else if(position==32)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsNoon.class);
                    startActivity(i);
                }
                else if(position==33)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsWow.class);
                    startActivity(i);
                }
                else if(position==34)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsHayy.class);
                    startActivity(i);
                }
                else if(position==35)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsHamza.class);
                    startActivity(i);
                }
                else if(position==36)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsChotiye.class);
                    startActivity(i);
                }
                else if(position==37)
                {
                    Intent i=new Intent(IdiomsList.this,IdiomsBarriye.class);
                    startActivity(i);
                }
            }


        });







    }
}
