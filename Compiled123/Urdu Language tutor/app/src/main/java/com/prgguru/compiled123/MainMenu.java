package com.prgguru.compiled123;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    private long   backPressedTime;
    private Toast  backtoast;
    public  Dialog dialog;
    public  Button dialogYes,dialogNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        createExitDialog();
    }
    public void sendWrite(View view) {
        Intent intent = new Intent(this, ActivityWrite.class);
        startActivity(intent);
    }
    public void sendRead(View view){
        Intent intent = new Intent(this, ActivityRead.class);
        startActivity(intent);
    }
    public void sendgrammar(View view){
        Intent intent = new Intent(this, IdiomsList.class);
        startActivity(intent);
    }
    public void sendMuhawry(View view){
        Intent intent = new Intent(this,GrammarList.class );
        startActivity(intent);
    }
    public void sendKhawty(View view){
        Intent intent = new Intent(this, ProverbsList.class);
        startActivity(intent);
    }
    public void sendLagat(View view){
        Intent intent = new Intent(this, PhrasesScenarios.class);
        startActivity(intent);
    }
    public void sendMukalam(View view){
        Intent intent = new Intent(this, ConversationScenarios.class);
        startActivity(intent);
    }
    public void sendChatbot(View view){
        Intent intent = new Intent(this, ActivityChatbot.class);
        startActivity(intent);
    }
    public void sendzkhiraAlfaz(View view){
        Intent intent = new Intent(this,VocabularyList.class );
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

        if(backPressedTime+2000>System.currentTimeMillis())
        {
            backtoast.cancel();

            //   super.onBackPressed();
           /* Intent intent=new Intent(Intent.ACTION_MAIN);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addCategory(Intent.CATEGORY_HOME);
            startActivity(intent);
            finish();
            System.exit(0);*/

            dialog.show();
            // createExitDialog();


            //return;
        }
        else
        {

            backtoast= Toast.makeText(getBaseContext(),"Press back again to exit",Toast.LENGTH_SHORT);
            backtoast.show();
        }
        backPressedTime=System.currentTimeMillis();
    }
    protected void createExitDialog()
    {
        dialog=new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        dialogYes=(Button)dialog.findViewById(R.id.yes);
        dialogNo=(Button)dialog.findViewById(R.id.No);
        dialogYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_MAIN);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent);
                finish();
                System.exit(0);


            }
        });
        dialogNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();

            }
        });



    }

}
