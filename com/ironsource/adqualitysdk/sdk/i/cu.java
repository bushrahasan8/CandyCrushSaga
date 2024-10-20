package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: cu.class */
public final class cu {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1532 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1533;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1534;

    static {
        m4501();
        f1532 = (f1533 + 73) % 128;
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        char c;
        String str2 = str;
        if (str != null) {
            $10 = ($11 + 91) % 128;
            str2 = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) str2;
        j jVar = new j();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = f1534;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                char c2 = cArr[i5];
                try {
                    Map map = b.f452;
                    Object obj = map.get(123012079);
                    if (obj == null) {
                        obj = ((Class) b.m3371(TextUtils.getTrimmedLength(""), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 41)).getMethod("t", Integer.TYPE);
                        map.put(123012079, obj);
                    }
                    cArr2[i5] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c2))).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        System.arraycopy(cArr, i, cArr3, 0, i2);
        char[] cArr4 = cArr3;
        if (bArr != null) {
            int i6 = $10 + 113;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr4 = new char[i2];
                jVar.f2705 = 1;
                c = 1;
            } else {
                cArr4 = new char[i2];
                jVar.f2705 = 0;
                c = 0;
            }
            while (true) {
                int i7 = jVar.f2705;
                if (i7 >= i2) {
                    break;
                }
                if (bArr[i7] == 1) {
                    char c3 = cArr3[i7];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(-1475644584);
                    if (obj2 == null) {
                        Class cls = (Class) b.m3371((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, (char) (ViewConfiguration.getScrollBarSize() >> 8), KeyEvent.getDeadChar(0, 0) + 41);
                        Class<?> cls2 = Integer.TYPE;
                        obj2 = cls.getMethod("v", cls2, cls2);
                        map2.put(-1475644584, obj2);
                    }
                    cArr4[i7] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c3), Integer.valueOf(c))).charValue();
                } else {
                    char c4 = cArr3[i7];
                    Map map3 = b.f452;
                    Object obj3 = map3.get(1186866459);
                    if (obj3 == null) {
                        Class cls3 = (Class) b.m3371(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) TextUtils.indexOf("", ""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 41);
                        Class<?> cls4 = Integer.TYPE;
                        obj3 = cls3.getMethod("y", cls4, cls4);
                        map3.put(1186866459, obj3);
                    }
                    cArr4[i7] = ((Character) ((Method) obj3).invoke(null, Integer.valueOf(c4), Integer.valueOf(c))).charValue();
                }
                c = cArr4[jVar.f2705];
                Map map4 = b.f452;
                Object obj4 = map4.get(-811294887);
                if (obj4 == null) {
                    obj4 = ((Class) b.m3371(KeyEvent.getMaxKeyCode() >> 16, (char) (Process.myTid() >> 22), View.MeasureSpec.getMode(0) + 41)).getMethod("w", Object.class, Object.class);
                    map4.put(-811294887, obj4);
                }
                ((Method) obj4).invoke(null, jVar, jVar);
            }
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            System.arraycopy(cArr4, 0, cArr5, 0, i2);
            int i8 = i2 - i4;
            System.arraycopy(cArr5, 0, cArr4, i8, i4);
            System.arraycopy(cArr5, i4, cArr4, 0, i8);
        }
        char[] cArr6 = cArr4;
        if (z) {
            $10 = ($11 + 41) % 128;
            cArr6 = new char[i2];
            jVar.f2705 = 0;
            while (true) {
                int i9 = jVar.f2705;
                if (i9 >= i2) {
                    break;
                }
                int i10 = ($10 + 49) % 128;
                $11 = i10;
                cArr6[i9] = cArr4[(i2 - i9) - 1];
                jVar.f2705 = i9 + 1;
                $10 = (i10 + 81) % 128;
            }
        }
        if (i3 > 0) {
            int i11 = 0;
            while (true) {
                jVar.f2705 = i11;
                int i12 = jVar.f2705;
                if (i12 >= i2) {
                    break;
                }
                cArr6[i12] = (char) (cArr6[i12] - iArr[2]);
                i11 = i12 + 1;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m4500(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(false, new int[]{4, 4, 0, 0}, "\u0001\u0001��\u0001", objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        kd.m5655(sb.toString(), str2, Integer.toHexString(str2.hashCode()), th, null, false);
        f1532 = (f1533 + 97) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m4501() {
        f1534 = new char[]{37221, 37150, 37123, 37242, 37221, 37150, 37123, 37233, 37232, 37179, 37176};
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m4502(String str, String str2, Throwable th) {
        int i = f1533 + 81;
        f1532 = i % 128;
        m4500(str, str2, th);
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        f1532 = (f1533 + 75) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4503(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(false, new int[]{0, 4, 0, 0}, "\u0001\u0001����", objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        v.m5767(sb.toString(), str2);
        f1533 = (f1532 + 117) % 128;
    }
}
