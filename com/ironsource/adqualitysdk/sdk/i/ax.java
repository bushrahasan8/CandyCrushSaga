package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: ax.class */
public final class ax {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f411 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f412 = {37151, 37355, 37350, 37374, 37374, 37353, 37353};

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f413;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private ISAdQualityDeviceIdType f414;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private Map f415;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private boolean f416;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f417;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f418;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f419 = "";

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f420;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f421;

    public ax() {
        Object[] objArr = new Object[1];
        a(false, new int[]{0, 7, 89, 0}, "\u0001\u0001\u0001\u0001����\u0001", objArr);
        this.f421 = ((String) objArr[0]).intern();
        this.f418 = true;
        this.f417 = "";
        this.f420 = false;
        this.f415 = new HashMap();
        this.f416 = false;
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        String str2 = str;
        if (str != null) {
            str2 = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) str2;
        j jVar = new j();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = f412;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                char c = cArr[i5];
                try {
                    Map map = b.f452;
                    Object obj = map.get(123012079);
                    if (obj == null) {
                        obj = ((Class) b.m3371(View.resolveSizeAndState(0, 0, 0), (char) TextUtils.indexOf("", ""), ((Process.getThreadPriority(0) + 20) >> 6) + 41)).getMethod("t", Integer.TYPE);
                        map.put(123012079, obj);
                    }
                    cArr2[i5] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
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
            char[] cArr5 = new char[i2];
            jVar.f2705 = 0;
            char c2 = 0;
            while (true) {
                int i6 = jVar.f2705;
                if (i6 >= i2) {
                    break;
                }
                if (bArr[i6] == 1) {
                    char c3 = cArr3[i6];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(-1475644584);
                    if (obj2 == null) {
                        Class cls = (Class) b.m3371(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 41 - View.resolveSizeAndState(0, 0, 0));
                        Class<?> cls2 = Integer.TYPE;
                        obj2 = cls.getMethod("v", cls2, cls2);
                        map2.put(-1475644584, obj2);
                    }
                    cArr5[i6] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c3), Integer.valueOf(c2))).charValue();
                } else {
                    char c4 = cArr3[i6];
                    Map map3 = b.f452;
                    Object obj3 = map3.get(1186866459);
                    if (obj3 == null) {
                        Class cls3 = (Class) b.m3371(TextUtils.indexOf((CharSequence) "", '0') + 1, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.argb(0, 0, 0, 0) + 41);
                        Class<?> cls4 = Integer.TYPE;
                        obj3 = cls3.getMethod("y", cls4, cls4);
                        map3.put(1186866459, obj3);
                    }
                    cArr5[i6] = ((Character) ((Method) obj3).invoke(null, Integer.valueOf(c4), Integer.valueOf(c2))).charValue();
                }
                c2 = cArr5[jVar.f2705];
                Map map4 = b.f452;
                Object obj4 = map4.get(-811294887);
                if (obj4 == null) {
                    obj4 = ((Class) b.m3371(1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (Process.myPid() >> 22) + 41)).getMethod("w", Object.class, Object.class);
                    map4.put(-811294887, obj4);
                }
                ((Method) obj4).invoke(null, jVar, jVar);
            }
            cArr4 = cArr5;
        }
        if (i4 > 0) {
            char[] cArr6 = new char[i2];
            System.arraycopy(cArr4, 0, cArr6, 0, i2);
            int i7 = i2 - i4;
            System.arraycopy(cArr6, 0, cArr4, i7, i4);
            System.arraycopy(cArr6, i4, cArr4, 0, i7);
        }
        int i8 = 0;
        char[] cArr7 = cArr4;
        if (z) {
            $11 = ($10 + 41) % 128;
            cArr7 = new char[i2];
            while (true) {
                jVar.f2705 = i8;
                int i9 = jVar.f2705;
                if (i9 >= i2) {
                    break;
                }
                cArr7[i9] = cArr4[(i2 - i9) - 1];
                i8 = i9 + 1;
            }
        }
        if (i3 > 0) {
            int i10 = $11 + 5;
            $10 = i10 % 128;
            int i11 = i10 % 2 != 0 ? 1 : 0;
            while (true) {
                jVar.f2705 = i11;
                int i12 = jVar.f2705;
                if (i12 >= i2) {
                    break;
                }
                cArr7[i12] = (char) (cArr7[i12] - iArr[2]);
                i11 = i12 + 1;
            }
        }
        objArr[0] = new String(cArr7);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m3333(Object[] objArr, int i, int i2, int i3) {
        Object m3334;
        int i4 = i2 ^ (-1);
        int i5 = ((i3 ^ (-1)) | i2) ^ (-1);
        int i6 = i ^ (-1);
        if ((i * (-1939)) + (i2 * 971) + ((((i4 | i) ^ (-1)) | i5) * (-970)) + (((i2 | i6) ^ (-1)) * 1940) + ((((i6 | i4) ^ (-1)) | i5) * 970) != 1) {
            ax axVar = (ax) objArr[0];
            int i7 = (f411 + 23) % 128;
            f413 = i7;
            m3334 = axVar.f414;
            f411 = (i7 + 97) % 128;
        } else {
            m3334 = m3334(objArr);
        }
        return m3334;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m3334(Object[] objArr) {
        ax axVar = (ax) objArr[0];
        int i = f411;
        int i2 = i + 49;
        f413 = i2 % 128;
        boolean z = axVar.f418;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = i + 25;
        f413 = i3 % 128;
        if (i3 % 2 == 0) {
            return Boolean.valueOf(z);
        }
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final ISAdQualityDeviceIdType m3335() {
        return (ISAdQualityDeviceIdType) m3333(new Object[]{this}, 1631789831, -1631789831, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final boolean m3336() {
        int i = f411 + 45;
        f413 = i % 128;
        if (i % 2 == 0) {
            return this.f416;
        }
        boolean z = this.f416;
        throw new ArithmeticException("divide by zero");
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final Map<String, String> m3337() {
        int i = f413 + 77;
        int i2 = i % 128;
        f411 = i2;
        if (i % 2 == 0) {
            throw null;
        }
        Map<String, String> map = this.f415;
        f413 = (i2 + 59) % 128;
        return map;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final void m3338() {
        int i = f411;
        int i2 = i + 13;
        f413 = i2 % 128;
        this.f416 = i2 % 2 == 0;
        f413 = (i + 7) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m3339(Map<String, String> map) {
        int i = (f413 + 49) % 128;
        f411 = i;
        this.f415 = map;
        f413 = (i + 69) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m3340() {
        return ((Boolean) m3333(new Object[]{this}, -1977276405, 1977276406, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue())).booleanValue();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m3341() {
        int i = f413;
        String str = this.f417;
        int i2 = i + 51;
        f411 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m3342(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
        int i = f413;
        this.f414 = iSAdQualityDeviceIdType;
        int i2 = i + 43;
        f411 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m3343(boolean z) {
        int i = f413 + 15;
        int i2 = i % 128;
        f411 = i2;
        this.f420 = z;
        if (i % 2 == 0) {
            throw null;
        }
        int i3 = i2 + 53;
        f413 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m3344(String str) {
        synchronized (this) {
            int i = f411;
            this.f421 = str;
            f413 = (i + 37) % 128;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final boolean m3345() {
        int i = f411;
        boolean z = this.f420;
        int i2 = i + 83;
        f413 = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return z;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m3346() {
        String str;
        synchronized (this) {
            int i = f413 + 1;
            f411 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            str = this.f421;
        }
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m3347(String str) {
        int i = f411;
        this.f417 = str;
        f413 = (i + 35) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m3348(boolean z) {
        int i = f411;
        this.f418 = z;
        f413 = (i + 33) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m3349() {
        int i = f411 + 19;
        int i2 = i % 128;
        f413 = i2;
        if (i % 2 != 0) {
            throw null;
        }
        String str = this.f419;
        f411 = (i2 + 105) % 128;
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m3350(String str) {
        int i = f411 + 99;
        int i2 = i % 128;
        f413 = i2;
        this.f419 = str;
        if (i % 2 != 0) {
            throw null;
        }
        f411 = (i2 + 85) % 128;
    }
}
