package com.ironsource;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: ie.class */
public class ie {
    public static final String a = "errMsg";

    public static JSONObject a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", str);
            jSONObject.put("adViewId", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
