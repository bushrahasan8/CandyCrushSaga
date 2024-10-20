package com.onetrust.otpublishers.headless.Internal.Preferences;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: e.class */
public class e {
    public final SharedPreferences a;
    public final h b;
    public final boolean c;
    public final Context d;

    public e(Context context) {
        this.d = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.onetrust.otpublishers.headless.preferenceOTT_DEFAULT_USER", 0);
        this.a = sharedPreferences;
        if (com.onetrust.otpublishers.headless.Internal.Helper.f.a(context)) {
            this.c = true;
            this.b = new h(context, sharedPreferences, sharedPreferences.getString("OT_ACTIVE_PROFILE_ID", ""));
        }
    }

    public e(Context context, String str) {
        this.d = context;
        this.a = context.getSharedPreferences("com.onetrust.otpublishers.headless.preference".concat(str), 0);
    }

    public final void a() {
        if (this.c) {
            try {
                com.onetrust.otpublishers.headless.Internal.profile.d dVar = new com.onetrust.otpublishers.headless.Internal.profile.d(this.d);
                String string = dVar.a.b().getString("OT_MULTI_PROFILE_ID_MAP", null);
                if (!com.onetrust.otpublishers.headless.Internal.c.b(string)) {
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        dVar.a(jSONArray.getString(i));
                    }
                }
            } catch (JSONException e) {
                com.onetrust.otpublishers.headless.Internal.Helper.h.a(e, new StringBuilder("Error on clearing multi-profile files. Error = "), "OneTrust", 6);
            }
        }
        this.a.edit().clear().apply();
    }

    public final void a(String str) {
        if (com.onetrust.otpublishers.headless.Internal.c.b(str)) {
            return;
        }
        b().edit().putString("OTT_IDENTIFIER_TYPE", str).apply();
    }

    public final SharedPreferences b() {
        return this.c ? this.b : this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (r0 == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r4 = this;
            r0 = r4
            android.content.SharedPreferences r0 = r0.b()
            r8 = r0
            r0 = r8
            java.lang.String r1 = "OTT_CREATE_CONSENT_PROFILE_STRING"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            r9 = r0
            r0 = r9
            boolean r0 = com.onetrust.otpublishers.headless.Internal.c.b(r0)
            if (r0 != 0) goto L38
            r0 = r9
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r7 = r0
            r0 = r8
            java.lang.String r1 = "OTT_DATA_SUBJECT_IDENTIFIER_TYPE"
            r2 = 1
            int r0 = r0.getInt(r1, r2)
            r5 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 == 0) goto L3a
            r0 = r7
            r6 = r0
            r0 = r5
            r1 = 1
            if (r0 != r1) goto L3a
        L38:
            r0 = 0
            r6 = r0
        L3a:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.Internal.Preferences.e.c():boolean");
    }
}
