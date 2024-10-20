package com.applovin.impl;

import android.os.Build;
import java.util.HashSet;

/* loaded from: i8.class */
public abstract class i8 {
    public static final String a = "ExoPlayerLib/2.15.1 (Linux; Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.15.1";
    private static final HashSet b = new HashSet();
    private static String c = "goog.exo.core";

    public static String a() {
        String str;
        synchronized (i8.class) {
            try {
                str = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static void a(String str) {
        synchronized (i8.class) {
            try {
                if (b.add(str)) {
                    c += ", " + str;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
