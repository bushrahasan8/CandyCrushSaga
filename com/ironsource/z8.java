package com.ironsource;

import com.ironsource.f7;
import org.json.JSONObject;

/* loaded from: z8.class */
public class z8 {
    static String a = "ManRewInst_";

    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(q8 q8Var) {
        return (q8Var.g() ? f7.e.Banner : q8Var.l() ? f7.e.RewardedVideo : f7.e.Interstitial).toString();
    }

    public static String a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return a + jSONObject.optString("name");
    }
}
