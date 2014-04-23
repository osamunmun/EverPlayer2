package com.osamunmun.everplayer.everplayer2.app.entity;

import android.provider.*;

import com.evernote.edam.type.BusinessNotebook;
import com.evernote.edam.type.NotebookRestrictions;
import com.evernote.edam.type.Publishing;
import com.evernote.edam.type.SharedNotebook;
import com.evernote.edam.type.User;

import java.sql.Timestamp;
import java.util.List;

public class NoteBook implements android.provider.BaseColumns {
    public static final String NOTEBOOK_TABLE_NAME = "notebook";

    public static final String COLUMN_NAME_GUID = "guid";
    public static final String COLUMN_NAME_NAME = "name";
    public static final String COLUMN_NAME_UPDATE_SEQUENCE_NUM = "updateSequenceNum";
    public static final String COLUMN_NAME_DEFAULT_NOTEBOOK = "defaultNotebook";
    public static final String COLUMN_NAME_SERVICE_CREATED = "serviceCreated";
    public static final String COLUMN_NAME_SERVICE_UPDATED = "serviceUpdated";
    public static final String COLUMN_NAME_PUBLISHING = "publishing";
    public static final String COLUMN_NAME_PUBLISHED = "published";
    public static final String COLUMN_NAME_STACK = "stack";
    public static final String COLUMN_NAME_SHARED_NOTEBOOK_IDS = "sharedNotebookIds";
    public static final String COLUMN_NAME_SHARED_NOTEBOOKS = "sharedNotebooks";
    public static final String COLUMN_NAME_BUSINESS_NOTEBOOK = "businessNotebook";
    public static final String COLUMN_NAME_CONTACT = "contact";
    public static final String COLUMN_NAME_RESTRICTIONS = "restrictions";

    public String mGuid;
    public String mName;
    public int mUpdateSequenceNum;
    public boolean mDefaultNotebook;
    public Timestamp mServiceCreated;
    public Timestamp mServiceUpdated;
    public Publishing mPublishing;
    public boolean mPublished;
    public String mStack;
    public List<Integer> mSharedNotebookIds;
    public List<SharedNotebook> mSharedNotebooks;
    public BusinessNotebook mBusinessNotebook;
    public User mContact;
    public NotebookRestrictions mNotebookRestrictions;
}
