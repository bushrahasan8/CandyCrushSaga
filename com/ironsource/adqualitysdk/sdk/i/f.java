package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: f.class */
public final class f {
    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m4985(int i, int i2, boolean z, int i3, int[] iArr, int[][] iArr2, int[] iArr3) {
        int i4;
        if (!z) {
            m4986(iArr);
        }
        int i5 = i;
        int i6 = i2;
        int i7 = 0;
        while (true) {
            i4 = i6;
            if (i7 >= i3) {
                break;
            }
            i6 = i5 ^ iArr[i7];
            int i8 = iArr2[0][i6 >>> 24];
            int i9 = iArr2[1][(i6 >>> 16) & 255];
            i7++;
            i5 = i4 ^ ((iArr2[2][(i6 >>> 8) & 255] ^ (i8 + i9)) + iArr2[3][i6 & 255]);
        }
        int i10 = iArr[iArr.length - 2];
        int i11 = iArr[iArr.length - 1];
        if (!z) {
            m4986(iArr);
        }
        iArr3[0] = i4 ^ i11;
        iArr3[1] = i5 ^ i10;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m4986(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }
}
