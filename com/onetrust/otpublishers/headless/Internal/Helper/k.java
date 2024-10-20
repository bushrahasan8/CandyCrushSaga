package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.SharedPreferences;

/* loaded from: k.class */
public abstract /* synthetic */ class k {
    public static void a(SharedPreferences sharedPreferences, String str, String str2) {
        sharedPreferences.edit().putString(str, str2).apply();
    }
}
