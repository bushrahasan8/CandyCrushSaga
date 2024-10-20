package com.ironsource.adqualitysdk.sdk.i;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: jz.class */
public final class jz {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2953 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2954;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2955 = 1;

    static {
        m5608();
        int i = f2953 + 55;
        f2955 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0174, code lost:
    
        r0 = r0[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017b, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.b.f452;
        r8 = r0.get(-1475644584);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018c, code lost:
    
        if (r8 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0192, code lost:
    
        r0 = (java.lang.Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 1), 41 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
        r0 = java.lang.Integer.TYPE;
        r8 = r0.getMethod("v", r0, r0);
        r0.put(-1475644584, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01fe, code lost:
    
        r0[r0] = ((java.lang.Character) ((java.lang.reflect.Method) r8).invoke(null, java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r12))).charValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x020c, code lost:
    
        throw new java.lang.ArithmeticException("divide by zero");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(boolean r7, int[] r8, java.lang.String r9, java.lang.Object[] r10) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jz.a(boolean, int[], java.lang.String, java.lang.Object[]):void");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m5608() {
        f2954 = new char[]{37205, 37123, 37138, 37164, 37138, 37164, 37144, 37240, 37144, 37145, 37122, 37140, 37128, 37244, 37246, 37233, 37128, 37148, 37167, 37138, 37144, 37143, 37129, 37151, 37140, 37236, 37235, 37143, 37122, 37243, 37151, 37141, 37240, 37237, 37172, 37294, 37250, 37273, 37285, 37212, 37142, 37161, 37253, 37249, 37263, 37361, 37249, 37279, 37366, 37365, 37154, 37311, 36934, 36932, 36932, 37282, 37257};
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5609(String str) {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            Object[] objArr = new Object[1];
            a(true, new int[]{0, 34, 0, 13}, "\u0001��\u0001\u0001\u0001\u0001\u0001\u0001\u0001����\u0001\u0001\u0001\u0001\u0001\u0001\u0001����\u0001��\u0001\u0001\u0001��\u0001\u0001��\u0001\u0001��\u0001��", objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(true, new int[]{34, 5, 156, 1}, "\u0001\u0001\u0001\u0001��", objArr2);
            mac.init(new SecretKeySpec(intern.getBytes(((String) objArr2[0]).intern()), mac.getAlgorithm()));
            Object[] objArr3 = new Object[1];
            a(false, new int[]{39, 1, 0, 1}, "��", objArr3);
            String replaceAll = str.replaceAll(((String) objArr3[0]).intern(), "");
            Object[] objArr4 = new Object[1];
            a(false, new int[]{40, 1, 171, 0}, "\u0001", objArr4);
            String replaceAll2 = replaceAll.replaceAll(((String) objArr4[0]).intern(), "");
            Object[] objArr5 = new Object[1];
            a(true, new int[]{34, 5, 156, 1}, "\u0001\u0001\u0001\u0001��", objArr5);
            String m5324 = ic.m5324(mac.doFinal(replaceAll2.getBytes(((String) objArr5[0]).intern())));
            int i = f2955 + 11;
            f2953 = i % 128;
            if (i % 2 == 0) {
                return m5324;
            }
            throw null;
        } catch (Exception e) {
            Object[] objArr6 = new Object[1];
            a(true, new int[]{41, 9, 95, 8}, "\u0001\u0001\u0001\u0001\u0001��\u0001����", objArr6);
            String intern2 = ((String) objArr6[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr7 = new Object[1];
            a(false, new int[]{50, 7, 152, 0}, "\u0001\u0001��\u0001\u0001����", objArr7);
            sb.append(((String) objArr7[0]).intern());
            sb.append(e.getLocalizedMessage());
            v.m5763(intern2, sb.toString());
            return null;
        }
    }
}
