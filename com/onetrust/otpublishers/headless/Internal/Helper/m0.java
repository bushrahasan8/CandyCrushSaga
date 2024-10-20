package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: m0.class */
public final class m0 {
    public final SharedPreferences a;

    public m0(Context context) {
        this.a = new com.onetrust.otpublishers.headless.Internal.Preferences.e(context).b();
    }

    public final void a() {
        this.a.edit().putInt("OT_UCP_USER_CONSENT_STATUS", 1).apply();
    }

    public final void b() {
        this.a.edit().putInt("OTT_USER_CONSENT_STATUS", 1).apply();
    }
}
