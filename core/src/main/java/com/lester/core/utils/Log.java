package com.lester.core.utils;

import com.lester.core.BuildConfig;

public class Log {
    public static boolean isDebug = BuildConfig.DEBUG;

    public static void i(String TAG, String msg) {
        if (!isDebug){
            return;
        }
        android.util.Log.i(TAG, msg);
    }

    public static void v(String TAG, String msg) {
        if (!isDebug){
            return;
        }
        android.util.Log.v(TAG, msg);
    }

    public static void e(String TAG, String msg) {
        if (!isDebug){
            return;
        }
        android.util.Log.e(TAG, msg);
    }

    public static void e(String TAG, String msg, Throwable tr) {
        if (!isDebug){
            return;
        }
        android.util.Log.e(TAG, msg, tr);
    }

    public static void d(String TAG, String msg) {
        if (!isDebug){
            return;
        }
        android.util.Log.d(TAG, msg);
    }

    public static void w(String TAG, String msg) {
        if (!isDebug){
            return;
        }
        android.util.Log.w(TAG, msg);
    }
}
