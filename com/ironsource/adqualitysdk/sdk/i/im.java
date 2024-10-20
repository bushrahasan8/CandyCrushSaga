package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: im.class */
public final class im {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2611 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2612;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f2613;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f2614;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Map f2615;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2616;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2617;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Map f2618;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Map f2619;

    static {
        m5370();
        KeyEvent.keyCodeFromString("");
        f2615 = new HashMap();
        f2618 = new HashMap();
        f2619 = new HashMap();
        int i = f2612 + 3;
        f2611 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m5369(Context context, String str, JSONObject jSONObject, Object... objArr) {
        Intent putExtra = new Intent(str).putExtra(ig.f2534, jSONObject.toString());
        int length = objArr.length;
        ((ij) ij.m5354(new Object[]{context})).cR_(putExtra);
        f2611 = (f2612 + 29) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m5370() {
        f2613 = true;
        f2616 = new char[]{6426, 6408, 6439, 6451, 6453, 6440, 6417, 6494, 6449, 6438, 6432, 6409, 6447, 6434, 6413};
        f2614 = true;
        f2617 = 343349716;
    }
}
