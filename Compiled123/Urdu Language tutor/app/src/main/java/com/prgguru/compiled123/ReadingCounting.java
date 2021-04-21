package com.prgguru.compiled123;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Field;
import java.util.ArrayList;


public class ReadingCounting extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter arrayAdapter;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_counting);
        listView=(ListView)findViewById(R.id.my_list);
        arrayList=new ArrayList<String>();

        Field[] fields=R.raw.class.getFields();
        for(int i=38; i<138;i++)
        {
            arrayList.add(fields[i].getName());
        }
        arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList)
        {
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                // Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                // Initialize a TextView for ListView each Item
                TextView tv = (TextView) view.findViewById(android.R.id.text1);


                // Set the text color of TextView (ListView Item)
                tv.setTextColor(Color.WHITE);
                String[]  array={"1                ایک" ,
                        "2                 دو",
                        "3               تین",
                        "4               چار",
                        "5                پانچ",
                        "6                چھ",
                        "7                سات" ,
                        "8                  آٹھ" ,
                        "9                  نو",
                        "10                  دس" ,
                        "11              گیارہ",
                        "12               بارہ",
                        " 13               تیرہ",
                        "14                 چودہ",
                        "15               پندرہ",
                        "16                 سولہ",
                        "17                سترہ" ,
                        "18                 اٹھارہ",
                        "19                 انیس" ,
                        "20                   بیس" ,
                        "21                 اکیس" ,
                        " 22             بائیس" ,
                        " 23                تئیس" ,
                        "24                چوبیس",
                        "25                 پچیس" ,
                        "26               چھبیس" ,
                        " 27               ستائیس" ,
                        " 28              اٹھائیس" ,
                        "29                انتیس" ,
                        " 30                 تیس" ,
                        "31                اکتیس" ,
                        " 32                 بتیس" ,
                        " 33              تینتیس" ,
                        " 34              چونتیس" ,
                        "35               پینتیس" ,
                        "36                 چھتیس",
                        "37                 سنتیس",
                        " 38                 اڑتیس" ,
                        " 39               انتالیس" ,
                        "  40                 چالیس" ,
                        "  41               اکتالیس" ,
                        "42                بیالیس" ,
                        "43               تینتالیس",
                        " 44                چوالیس",
                        " 45               پینتالیس" ,
                        "46                چھیالیس" ,
                        "47                سینتالیس",
                        " 48                اڑتالیس" ,
                        "49                   انچاس",
                        "    50                  پچاس" ,
                        "  51                  اکاون",
                        " 52                   باون",
                        "  53                   تریپن" ,
                        "54                      چون" ,
                        " 55                    پچپن" ,
                        "56                     چھپن" ,
                        "  57                  ستاون" ,
                        " 58                  اٹھاون" ,
                        "  59                 انسٹھ" ,
                        " 60                    ساٹھ",
                        "61                   اکسٹھ" ,
                        "62                  باسٹھ",
                        " 63              تریسٹھ" ,
                        " 64                  چونسٹھ" ,
                        "65                 پینسٹھ" ,
                        "66              چھیاسٹھ",
                        "67                سڑساٹھ" ,
                        "68                 اٹھسٹھ",
                        "69                 انهتر" ,
                        "70                    ستر" ,
                        "    71                اکھتر" ,
                        "  72                بھتر" ,
                        "  73                تھتر" ,
                        "  74                چوھتر" ,
                        "75                پچھتر" ,
                        "     76                  چھہتر",
                        "   77                  ستتر" ,
                        " 78                   اٹھتر" ,
                        " 79                 اناسي",
                        "  80                   اسی" ,
                        "81               اکاسي" ,
                        "  82               بیاسي" ,
                        "83              تراسي" ,
                        " 84               چوراسي" ,
                        "  85                پچھاسي" ,
                        "   86                چھیاسي" ,
                        " 87                ستاسي" ,
                        " 88             اٹھاسي" ,
                        " 89                نواسي" ,
                        "   90                نوے" ,
                        " 91              اکانوے" ,
                        "92                بانوے" ,
                        "  93                ترانوے" ,
                        " 94                چورانوے" ,
                        "   95                 پچانوے" ,
                        " 96             چھیانوے" ,
                        "  97                ستانوے" ,
                        " 98                اٹھانوے" ,
                        "  99             ننانوے" ,
                        "   100               سو"

                };
                for(int i=0;i<array.length;i++)
                {
                    if(position==i)
                    {
                        tv.setText(array[i]);


                    }



                }// Get the Layout Parameters for ListView Current Item View
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

                if (position == 0) {
                    Intent i = new Intent(ReadingCounting.this,ActivityAik.class);
                    startActivity(i);
                }
                if (position == 1){
                    Intent i = new Intent(ReadingCounting.this,ActivityDo.class);
                    startActivity(i);
                }
                if (position == 2){
                    Intent i = new Intent(ReadingCounting.this,ActivityTeen.class);
                    startActivity(i);
                }
                if (position == 3){
                    Intent i = new Intent(ReadingCounting.this,ActivityChar.class);
                    startActivity(i);
                }
                if (position == 4){
                    Intent i = new Intent(ReadingCounting.this,ActivityPanch.class);
                    startActivity(i);
                }
                if (position == 5){
                    Intent i = new Intent(ReadingCounting.this,ActivityChaay.class);
                    startActivity(i);
                }
                if (position == 6){
                    Intent i = new Intent(ReadingCounting.this,ActivitySath.class);
                    startActivity(i);
                }
                if (position == 7){
                    Intent i = new Intent(ReadingCounting.this,ActivityAath.class);
                    startActivity(i);
                }
                if (position == 8){
                    Intent i = new Intent(ReadingCounting.this,ActivityNoo.class);
                    startActivity(i);
                }
                if (position == 9){
                    Intent i = new Intent(ReadingCounting.this,ActivityTen.class);
                    startActivity(i);
                }


                if( mediaPlayer!=null)
                {
                    mediaPlayer.release();

                }
                if(position>9 )
                {
                    int resId;
                    resId = getResources().getIdentifier(arrayList.get(position), "raw", getPackageName());
                    mediaPlayer = MediaPlayer.create(ReadingCounting.this, resId);
                    mediaPlayer.start();

                }




            }
        });





    }
}
