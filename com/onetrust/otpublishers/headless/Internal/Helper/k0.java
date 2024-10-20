package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.SharedPreferences;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import org.json.JSONObject;

/* loaded from: k0.class */
public abstract class k0 {
    public static int a(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str)) {
            return -1;
        }
        String optString = jSONObject.optJSONObject(str).optString("userConsentStatus");
        return ("ACTIVE".equalsIgnoreCase(optString) || "OPT_IN".equalsIgnoreCase(optString)) ? 1 : 0;
    }

    public static void a(com.onetrust.otpublishers.headless.Internal.Preferences.e eVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        SharedPreferences.Editor edit = eVar.b().edit();
        edit.putString("OT_UC_PURPOSES_PURPOSE_SERVER_DATA", String.valueOf(jSONObject));
        edit.putString("OT_UC_PURPOSES_TOPIC_SERVER_DATA", String.valueOf(jSONObject2));
        edit.putString("OT_UC_PURPOSES_CUSTOM_PREF_OPTIONS_SERVER_DATA", String.valueOf(jSONObject3));
        edit.apply();
    }

    public static boolean a(boolean z, JSONObject jSONObject, String str, String str2) {
        if (str.equalsIgnoreCase(str2)) {
            jSONObject.put("userConsentStatus", z ? "OPT_IN" : "OPT_OUT");
            return true;
        }
        OTLogger.a("UCPurposesDataHandler", 5, "Invalid ID passed to update UCP Consent values");
        return false;
    }
}
