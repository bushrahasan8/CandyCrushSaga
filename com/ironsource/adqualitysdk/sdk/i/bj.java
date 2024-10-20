package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;

/* loaded from: bj.class */
public final class bj extends bm {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f824 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f825 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static short[] f826;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f827 = {-87, -81, 92, 87, -91, 95, 86};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f828 = 801038352;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f829 = 1222266906;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f830 = 1798721606;

    public bj(String str) {
        super(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x03e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r8, byte r9, int r10, int r11, int r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 1187
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bj.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﱡ, reason: contains not printable characters */
    public final boolean mo3642() {
        int i = (f825 + 49) % 128;
        f824 = i;
        f825 = (i + 85) % 128;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Class mo3627(String str) {
        f825 = (f824 + 87) % 128;
        return null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Map mo3628() {
        HashMap hashMap = new HashMap();
        int i = f825 + 43;
        f824 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾒ */
    public final String mo3629() {
        f824 = (f825 + 5) % 128;
        Object[] objArr = new Object[1];
        a((short) Gravity.getAbsoluteGravity(0, 0), (byte) View.MeasureSpec.getMode(0), (-1149808641) - Color.red(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 9, (-602669131) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        String intern = ((String) objArr[0]).intern();
        int i = f824 + 43;
        f825 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return intern;
    }
}
