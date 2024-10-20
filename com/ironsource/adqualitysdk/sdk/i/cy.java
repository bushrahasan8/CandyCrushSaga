package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.hp;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: cy.class */
public final class cy extends db {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1569 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1570 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f1571 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1572 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f1573;

    static {
        m4571();
        TextUtils.getCapsMode("", 0, 0);
        ViewConfiguration.getTouchSlop();
        Process.myPid();
        ViewConfiguration.getMaximumFlingVelocity();
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getTapTimeout();
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getScrollDefaultDelay();
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getLongPressTimeout();
        f1570 = (f1572 + 61) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Field m4569(List<Object> list) {
        if (!(list.get(0) instanceof Class)) {
            Object m4587 = db.m4587(list, 0, Object.class);
            return hv.m5211().m5213().m5134(m4587.getClass(), (Class) db.m4587(list, 1, Class.class));
        }
        f1570 = (f1572 + 47) % 128;
        Class cls = (Class) db.m4587(list, 0, Class.class);
        if (list.get(1) instanceof Class) {
            return hv.m5211().m5213().m5134(cls, (Class) db.m4587(list, 1, Class.class));
        }
        Field m5132 = hv.m5211().m5213().m5132(cls, (hp) db.m4587(list, 1, hp.class));
        f1570 = (f1572 + 67) % 128;
        return m5132;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Field m4570(List<Object> list) {
        f1570 = (f1572 + 27) % 128;
        Field m5132 = hv.m5211().m5213().m5132((Class) db.m4587(list, 0, Class.class), (hp) db.m4587(list, 1, hp.class));
        int i = f1572 + 111;
        f1570 = i % 128;
        if (i % 2 == 0) {
            return m5132;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m4571() {
        f1569 = -919218910;
        f1571 = -6542782394566060766L;
        f1573 = (char) 23513;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static List<Field> m4572(List<Object> list) {
        return (List) m4573(new Object[]{list}, 818924402, -818924402, (int) System.currentTimeMillis());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Object m4573(Object[] objArr, int i, int i2, int i3) {
        List<Field> m5133;
        boolean z = false;
        List list = (List) objArr[0];
        f1572 = (f1570 + 25) % 128;
        if (!(list.get(0) instanceof Class)) {
            Object m4587 = db.m4587(list, 0, Object.class);
            if (list.size() > 1) {
                z = ((Boolean) db.m4587(list, 1, Boolean.class)).booleanValue();
            }
            hv.m5211().m5213();
            Field[] m5130 = hn.m5130(m4587.getClass(), z, -1, null);
            if (m5130 != null) {
                m5133 = Arrays.asList(m5130);
            }
            m5133 = new ArrayList();
        } else {
            f1570 = (f1572 + 79) % 128;
            if (list.size() > 1) {
                f1572 = (f1570 + 11) % 128;
                m5133 = hv.m5211().m5213().m5133((Class) db.m4587(list, 0, Class.class), (hp) db.m4587(list, 1, hp.class));
            }
            m5133 = new ArrayList();
        }
        return m5133;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Field m4574(List<Object> list) {
        Class cls;
        Object obj;
        int i = f1572 + 45;
        f1570 = i % 128;
        if (i % 2 != 0) {
            Class cls2 = (Class) db.m4587(list, 0, Class.class);
            obj = db.m4587(list, 0, String.class);
            cls = cls2;
        } else {
            Class cls3 = (Class) db.m4587(list, 0, Class.class);
            Object m4587 = db.m4587(list, 1, String.class);
            cls = cls3;
            obj = m4587;
        }
        return hv.m5211().m5213().m5135(cls, (String) obj);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static hp.b m4575() {
        int i = f1572 + 19;
        f1570 = i % 128;
        if (i % 2 != 0) {
            hv.m5211().m5213();
            hn.m5127();
            throw null;
        }
        hv.m5211().m5213();
        hp.b m5127 = hn.m5127();
        int i2 = f1572 + 123;
        f1570 = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m5127;
    }
}
