package com.osamunmun.everplayer.everplayer2.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.osamunmun.everplayer.everplayer2.app.entity.Note;

public class NoteOpenHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;  // Up version number, if schema is changed
    public static final String DATABASE_NAME = "EverPlayer.db";
    private static final String NOTE_TABLE_CREATE =
            "CREATE TABLE " + Note.NOTE_TABLE_NAME + " (" +
                    Note._ID + " INTEGER PRIMARY KEY," +
                    Note.COLUMN_NAME_GUID + " TEXT NOT NULL," +
                    Note.COLUMN_NAME_TITLE + " TEXT," +
                    Note.COLUMN_NAME_CONTENT + " TEXT," +
                    Note.COLUMN_NAME_CONTENT_HASH + " TEXT," +
                    Note.COLUMN_NAME_CONTENT_LENGTH + " INTEGER," +
                    Note.COLUMN_NAME_CREATED + " TEXT," +
                    Note.COLUMN_NAME_UPDATED + " TEXT," +
                    Note.COLUMN_NAME_DELETED + " TEXT," +
                    Note.COLUMN_NAME_ACTIVE + " NUMERIC," +
                    Note.COLUMN_NAME_UPDATE_SEQUENCE_NUM + " INTEGER," +
                    Note.COLUMN_NAME_NOTEBOOK_GUID + " TEXT," +
                    Note.COLUMN_NAME_TAG_GUIDS + " BLOB," +
                    Note.COLUMN_NAME_RESOURCES + " BLOB," +
                    Note.COLUMN_NAME_ATTRIBUTES + " BLOB," +
                    Note.COLUMN_NAME_TAG_NAMES + " BLOB);";

    private static final String NOTE_TABLE_DELETE =
            "DROP TABLE IF EXISTS " + Note.NOTE_TABLE_NAME;

    public NoteOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(NOTE_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i2) {
        db.execSQL(NOTE_TABLE_DELETE);
        onCreate(db);
    }
}
