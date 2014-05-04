package com.osamunmun.everplayer.everplayer2.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.osamunmun.everplayer.everplayer2.app.entity.NoteEntity;

public class NoteOpenHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;  // Up version number, if schema is changed
    public static final String DATABASE_NAME = "EverPlayer.db";
    private static final String NOTE_TABLE_CREATE =
            "CREATE TABLE " + NoteEntity.NOTE_TABLE_NAME + " (" +
                    NoteEntity._ID + " INTEGER PRIMARY KEY," +
                    NoteEntity.COLUMN_NAME_GUID + " TEXT NOT NULL," +
                    NoteEntity.COLUMN_NAME_TITLE + " TEXT," +
                    NoteEntity.COLUMN_NAME_CONTENT + " TEXT," +
                    NoteEntity.COLUMN_NAME_CONTENT_HASH + " TEXT," +
                    NoteEntity.COLUMN_NAME_CONTENT_LENGTH + " INTEGER," +
                    NoteEntity.COLUMN_NAME_CREATED + " TEXT," +
                    NoteEntity.COLUMN_NAME_UPDATED + " TEXT," +
                    NoteEntity.COLUMN_NAME_DELETED + " TEXT," +
                    NoteEntity.COLUMN_NAME_ACTIVE + " NUMERIC," +
                    NoteEntity.COLUMN_NAME_UPDATE_SEQUENCE_NUM + " INTEGER," +
                    NoteEntity.COLUMN_NAME_NOTEBOOK_GUID + " TEXT," +
                    NoteEntity.COLUMN_NAME_TAG_GUIDS + " BLOB," +
                    NoteEntity.COLUMN_NAME_RESOURCES + " BLOB," +
                    NoteEntity.COLUMN_NAME_ATTRIBUTES + " BLOB," +
                    NoteEntity.COLUMN_NAME_TAG_NAMES + " BLOB);";

    private static final String NOTE_TABLE_DELETE =
            "DROP TABLE IF EXISTS " + NoteEntity.NOTE_TABLE_NAME;

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
