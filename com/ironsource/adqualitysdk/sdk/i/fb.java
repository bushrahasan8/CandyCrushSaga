package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;

/* loaded from: fb.class */
public final class fb extends ep {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2088 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2090 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2089 = {3335};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2087 = -4076608639347396494L;

    public fb(eb ebVar, eb ebVar2, dr drVar) {
        super(ebVar, ebVar2, drVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0205, code lost:
    
        r0[r0] = (char) r0[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x020f, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.b.f452;
        r11 = r0.get(518145355);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0222, code lost:
    
        if (r11 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0228, code lost:
    
        r11 = ((java.lang.Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(android.view.KeyEvent.getMaxKeyCode() >> 16, (char) android.view.View.combineMeasuredStates(0, 0), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 41)).getMethod("i", java.lang.Object.class, java.lang.Object.class);
        r0.put(518145355, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0266, code lost:
    
        ((java.lang.reflect.Method) r11).invoke(null, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x027d, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x030d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fb.c(int, int, char, java.lang.Object[]):void");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ep
    /* renamed from: ﻐ */
    public final Number mo4974(Number number, Number number2) {
        int i = f2090;
        int i2 = i + 83;
        f2088 = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = number instanceof Double;
            throw null;
        }
        if ((number instanceof Double) || (number2 instanceof Double)) {
            return Double.valueOf(number.doubleValue() - number2.doubleValue());
        }
        if (!(number instanceof Long)) {
            f2088 = (i + 27) % 128;
            if (!(number2 instanceof Long)) {
                return Integer.valueOf(number.intValue() - number2.intValue());
            }
        }
        long longValue = number.longValue();
        long longValue2 = number2.longValue();
        int i3 = f2088 + 45;
        f2090 = i3 % 128;
        if (i3 % 2 != 0) {
            return Long.valueOf(longValue - longValue2);
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* renamed from: ﻛ */
    public final String mo4955() {
        Object obj;
        int i = f2088 + 101;
        f2090 = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            c(-TextUtils.lastIndexOf("", '.', 1, 1), View.combineMeasuredStates(1, 0), (char) (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            c(-TextUtils.lastIndexOf("", '0', 0, 0), View.combineMeasuredStates(0, 0), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr2);
            obj = objArr2[0];
        }
        String intern = ((String) obj).intern();
        int i2 = f2088 + 21;
        f2090 = i2 % 128;
        if (i2 % 2 != 0) {
            return intern;
        }
        throw null;
    }
}
