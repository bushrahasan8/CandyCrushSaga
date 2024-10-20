package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* loaded from: c.class */
public abstract /* synthetic */ class c {
    public static void a(JSONObject jSONObject, SharedPreferences.Editor editor, String str) {
        editor.putString(str, jSONObject.toString()).apply();
    }
}
