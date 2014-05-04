package com.osamunmun.everplayer.everplayer2.app;

import android.app.Application;

public class EverPlayerApplication extends Application {
    private static final String CONSUMER_KEY    = "osamunmun";
    private static final String CONSUMER_SECRET = "ce8c25437306716a";
    private EvernoteSession mEvernoteSession;

    public EvernoteSession getEvernoteSession() {
        if (mEvernoteSession == null) {
        }
        return mEvernoteSession;
    }
}
