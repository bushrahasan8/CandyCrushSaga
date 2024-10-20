package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: fd.class */
public final class fd extends eq {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2097 = -6542782394566060766L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2098 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2099 = 549019190;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2100 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2101 = 54562;

    public fd(eb ebVar, eb ebVar2, dr drVar) {
        super(ebVar, ebVar2, drVar);
    }

    private static void d(char c, int i, String str, String str2, String str3, Object[] objArr) {
        int i2 = $11;
        int i3 = i2 + 7;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        char[] cArr = str3;
        if (str3 != null) {
            $10 = (i2 + 115) % 128;
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        if (str2 != null) {
            str2 = str2.toCharArray();
        }
        char[] cArr3 = (char[]) str2;
        if (str != null) {
            $10 = ($11 + 65) % 128;
            str = str.toCharArray();
        }
        char[] cArr4 = (char[]) str;
        g gVar = new g();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        System.arraycopy(cArr3, 0, cArr5, 0, length);
        System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr7 = new char[length3];
        gVar.f2182 = 0;
        while (gVar.f2182 < length3) {
            try {
                Map map = b.f452;
                Object obj = map.get(844572084);
                if (obj == null) {
                    obj = ((Class) b.m3371((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 41)).getMethod("B", Object.class);
                    map.put(844572084, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, gVar)).intValue();
                Object obj2 = map.get(-204678676);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(TextUtils.getOffsetBefore("", 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 41 - (ViewConfiguration.getTouchSlop() >> 8))).getMethod("z", Object.class);
                    map.put(-204678676, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, gVar)).intValue();
                char c2 = cArr5[gVar.f2182 % 4];
                char c3 = cArr6[intValue];
                Object obj3 = map.get(786100179);
                if (obj3 == null) {
                    Class cls = (Class) b.m3371(Color.blue(0), (char) (Process.myTid() >> 22), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 42);
                    Class<?> cls2 = Integer.TYPE;
                    obj3 = cls.getMethod("A", Object.class, cls2, cls2);
                    map.put(786100179, obj3);
                }
                ((Method) obj3).invoke(null, gVar, Integer.valueOf(c2 * 32718), Integer.valueOf(c3));
                char c4 = cArr5[intValue2];
                char c5 = cArr6[intValue];
                Object obj4 = map.get(1393811622);
                if (obj4 == null) {
                    Class cls3 = (Class) b.m3371((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (KeyEvent.getMaxKeyCode() >> 16), View.combineMeasuredStates(0, 0) + 41);
                    Class<?> cls4 = Integer.TYPE;
                    obj4 = cls3.getMethod("D", cls4, cls4);
                    map.put(1393811622, obj4);
                }
                cArr6[intValue2] = ((Character) ((Method) obj4).invoke(null, Integer.valueOf(c4 * 32718), Integer.valueOf(c5))).charValue();
                cArr5[intValue2] = gVar.f2183;
                int i4 = gVar.f2182;
                cArr7[i4] = (char) ((((int) (f2099 ^ (-6542782394566060766L))) ^ ((r0 ^ cArr2[i4]) ^ (f2097 ^ (-6542782394566060766L)))) ^ ((char) (f2101 ^ (-6542782394566060766L))));
                gVar.f2182 = i4 + 1;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str4 = new String(cArr7);
        int i5 = $10 + 23;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        objArr[0] = str4;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* renamed from: ﻛ */
    public final String mo4955() {
        Object obj;
        int i = f2098 + 11;
        f2100 = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            d((char) (64515 % ImageFormat.getBitsPerPixel(0)), 1697183371 / (ViewConfiguration.getMaximumDrawingCacheSize() << 111), "��������", "譏⣶ɥ跼", "\uee39", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            d((char) (ImageFormat.getBitsPerPixel(0) + 64515), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1697183371, "��������", "譏⣶ɥ跼", "\uee39", objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.er
    /* renamed from: ﾒ */
    final boolean mo4978(int i) {
        int i2 = f2100;
        int i3 = i2 + 15;
        int i4 = i3 % 128;
        f2098 = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (i < 0) {
            f2100 = (i4 + 111) % 128;
            return true;
        }
        f2098 = (i2 + 31) % 128;
        return false;
    }
}
