package com.iab.omid.library.vungle.utils;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: d.class */
public final class d {
    public static void a(String str) {
        if (!com.iab.omid.library.vungle.a.a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    public static void a(String str, Exception exc) {
        if ((!com.iab.omid.library.vungle.a.a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
