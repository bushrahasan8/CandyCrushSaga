package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: eq.class */
public abstract class eq extends er {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2059 = {37229, 37150, 37163, 37154, 37154, 37181, 37126, 37133, 37157, 37154, 37154, 37156, 37157, 37159, 37134, 37212, 37134, 37157, 37163, 37132};

    public eq(eb ebVar, eb ebVar2, dr drVar) {
        super(ebVar, ebVar2, drVar);
    }

    private static void c(boolean z, int[] iArr, String str, Object[] objArr) {
        String str2 = str;
        if (str != null) {
            $10 = ($11 + 123) % 128;
            str2 = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) str2;
        j jVar = new j();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = f2059;
        char[] cArr2 = cArr;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                char c = cArr[i5];
                try {
                    Map map = b.f452;
                    Object obj = map.get(123012079);
                    if (obj == null) {
                        obj = ((Class) b.m3371(ViewConfiguration.getWindowTouchSlop() >> 8, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 41)).getMethod("t", Integer.TYPE);
                        map.put(123012079, obj);
                    }
                    cArr3[i5] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i2];
        System.arraycopy(cArr2, i, cArr4, 0, i2);
        char[] cArr5 = cArr4;
        if (bArr != null) {
            char[] cArr6 = new char[i2];
            jVar.f2705 = 0;
            char c2 = 0;
            while (true) {
                int i6 = jVar.f2705;
                if (i6 >= i2) {
                    break;
                }
                if (bArr[i6] == 1) {
                    char c3 = cArr4[i6];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(-1475644584);
                    if (obj2 == null) {
                        Class cls = (Class) b.m3371(KeyEvent.getDeadChar(0, 0), (char) Color.argb(0, 0, 0, 0), 41 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        Class<?> cls2 = Integer.TYPE;
                        obj2 = cls.getMethod("v", cls2, cls2);
                        map2.put(-1475644584, obj2);
                    }
                    cArr6[i6] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c3), Integer.valueOf(c2))).charValue();
                } else {
                    char c4 = cArr4[i6];
                    Map map3 = b.f452;
                    Object obj3 = map3.get(1186866459);
                    if (obj3 == null) {
                        Class cls3 = (Class) b.m3371(KeyEvent.getMaxKeyCode() >> 16, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (Process.myPid() >> 22) + 41);
                        Class<?> cls4 = Integer.TYPE;
                        obj3 = cls3.getMethod("y", cls4, cls4);
                        map3.put(1186866459, obj3);
                    }
                    cArr6[i6] = ((Character) ((Method) obj3).invoke(null, Integer.valueOf(c4), Integer.valueOf(c2))).charValue();
                }
                c2 = cArr6[jVar.f2705];
                Map map4 = b.f452;
                Object obj4 = map4.get(-811294887);
                if (obj4 == null) {
                    obj4 = ((Class) b.m3371(1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-16777175) - Color.rgb(0, 0, 0))).getMethod("w", Object.class, Object.class);
                    map4.put(-811294887, obj4);
                }
                ((Method) obj4).invoke(null, jVar, jVar);
            }
            cArr5 = cArr6;
        }
        if (i4 > 0) {
            int i7 = $11 + 5;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                char[] cArr7 = new char[i2];
                System.arraycopy(cArr5, 0, cArr7, 0, i2);
                System.arraycopy(cArr7, 1, cArr5, i2 >> i4, i4);
                System.arraycopy(cArr7, i4, cArr5, 1, i2 % i4);
            } else {
                char[] cArr8 = new char[i2];
                System.arraycopy(cArr5, 0, cArr8, 0, i2);
                int i8 = i2 - i4;
                System.arraycopy(cArr8, 0, cArr5, i8, i4);
                System.arraycopy(cArr8, i4, cArr5, 0, i8);
            }
        }
        int i9 = 0;
        char[] cArr9 = cArr5;
        if (!(!z)) {
            cArr9 = new char[i2];
            while (true) {
                jVar.f2705 = i9;
                int i10 = jVar.f2705;
                if (i10 >= i2) {
                    break;
                }
                cArr9[i10] = cArr5[(i2 - i10) - 1];
                i9 = i10 + 1;
            }
        }
        if (i3 > 0) {
            jVar.f2705 = 0;
            while (true) {
                int i11 = jVar.f2705;
                if (i11 >= i2) {
                    break;
                }
                int i12 = ($11 + 17) % 128;
                $10 = i12;
                cArr9[i11] = (char) (cArr9[i11] - iArr[2]);
                jVar.f2705 = i11 + 1;
                $11 = (i12 + 7) % 128;
            }
        }
        objArr[0] = new String(cArr9);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.er
    /* renamed from: ﻐ, reason: contains not printable characters */
    final boolean mo4976(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        c(false, new int[]{0, 15, 0, 0}, "\u0001��\u0001��\u0001\u0001��\u0001����\u0001\u0001\u0001\u0001\u0001", objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        c(true, new int[]{15, 5, 0, 0}, "������\u0001\u0001", objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        throw new RuntimeException(sb.toString());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.er
    /* renamed from: ﻛ, reason: contains not printable characters */
    final boolean mo4977(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        c(false, new int[]{0, 15, 0, 0}, "\u0001��\u0001��\u0001\u0001��\u0001����\u0001\u0001\u0001\u0001\u0001", objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(obj);
        Object[] objArr2 = new Object[1];
        c(true, new int[]{15, 5, 0, 0}, "������\u0001\u0001", objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(obj2);
        throw new RuntimeException(sb.toString());
    }
}
