package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.ironsource.adqualitysdk.sdk.i.hs;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: dd.class */
public final class dd extends db {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1592 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1593 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f1594 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1595 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f1596;

    static {
        m4596();
        Color.blue(0);
        TextUtils.getTrimmedLength("");
        Color.argb(0, 0, 0, 0);
        Color.argb(0, 0, 0, 0);
        KeyEvent.getDeadChar(0, 0);
        View.getDefaultSize(0, 0);
        int i = f1595 + 37;
        f1592 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m4596() {
        f1593 = -141075033;
        f1596 = -6542782394566060766L;
        f1594 = (char) 54562;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static hs.d m4597() {
        hs.d dVar = new hs.d();
        int i = f1592 + 49;
        f1595 = i % 128;
        if (i % 2 != 0) {
            return dVar;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Method m4598(List<Object> list) {
        f1595 = (f1592 + 45) % 128;
        hs hsVar = (hs) db.m4587(list, 1, hs.class);
        if (!(list.get(0) instanceof Class)) {
            return ht.m5201(db.m4587(list, 0, Object.class).getClass(), hsVar);
        }
        Method m5201 = ht.m5201((Class) db.m4587(list, 0, Class.class), hsVar);
        f1595 = (f1592 + 83) % 128;
        return m5201;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static List<Method> m4599(List<Object> list) {
        hs hsVar = (hs) db.m4587(list, 1, hs.class);
        if (list.get(0) instanceof Class) {
            int i = f1592 + 43;
            f1595 = i % 128;
            return ht.m5199((Class) (i % 2 == 0 ? db.m4587(list, 1, Class.class) : db.m4587(list, 0, Class.class)), hsVar);
        }
        List<Method> m5199 = ht.m5199(db.m4587(list, 0, Object.class).getClass(), hsVar);
        f1592 = (f1595 + 79) % 128;
        return m5199;
    }
}
