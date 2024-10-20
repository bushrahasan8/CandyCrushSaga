package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: ey.class */
public final class ey extends eq {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2078 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2079 = 287397535;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2080;

    public ey(eb ebVar, eb ebVar2, dr drVar) {
        super(ebVar, ebVar2, drVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r8, int r9, boolean r10, int r11, java.lang.String r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ey.d(int, int, boolean, int, java.lang.String, java.lang.Object[]):void");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* renamed from: ﻛ */
    public final String mo4955() {
        f2078 = (f2080 + 45) % 128;
        Object[] objArr = new Object[1];
        d(1 - View.combineMeasuredStates(0, 0), 1 - (ViewConfiguration.getEdgeSlop() >> 16), true, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 240, "��", objArr);
        String intern = ((String) objArr[0]).intern();
        f2078 = (f2080 + 113) % 128;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.er
    /* renamed from: ﾒ */
    final boolean mo4978(int i) {
        int i2 = f2078;
        f2080 = (i2 + 89) % 128;
        if (i <= 0) {
            return false;
        }
        int i3 = i2 + 7;
        f2080 = i3 % 128;
        return i3 % 2 == 0;
    }
}
