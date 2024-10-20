package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: eb.class */
public abstract class eb {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1981 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1982 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f1983 = 13141;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1984 = 64547;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f1985 = 12698;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f1986 = 26024;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private dr f1987;

    public eb(dr drVar) {
        this.f1987 = drVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v87, types: [int] */
    private static void b(String str, int i, Object[] objArr) {
        int i2 = $11;
        $10 = (i2 + 117) % 128;
        if (str != null) {
            int i3 = i2 + 7;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                str.toCharArray();
                throw new ArithmeticException("divide by zero");
            }
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        p pVar = new p();
        char[] cArr2 = new char[cArr.length];
        pVar.f3046 = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i4 = pVar.f3046;
            if (i4 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[i4];
            cArr3[1] = cArr[i4 + 1];
            char c = 58224;
            int i5 = 0;
            while (i5 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                char c4 = (char) (f1985 ^ 8584761702560213004L);
                char c5 = f1984;
                try {
                    Map map = b.f452;
                    Object obj = map.get(-952725446);
                    if (obj == null) {
                        Class cls = (Class) b.m3371((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 41 - View.MeasureSpec.getMode(0));
                        Class<?> cls2 = Integer.TYPE;
                        obj = cls.getMethod("x", cls2, cls2, cls2, cls2);
                        map.put(-952725446, obj);
                    }
                    char charValue = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c2), Integer.valueOf((c3 + c) ^ ((c3 << 4) + c4)), Integer.valueOf(c3 >>> 5), Integer.valueOf(c5))).charValue();
                    cArr3[1] = charValue;
                    char c6 = cArr3[0];
                    char c7 = (char) (f1983 ^ 8584761702560213004L);
                    char c8 = f1986;
                    Object obj2 = map.get(-952725446);
                    if (obj2 == null) {
                        Class cls3 = (Class) b.m3371(View.resolveSize(0, 0), (char) (Process.myTid() >> 22), 41 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        Class<?> cls4 = Integer.TYPE;
                        obj2 = cls3.getMethod("x", cls4, cls4, cls4, cls4);
                        map.put(-952725446, obj2);
                    }
                    cArr3[0] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c6), Integer.valueOf((charValue + c) ^ ((charValue << 4) + c7)), Integer.valueOf(charValue >>> 5), Integer.valueOf(c8))).charValue();
                    c -= 40503;
                    i5++;
                    $10 = ($11 + 123) % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = pVar.f3046;
            cArr2[i6] = cArr3[0];
            cArr2[i6 + 1] = cArr3[1];
            Map map2 = b.f452;
            Object obj3 = map2.get(-1234941609);
            if (obj3 == null) {
                obj3 = ((Class) b.m3371(ViewConfiguration.getJumpTapTimeout() >> 16, (char) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.getTrimmedLength("") + 41)).getMethod("u", Object.class, Object.class);
                map2.put(-1234941609, obj3);
            }
            ((Method) obj3).invoke(null, pVar, pVar);
            $11 = ($10 + 45) % 128;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ﾇ, reason: contains not printable characters */
    public static String m4935(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        int i = 0;
        boolean z = true;
        while (true) {
            boolean z2 = z;
            if (i >= length) {
                return sb.toString();
            }
            int i2 = f1982 + 99;
            f1981 = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = objArr[i];
                throw new ArithmeticException("divide by zero");
            }
            Object obj2 = objArr[i];
            Object obj3 = obj2;
            if (!z2) {
                obj3 = obj2;
                Object[] objArr2 = new Object[1];
                b("ꍀ듶", (ViewConfiguration.getWindowTouchSlop() >> 8) + 2, objArr2);
                sb.append(((String) objArr2[0]).intern());
            }
            if (obj3 instanceof String) {
                Object[] objArr3 = new Object[1];
                b("牿놯", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr3);
                sb.append(((String) objArr3[0]).intern());
                sb.append(obj3);
                Object[] objArr4 = new Object[1];
                b("牿놯", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, objArr4);
                sb.append(((String) objArr4[0]).intern());
            } else {
                sb.append(obj3);
            }
            i++;
            f1982 = (f1981 + 77) % 128;
            z = false;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m4936() {
        if (this.f1987 == null) {
            int i = f1982 + 81;
            f1981 = i % 128;
            if (i % 2 != 0) {
                return "";
            }
            throw null;
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        b("⯠䚙憗뾢\uf15fュ˷兣詈莞焻\uf619", 11 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(this.f1987);
        String obj = sb.toString();
        int i2 = f1982 + 35;
        f1981 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return obj;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public abstract dx mo4937(dy dyVar, co coVar);

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final int m4938() {
        int i = (f1981 + 121) % 128;
        f1982 = i;
        dr drVar = this.f1987;
        if (drVar == null) {
            return -1;
        }
        f1981 = (i + 41) % 128;
        int m4813 = drVar.m4813();
        f1982 = (f1981 + 1) % 128;
        return m4813;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final dx m4939(dy dyVar, co coVar) {
        dx mo4937;
        eb ebVar = this;
        while (true) {
            mo4937 = ebVar.mo4937(dyVar, coVar);
            if (mo4937 == null) {
                break;
            }
            if (!(dx.m4891(new Object[]{mo4937}, -1102896907, 1102896907, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, mo4937)).intValue()) instanceof eb)) {
                break;
            }
            f1981 = (f1982 + 61) % 128;
            ebVar = (eb) dx.m4891(new Object[]{mo4937}, -1102896907, 1102896907, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, mo4937)).intValue());
        }
        f1982 = (f1981 + 11) % 128;
        return mo4937;
    }
}
