package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: ay.class */
public final class ay extends au {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f422 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f423 = -919218910;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f424 = -6542782394566060766L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f425 = 59641;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f426;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final String f427;

    public ay(az azVar) {
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 6555), (-1716035692) + (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "��������", "锇띟鮙쨙", "ዸ", objArr);
        sb.append(((String) objArr[0]).intern());
        String obj = UUID.randomUUID().toString();
        Object[] objArr2 = new Object[1];
        a((char) (38118 - Color.red(0)), 1301184986 - (ViewConfiguration.getLongPressTimeout() >> 16), "��������", "�躁\ue64d뒔", "�", objArr2);
        sb.append(obj.replace(((String) objArr2[0]).intern(), ""));
        this.f427 = sb.toString();
        m3314(azVar);
    }

    private static void a(char c, int i, String str, String str2, String str3, Object[] objArr) {
        int i2 = $11 + 3;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
            $10 = ($11 + 51) % 128;
        }
        char[] cArr2 = cArr;
        if (str2 != null) {
            str2 = str2.toCharArray();
        }
        char[] cArr3 = (char[]) str2;
        if (str != null) {
            str = str.toCharArray();
            $11 = ($10 + 97) % 128;
        }
        char[] cArr4 = (char[]) str;
        g gVar = new g();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        System.arraycopy(cArr3, 0, cArr5, 0, length);
        System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr7 = new char[length3];
        gVar.f2182 = 0;
        while (gVar.f2182 < length3) {
            try {
                Map map = b.f452;
                Object obj = map.get(844572084);
                if (obj == null) {
                    obj = ((Class) b.m3371(Color.alpha(0), (char) (TextUtils.lastIndexOf("", '0') + 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 40)).getMethod("B", Object.class);
                    map.put(844572084, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, gVar)).intValue();
                Object obj2 = map.get(-204678676);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(Color.alpha(0), (char) Color.argb(0, 0, 0, 0), 41 - (ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("z", Object.class);
                    map.put(-204678676, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, gVar)).intValue();
                char c2 = cArr5[gVar.f2182 % 4];
                char c3 = cArr6[intValue];
                Object obj3 = map.get(786100179);
                if (obj3 == null) {
                    Class cls = (Class) b.m3371(View.MeasureSpec.getMode(0), (char) Drawable.resolveOpacity(0, 0), 41 - View.MeasureSpec.getSize(0));
                    Class<?> cls2 = Integer.TYPE;
                    obj3 = cls.getMethod("A", Object.class, cls2, cls2);
                    map.put(786100179, obj3);
                }
                ((Method) obj3).invoke(null, gVar, Integer.valueOf(c2 * 32718), Integer.valueOf(c3));
                char c4 = cArr5[intValue2];
                char c5 = cArr6[intValue];
                Object obj4 = map.get(1393811622);
                if (obj4 == null) {
                    Class cls3 = (Class) b.m3371((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, (char) (ImageFormat.getBitsPerPixel(0) + 1), TextUtils.indexOf((CharSequence) "", '0', 0) + 42);
                    Class<?> cls4 = Integer.TYPE;
                    obj4 = cls3.getMethod("D", cls4, cls4);
                    map.put(1393811622, obj4);
                }
                cArr6[intValue2] = ((Character) ((Method) obj4).invoke(null, Integer.valueOf(c4 * 32718), Integer.valueOf(c5))).charValue();
                cArr5[intValue2] = gVar.f2183;
                int i3 = gVar.f2182;
                cArr7[i3] = (char) ((((r0 ^ cArr2[i3]) ^ (f424 ^ (-6542782394566060766L))) ^ ((int) (f423 ^ (-6542782394566060766L)))) ^ ((char) (f425 ^ (-6542782394566060766L))));
                gVar.f2182 = i3 + 1;
                $11 = ($10 + 65) % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr7);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m3352() {
        f426 = (f422 + 73) % 128;
        JSONObject m3312 = m3312();
        Object[] objArr = new Object[1];
        a((char) (36402 - Color.argb(0, 0, 0, 0)), (-484274657) + (Process.myPid() >> 22), "��������", "ᾩ⊎㋣ꢎ", "�領챷", objArr);
        String optString = m3312.optString(((String) objArr[0]).intern(), this.f427);
        int i = f426 + 65;
        f422 = i % 128;
        if (i % 2 != 0) {
            return optString;
        }
        throw null;
    }
}
