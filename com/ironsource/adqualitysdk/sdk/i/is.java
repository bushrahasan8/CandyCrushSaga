package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: is.class */
public abstract class is implements Runnable {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2625 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2626;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2627 = 1;

    static {
        m5378();
        int i = f2627 + 41;
        f2625 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void c(boolean z, int[] iArr, String str, Object[] objArr) {
        int i = $10 + 19;
        $11 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        String str2 = str;
        if (str != null) {
            str2 = str.getBytes("ISO-8859-1");
            $10 = ($11 + 81) % 128;
        }
        byte[] bArr = (byte[]) str2;
        j jVar = new j();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = f2626;
        char[] cArr2 = cArr;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 7;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    char c = cArr[i6];
                    try {
                        Map map = b.f452;
                        Object obj = map.get(123012079);
                        if (obj == null) {
                            obj = ((Class) b.m3371((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ImageFormat.getBitsPerPixel(0) + 1), 41 - (ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("t", Integer.TYPE);
                            map.put(123012079, obj);
                        }
                        cArr3[i6] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
                        i6 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    char c2 = cArr[i6];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(123012079);
                    if (obj2 == null) {
                        obj2 = ((Class) b.m3371(ExpandableListView.getPackedPositionChild(0L) + 1, (char) TextUtils.indexOf("", ""), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 41)).getMethod("t", Integer.TYPE);
                        map2.put(123012079, obj2);
                    }
                    cArr3[i6] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c2))).charValue();
                    i6++;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        char[] cArr5 = cArr4;
        if (bArr != null) {
            char[] cArr6 = new char[i3];
            jVar.f2705 = 0;
            char c3 = 0;
            while (true) {
                int i8 = jVar.f2705;
                if (i8 >= i3) {
                    break;
                }
                if (bArr[i8] == 1) {
                    char c4 = cArr4[i8];
                    Map map3 = b.f452;
                    Object obj3 = map3.get(-1475644584);
                    if (obj3 == null) {
                        Class cls = (Class) b.m3371(View.MeasureSpec.getMode(0), (char) Color.alpha(0), TextUtils.indexOf("", "", 0) + 41);
                        Class<?> cls2 = Integer.TYPE;
                        obj3 = cls.getMethod("v", cls2, cls2);
                        map3.put(-1475644584, obj3);
                    }
                    cArr6[i8] = ((Character) ((Method) obj3).invoke(null, Integer.valueOf(c4), Integer.valueOf(c3))).charValue();
                } else {
                    char c5 = cArr4[i8];
                    Map map4 = b.f452;
                    Object obj4 = map4.get(1186866459);
                    if (obj4 == null) {
                        Class cls3 = (Class) b.m3371(TextUtils.lastIndexOf("", '0', 0, 0) + 1, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 'Y' - AndroidCharacter.getMirror('0'));
                        Class<?> cls4 = Integer.TYPE;
                        obj4 = cls3.getMethod("y", cls4, cls4);
                        map4.put(1186866459, obj4);
                    }
                    cArr6[i8] = ((Character) ((Method) obj4).invoke(null, Integer.valueOf(c5), Integer.valueOf(c3))).charValue();
                }
                c3 = cArr6[jVar.f2705];
                Map map5 = b.f452;
                Object obj5 = map5.get(-811294887);
                if (obj5 == null) {
                    obj5 = ((Class) b.m3371(Color.alpha(0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 41 - TextUtils.getOffsetAfter("", 0))).getMethod("w", Object.class, Object.class);
                    map5.put(-811294887, obj5);
                }
                ((Method) obj5).invoke(null, jVar, jVar);
            }
            $10 = ($11 + 65) % 128;
            cArr5 = cArr6;
        }
        if (i5 > 0) {
            char[] cArr7 = new char[i3];
            System.arraycopy(cArr5, 0, cArr7, 0, i3);
            int i9 = i3 - i5;
            System.arraycopy(cArr7, 0, cArr5, i9, i5);
            System.arraycopy(cArr7, i5, cArr5, 0, i9);
        }
        char[] cArr8 = cArr5;
        if (z) {
            cArr8 = new char[i3];
            jVar.f2705 = 0;
            $11 = ($10 + 63) % 128;
            while (true) {
                int i10 = jVar.f2705;
                if (i10 >= i3) {
                    break;
                }
                cArr8[i10] = cArr5[(i3 - i10) - 1];
                jVar.f2705 = i10 + 1;
            }
        }
        if (i4 > 0) {
            int i11 = 0;
            while (true) {
                jVar.f2705 = i11;
                int i12 = jVar.f2705;
                if (i12 >= i3) {
                    break;
                }
                cArr8[i12] = (char) (cArr8[i12] - iArr[2]);
                i11 = i12 + 1;
            }
        }
        objArr[0] = new String(cArr8);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static void m5378() {
        f2626 = new char[]{37172, 37291, 37290, 37306, 37299, 36941, 37307, 37299, 36929, 36934, 36943, 37297, 36943, 36936, 37230, 37143, 37182, 37180, 37180, 37125, 37128, 37159, 37131, 37133, 37163, 37162, 37158, 37183, 37125, 37224, 37154, 37336, 37319, 37323, 37172, 37208, 37201, 37146, 37155, 37158, 37161, 37158, 37152, 37144};
    }

    @Override // java.lang.Runnable
    public final void run() {
        f2625 = (f2627 + 21) % 128;
        try {
            mo3016();
            int i = f2625 + 41;
            f2627 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            try {
                mo3541(th);
            } catch (Throwable th2) {
            }
        }
    }

    /* renamed from: ﻐ */
    public abstract void mo3016() throws Exception;

    /* renamed from: ｋ */
    public void mo3541(Throwable th) {
        Object[] objArr = new Object[1];
        c(false, new int[]{0, 14, 156, 0}, "����\u0001��\u0001\u0001\u0001\u0001\u0001��\u0001\u0001��\u0001", objArr);
        String intern = ((String) objArr[0]).intern();
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        c(false, new int[]{14, 15, 0, 0}, "\u0001\u0001��\u0001\u0001��\u0001\u0001��\u0001\u0001\u0001����\u0001", objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(getClass().getName());
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr3 = new Object[1];
        c(true, new int[]{29, 6, 33, 0}, "\u0001\u0001����\u0001\u0001", objArr3);
        sb2.append(((String) objArr3[0]).intern());
        sb2.append(getClass().getName());
        Object[] objArr4 = new Object[1];
        c(false, new int[]{35, 1, 0, 1}, "\u0001", objArr4);
        sb2.append(((String) objArr4[0]).intern());
        kd.m5649(new Object[]{intern, obj, sb2.toString(), th}, -1811451310, 1811451311, (int) System.currentTimeMillis());
        Object[] objArr5 = new Object[1];
        c(false, new int[]{0, 14, 156, 0}, "����\u0001��\u0001\u0001\u0001\u0001\u0001��\u0001\u0001��\u0001", objArr5);
        String intern2 = ((String) objArr5[0]).intern();
        StringBuilder sb3 = new StringBuilder();
        Object[] objArr6 = new Object[1];
        c(false, new int[]{14, 15, 0, 0}, "\u0001\u0001��\u0001\u0001��\u0001\u0001��\u0001\u0001\u0001����\u0001", objArr6);
        sb3.append(((String) objArr6[0]).intern());
        sb3.append(getClass().getName());
        v.m5763(intern2, sb3.toString());
        Object[] objArr7 = new Object[1];
        c(false, new int[]{0, 14, 156, 0}, "����\u0001��\u0001\u0001\u0001\u0001\u0001��\u0001\u0001��\u0001", objArr7);
        String intern3 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        c(true, new int[]{36, 8, 0, 0}, "��\u0001\u0001\u0001��\u0001\u0001\u0001", objArr8);
        v.m5760(intern3, ((String) objArr8[0]).intern(), th);
        f2625 = (f2627 + 101) % 128;
    }
}
