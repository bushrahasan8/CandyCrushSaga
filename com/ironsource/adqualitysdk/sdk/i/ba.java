package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: ba.class */
public final class ba extends au {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f454 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f455 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f456 = {37176, 37267, 37268, 37294, 37322, 36953, 36959, 36933};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final boolean f457 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final boolean f458 = true;

    public ba(az azVar) {
        m3314(azVar);
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        $11 = ($10 + 93) % 128;
        String str2 = str;
        if (str != null) {
            str2 = str.getBytes("ISO-8859-1");
            $11 = ($10 + 47) % 128;
        }
        byte[] bArr = (byte[]) str2;
        j jVar = new j();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = f456;
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
                        obj = ((Class) b.m3371(ViewConfiguration.getScrollBarSize() >> 8, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 41)).getMethod("t", Integer.TYPE);
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
            $10 = ($11 + 63) % 128;
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
                        Class cls = (Class) b.m3371((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 41 - KeyEvent.normalizeMetaState(0));
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
                        Class cls3 = (Class) b.m3371(ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 41 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
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
                    obj4 = ((Class) b.m3371((-1) - ImageFormat.getBitsPerPixel(0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), View.MeasureSpec.getMode(0) + 41)).getMethod("w", Object.class, Object.class);
                    map4.put(-811294887, obj4);
                }
                ((Method) obj4).invoke(null, jVar, jVar);
            }
            cArr5 = cArr6;
        }
        if (i4 > 0) {
            char[] cArr7 = new char[i2];
            System.arraycopy(cArr5, 0, cArr7, 0, i2);
            int i7 = i2 - i4;
            System.arraycopy(cArr7, 0, cArr5, i7, i4);
            System.arraycopy(cArr7, i4, cArr5, 0, i7);
        }
        int i8 = 0;
        char[] cArr8 = cArr5;
        if (z) {
            cArr8 = new char[i2];
            while (true) {
                jVar.f2705 = i8;
                int i9 = jVar.f2705;
                if (i9 >= i2) {
                    break;
                }
                cArr8[i9] = cArr5[(i2 - i9) - 1];
                i8 = i9 + 1;
            }
        }
        if (i3 > 0) {
            int i10 = 0;
            while (true) {
                jVar.f2705 = i10;
                int i11 = jVar.f2705;
                if (i11 >= i2) {
                    break;
                }
                cArr8[i11] = (char) (cArr8[i11] - iArr[2]);
                i10 = i11 + 1;
            }
        }
        objArr[0] = new String(cArr8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m3373(Object[] objArr) {
        ba baVar = (ba) objArr[0];
        f455 = (f454 + 101) % 128;
        JSONObject m3312 = baVar.m3312();
        Object[] objArr2 = new Object[1];
        a(false, new int[]{4, 4, 166, 0}, "\u0001������", objArr2);
        boolean optBoolean = m3312.optBoolean(((String) objArr2[0]).intern(), true);
        int i = f454 + 67;
        f455 = i % 128;
        if (i % 2 != 0) {
            return Boolean.valueOf(optBoolean);
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final boolean m3375() {
        ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        return ((Boolean) m3373(new Object[]{this})).booleanValue();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m3376() {
        boolean optBoolean;
        int i = f455 + 99;
        f454 = i % 128;
        if (i % 2 != 0) {
            JSONObject m3312 = m3312();
            Object[] objArr = new Object[1];
            a(false, new int[]{0, 4, 115, 2}, "\u0001\u0001����", objArr);
            optBoolean = m3312.optBoolean(((String) objArr[0]).intern(), false);
        } else {
            JSONObject m33122 = m3312();
            Object[] objArr2 = new Object[1];
            a(false, new int[]{0, 4, 115, 2}, "\u0001\u0001����", objArr2);
            optBoolean = m33122.optBoolean(((String) objArr2[0]).intern(), true);
        }
        int i2 = f454 + 105;
        f455 = i2 % 128;
        if (i2 % 2 != 0) {
            return optBoolean;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int m3377() {
        f454 = (f455 + 81) % 128;
        az m3311 = m3311();
        int intValue = ((Integer) az.m3358(new Object[]{m3311}, 816115954, -816115953, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, m3311)).intValue())).intValue();
        f454 = (f455 + 47) % 128;
        return intValue;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m3378() {
        f455 = (f454 + 77) % 128;
        List<String> m3364 = m3311().m3364();
        f454 = (f455 + 29) % 128;
        return m3364;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final int m3379() {
        int i = f455 + 67;
        f454 = i % 128;
        if (i % 2 != 0) {
            m3311().m3362();
            throw null;
        }
        int m3362 = m3311().m3362();
        int i2 = f455 + 61;
        f454 = i2 % 128;
        if (i2 % 2 == 0) {
            return m3362;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m3380() {
        int i = f455 + 9;
        f454 = i % 128;
        if (i % 2 == 0) {
            return m3311().m3366();
        }
        m3311().m3366();
        throw null;
    }
}
