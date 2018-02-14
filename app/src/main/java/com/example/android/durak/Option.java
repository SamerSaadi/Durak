package com.example.android.durak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Option extends AppCompatActivity {
String x;
int theNumberOfTheİmage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);



    }
    private int [] imageArray = {R.drawable.logo,R.drawable.n1111111111,R.drawable.nnnnnnn};

    public void Save(View view) {
        EditText e1 = (EditText) findViewById(R.id.name);
        x = e1.getText().toString();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("the name",x);
        ImageView m1 = (ImageView) findViewById(R.id.profile);
        intent.putExtra("number",theNumberOfTheİmage);

        startActivity(intent);
        finish();

    }

    public void nextimage(View view) {
        ImageView image1 = (ImageView) findViewById(R.id.profile);

        if (theNumberOfTheİmage<imageArray.length-1){
            theNumberOfTheİmage++;
        }


            image1.setImageResource(imageArray[theNumberOfTheİmage]);
        }

    public void back(View view) {
        ImageView image1 = (ImageView) findViewById(R.id.profile);
        if (theNumberOfTheİmage>0){
            theNumberOfTheİmage--;
        }
        image1.setImageResource(imageArray[theNumberOfTheİmage]);
    }
}

