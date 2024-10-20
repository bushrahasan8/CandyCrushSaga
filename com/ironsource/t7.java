package com.ironsource;

import org.json.JSONObject;

/* loaded from: t7.class */
public final class t7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString(str);
        String str2 = optString;
        if (optString.length() == 0) {
            str2 = null;
        }
        return str2;
    }
}
