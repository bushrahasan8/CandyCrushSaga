package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: ev.class */
public final class ev extends er {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2071 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2072 = -1640549586706888894L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2073;

    public ev(eb ebVar, eb ebVar2, dr drVar) {
        super(ebVar, ebVar2, drVar);
    }

    private static void c(String str, int i, Object[] objArr) {
        if (str != null) {
            $10 = ($11 + 57) % 128;
            str = str.toCharArray();
        }
        n nVar = new n();
        char[] m5750 = n.m5750(f2072 ^ (-7438370749274812225L), (char[]) str, i);
        nVar.f3042 = 4;
        while (true) {
            int i2 = nVar.f3042;
            if (i2 >= m5750.length) {
                objArr[0] = new String(m5750, 4, m5750.length - 4);
                return;
            }
            int i3 = i2 - 4;
            nVar.f3041 = i3;
            long j = m5750[i2] ^ m5750[i2 % 4];
            long j2 = i3;
            long j3 = f2072;
            try {
                Map map = b.f452;
                Object obj = map.get(983860882);
                if (obj == null) {
                    Class cls = (Class) b.m3371(View.getDefaultSize(0, 0), (char) (ViewConfiguration.getScrollBarSize() >> 8), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 40);
                    Class<?> cls2 = Long.TYPE;
                    obj = cls.getMethod("p", cls2, cls2, cls2);
                    map.put(983860882, obj);
                }
                m5750[i2] = ((Character) ((Method) obj).invoke(null, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3))).charValue();
                Object obj2 = map.get(-2082235053);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (Process.myPid() >> 22) + 41)).getMethod("q", Object.class, Object.class);
                    map.put(-2082235053, obj2);
                }
                ((Method) obj2).invoke(null, nVar, nVar);
                $10 = ($11 + 91) % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.er
    /* renamed from: ﻐ */
    final boolean mo4976(String str, String str2) {
        f2071 = (f2073 + 39) % 128;
        boolean equals = str.equals(str2);
        int i = f2071 + 53;
        f2073 = i % 128;
        if (i % 2 == 0) {
            return equals;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* renamed from: ﻛ */
    public final String mo4955() {
        f2073 = (f2071 + 123) % 128;
        Object[] objArr = new Object[1];
        c("ㄚㄧ底莖ጀ쥕", 1 - TextUtils.indexOf("", ""), objArr);
        String intern = ((String) objArr[0]).intern();
        f2071 = (f2073 + 77) % 128;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.er
    /* renamed from: ﻛ */
    final boolean mo4977(Object obj, Object obj2) {
        int i = f2073;
        f2071 = (i + 43) % 128;
        if (obj != obj2) {
            return false;
        }
        f2071 = (i + 121) % 128;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.er
    /* renamed from: ﾒ */
    final boolean mo4978(int i) {
        int i2 = f2073 + 27;
        int i3 = i2 % 128;
        f2071 = i3;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        if (i != 0) {
            return false;
        }
        f2073 = (i3 + 35) % 128;
        return true;
    }
}
