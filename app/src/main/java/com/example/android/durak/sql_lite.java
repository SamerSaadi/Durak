package com.example.android.durak;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by Lenovo on 2/19/2018.
 */

public class sql_lite extends SQLiteOpenHelper {

    public static final String DBname = "data.db";


    public sql_lite(Context context) {
        super(context, DBname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // here we created a table in the database
        //ıf wee need to add another thing we just have to write
        // , email TEXT or , adress TEXT ,
        db.execSQL("create table mytable(id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT)");
        db.execSQL("create table PicTable(id INTEGER PRIMARY KEY AUTOINCREMENT,pic_key INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
  // here if we didnt find the table, it will be created here
        db.execSQL("DROP TABLE IF EXISTS mytable");
        onCreate(db);

    }


    //this method to add info in the data
    public boolean isertData (String name){
        //let us to write in the data base
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        // here we added the name
       contentValues.put("name",name);


        long result = db.insert("mytable",null,contentValues);
        if (result == -1)
            return false;
        else
            return true;

    }


    public boolean insertPic (int pic){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("pic_key",pic);
        long result = db.insert("PicTable",null,contentValues);
        if (result == -1)
            return false;
        else
            return true;

    }


    // method to return the data
/*
    public ArrayList getAllrecord(){
        ArrayList arrayList = new ArrayList();

        // to read from data base
        SQLiteDatabase db = this.getReadableDatabase();
        // here to take all the data ın mytable
        Cursor res = db.rawQuery("select * from mytable",null);
        res.moveToFirst();
        while (res.isAfterLast()==false) {
            //arrayList.add(res.getString(res.getColumnIndex("NAME")));
            String t1 = res.getString(0);
            String t2 = res.getString(1);

            // i delete it cause we have now only id and name
            //String t3 = res.getString(2);

            arrayList.add(t1 + " - " + t2 );
            res.moveToNext();



        }

        return arrayList;

    }

    */

    public String showshow(){
        String x ;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from mytable",null);
        res.moveToLast();
        x = res.getString(1);
        return x;
    }


    public int showpic(){
        int x;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from PicTable",null);
        res.moveToLast();
        x = res.getInt(1);
        return x;




    }
}
