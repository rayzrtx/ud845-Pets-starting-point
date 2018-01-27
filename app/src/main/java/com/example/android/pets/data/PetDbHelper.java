package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.android.pets.data.PetContract.PetEntry;

/**
 * Created by raylinares on 1/26/18.
 */

public class PetDbHelper extends SQLiteOpenHelper {

    /**
     * Database version. If you change the database schema,
     * you must increment the database version
     **/
    private static final int DATABASE_VERSION = 1;

    /** Name of the database file **/
    private static final String DATABASE_NAME = "shelter.db";

    //Constants used for creating database table (optional)
    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEPARATOR = ", ";
    private static final String NOT_NULL = " NOT NULL";
    private static final String INTEGER_TYPE = " INTEGER";


    public PetDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String SQL_CREATE_ENTRIES = "CREATE TABLE " + PetEntry.TABLE_NAME + " (" +
                PetEntry._ID + INTEGER_TYPE + " PRIMARY KEY AUTOINCREMENT, " +
                PetEntry.COLUMN_PET_NAME + TEXT_TYPE + NOT_NULL + COMMA_SEPARATOR +
                PetEntry.COLUMN_PET_BREED + TEXT_TYPE + COMMA_SEPARATOR +
                PetEntry.COLUMN_PET_GENDER + INTEGER_TYPE + NOT_NULL + COMMA_SEPARATOR +
                PetEntry.COLUMN_PET_WEIGHT + INTEGER_TYPE + NOT_NULL + " DEFAULT 0);";
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + PetEntry.TABLE_NAME;
        sqLiteDatabase.execSQL(SQL_DELETE_ENTRIES);
        onCreate(sqLiteDatabase);
    }
}
