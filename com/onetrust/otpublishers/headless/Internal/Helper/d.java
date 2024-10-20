package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.SharedPreferences;

/* loaded from: d.class */
public abstract /* synthetic */ class d {
    public static boolean a(Boolean bool, SharedPreferences sharedPreferences, String str) {
        return com.onetrust.otpublishers.headless.Internal.b.a(sharedPreferences.getString(str, bool.toString()));
    }
}
