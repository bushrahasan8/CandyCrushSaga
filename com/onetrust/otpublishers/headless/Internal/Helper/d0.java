package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: d0.class */
public final class d0 {
    public final SharedPreferences a;

    public d0(Context context) {
        this.a = new com.onetrust.otpublishers.headless.Internal.Preferences.e(context).b();
    }

    public final void a(String str) {
        k.a(this.a, "INTERACTION_TYPE", str);
    }
}
