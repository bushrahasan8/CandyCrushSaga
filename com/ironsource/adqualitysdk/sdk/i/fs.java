package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: fs.class */
public final class fs extends fm<String> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2148 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2149 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2150 = 287397410;

    public fs(String str, dr drVar) {
        super(dv.m4842(str), drVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0320  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r8, int r9, boolean r10, int r11, java.lang.String r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fs.a(int, int, boolean, int, java.lang.String, java.lang.Object[]):void");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fm
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(1 - View.getDefaultSize(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), false, 49 - View.getDefaultSize(0, 0), "��", objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(super.toString());
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, 1 - (ViewConfiguration.getFadingEdgeLength() >> 16), false, View.getDefaultSize(0, 0) + 49, "��", objArr2);
        sb.append(((String) objArr2[0]).intern());
        String obj = sb.toString();
        f2148 = (f2149 + 27) % 128;
        return obj;
    }
}
