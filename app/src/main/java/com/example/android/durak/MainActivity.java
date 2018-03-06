package com.example.android.durak;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   public static String name;
   public static int level;
   public static int counterVisiting;
    TextView textView;
    sql_lite db = new sql_lite(this);
    private int [] imageArray = {R.drawable.logo,R.drawable.n1111111111,R.drawable.nnnnnnn};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView levelText = (TextView) findViewById(R.id.level);


        /**
        *  progress bars
         */
        ProgressBar progressBar = (ProgressBar)findViewById(R.id.progressBar);
        //int xp1 = getIntent().getIntExtra("xp1",0);
        int xp1 =+ 20;
        progressBar.setProgress(xp1);
       // int xp2 = getIntent().getIntExtra("xp2",0);
       // progressBar.setProgress(xp2);
        if (progressBar.getProgress()==100){
            progressBar.setProgress(0);
            level++;
            levelText.setText(level + "");
        }

        TextView t2 = (TextView)findViewById(R.id.Options);
        TextView t1 = (TextView)findViewById(R.id.newGame);
        TextView t3 = (TextView)findViewById(R.id.howtoplay);
        Animation anim = new AlphaAnimation(0.6f,1.0f);
        Animation anim2 = new RotateAnimation(0.0f,0.6f);

        anim.setDuration(100);
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.ZORDER_NORMAL);
        anim.setRepeatCount(Animation.INFINITE);
        t1.startAnimation(anim);

        anim2.setDuration(200);
        anim2.setStartOffset(20);
        anim2.setRepeatMode(Animation.REVERSE);
        anim2.setRepeatCount(Animation.INFINITE);

        t2.startAnimation(anim2);


        TextView Tname = (TextView)findViewById(R.id.theName);

        name = getIntent().getStringExtra("the name");



        int nu = getIntent().getIntExtra("number",0);
        ImageView profileimage = (ImageView) findViewById(R.id.imaaaage);
        profileimage.setImageResource(imageArray[nu]);

        Tname.setText(name);

        final String PREFS_NAME = "MyPrefsFile";

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);

        if (settings.getBoolean("my_first_time", true)) {
            //the app is being launched for first time, do something
            Log.d("Comments", "First time");

            // first time task

            /*
            Intent intent = new Intent(this,Option.class);
            startActivity(intent);
            finish();
            */
            db.isertData("player name");
            db.insertPic(1);


            // record the fact that the app has been started at least once
            settings.edit().putBoolean("my_first_time", false).commit();
        }
        else{
            showdata();
        }








    }





    public void openNewGame(View view) {

        // this for showing the saving data in the SQlite
        showdata();

        Intent intent = new Intent(MainActivity.this,New_Game.class);
        startActivity(intent);

    }



    public void option(View view) {


        Intent intent = new Intent(this,Option.class);
        startActivity(intent);
        finish();

    }

    public void showdata(){
        String savedName;
        savedName = db.showshow();
        int savedPic = db.showpic();

        ImageView profileimage = (ImageView) findViewById(R.id.imaaaage);
        profileimage.setImageResource(imageArray[savedPic]);


       TextView Tname = (TextView)findViewById(R.id.theName);

     Tname.setText(savedName);

    }

    public  void  Exit (View view){
        System.exit(0);
    }

}
