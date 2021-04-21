package com.prgguru.compiled123;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class SplashScreen extends AppCompatActivity {

    String FileStatus;
    //Vocabulary Data
    private static String file_url1 = "https://urdututor.000webhostapp.com/vocabularyanimals.txt";
    private static String file_url2 = "https://urdututor.000webhostapp.com/vocabularybirds.txt";
    private static String file_url3 = "https://urdututor.000webhostapp.com/vocabularyclothing.txt";
    private static String file_url4 = "https://urdututor.000webhostapp.com/vocabularycolors.txt";
    private static String file_url5 = "https://urdututor.000webhostapp.com/vocabularycommonmaterials.txt";
    private static String file_url6 = "https://urdututor.000webhostapp.com/vocabularydays.txt";
    private static String file_url7 = "https://urdututor.000webhostapp.com/vocabularyemotions.txt";
    private static String file_url8 = "https://urdututor.000webhostapp.com/vocabularyfamilyrelations.txt";
    private static String file_url9 =  "https://urdututor.000webhostapp.com/vocabularyflowers.txt";
    private static String file_url10 = "https://urdututor.000webhostapp.com/vocabularyfood.txt";
    private static String file_url11 = "https://urdututor.000webhostapp.com/vocabularyfruits.txt";
    private static String file_url12 = "https://urdututor.000webhostapp.com/vocabularyfurniture.txt";
    private static String file_url13 = "https://urdututor.000webhostapp.com/vocabularyhealth.txt";
    private static String file_url14 = "https://urdututor.000webhostapp.com/vocabularymonths.txt";
    private static String file_url15 = "https://urdututor.000webhostapp.com/vocabularypartsofbody.txt";
    private static String file_url16 = "https://urdututor.000webhostapp.com/vocabularyperiodsoftime.txt";
    private static String file_url17 = "https://urdututor.000webhostapp.com/vocabularypersonalitytypes.txt";
    private static String file_url18 = "https://urdututor.000webhostapp.com/vocabularyprofessions.txt";
    private static String file_url19 = "https://urdututor.000webhostapp.com/vocabularyspices.txt";
    private static String file_url20 = "https://urdututor.000webhostapp.com/vocabularyvegetabels.txt";
    private static String file_url21 = "https://urdututor.000webhostapp.com/vocabularyvehicels.txt";
    private static String file_url22 = "https://urdututor.000webhostapp.com/vocabularyweather.txt";


    //Conversations Data
    private static String file_url23 = "https://urdututor.000webhostapp.com/conversation_athospital.txt";
    private static String file_url24 = "https://urdututor.000webhostapp.com/conversation_athotel.txt";
    private static String file_url25 = "https://urdututor.000webhostapp.com/conversation_atrestaurant.txt";
    private static String file_url26 = "https://urdututor.000webhostapp.com/conversation_atshop.txt";
    private static String file_url27 = "https://urdututor.000webhostapp.com/conversaton_forintroduction.txt";

    //grammar Data
    private static String file_url28 = "https://urdututor.000webhostapp.com/grammar_fail.txt";
    private static String file_url29 = "https://urdututor.000webhostapp.com/grammar_hurrf.txt";
    private static String file_url30 = "https://urdututor.000webhostapp.com/grammar_issm.txt";
    private static String file_url31 = "https://urdututor.000webhostapp.com/grammar_jumla.txt";
    private static String file_url32 = "https://urdututor.000webhostapp.com/grammar_kalma.txt";
    private static String file_url33 = "https://urdututor.000webhostapp.com/grammar_lafz.txt";

    //idioms Data
    private static String file_url34 = "https://urdututor.000webhostapp.com/idiomchay.txt";
    private static String file_url35 = "https://urdututor.000webhostapp.com/idiomddal.txt";
    private static String file_url36 = "https://urdututor.000webhostapp.com/idiomhay.txt";
    private static String file_url37 = "https://urdututor.000webhostapp.com/idiomsaayin.txt";
    private static String file_url38 = "https://urdututor.000webhostapp.com/idiomsalif.txt";
    private static String file_url39 = "https://urdututor.000webhostapp.com/idiomsalifmudaa.txt";
    private static String file_url40 = "https://urdututor.000webhostapp.com/idiomsbarriye.txt";
    private static String file_url41 = "https://urdututor.000webhostapp.com/idiomsbay.txt";
    private static String file_url42 = "https://urdututor.000webhostapp.com/idiomschotiye.txt";
    private static String file_url43 = "https://urdututor.000webhostapp.com/idiomsdaal.txt";
    private static String file_url44 = "https://urdututor.000webhostapp.com/idiomsfay.txt";
    private static String file_url45 = "https://urdututor.000webhostapp.com/idiomsgeem.txt";
    private static String file_url46 = "https://urdututor.000webhostapp.com/idiomsghaaf.txt";
    private static String file_url47 = "https://urdututor.000webhostapp.com/idiomsghayin.txt";
    private static String file_url48 = "https://urdututor.000webhostapp.com/idiomshamza.txt";
    private static String file_url49 = "https://urdututor.000webhostapp.com/idiomshayy.txt";
    private static String file_url50 = "https://urdututor.000webhostapp.com/idiomskaaf.txt";
    private static String file_url51 = "https://urdututor.000webhostapp.com/idiomskhay.txt";
    private static String file_url52 = "https://urdututor.000webhostapp.com/idiomslaam.txt";
    private static String file_url53 = "https://urdututor.000webhostapp.com/idiomsmeem.txt";
    private static String file_url54 = "https://urdututor.000webhostapp.com/idiomsnoon.txt";
    private static String file_url55 = "https://urdututor.000webhostapp.com/idiomspay.txt";
    private static String file_url56 = "https://urdututor.000webhostapp.com/idiomsqaaf.txt";
    private static String file_url57 = "https://urdututor.000webhostapp.com/idiomsray.txt";
    private static String file_url58 = "https://urdututor.000webhostapp.com/idiomsrray.txt";
    private static String file_url59 = "https://urdututor.000webhostapp.com/idiomssay.txt";
    private static String file_url60 = "https://urdututor.000webhostapp.com/idiomssayy.txt";
    private static String file_url61 = "https://urdututor.000webhostapp.com/idiomsseen.txt";
    private static String file_url62 = "https://urdututor.000webhostapp.com/idiomssheen.txt";
    private static String file_url63 = "https://urdututor.000webhostapp.com/idiomsswaad.txt";
    private static String file_url64 = "https://urdututor.000webhostapp.com/idiomstay.txt";
    private static String file_url65 = "https://urdututor.000webhostapp.com/idiomstoyain.txt";
    private static String file_url66 = "https://urdututor.000webhostapp.com/idiomsttay.txt";
    private static String file_url67 = "https://urdututor.000webhostapp.com/idiomswow.txt";
    private static String file_url68 = "https://urdututor.000webhostapp.com/idiomszaal.txt";
    private static String file_url69 = "https://urdututor.000webhostapp.com/idiomszay.txt";
    private static String file_url70 = "https://urdututor.000webhostapp.com/idiomszoyain.txt";
    private static String file_url71 = "https://urdututor.000webhostapp.com/idiomszwaad.txt";

    //Phrases Data
    private static String file_url72 = "https://urdututor.000webhostapp.com/phrases_askingforhelp.txt";
    private static String file_url73 = "https://urdututor.000webhostapp.com/phrases_greetings.txt";
    private static String file_url74 = "https://urdututor.000webhostapp.com/phrases_saythanks.txt";
    private static String file_url75 = "https://urdututor.000webhostapp.com/phrases_solvingamisunderstanding.txt";
    private static String file_url76 = "https://urdututor.000webhostapp.com/phrases_wishsomeonesomething.txt";

    //Proverbs Data
    private static String file_url77 = "https://urdututor.000webhostapp.com/proverbs_aayin.txt";
    private static String file_url78 = "https://urdututor.000webhostapp.com/proverbs_alif.txt";
    private static String file_url79 = "https://urdututor.000webhostapp.com/proverbs_alifmudaa.txt";
    private static String file_url80 = "https://urdututor.000webhostapp.com/proverbs_barriye.txt";
    private static String file_url81 = "https://urdututor.000webhostapp.com/proverbs_bay.txt";
    private static String file_url82 = "https://urdututor.000webhostapp.com/proverbs_chay.txt";
    private static String file_url83= "https://urdututor.000webhostapp.com/proverbs_chotiye.txt";
    private static String file_url84 = "https://urdututor.000webhostapp.com/proverbs_daal.txt";
    private static String file_url85 = "https://urdututor.000webhostapp.com/proverbs_ddal.txt";
    private static String file_url86 = "https://urdututor.000webhostapp.com/proverbs_fay.txt";
    private static String file_url87 = "https://urdututor.000webhostapp.com/proverbs_geem.txt";
    private static String file_url88= "https://urdututor.000webhostapp.com/proverbs_ghaaf.txt";
    private static String file_url89 = "https://urdututor.000webhostapp.com/proverbs_ghayin.txt";
    private static String file_url90 = "https://urdututor.000webhostapp.com/proverbs_hamza.txt";
    private static String file_url91 = "https://urdututor.000webhostapp.com/proverbs_hay.txt";
    private static String file_url92 = "https://urdututor.000webhostapp.com/proverbs_hayy.txt";
    private static String file_url93 = "https://urdututor.000webhostapp.com/proverbs_kaaf.txt";
    private static String file_url94 = "https://urdututor.000webhostapp.com/proverbs_khay.txt";
    private static String file_url95 = "https://urdututor.000webhostapp.com/proverbs_laam.txt";
    private static String file_url96 = "https://urdututor.000webhostapp.com/proverbs_meem.txt";
    private static String file_url97 = "https://urdututor.000webhostapp.com/proverbs_noon.txt";
    private static String file_url98 = "https://urdututor.000webhostapp.com/proverbs_pay.txt";
    private static String file_url99 = "https://urdututor.000webhostapp.com/proverbs_qaaf.txt";
    private static String file_url100 = "https://urdututor.000webhostapp.com/proverbs_ray.txt";
    private static String file_url101 = "https://urdututor.000webhostapp.com/proverbs_rray.txt";
    private static String file_url102 = "https://urdututor.000webhostapp.com/proverbs_say.txt";
    private static String file_url103 = "https://urdututor.000webhostapp.com/proverbs_sayy.txt";
    private static String file_url104 = "https://urdututor.000webhostapp.com/proverbs_seen.txt";
    private static String file_url105 = "https://urdututor.000webhostapp.com/proverbs_sheen.txt";
    private static String file_url106 = "https://urdututor.000webhostapp.com/proverbs_swaad.txt";
    private static String file_url107 = "https://urdututor.000webhostapp.com/proverbs_tay.txt";
    private static String file_url108 = "https://urdututor.000webhostapp.com/proverbs_toyain.txt";
    private static String file_url109 = "https://urdututor.000webhostapp.com/proverbs_ttay.txt";
    private static String file_url110 = "https://urdututor.000webhostapp.com/proverbs_wow.txt";
    private static String file_url111 = "https://urdututor.000webhostapp.com/proverbs_zaal.txt";
    private static String file_url112 = "https://urdututor.000webhostapp.com/proverbs_zay.txt";
    private static String file_url113 = "https://urdututor.000webhostapp.com/proverbs_zoyain.txt";
    private static String file_url114 = "https://urdututor.000webhostapp.com/proverbs_zwaad.txt";

    private static int SPLASH_TIME_OUT=2500;
    Handler  handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        new DownloadFileFromURL().execute(file_url1);
        new DownloadFileFromURL().execute(file_url2);
        new DownloadFileFromURL().execute(file_url3);
        new DownloadFileFromURL().execute(file_url4);
        new DownloadFileFromURL().execute(file_url5);
        new DownloadFileFromURL().execute(file_url6);
        new DownloadFileFromURL().execute(file_url7);
        new DownloadFileFromURL().execute(file_url8);
        new DownloadFileFromURL().execute(file_url9);
        new DownloadFileFromURL().execute(file_url10);
        new DownloadFileFromURL().execute(file_url11);
        new DownloadFileFromURL().execute(file_url12);
        new DownloadFileFromURL().execute(file_url13);
        new DownloadFileFromURL().execute(file_url14);
        new DownloadFileFromURL().execute(file_url15);
        new DownloadFileFromURL().execute(file_url16);
        new DownloadFileFromURL().execute(file_url17);
        new DownloadFileFromURL().execute(file_url18);
        new DownloadFileFromURL().execute(file_url19);
        new DownloadFileFromURL().execute(file_url20);
        new DownloadFileFromURL().execute(file_url21);
        new DownloadFileFromURL().execute(file_url22);
        new DownloadFileFromURL().execute(file_url23);
        new DownloadFileFromURL().execute(file_url24);
        new DownloadFileFromURL().execute(file_url25);
        new DownloadFileFromURL().execute(file_url26);
        new DownloadFileFromURL().execute(file_url27);
        new DownloadFileFromURL().execute(file_url28);
        new DownloadFileFromURL().execute(file_url29);
        new DownloadFileFromURL().execute(file_url30);
        new DownloadFileFromURL().execute(file_url31);
        new DownloadFileFromURL().execute(file_url32);
        new DownloadFileFromURL().execute(file_url33);
        new DownloadFileFromURL().execute(file_url34);
        new DownloadFileFromURL().execute(file_url35);
        new DownloadFileFromURL().execute(file_url36);
        new DownloadFileFromURL().execute(file_url37);
        new DownloadFileFromURL().execute(file_url38);
        new DownloadFileFromURL().execute(file_url39);
        new DownloadFileFromURL().execute(file_url40);
        new DownloadFileFromURL().execute(file_url41);
        new DownloadFileFromURL().execute(file_url42);
        new DownloadFileFromURL().execute(file_url43);
        new DownloadFileFromURL().execute(file_url44);
        new DownloadFileFromURL().execute(file_url45);
        new DownloadFileFromURL().execute(file_url46);
        new DownloadFileFromURL().execute(file_url47);
        new DownloadFileFromURL().execute(file_url48);
        new DownloadFileFromURL().execute(file_url49);
        new DownloadFileFromURL().execute(file_url50);
        new DownloadFileFromURL().execute(file_url51);
        new DownloadFileFromURL().execute(file_url52);
        new DownloadFileFromURL().execute(file_url53);
        new DownloadFileFromURL().execute(file_url54);
        new DownloadFileFromURL().execute(file_url55);
        new DownloadFileFromURL().execute(file_url56);
        new DownloadFileFromURL().execute(file_url57);
        new DownloadFileFromURL().execute(file_url58);
        new DownloadFileFromURL().execute(file_url59);
        new DownloadFileFromURL().execute(file_url60);
        new DownloadFileFromURL().execute(file_url61);
        new DownloadFileFromURL().execute(file_url62);
        new DownloadFileFromURL().execute(file_url63);
        new DownloadFileFromURL().execute(file_url64);
        new DownloadFileFromURL().execute(file_url65);
        new DownloadFileFromURL().execute(file_url66);
        new DownloadFileFromURL().execute(file_url67);
        new DownloadFileFromURL().execute(file_url68);
        new DownloadFileFromURL().execute(file_url69);
        new DownloadFileFromURL().execute(file_url70);
        new DownloadFileFromURL().execute(file_url71);
        new DownloadFileFromURL().execute(file_url72);
        new DownloadFileFromURL().execute(file_url73);
        new DownloadFileFromURL().execute(file_url74);
        new DownloadFileFromURL().execute(file_url75);
        new DownloadFileFromURL().execute(file_url76);
        new DownloadFileFromURL().execute(file_url77);
        new DownloadFileFromURL().execute(file_url78);
        new DownloadFileFromURL().execute(file_url79);
        new DownloadFileFromURL().execute(file_url80);
        new DownloadFileFromURL().execute(file_url81);
        new DownloadFileFromURL().execute(file_url82);
        new DownloadFileFromURL().execute(file_url83);
        new DownloadFileFromURL().execute(file_url84);
        new DownloadFileFromURL().execute(file_url85);
        new DownloadFileFromURL().execute(file_url86);
        new DownloadFileFromURL().execute(file_url87);
        new DownloadFileFromURL().execute(file_url88);
        new DownloadFileFromURL().execute(file_url88);
        new DownloadFileFromURL().execute(file_url89);
        new DownloadFileFromURL().execute(file_url90);
        new DownloadFileFromURL().execute(file_url91);
        new DownloadFileFromURL().execute(file_url92);
        new DownloadFileFromURL().execute(file_url93);
        new DownloadFileFromURL().execute(file_url94);
        new DownloadFileFromURL().execute(file_url95);
        new DownloadFileFromURL().execute(file_url96);
        new DownloadFileFromURL().execute(file_url97);
        new DownloadFileFromURL().execute(file_url98);
        new DownloadFileFromURL().execute(file_url99);
        new DownloadFileFromURL().execute(file_url100);
        new DownloadFileFromURL().execute(file_url101);
        new DownloadFileFromURL().execute(file_url102);
        new DownloadFileFromURL().execute(file_url103);
        new DownloadFileFromURL().execute(file_url104);
        new DownloadFileFromURL().execute(file_url105);
        new DownloadFileFromURL().execute(file_url106);
        new DownloadFileFromURL().execute(file_url107);
        new DownloadFileFromURL().execute(file_url108);
        new DownloadFileFromURL().execute(file_url109);
        new DownloadFileFromURL().execute(file_url110);
        new DownloadFileFromURL().execute(file_url111);
        new DownloadFileFromURL().execute(file_url112);
        new DownloadFileFromURL().execute(file_url113);
        new DownloadFileFromURL().execute(file_url114);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreen.this, MainMenu.class);
                startActivity(intent);
                finish();
            }
        },2500);



    }

    class DownloadFileFromURL extends AsyncTask<String, String, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();

        }

        /**
         * Downloading file in background thread
         */
        @Override
        protected String doInBackground(String... f_url) {
            int count;
            String filename;
            try {
                URL url;
                url = new URL(f_url[0]);
                URLConnection conection = url.openConnection();
                conection.connect();
                int lenghtOfFile = conection.getContentLength();
                // download the file
                InputStream input = new BufferedInputStream(url.openStream(), 8192);
                byte data[] = new byte[8192];
                long total = 0;
                filename=givefilename(f_url[0]);
                //in cache of app
                File folder = getCacheDir();
                File myfile;
                myfile = new File(folder, filename);
                FileOutputStream fileOutputStreamincache = null;
                FileOutputStream fileOutputStream = null;
                try {
                    fileOutputStream=openFileOutput(filename,MODE_PRIVATE);
                    fileOutputStreamincache = new FileOutputStream(myfile);

                    while ((count = input.read(data)) != -1) {

                        total += count;

                        fileOutputStream.write(data);
                        fileOutputStreamincache.write(data);

                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            fileOutputStreamincache.close();


                            input.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }


                }


            } catch (Exception e) {

                Log.e("Error ", e.getMessage());

            }

            return null;
        }


        public String givefilename(String array)
        {
            String getfilename="";
            String[] arr;
            arr = new String[]{"https://urdututor.000webhostapp.com/vocabularyanimals.txt",
                    "https://urdututor.000webhostapp.com/vocabularybirds.txt",
                    "https://urdututor.000webhostapp.com/vocabularyclothing.txt",
                    "https://urdututor.000webhostapp.com/vocabularycolors.txt",
                    "https://urdututor.000webhostapp.com/vocabularycommonmaterials.txt",
                    "https://urdututor.000webhostapp.com/vocabularydays.txt",
                    "https://urdututor.000webhostapp.com/vocabularyemotions.txt",
                    "https://urdututor.000webhostapp.com/vocabularyfamilyrelations.txt",
                    "https://urdututor.000webhostapp.com/vocabularyflowers.txt",
                    "https://urdututor.000webhostapp.com/vocabularyfood.txt",
                    "https://urdututor.000webhostapp.com/vocabularyfruits.txt",
                    "https://urdututor.000webhostapp.com/vocabularyfurniture.txt",
                    "https://urdututor.000webhostapp.com/vocabularyhealth.txt",
                    "https://urdututor.000webhostapp.com/vocabularymonths.txt",
                    "https://urdututor.000webhostapp.com/vocabularypartsofbody.txt",
                    "https://urdututor.000webhostapp.com/vocabularyperiodsoftime.txt",
                    "https://urdututor.000webhostapp.com/vocabularypersonalitytypes.txt",
                    "https://urdututor.000webhostapp.com/vocabularyprofessions.txt",
                    "https://urdututor.000webhostapp.com/vocabularyspices.txt",
                    "https://urdututor.000webhostapp.com/vocabularyvegetabels.txt",
                    "https://urdututor.000webhostapp.com/vocabularyvehicels.txt",
                    "https://urdututor.000webhostapp.com/vocabularyweather.txt",
                    "https://urdututor.000webhostapp.com/conversation_athospital.txt",
                    "https://urdututor.000webhostapp.com/conversation_athotel.txt",
                    "https://urdututor.000webhostapp.com/conversation_atrestaurant.txt",
                    "https://urdututor.000webhostapp.com/conversation_atshop.txt",
                    "https://urdututor.000webhostapp.com/conversaton_forintroduction.txt",
                    "https://urdututor.000webhostapp.com/grammar_fail.txt",
                    "https://urdututor.000webhostapp.com/grammar_hurrf.txt",
                    "https://urdututor.000webhostapp.com/grammar_issm.txt",
                    "https://urdututor.000webhostapp.com/grammar_jumla.txt",
                    "https://urdututor.000webhostapp.com/grammar_kalma.txt",
                    "https://urdututor.000webhostapp.com/grammar_lafz.txt",
                    "https://urdututor.000webhostapp.com/idiomchay.txt",
                    "https://urdututor.000webhostapp.com/idiomddal.txt",
                    "https://urdututor.000webhostapp.com/idiomhay.txt",
                    "https://urdututor.000webhostapp.com/idiomsaayin.txt",
                    "https://urdututor.000webhostapp.com/idiomsalif.txt",
                    "https://urdututor.000webhostapp.com/idiomsalifmudaa.txt",
                    "https://urdututor.000webhostapp.com/idiomsbarriye.txt",
                    "https://urdututor.000webhostapp.com/idiomsbay.txt",
                    "https://urdututor.000webhostapp.com/idiomschotiye.txt",
                    "https://urdututor.000webhostapp.com/idiomsdaal.txt",
                    "https://urdututor.000webhostapp.com/idiomsfay.txt",
                    "https://urdututor.000webhostapp.com/idiomsgeem.txt",
                    "https://urdututor.000webhostapp.com/idiomsghaaf.txt",
                    "https://urdututor.000webhostapp.com/idiomsghayin.txt",
                    "https://urdututor.000webhostapp.com/idiomshamza.txt",
                    "https://urdututor.000webhostapp.com/idiomshayy.txt",
                    "https://urdututor.000webhostapp.com/idiomskaaf.txt",
                    "https://urdututor.000webhostapp.com/idiomskhay.txt",
                    "https://urdututor.000webhostapp.com/idiomslaam.txt",
                    "https://urdututor.000webhostapp.com/idiomsmeem.txt",
                    "https://urdututor.000webhostapp.com/idiomsnoon.txt",
                    "https://urdututor.000webhostapp.com/idiomspay.txt",
                    "https://urdututor.000webhostapp.com/idiomsqaaf.txt",
                    "https://urdututor.000webhostapp.com/idiomsray.txt",
                    "https://urdututor.000webhostapp.com/idiomsrray.txt",
                    "https://urdututor.000webhostapp.com/idiomssay.txt",
                    "https://urdututor.000webhostapp.com/idiomssayy.txt",
                    "https://urdututor.000webhostapp.com/idiomsseen.txt",
                    "https://urdututor.000webhostapp.com/idiomssheen.txt",
                    "https://urdututor.000webhostapp.com/idiomsswaad.txt",
                    "https://urdututor.000webhostapp.com/idiomstay.txt",
                    "https://urdututor.000webhostapp.com/idiomstoyain.txt",
                    "https://urdututor.000webhostapp.com/idiomsttay.txt",
                    "https://urdututor.000webhostapp.com/idiomswow.txt",
                    "https://urdututor.000webhostapp.com/idiomszaal.txt",
                    "https://urdututor.000webhostapp.com/idiomszay.txt",
                    "https://urdututor.000webhostapp.com/idiomszoyain.txt",
                    "https://urdututor.000webhostapp.com/idiomszwaad.txt",
                    "https://urdututor.000webhostapp.com/phrases_askingforhelp.txt",
                    "https://urdututor.000webhostapp.com/phrases_greetings.txt",
                    "https://urdututor.000webhostapp.com/phrases_saythanks.txt",
                    "https://urdututor.000webhostapp.com/phrases_solvingamisunderstanding.txt",
                    "https://urdututor.000webhostapp.com/phrases_wishsomeonesomething.txt",
                    "https://urdututor.000webhostapp.com/proverbs_aayin.txt",
                    "https://urdututor.000webhostapp.com/proverbs_alif.txt",
                    "https://urdututor.000webhostapp.com/proverbs_alifmudaa.txt",
                    "https://urdututor.000webhostapp.com/proverbs_barriye.txt",
                    "https://urdututor.000webhostapp.com/proverbs_bay.txt",
                    "https://urdututor.000webhostapp.com/proverbs_chay.txt",
                    "https://urdututor.000webhostapp.com/proverbs_chotiye.txt",
                    "https://urdututor.000webhostapp.com/proverbs_daal.txt",
                    "https://urdututor.000webhostapp.com/proverbs_ddal.txt",
                    "https://urdututor.000webhostapp.com/proverbs_fay.txt",
                    "https://urdututor.000webhostapp.com/proverbs_geem.txt",
                    "https://urdututor.000webhostapp.com/proverbs_ghaaf.txt",
                    "https://urdututor.000webhostapp.com/proverbs_ghayin.txt",
                    "https://urdututor.000webhostapp.com/proverbs_hamza.txt",
                    "https://urdututor.000webhostapp.com/proverbs_hay.txt",
                    "https://urdututor.000webhostapp.com/proverbs_hayy.txt",
                    "https://urdututor.000webhostapp.com/proverbs_kaaf.txt",
                    "https://urdututor.000webhostapp.com/proverbs_khay.txt",
                    "https://urdututor.000webhostapp.com/proverbs_laam.txt",
                    "https://urdututor.000webhostapp.com/proverbs_meem.txt",
                    "https://urdututor.000webhostapp.com/proverbs_noon.txt",
                    "https://urdututor.000webhostapp.com/proverbs_pay.txt",
                    "https://urdututor.000webhostapp.com/proverbs_qaaf.txt",
                    "https://urdututor.000webhostapp.com/proverbs_ray.txt",
                    "https://urdututor.000webhostapp.com/proverbs_rray.txt",
                    "https://urdututor.000webhostapp.com/proverbs_say.txt",
                    "https://urdututor.000webhostapp.com/proverbs_sayy.txt",
                    "https://urdututor.000webhostapp.com/proverbs_seen.txt",
                    "https://urdututor.000webhostapp.com/proverbs_sheen.txt",
                    "https://urdututor.000webhostapp.com/proverbs_swaad.txt",
                    "https://urdututor.000webhostapp.com/proverbs_tay.txt",
                    "https://urdututor.000webhostapp.com/proverbs_toyain.txt",
                    "https://urdututor.000webhostapp.com/proverbs_ttay.txt",
                    "https://urdututor.000webhostapp.com/proverbs_wow.txt",
                    "https://urdututor.000webhostapp.com/proverbs_zaal.txt",
                    "https://urdututor.000webhostapp.com/proverbs_zay.txt",
                    "https://urdututor.000webhostapp.com/proverbs_zoyain.txt",
                    "https://urdututor.000webhostapp.com/proverbs_zwaad.txt"
            };
            for(int i=0;i<arr.length;i++)
            {
                if(array.equals(arr[i]))
                {
                    getfilename="datafile"+i+".txt";
                }
            }

            return getfilename;



        }



    }
}
