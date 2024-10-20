package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: dg.class */
public final class dg extends db {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1726 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1727;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1728;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1729;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f1730;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f1731;

    static {
        m4652();
        TextUtils.lastIndexOf("", '0', 0, 0);
        Color.green(0);
        Process.myPid();
        ViewConfiguration.getTapTimeout();
        f1729 = (f1726 + 3) % 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.List] */
    public static WebView cB_(List<Object> list) {
        int i;
        ArrayList arrayList;
        Activity activity = (Activity) db.m4587(list, 0, Activity.class);
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        if (list.size() > 1) {
            int intValue = ((Integer) db.m4587(list, 1, Integer.class)).intValue();
            arrayList = arrayList2;
            i = intValue;
            if (list.size() > 2) {
                f1729 = (f1726 + 123) % 128;
                String str2 = (String) db.m4587(list, 2, String.class);
                arrayList = arrayList2;
                i = intValue;
                str = str2;
                if (list.size() > 3) {
                    f1726 = (f1729 + 9) % 128;
                    arrayList = (List) db.m4587(list, 3, List.class);
                    f1726 = (f1729 + 39) % 128;
                    i = intValue;
                    str = str2;
                }
            }
        } else {
            i = -1;
            arrayList = arrayList2;
        }
        return (WebView) kh.eA_(activity, WebView.class, i, arrayList, str);
    }

    public static <E extends View> E cC_(List<Object> list) {
        f1729 = (f1726 + 61) % 128;
        E e = (E) kh.eE_((View) db.m4587(list, 0, View.class), (Class) db.m4587(list, 1, Class.class), ((Boolean) db.m4587(list, 2, Boolean.class)).booleanValue());
        int i = f1729 + 107;
        f1726 = i % 128;
        if (i % 2 != 0) {
            return e;
        }
        throw null;
    }

    public static View cD_(List<Object> list) {
        f1726 = (f1729 + 91) % 128;
        View ez_ = kh.ez_((Activity) db.m4587(list, 0, Activity.class));
        f1729 = (f1726 + 15) % 128;
        return ez_;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m4652() {
        f1730 = true;
        f1728 = new char[]{6430, 6624, 6419, 6594, 6422, 6425, 6641, 6428, 6414, 6418, 6629, 6427, 6596, 6627, 6638, 6593, 6421, 6424, 6626, 6417, 6412};
        f1731 = true;
        f1727 = 343349639;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m4653(List<Object> list) {
        int i = f1726 + 27;
        f1729 = i % 128;
        return kh.eL_((View) db.m4587(list, i % 2 != 0 ? 1 : 0, View.class));
    }
}
