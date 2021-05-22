package com.example.applicationfagment.ui;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.applicationfagment.ui.home.Notes;

public class DataBaseHelp extends SQLiteOpenHelper {


    public DataBaseHelp(@Nullable Context context) {
        super(context, "Users.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table compte(nom text primary key, prenom text, password text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists compte");
    }

    public boolean insert(String nom, String prenom, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("nom", nom);
        contentValues.put("prenom", prenom);
        contentValues.put("password", password);
        long ins = db.insert("compte", null, contentValues);

        if (ins == -1)return false;
        else return true;
    }
}
