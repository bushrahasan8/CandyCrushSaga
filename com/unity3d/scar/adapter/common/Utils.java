package com.unity3d.scar.adapter.common;

import android.os.Handler;
import android.os.Looper;

/* loaded from: Utils.class */
public abstract class Utils {
    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(runnable, 0L);
    }

    public static void runOnUiThread(Runnable runnable, long j) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, j);
    }
}
