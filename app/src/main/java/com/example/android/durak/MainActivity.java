package com.example.android.durak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String name;
    private int [] imageArray = {R.drawable.logo,R.drawable.n1111111111,R.drawable.nnnnnnn};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        Tname.setText(name);
        int nu = getIntent().getIntExtra("number",0);
        ImageView profileimage = (ImageView) findViewById(R.id.imaaaage);
        profileimage.setImageResource(imageArray[nu]);



    }





    public void openNewGame(View view) {
        Intent intent = new Intent(MainActivity.this,New_Game.class);
        startActivity(intent);
        finish();
    }



    public void option(View view) {
        Intent intent = new Intent(this,Option.class);
        startActivity(intent);
        finish();
    }

    public  void  Exit (View view){
        System.exit(0);
    }

}
