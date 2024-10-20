package com.onetrust.otpublishers.headless.Internal.Preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.onetrust.otpublishers.headless.Internal.Helper.k;

/* loaded from: a.class */
public final class a {
    public final SharedPreferences a;

    public a(Context context) {
        this.a = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public final void a(String str) {
        if (this.a.contains(str)) {
            this.a.edit().remove(str).apply();
        }
    }

    public final void a(String str, int i) {
        this.a.edit().putInt(str, i).apply();
    }

    public final void a(String str, String str2) {
        k.a(this.a, str, str2);
    }

    public final int b(String str) {
        return this.a.getInt(str, -1);
    }

    public final String c(String str) {
        return this.a.getString(str, "");
    }
}
