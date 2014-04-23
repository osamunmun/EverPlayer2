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

    private String mGuid;
    private String mName;
    private int mUpdateSequenceNum;
    private boolean mDefaultNotebook;
    private Timestamp mServiceCreated;
    private Timestamp mServiceUpdated;
    private Publishing mPublishing;
    private boolean mPublished;
    private String mStack;
    private List<Integer> mSharedNotebookIds;
    private List<SharedNotebook> mSharedNotebooks;
    private BusinessNotebook mBusinessNotebook;
    private User mContact;
    private NotebookRestrictions mNotebookRestrictions;


    public String getmGuid() {
        return mGuid;
    }

    public void setmGuid(String mGuid) {
        this.mGuid = mGuid;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmUpdateSequenceNum() {
        return mUpdateSequenceNum;
    }

    public void setmUpdateSequenceNum(int mUpdateSequenceNum) {
        this.mUpdateSequenceNum = mUpdateSequenceNum;
    }

    public boolean getmDefaultNotebook() {
        return mDefaultNotebook;
    }

    public void setmDefaultNotebook(boolean mDefaultNotebook) {
        this.mDefaultNotebook = mDefaultNotebook;
    }

    public Timestamp getmServiceCreated() {
        return mServiceCreated;
    }

    public void setmServiceCreated(Timestamp mServiceCreated) {
        this.mServiceCreated = mServiceCreated;
    }

    public Timestamp getmServiceUpdated() {
        return mServiceUpdated;
    }

    public void setmServiceUpdated(Timestamp mServiceUpdated) {
        this.mServiceUpdated = mServiceUpdated;
    }

    public Publishing getmPublishing() {
        return mPublishing;
    }

    public void setmPublishing(Publishing mPublishing) {
        this.mPublishing = mPublishing;
    }

    public boolean ismPublished() {
        return mPublished;
    }

    public void setmPublished(boolean mPublished) {
        this.mPublished = mPublished;
    }

    public String getmStack() {
        return mStack;
    }

    public void setmStack(String mStack) {
        this.mStack = mStack;
    }

    public List<Integer> getmSharedNotebookIds() {
        return mSharedNotebookIds;
    }

    public void setmSharedNotebookIds(List<Integer> mSharedNotebookIds) {
        this.mSharedNotebookIds = mSharedNotebookIds;
    }

    public List<SharedNotebook> getmSharedNotebooks() {
        return mSharedNotebooks;
    }

    public void setmSharedNotebooks(List<SharedNotebook> mSharedNotebooks) {
        this.mSharedNotebooks = mSharedNotebooks;
    }

    public BusinessNotebook getmBusinessNotebook() {
        return mBusinessNotebook;
    }

    public void setmBusinessNotebook(BusinessNotebook mBusinessNotebook) {
        this.mBusinessNotebook = mBusinessNotebook;
    }

    public User getmContact() {
        return mContact;
    }

    public void setmContact(User mContact) {
        this.mContact = mContact;
    }

    public NotebookRestrictions getmNotebookRestrictions() {
        return mNotebookRestrictions;
    }

    public void setmNotebookRestrictions(NotebookRestrictions mNotebookRestrictions) {
        this.mNotebookRestrictions = mNotebookRestrictions;
    }
}
