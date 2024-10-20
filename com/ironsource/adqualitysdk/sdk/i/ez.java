package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.Process;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: ez.class */
public final class ez extends eq {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2081 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2082 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2083 = 4473807744205974448L;

    public ez(eb ebVar, eb ebVar2, dr drVar) {
        super(ebVar, ebVar2, drVar);
    }

    private static void d(String str, int i, Object[] objArr) {
        $10 = ($11 + 109) % 128;
        if (str != null) {
            str = str.toCharArray();
            $10 = ($11 + 23) % 128;
        }
        n nVar = new n();
        char[] m5750 = n.m5750(f2083 ^ (-7438370749274812225L), (char[]) str, i);
        nVar.f3042 = 4;
        while (true) {
            int i2 = nVar.f3042;
            if (i2 >= m5750.length) {
                objArr[0] = new String(m5750, 4, m5750.length - 4);
                return;
            }
            $10 = ($11 + 73) % 128;
            int i3 = i2 - 4;
            nVar.f3041 = i3;
            long j = m5750[i2] ^ m5750[i2 % 4];
            long j2 = i3;
            long j3 = f2083;
            try {
                Map map = b.f452;
                Object obj = map.get(983860882);
                if (obj == null) {
                    Class cls = (Class) b.m3371((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 40 - Process.getGidForName(""));
                    Class<?> cls2 = Long.TYPE;
                    obj = cls.getMethod("p", cls2, cls2, cls2);
                    map.put(983860882, obj);
                }
                m5750[i2] = ((Character) ((Method) obj).invoke(null, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3))).charValue();
                Object obj2 = map.get(-2082235053);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(KeyEvent.keyCodeFromString(""), (char) (KeyEvent.getMaxKeyCode() >> 16), 41 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("q", Object.class, Object.class);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* renamed from: ﻛ */
    public final String mo4955() {
        Object obj;
        int i = f2082 + 15;
        f2081 = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            d("䫪푊䝒\uf753䫖꽸", -ImageFormat.getBitsPerPixel(1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            d("䫪푊䝒\uf753䫖꽸", -ImageFormat.getBitsPerPixel(0), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.er
    /* renamed from: ﾒ */
    final boolean mo4978(int i) {
        int i2 = f2082 + 11;
        int i3 = i2 % 128;
        f2081 = i3;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        if (i <= 0) {
            return true;
        }
        int i4 = i3 + 93;
        f2082 = i4 % 128;
        if (i4 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return false;
    }
}
