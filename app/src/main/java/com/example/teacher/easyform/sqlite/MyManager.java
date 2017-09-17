package com.example.teacher.easyform.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Teacher on 17/09/2017.
 */

public class MyManager {

    private Context context;
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;


    public MyManager(Context context) {
        this.context = context;
        myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();
    }

    public long addNametoSQLite(String strName,
                                String strGender,
                                String strProvince) {
        ContentValues contentValues = new ContentValues();  //แปลงตัวอักษรเป็นตัวเลข
        contentValues.put("Name",strName);
        contentValues.put("Gender",strGender);
        contentValues.put("Province",strProvince);
        return sqLiteDatabase.insert("nameTABLE",null,contentValues);


    }



}   //Main Class
