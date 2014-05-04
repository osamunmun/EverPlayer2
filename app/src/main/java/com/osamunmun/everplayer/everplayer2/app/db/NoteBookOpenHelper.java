package com.osamunmun.everplayer.everplayer2.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.osamunmun.everplayer.everplayer2.app.entity.NoteBookEntity;

public class NoteBookOpenHelper extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 1;  // Up version number, if schema is changed
    public static final String DATABASE_NAME = "EverPlayer.db";
    private static final String NOTEBOOK_TABLE_CREATE =
            "CREATE TABLE " + NoteBookEntity.NOTEBOOK_TABLE_NAME + " (" +
                    NoteBookEntity._ID + " INTEGER PRIMARY KEY," +
                    NoteBookEntity.COLUMN_NAME_GUID + " TEXT NOT NULL," +
                    NoteBookEntity.COLUMN_NAME_NAME + " TEXT," +
                    NoteBookEntity.COLUMN_NAME_DEFAULT_NOTEBOOK + " NUMERIC," +
                    NoteBookEntity.COLUMN_NAME_SERVICE_CREATED + " TEXT," +
                    NoteBookEntity.COLUMN_NAME_SERVICE_UPDATED + " TEXT," +
                    NoteBookEntity.COLUMN_NAME_PUBLISHING + " BLOB," +
                    NoteBookEntity.COLUMN_NAME_PUBLISHED + " NUMERIC," +
                    NoteBookEntity.COLUMN_NAME_STACK + " TEXT," +
                    NoteBookEntity.COLUMN_NAME_SHARED_NOTEBOOK_IDS + " BLOB," +
                    NoteBookEntity.COLUMN_NAME_SHARED_NOTEBOOKS + " BLOB," +
                    NoteBookEntity.COLUMN_NAME_UPDATE_SEQUENCE_NUM + " INTEGER," +
                    NoteBookEntity.COLUMN_NAME_BUSINESS_NOTEBOOK + " BLOB," +
                    NoteBookEntity.COLUMN_NAME_CONTACT + " BLOB," +
                    NoteBookEntity.COLUMN_NAME_RESTRICTIONS + " BLOG);";

    private static final String NOTE_TABLE_DELETE =
            "DROP TABLE IF EXISTS " + NoteBookEntity.NOTEBOOK_TABLE_NAME;

    public NoteBookOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(NOTEBOOK_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i2) {
        db.execSQL(NOTE_TABLE_DELETE);
        onCreate(db);
    }
}
