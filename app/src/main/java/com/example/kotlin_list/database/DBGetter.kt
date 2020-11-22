package com.example.kotlin_list.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase

/**
 * Created by sgao on 18/11/2020 16:18
 **/
class DBGetter (context: Context) {
    private val dbh: DBHelper = DBHelper(context)
    internal val db: SQLiteDatabase

    init {
        db = dbh.writableDatabase
    }
}