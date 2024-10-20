package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: dn.class */
public final class dn {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1811 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1812;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1813;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1814;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f1815;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f1816;

    static {
        m4763();
        int i = f1811 + 25;
        f1812 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    public dn(JSONObject jSONObject) {
        Object[] objArr = new Object[1];
        a(false, new int[]{0, 10, 0, 0}, "\u0001����\u0001������\u0001��\u0001", objArr);
        this.f1814 = jSONObject.optBoolean(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(false, new int[]{10, 9, 0, 0}, "\u0001\u0001��\u0001\u0001\u0001����\u0001", objArr2);
        this.f1815 = jSONObject.optBoolean(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(false, new int[]{19, 6, 65, 1}, "\u0001\u0001��\u0001��\u0001", objArr3);
        this.f1816 = dv.m4842(jSONObject.optString(((String) objArr3[0]).intern()));
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
        char[] cArr = f1813;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                char c = cArr[i5];
                try {
                    Map map = b.f452;
                    Object obj = map.get(123012079);
                    if (obj == null) {
                        obj = ((Class) b.m3371(KeyEvent.getMaxKeyCode() >> 16, (char) (MotionEvent.axisFromString("") + 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 41)).getMethod("t", Integer.TYPE);
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
                    $10 = ($11 + 101) % 128;
                    char c3 = cArr3[i6];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(-1475644584);
                    if (obj2 == null) {
                        Class cls = (Class) b.m3371(ExpandableListView.getPackedPositionType(0L), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 40 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
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
                        Class cls3 = (Class) b.m3371(KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 41 - View.resolveSizeAndState(0, 0, 0));
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
                    obj4 = ((Class) b.m3371((Process.getThreadPriority(0) + 20) >> 6, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 40)).getMethod("w", Object.class, Object.class);
                    map4.put(-811294887, obj4);
                }
                ((Method) obj4).invoke(null, jVar, jVar);
            }
            cArr4 = cArr5;
        }
        if (i4 > 0) {
            int i7 = $11 + 43;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                char[] cArr6 = new char[i2];
                System.arraycopy(cArr4, 0, cArr6, 1, i2);
                System.arraycopy(cArr6, 0, cArr4, i2 - i4, i4);
                System.arraycopy(cArr6, i4, cArr4, 0, i2 / i4);
            } else {
                char[] cArr7 = new char[i2];
                System.arraycopy(cArr4, 0, cArr7, 0, i2);
                int i8 = i2 - i4;
                System.arraycopy(cArr7, 0, cArr4, i8, i4);
                System.arraycopy(cArr7, i4, cArr4, 0, i8);
            }
        }
        int i9 = 0;
        char[] cArr8 = cArr4;
        if (z) {
            cArr8 = new char[i2];
            while (true) {
                jVar.f2705 = i9;
                int i10 = jVar.f2705;
                if (i10 >= i2) {
                    break;
                }
                int i11 = $11 + 101;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr8[i10] = cArr4[i2 >>> i10];
                    i9 = i10 << 1;
                } else {
                    cArr8[i10] = cArr4[(i2 - i10) - 1];
                    i9 = i10 + 1;
                }
            }
        }
        if (i3 > 0) {
            int i12 = 0;
            while (true) {
                jVar.f2705 = i12;
                int i13 = jVar.f2705;
                if (i13 >= i2) {
                    break;
                }
                cArr8[i13] = (char) (cArr8[i13] - iArr[2]);
                i12 = i13 + 1;
            }
        }
        objArr[0] = new String(cArr8);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m4763() {
        f1813 = new char[]{37242, 37163, 37161, 37159, 37165, 37138, 37153, 37159, 37167, 37166, 37244, 37167, 37153, 37152, 37159, 37139, 37147, 37161, 37159, 37150, 37349, 37350, 37345, 37347, 37344, 37309, 37284, 37301, 37252, 37286, 37280, 37285, 37309, 37310, 37258, 37307};
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final boolean m4764() {
        int i = f1812 + 107;
        int i2 = i % 128;
        f1811 = i2;
        if (i % 2 == 0) {
            boolean z = this.f1815;
            throw new ArithmeticException("divide by zero");
        }
        boolean z2 = this.f1815;
        int i3 = i2 + 47;
        f1812 = i3 % 128;
        if (i3 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m4765() {
        int i = (f1812 + 83) % 128;
        f1811 = i;
        boolean z = this.f1814;
        int i2 = i + 51;
        f1812 = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m4766() {
        int i = f1812 + 3;
        int i2 = i % 128;
        f1811 = i2;
        if (i % 2 == 0) {
            throw null;
        }
        String str = this.f1816;
        int i3 = i2 + 9;
        f1812 = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
