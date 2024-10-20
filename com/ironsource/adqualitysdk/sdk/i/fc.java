package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: fc.class */
public final class fc extends ep {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2091 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f2094 = true;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2095;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2092 = {6510};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f2093 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2096 = 343349592;

    public fc(eb ebVar, eb ebVar2, dr drVar) {
        super(ebVar, ebVar2, drVar);
    }

    private static void c(int[] iArr, String str, int i, String str2, Object[] objArr) {
        int i2;
        String str3 = str2;
        if (str2 != null) {
            str3 = str2.getBytes("ISO-8859-1");
            $11 = ($10 + 7) % 128;
        }
        byte[] bArr = (byte[]) str3;
        if (str != null) {
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        r rVar = new r();
        char[] cArr2 = f2092;
        char[] cArr3 = cArr2;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                char c = cArr2[i3];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122475841);
                    if (obj == null) {
                        obj = ((Class) b.m3371((-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((-1) - Process.getGidForName("")), View.resolveSize(0, 0) + 41)).getMethod("b", Integer.TYPE);
                        map.put(122475841, obj);
                    }
                    cArr4[i3] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        int i4 = f2096;
        Map map2 = b.f452;
        Object obj2 = map2.get(122565214);
        if (obj2 == null) {
            obj2 = ((Class) b.m3371(TextUtils.indexOf("", ""), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 41 - KeyEvent.keyCodeFromString(""))).getMethod("e", Integer.TYPE);
            map2.put(122565214, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i4))).intValue();
        if (f2093) {
            $10 = ($11 + 87) % 128;
            int length2 = bArr.length;
            rVar.f3052 = length2;
            char[] cArr5 = new char[length2];
            rVar.f3051 = 0;
            while (true) {
                int i5 = rVar.f3051;
                int i6 = rVar.f3052;
                if (i5 >= i6) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i5] = (char) (cArr3[bArr[(i6 - 1) - i5] + i] - intValue);
                Map map3 = b.f452;
                Object obj3 = map3.get(-1176441533);
                if (obj3 == null) {
                    obj3 = ((Class) b.m3371(ViewConfiguration.getPressedStateDuration() >> 16, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), TextUtils.getTrimmedLength("") + 41)).getMethod("a", Object.class, Object.class);
                    map3.put(-1176441533, obj3);
                }
                ((Method) obj3).invoke(null, rVar, rVar);
            }
        } else if (f2094) {
            int length3 = cArr.length;
            rVar.f3052 = length3;
            char[] cArr6 = new char[length3];
            rVar.f3051 = 0;
            while (true) {
                int i7 = rVar.f3051;
                int i8 = rVar.f3052;
                if (i7 >= i8) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                $11 = ($10 + 95) % 128;
                cArr6[i7] = (char) (cArr3[cArr[(i8 - 1) - i7] - i] - intValue);
                Map map4 = b.f452;
                Object obj4 = map4.get(-1176441533);
                if (obj4 == null) {
                    obj4 = ((Class) b.m3371(View.MeasureSpec.getMode(0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.argb(0, 0, 0, 0) + 41)).getMethod("a", Object.class, Object.class);
                    map4.put(-1176441533, obj4);
                }
                ((Method) obj4).invoke(null, rVar, rVar);
            }
        } else {
            int length4 = iArr.length;
            rVar.f3052 = length4;
            char[] cArr7 = new char[length4];
            rVar.f3051 = 0;
            $10 = ($11 + 81) % 128;
            while (true) {
                int i9 = rVar.f3051;
                int i10 = rVar.f3052;
                if (i9 >= i10) {
                    objArr[0] = new String(cArr7);
                    return;
                }
                int i11 = $10 + 31;
                int i12 = i11 % 128;
                $11 = i12;
                if (i11 % 2 == 0) {
                    cArr7[i9] = (char) (cArr3[iArr[i10 - i9] >> i] - intValue);
                    i2 = i9 - 1;
                } else {
                    cArr7[i9] = (char) (cArr3[iArr[(i10 - 1) - i9] - i] - intValue);
                    i2 = i9 + 1;
                }
                rVar.f3051 = i2;
                $10 = (i12 + 45) % 128;
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ep
    /* renamed from: ﻐ */
    public final Number mo4974(Number number, Number number2) {
        if ((number instanceof Double) || (number2 instanceof Double)) {
            return Double.valueOf(number.doubleValue() * number2.doubleValue());
        }
        if (!(number instanceof Long)) {
            int i = f2095 + 15;
            f2091 = i % 128;
            if (i % 2 == 0) {
                boolean z = number2 instanceof Long;
                throw null;
            }
            if (!(number2 instanceof Long)) {
                int intValue = number.intValue();
                int intValue2 = number2.intValue();
                f2095 = (f2091 + 77) % 128;
                return Integer.valueOf(intValue * intValue2);
            }
        }
        return Long.valueOf(number.longValue() * number2.longValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* renamed from: ﻛ */
    public final String mo4955() {
        Object obj;
        int i = f2091 + 11;
        f2095 = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            c(null, null, (ViewConfiguration.getJumpTapTimeout() / 67) + 91, "\u0081", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            c(null, null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), "\u0081", objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }
}
