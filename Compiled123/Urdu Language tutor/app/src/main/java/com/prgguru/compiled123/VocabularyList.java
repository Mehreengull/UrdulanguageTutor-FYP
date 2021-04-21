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


public class VocabularyList extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


        listView = (ListView) findViewById(R.id.my_list);

        String[] items = {"Animals           جانور",
                          "Birds             پرندے",
                          "Clothing        ملبوسات",
                          "Colors              رنگ",
                          "Common Materials       عام اشیاء",
                          "Days                 دن",
                          "Emotions       جذبات",
                          "Family Relations خاندانی رشتے",
                          "Flowers             پھول",
                          "Food               خوراک",
                          "Fruits               پھل",
                          "Furniture         فرنیچر",
                          "Health         صحت",
                          "Months        مہینے",
                          "Parts of Body     جسمانی اعضاء",
                          "Periods of Time   اوقات",
                          "Personality Types شخصیات کی اقسام",
                          "Professions  شعبہ جات",
                          "Spices  مصالحہ جات",
                          "Vegetables     سبزیاں",
                          "Vehicles          سواری" ,
                          "Weather        موسم"};

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
                    Intent i=new Intent(VocabularyList.this,VocabularyAnimals.class);
                    startActivity(i);
                }
                else if(position==1)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyBirds.class);
                    startActivity(i);
                }
                else if(position==2)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyClothing.class);
                    startActivity(i);
                }
                else if(position==3)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyColors.class);
                    startActivity(i);
                }
                else if(position==4)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyCommonMaterials.class);
                    startActivity(i);
                }
                else if(position==5)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyDays.class);
                    startActivity(i);
                }
                else if(position==6)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyEmotions.class);
                    startActivity(i);
                }
                else if(position==7)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyFamilyRelations.class);
                    startActivity(i);
                }
                else if(position==8)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyFlowers.class);
                    startActivity(i);
                }
                else if(position==9)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyFood.class);
                    startActivity(i);
                }
                else if(position==10)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyFruits.class);
                    startActivity(i);
                }

                else if(position==11)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyFurniture.class);
                    startActivity(i);
                }
                else if(position==12)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyHealth.class);
                    startActivity(i);
                }
                else if(position==13)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyMonths.class);
                    startActivity(i);
                }
                else if(position==14)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyPartsOfBody.class);
                    startActivity(i);
                }
                else if(position==15)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyPeriodsOfTime.class);
                    startActivity(i);
                }
                else if(position==16)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyPersonalityTypes.class);
                    startActivity(i);
                }
                else if(position==17)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyProfessions.class);
                    startActivity(i);
                }
                else if(position==18)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularySpices.class);
                    startActivity(i);
                }
                else if(position==19)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyVegetables.class);
                    startActivity(i);
                }
                else if(position==20)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyVehicles.class);
                    startActivity(i);
                }
                else if(position==21)
                {
                    Intent i=new Intent(VocabularyList.this,VocabularyWeather.class);
                    startActivity(i);
                }

            }


        });







    }
}
