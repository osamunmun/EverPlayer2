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

    private String mGuid;
    private String mTitle;
    private String mContent;
    private String mContentHash;
    private int mContentLength;
    private Timestamp mCreated;
    private Timestamp mUpdated;
    private Timestamp mDeleted;
    private boolean mActive;
    private int mUpdateSequenceNum;
    private String mNotebookGuid;
    private List<String> mTagGuids;
    private List<Resource> mResources;
    private NoteAttributes mAttributes;
    private List<String> mTagNames;

    public String getmGuid() {
        return mGuid;
    }

    public void setmGuid(String mGuid) {
        this.mGuid = mGuid;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

    public String getmContentHash() {
        return mContentHash;
    }

    public void setmContentHash(String mContentHash) {
        this.mContentHash = mContentHash;
    }

    public int getmContentLength() {
        return mContentLength;
    }

    public void setmContentLength(int mContentLength) {
        this.mContentLength = mContentLength;
    }

    public Timestamp getmCreated() {
        return mCreated;
    }

    public void setmCreated(Timestamp mCreated) {
        this.mCreated = mCreated;
    }

    public Timestamp getmUpdated() {
        return mUpdated;
    }

    public void setmUpdated(Timestamp mUpdated) {
        this.mUpdated = mUpdated;
    }

    public Timestamp getmDeleted() {
        return mDeleted;
    }

    public void setmDeleted(Timestamp mDeleted) {
        this.mDeleted = mDeleted;
    }

    public boolean ismActive() {
        return mActive;
    }

    public void setmActive(boolean mActive) {
        this.mActive = mActive;
    }

    public int getmUpdateSequenceNum() {
        return mUpdateSequenceNum;
    }

    public void setmUpdateSequenceNum(int mUpdateSequenceNum) {
        this.mUpdateSequenceNum = mUpdateSequenceNum;
    }

    public String getmNotebookGuid() {
        return mNotebookGuid;
    }

    public void setmNotebookGuid(String mNotebookGuid) {
        this.mNotebookGuid = mNotebookGuid;
    }

    public List<String> getmTagGuids() {
        return mTagGuids;
    }

    public void setmTagGuids(List<String> mTagGuids) {
        this.mTagGuids = mTagGuids;
    }

    public List<Resource> getmResources() {
        return mResources;
    }

    public void setmResources(List<Resource> mResources) {
        this.mResources = mResources;
    }

    public NoteAttributes getmAttributes() {
        return mAttributes;
    }

    public void setmAttributes(NoteAttributes mAttributes) {
        this.mAttributes = mAttributes;
    }

    public List<String> getmTagNames() {
        return mTagNames;
    }

    public void setmTagNames(List<String> mTagNames) {
        this.mTagNames = mTagNames;
    }
}
