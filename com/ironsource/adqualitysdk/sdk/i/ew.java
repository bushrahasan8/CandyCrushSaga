package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;

/* loaded from: ew.class */
public final class ew extends ep {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2074 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2075 = 287397407;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2076;

    public ew(eb ebVar, eb ebVar2, dr drVar) {
        super(ebVar, ebVar2, drVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r7, int r8, boolean r9, int r10, java.lang.String r11, java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ew.c(int, int, boolean, int, java.lang.String, java.lang.Object[]):void");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ep
    /* renamed from: ﻐ */
    public final Number mo4974(Number number, Number number2) {
        if ((number instanceof Double) || (number2 instanceof Double)) {
            double doubleValue = number.doubleValue() / number2.doubleValue();
            int i = f2076 + 55;
            f2074 = i % 128;
            if (i % 2 != 0) {
                return Double.valueOf(doubleValue);
            }
            throw null;
        }
        if ((number instanceof Long) || (number2 instanceof Long)) {
            return Long.valueOf(number.longValue() / number2.longValue());
        }
        int intValue = number.intValue() / number2.intValue();
        int i2 = f2074 + 51;
        f2076 = i2 % 128;
        if (i2 % 2 == 0) {
            return Integer.valueOf(intValue);
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* renamed from: ﻛ */
    public final String mo4955() {
        Object obj;
        int i = f2076 + 65;
        f2074 = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            c(-TextUtils.lastIndexOf("", 'n', 0), 1 - (Process.myPid() % 26), false, (-16777119) - Color.rgb(0, 0, 0), "��", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            c(-TextUtils.lastIndexOf("", '0', 0), (Process.myPid() >> 22) + 1, false, (-16777119) - Color.rgb(0, 0, 0), "��", objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }
}
