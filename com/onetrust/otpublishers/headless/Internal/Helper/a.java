package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;

/* loaded from: a.class */
public final class a {
    public final com.onetrust.otpublishers.headless.Internal.Preferences.e a;

    public a(Context context) {
        this.a = new com.onetrust.otpublishers.headless.Internal.Preferences.e(context);
    }

    public final void a(String str) {
        SharedPreferences.Editor edit;
        int i;
        if (str.equals("OPT_IN")) {
            edit = this.a.b().edit();
            i = 1;
        } else {
            if (!str.equals("OPT_OUT")) {
                this.a.b().edit().putInt("OT_AGE_GATE_USER_CONSENT_STATUS", -1).apply();
                OTLogger.a("AgeGateConsentHandler", 3, "Saving Age Gate Consent :" + this.a.b().getInt("OT_AGE_GATE_USER_CONSENT_STATUS", -1));
            }
            edit = this.a.b().edit();
            i = 0;
        }
        edit.putInt("OT_AGE_GATE_USER_CONSENT_STATUS", i).apply();
        OTLogger.a("AgeGateConsentHandler", 3, "Saving Age Gate Consent :" + this.a.b().getInt("OT_AGE_GATE_USER_CONSENT_STATUS", -1));
    }
}
