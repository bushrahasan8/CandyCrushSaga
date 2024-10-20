package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: n.class */
public abstract /* synthetic */ class n {
    public static SharedPreferences a(Context context, String str) {
        return new com.onetrust.otpublishers.headless.Internal.Preferences.e(context, str).b();
    }
}
