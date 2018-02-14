package com.example.android.durak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class New_Game extends AppCompatActivity {
    String x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__game);
    }




    public void gotomain(View view) {
        Intent ııı = new Intent(this,MainActivity.class);
        startActivity(ııı);
        finish();
    }
}
