package com.ironsource;

import android.util.Base64;

/* loaded from: h5.class */
public class h5 {
    public static String a(String str) {
        try {
            return new String(Base64.decode(str, 0), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str) {
        return Base64.encodeToString(str.getBytes(), 10);
    }
}
