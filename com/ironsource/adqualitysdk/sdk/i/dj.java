package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* loaded from: dj.class */
public final class dj extends db {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1763 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1764 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f1765;

    static {
        m4681();
        KeyEvent.getModifierMetaStateMask();
        Color.green(0);
        PointF.length(0.0f, 0.0f);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        int i = f1764 + 59;
        f1763 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static int m4680(List<Object> list) {
        f1763 = (f1764 + 43) % 128;
        int intValue = ((Integer) kf.m5679(new Object[]{(String) db.m4587(list, 0, String.class), (String) db.m4587(list, 1, String.class)}, 1722204562, -1722204561, (int) System.currentTimeMillis())).intValue();
        int i = f1763 + 85;
        f1764 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return intValue;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m4681() {
        f1765 = new int[]{-1004939364, -1505690805, 47120812, 2144524876, 1602528591, 371504569, -37159988, 664817122, -1467293152, 2128429225, 2142336295, -2079735619, -1984382820, 1286542532, 349182325, 614967526, -1470357077, 1555552875};
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m4682(List<Object> list) {
        boolean z;
        String str = (String) db.m4587(list, 0, String.class);
        if (list.size() > 2) {
            f1764 = (f1763 + 5) % 128;
            z = ((Boolean) db.m4587(list, 2, Boolean.class)).booleanValue();
        } else {
            z = true;
        }
        if (!(list.get(1) instanceof String)) {
            return kf.m5677(str, new JSONArray((Collection) db.m4587(list, 1, List.class)), z);
        }
        int i = f1763 + 103;
        f1764 = i % 128;
        String m5671 = kf.m5671(str, (String) (i % 2 == 0 ? db.m4587(list, 0, String.class) : db.m4587(list, 1, String.class)), z);
        int i2 = f1764 + 67;
        f1763 = i2 % 128;
        if (i2 % 2 == 0) {
            return m5671;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m4683(List<Object> list) {
        f1764 = (f1763 + 3) % 128;
        List<String> m5317 = hv.m5211().m5214().m5317(db.m4587(list, 0, Object.class), (List<String>) db.m4587(list, 1, List.class), ((Integer) db.m4587(list, 2, Integer.class)).intValue());
        f1763 = (f1764 + 37) % 128;
        return m5317;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static List<String> m4684(List<Object> list) {
        String str = (String) db.m4587(list, 0, String.class);
        if (!(!(list.get(1) instanceof String))) {
            List<String> m5674 = kf.m5674(str, (String) db.m4587(list, 1, String.class));
            f1763 = (f1764 + 49) % 128;
            return m5674;
        }
        List<String> m5672 = kf.m5672(str, new JSONArray((Collection) db.m4587(list, 1, List.class)));
        int i = f1764 + 21;
        f1763 = i % 128;
        if (i % 2 == 0) {
            return m5672;
        }
        throw null;
    }
}
