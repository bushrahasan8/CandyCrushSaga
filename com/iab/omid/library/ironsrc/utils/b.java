package com.iab.omid.library.ironsrc.utils;

import android.os.Build;
import com.ironsource.i5;
import com.ironsource.t2;
import org.json.JSONObject;

/* loaded from: b.class */
public final class b {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return t2.e;
    }

    public static String c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "deviceType", a());
        c.a(jSONObject, "osVersion", c());
        c.a(jSONObject, i5.x, b());
        return jSONObject;
    }
}
