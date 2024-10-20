package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: dx.class */
public final class dx {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1935 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f1936 = 53889;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1937 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f1938 = 27480;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char f1939 = 3241;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f1940 = 63503;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1941;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Object f1942;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f1943;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean f1944;

    public dx(Object obj) {
        this.f1942 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [int] */
    private static void a(String str, int i, Object[] objArr) {
        int i2 = $11 + 43;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        p pVar = new p();
        char[] cArr2 = new char[cArr.length];
        pVar.f3046 = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = pVar.f3046;
            if (i3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[i3];
            cArr3[1] = cArr[i3 + 1];
            $10 = ($11 + 97) % 128;
            char c = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                $10 = ($11 + 27) % 128;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + c) ^ ((c3 << 4) + ((char) (f1939 ^ 8584761702560213004L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f1936)};
                    Map map = b.f452;
                    Object obj = map.get(-952725446);
                    if (obj == null) {
                        Class cls = (Class) b.m3371((-1) - TextUtils.lastIndexOf("", '0'), (char) Gravity.getAbsoluteGravity(0, 0), 40 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        Class<?>[] clsArr = new Class[4];
                        Class<?> cls2 = Integer.TYPE;
                        clsArr[0] = cls2;
                        clsArr[1] = cls2;
                        clsArr[2] = cls2;
                        clsArr[3] = cls2;
                        obj = cls.getMethod("x", clsArr);
                        map.put(-952725446, obj);
                    }
                    char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    cArr3[1] = charValue;
                    char c4 = cArr3[0];
                    char c5 = (char) (f1940 ^ 8584761702560213004L);
                    char c6 = f1938;
                    Object obj2 = map.get(-952725446);
                    if (obj2 == null) {
                        Class cls3 = (Class) b.m3371(View.combineMeasuredStates(0, 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), Color.alpha(0) + 41);
                        Class<?> cls4 = Integer.TYPE;
                        obj2 = cls3.getMethod("x", cls4, cls4, cls4, cls4);
                        map.put(-952725446, obj2);
                    }
                    cArr3[0] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c4), Integer.valueOf((charValue + c) ^ ((charValue << 4) + c5)), Integer.valueOf(charValue >>> 5), Integer.valueOf(c6))).charValue();
                    c -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i5 = pVar.f3046;
            cArr2[i5] = cArr3[0];
            cArr2[i5 + 1] = cArr3[1];
            Map map2 = b.f452;
            Object obj3 = map2.get(-1234941609);
            if (obj3 == null) {
                obj3 = ((Class) b.m3371((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 41 - (Process.myTid() >> 22))).getMethod("u", Object.class, Object.class);
                map2.put(-1234941609, obj3);
            }
            ((Method) obj3).invoke(null, pVar, pVar);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static /* synthetic */ Object m4890(Object[] objArr) {
        dx dxVar = (dx) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = f1935 + 63;
        int i2 = i % 128;
        f1937 = i2;
        if (i % 2 == 0) {
            dxVar.f1944 = booleanValue;
            throw null;
        }
        dxVar.f1944 = booleanValue;
        int i3 = i2 + 7;
        f1935 = i3 % 128;
        if (i3 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return dxVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m4891(Object[] objArr, int i, int i2, int i3) {
        Object m4890;
        int i4 = i ^ (-1);
        int i5 = i3 ^ (-1);
        int i6 = (i4 | i2) ^ (-1);
        if ((i * 398) + (i2 * (-396)) + ((((i5 | i2) ^ (-1)) | ((i4 | i5) ^ (-1)) | i6) * (-397)) + (i6 * (-397)) + ((((i | (i2 ^ (-1))) ^ (-1)) | i3 | i6) * 397) != 1) {
            dx dxVar = (dx) objArr[0];
            int i7 = f1937;
            f1935 = (i7 + 125) % 128;
            m4890 = dxVar.f1942;
            f1935 = (i7 + 63) % 128;
        } else {
            m4890 = m4890(objArr);
        }
        return m4890;
    }

    public final String toString() {
        f1935 = (f1937 + 93) % 128;
        if (!(this.f1942 instanceof String)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f1942);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a("衄쿻", 1 - KeyEvent.getDeadChar(0, 0), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(this.f1942);
        Object[] objArr2 = new Object[1];
        a("衄쿻", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, objArr2);
        sb2.append(((String) objArr2[0]).intern());
        String obj = sb2.toString();
        int i = f1937 + 87;
        f1935 = i % 128;
        if (i % 2 == 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final dx m4892() {
        int i = (f1935 + 41) % 128;
        f1937 = i;
        this.f1943 = true;
        f1935 = (i + 117) % 128;
        return this;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m4893() {
        int i = f1935 + 125;
        int i2 = i % 128;
        f1937 = i2;
        if (i % 2 == 0) {
            throw null;
        }
        boolean z = this.f1943;
        f1935 = (i2 + 29) % 128;
        return z;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final dx m4894() {
        int i = f1937;
        this.f1941 = true;
        f1935 = (i + 93) % 128;
        return this;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final Number m4895() {
        Object obj = this.f1942;
        if (obj instanceof Integer) {
            int i = (f1935 + 121) % 128;
            f1937 = i;
            Integer num = (Integer) obj;
            f1935 = (i + 57) % 128;
            return num;
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m4896() {
        Object obj = this.f1942;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() != 0;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue() != 0;
        }
        if (!(!(obj instanceof Double))) {
            if (((Double) obj).doubleValue() == 0.0d) {
                return false;
            }
            f1935 = (f1937 + 121) % 128;
            return true;
        }
        if (!(obj instanceof String)) {
            int i = f1935 + 59;
            f1937 = i % 128;
            if (i % 2 != 0) {
                return true;
            }
            throw null;
        }
        f1937 = (f1935 + 119) % 128;
        if (TextUtils.isEmpty((String) obj)) {
            return false;
        }
        int i2 = f1937 + 69;
        f1935 = i2 % 128;
        if (i2 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Object m4897() {
        return m4891(new Object[]{this}, -1102896907, 1102896907, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m4898() {
        int i = (f1937 + 1) % 128;
        f1935 = i;
        boolean z = this.f1944;
        int i2 = i + 33;
        f1937 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return z;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final dx m4899(boolean z) {
        return (dx) m4891(new Object[]{this, Boolean.valueOf(z)}, -621535042, 621535043, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m4900() {
        int i = f1935 + 71;
        f1937 = i % 128;
        if (i % 2 != 0) {
            return this.f1941;
        }
        boolean z = this.f1941;
        throw new ArithmeticException("divide by zero");
    }
}
