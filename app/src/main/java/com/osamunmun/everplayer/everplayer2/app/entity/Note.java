package com.osamunmun.everplayer.everplayer2.app.entity;

import android.provider.BaseColumns;

import com.evernote.edam.type.NoteAttributes;
import com.evernote.edam.type.Resource;

import java.security.Timestamp;
import java.util.List;

public class Note implements BaseColumns {
    public static final String NOTEBOOK_TABLE_NAME = "note";

    public static final String COLUMN_NAME_GUID = "guid";
    public static final String COLUMN_NAME_TITLE = "title";
    public static final String COLUMN_NAME_CONTENT = "content";
    public static final String COLUMN_NAME_CONTENT_HASH = "contentHash";
    public static final String COLUMN_NAME_CONTENT_LENGTH = "contentLength";
    public static final String COLUMN_NAME_CREATED = "created";
    public static final String COLUMN_NAME_UPDATED = "updated";
    public static final String COLUMN_NAME_DELETED = "deleted";
    public static final String COLUMN_NAME_ACTIVE = "active";
    public static final String COLUMN_NAME_UPDATE_SEQUENCE_NUM = "updateSequenceNum";
    public static final String COLUMN_NAME_NOTEBOOK_GUID = "notebookGuid";
    public static final String COLUMN_NAME_TAG_GUIDS = "tagGuids";
    public static final String COLUMN_NAME_RESOURCES = "resources";
    public static final String COLUMN_NAME_ATTRIBUTES = "attributes";
    public static final String COLUMN_NAME_TAG_NAMES = "tagNames";

    public String mGuid;
    public String mTitle;
    public String mContent;
    public String mContentHash;
    public int mContentLength;
    public Timestamp mCreated;
    public Timestamp mUpdated;
    public Timestamp mDeleted;
    public boolean mActive;
    public int mUpdateSequenceNum;
    public String mNotebookGuid;
    public List<String> mTagGuids;
    public List<Resource> mResources;
    public NoteAttributes mAttributes;
    public List<String> mTagNames;
}
