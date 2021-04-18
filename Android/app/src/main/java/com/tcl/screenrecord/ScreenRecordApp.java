package com.tcl.screenrecord;

import android.app.Application;
import android.util.Log;


public class ScreenRecordApp extends Application {

    private static final String TAG = ScreenRecordApp.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
    }
}
