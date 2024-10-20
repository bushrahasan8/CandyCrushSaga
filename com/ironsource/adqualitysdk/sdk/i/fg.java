package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: fg.class */
public final class fg extends er {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2112 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2113 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2114 = -8966483649737635090L;

    public fg(eb ebVar, eb ebVar2, dr drVar) {
        super(ebVar, ebVar2, drVar);
    }

    private static void c(String str, int i, Object[] objArr) {
        if (str != null) {
            int i2 = $11 + 93;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            str = str.toCharArray();
        }
        n nVar = new n();
        char[] m5750 = n.m5750(f2114 ^ (-7438370749274812225L), (char[]) str, i);
        nVar.f3042 = 4;
        $11 = ($10 + 71) % 128;
        while (true) {
            int i3 = nVar.f3042;
            if (i3 >= m5750.length) {
                objArr[0] = new String(m5750, 4, m5750.length - 4);
                return;
            }
            int i4 = i3 - 4;
            nVar.f3041 = i4;
            long j = m5750[i3] ^ m5750[i3 % 4];
            long j2 = i4;
            long j3 = f2114;
            try {
                Map map = b.f452;
                Object obj = map.get(983860882);
                if (obj == null) {
                    Class cls = (Class) b.m3371((-1) - Process.getGidForName(""), (char) (Process.getGidForName("") + 1), 41 - TextUtils.indexOf("", ""));
                    Class<?> cls2 = Long.TYPE;
                    obj = cls.getMethod("p", cls2, cls2, cls2);
                    map.put(983860882, obj);
                }
                m5750[i3] = ((Character) ((Method) obj).invoke(null, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3))).charValue();
                Object obj2 = map.get(-2082235053);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(Color.blue(0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 40)).getMethod("q", Object.class, Object.class);
                    map.put(-2082235053, obj2);
                }
                ((Method) obj2).invoke(null, nVar, nVar);
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
        f2113 = (f2112 + 105) % 128;
        if (str.equals(str2)) {
            return false;
        }
        f2113 = (f2112 + 23) % 128;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* renamed from: ﻛ */
    public final String mo4955() {
        f2112 = (f2113 + 25) % 128;
        Object[] objArr = new Object[1];
        c("溤溅芰壜귅\ueca4", 1 - KeyEvent.normalizeMetaState(0), objArr);
        String intern = ((String) objArr[0]).intern();
        f2112 = (f2113 + 63) % 128;
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.er
    /* renamed from: ﻛ */
    final boolean mo4977(Object obj, Object obj2) {
        int i = f2112;
        f2113 = (i + 33) % 128;
        boolean z = false;
        if (obj != obj2) {
            int i2 = i + 123;
            int i3 = i2 % 128;
            f2113 = i3;
            z = i2 % 2 == 0;
            f2112 = (i3 + 85) % 128;
        }
        return z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.er
    /* renamed from: ﾒ */
    final boolean mo4978(int i) {
        int i2 = (f2113 + 31) % 128;
        f2112 = i2;
        if (i == 0) {
            return false;
        }
        f2113 = (i2 + 79) % 128;
        return true;
    }
}
