package com.example.abdallahsarayrah.sqlite1h

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by abdallah.sarayrah on 10/9/2017.
 */
class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, "databasethree", null, 1) {

    init {
        val db = this.writableDatabase
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("create table tablethree (id integer primary key autoincrement, name text)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}