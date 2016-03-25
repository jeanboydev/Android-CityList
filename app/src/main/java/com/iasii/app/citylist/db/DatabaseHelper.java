package com.iasii.app.citylist.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by next on 2016/3/24.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String name = "city";
    private static final int version = 1;

    public DatabaseHelper(Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS recent_city (id integer primary key autoincrement, name varchar(40), date INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
