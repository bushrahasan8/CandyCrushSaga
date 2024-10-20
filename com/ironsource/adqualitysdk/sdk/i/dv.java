package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;
import java.util.Map;

/* loaded from: dv.class */
public final class dv {

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Map f1912 = new HashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4842(String str) {
        String str2 = (String) f1912.get(str);
        if (str2 == null) {
            f1912.put(str, str);
        } else {
            str = str2;
        }
        return str;
    }
}
