package com.example.teacher.easyform.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Teacher on 17/09/2017.
 */

public class MyOpenHelper extends SQLiteOpenHelper{

    private Context context;
    public static final String database_name = "easyForm.db";
    private static final int database_version = 1;
    private static final String database_name_table = "create table nameTABLE (" +
            "id integer primary key, " +
            "Name text, " +
            "Gender text, " +
            "Province text);";


    public MyOpenHelper(Context context) {
        super(context,database_name,null,database_version);
        this.context = context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(database_name_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}   //Main Class
