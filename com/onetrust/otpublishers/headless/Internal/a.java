package com.onetrust.otpublishers.headless.Internal;

import com.onetrust.otpublishers.headless.Internal.Helper.h;
import com.onetrust.otpublishers.headless.Internal.Helper.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: a.class */
public final class a {
    public static JSONObject a(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getJSONObject(str);
            }
            return null;
        } catch (JSONException e) {
            l.a("getObject failed: ", e, "JSONUtils", 6);
            return null;
        }
    }

    public static void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2.has(str)) {
            try {
                jSONObject.put(str, jSONObject2.optString(str));
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("Error in parsing data. key = ");
                sb.append(str);
                sb.append("Error message : ");
                h.a(e, sb, "JSONUtils", 6);
            }
        }
    }

    public static boolean a(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static boolean a(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }
}
