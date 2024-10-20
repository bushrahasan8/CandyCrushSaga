package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;

/* loaded from: dr.class */
public final class dr {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1864 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1865 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f1866 = 2102307396741778622L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f1867;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private int f1868;

    private dr(String str, int i) {
        this.f1867 = str;
        this.f1868 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0343  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r9, int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dr.a(java.lang.String, int, java.lang.Object[]):void");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static dr m4812(String str, int i) {
        f1865 = (f1864 + 29) % 128;
        if (y.m5796().m5830()) {
            return new dr(str, i);
        }
        int i2 = f1864 + 99;
        f1865 = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1867);
        Object[] objArr = new Object[1];
        a("\uef6a", 51109 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(this.f1868);
        String obj = sb.toString();
        int i = f1864 + 99;
        f1865 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return obj;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final int m4813() {
        int i = f1865;
        int i2 = this.f1868;
        int i3 = i + 77;
        f1864 = i3 % 128;
        if (i3 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return i2;
    }
}
