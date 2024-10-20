package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: m.class */
public final class m {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public int f3038;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public int f3039;

    /* renamed from: ｋ, reason: contains not printable characters */
    public int f3040;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m5748(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static int m5749(int i) {
        int[][] iArr = e.f1959.f1960;
        return ((iArr[0][(i >>> 24) & 255] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }
}
