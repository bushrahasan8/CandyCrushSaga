package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: du.class */
public final class du {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f1903;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char f1904 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1905 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1906;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1907;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f1908;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f1909;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f1910;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f1911;

    static {
        m4833();
        View.combineMeasuredStates(0, 0);
        View.combineMeasuredStates(0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        ViewConfiguration.getDoubleTapTimeout();
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getScrollBarFadeDuration();
        TextUtils.getTrimmedLength("");
        MotionEvent.axisFromString("");
        TextUtils.getCapsMode("", 0, 0);
        Process.getGidForName("");
        Process.myTid();
        ViewConfiguration.getMinimumFlingVelocity();
        f1905 = (f1906 + 41) % 128;
    }

    public du(JSONObject jSONObject) {
        if (jSONObject != null) {
            Object[] objArr = new Object[1];
            a((byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 103), "\u000b\n\u0004\u0005\u0006\u000e㙏", Color.alpha(0) + 7, objArr);
            this.f1908 = jSONObject.optString(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a((byte) (60 - Color.blue(0)), "\u0007\u000b㘳㘳\u000b\u0016", 6 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
            this.f1911 = jSONObject.optString(((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a((byte) (TextUtils.indexOf((CharSequence) "", '0') + 107), "\r\u0006\u0018\r㙥", 5 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
            this.f1909 = jSONObject.optString(((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            a((byte) (TextUtils.indexOf("", "", 0, 0) + 117), "\u000b\f��\u0007\u0006\f㙢", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6, objArr4);
            this.f1910 = jSONObject.optString(((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            a((byte) (53 - Color.green(0)), "\u0017\u0011\f\u000e\r\u0003\n\u0004\u0012\u0013", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10, objArr5);
            this.f1907 = jSONObject.optBoolean(((String) objArr5[0]).intern());
        }
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        int i2;
        int i3 = $11 + 51;
        int i4 = i3 % 128;
        $10 = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            int i5 = i4 + 7;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        s sVar = new s();
        char[] cArr2 = f1903;
        char[] cArr3 = cArr2;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                $11 = ($10 + 55) % 128;
                char c = cArr2[i6];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122714169);
                    if (obj == null) {
                        obj = ((Class) b.m3371((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.resolveSizeAndState(0, 0, 0) + 41)).getMethod("j", Integer.TYPE);
                        map.put(122714169, obj);
                    }
                    cArr4[i6] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
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
        char c2 = f1904;
        Map map2 = b.f452;
        Object obj2 = map2.get(122714169);
        if (obj2 == null) {
            obj2 = ((Class) b.m3371(Process.myTid() >> 22, (char) ((-1) - Process.getGidForName("")), 41 - Color.argb(0, 0, 0, 0))).getMethod("j", Integer.TYPE);
            map2.put(122714169, obj2);
        }
        char charValue = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c2))).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            int i7 = $11 + 65;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                i2 = i + 34;
                cArr5[i2] = (char) (cArr[i2] + b);
            } else {
                i2 = i - 1;
                cArr5[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $11 = ($10 + 115) % 128;
            sVar.f3058 = 0;
            while (true) {
                int i8 = sVar.f3058;
                if (i8 >= i2) {
                    break;
                }
                $10 = ($11 + 65) % 128;
                char c3 = cArr[i8];
                sVar.f3059 = c3;
                char c4 = cArr[i8 + 1];
                sVar.f3055 = c4;
                if (c3 == c4) {
                    cArr5[i8] = (char) (c3 - b);
                    cArr5[i8 + 1] = (char) (c4 - b);
                } else {
                    Map map3 = b.f452;
                    Object obj3 = map3.get(-707600991);
                    if (obj3 == null) {
                        Class cls = (Class) b.m3371(View.getDefaultSize(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 40);
                        Class<?> cls2 = Integer.TYPE;
                        obj3 = cls.getMethod("o", Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class);
                        map3.put(-707600991, obj3);
                    }
                    int intValue = ((Integer) ((Method) obj3).invoke(null, sVar, sVar, Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), sVar)).intValue();
                    int i9 = sVar.f3054;
                    if (intValue == i9) {
                        $11 = ($10 + 105) % 128;
                        Object obj4 = map3.get(1018245111);
                        if (obj4 == null) {
                            Class cls3 = (Class) b.m3371((-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (char) Color.alpha(0), TextUtils.getOffsetAfter("", 0) + 41);
                            Class<?> cls4 = Integer.TYPE;
                            obj4 = cls3.getMethod("l", Object.class, Object.class, cls4, cls4, Object.class, Object.class, cls4, cls4, Object.class, cls4, Object.class);
                            map3.put(1018245111, obj4);
                        }
                        int intValue2 = ((Integer) ((Method) obj4).invoke(null, sVar, sVar, Integer.valueOf(charValue), Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), Integer.valueOf(charValue), sVar, Integer.valueOf(charValue), sVar)).intValue();
                        int i10 = sVar.f3057;
                        int i11 = sVar.f3054;
                        int i12 = sVar.f3058;
                        cArr5[i12] = cArr3[intValue2];
                        cArr5[i12 + 1] = cArr3[(i10 * charValue) + i11];
                    } else {
                        int i13 = sVar.f3056;
                        int i14 = sVar.f3057;
                        if (i13 == i14) {
                            $11 = ($10 + 101) % 128;
                            int i15 = ((sVar.f3053 + charValue) - 1) % charValue;
                            sVar.f3053 = i15;
                            int i16 = ((i9 + charValue) - 1) % charValue;
                            sVar.f3054 = i16;
                            int i17 = sVar.f3058;
                            cArr5[i17] = cArr3[(i13 * charValue) + i15];
                            cArr5[i17 + 1] = cArr3[(i14 * charValue) + i16];
                        } else {
                            int i18 = sVar.f3053;
                            int i19 = sVar.f3058;
                            cArr5[i19] = cArr3[(i13 * charValue) + i9];
                            cArr5[i19 + 1] = cArr3[(i14 * charValue) + i18];
                        }
                    }
                }
                sVar.f3058 += 2;
            }
        }
        $11 = ($10 + 29) % 128;
        int i20 = 0;
        while (i20 < i) {
            int i21 = $11 + 85;
            $10 = i21 % 128;
            if (i21 % 2 != 0) {
                cArr5[i20] = (char) (cArr5[i20] & 8519);
                i20 += 30;
            } else {
                cArr5[i20] = (char) (cArr5[i20] ^ 13722);
                i20++;
            }
        }
        objArr[0] = new String(cArr5);
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    static void m4833() {
        f1904 = (char) 44291;
        f1903 = new char[]{39165, 39114, 39166, 39115, 39163, 39146, 39167, 39157, 39140, 39148, 39147, 39161, 39155, 39129, 39150, 39160, 39686, 39126, 39151, 39135, 39153, 39154, 39145, 39144, 39162};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Object m4835(Object[] objArr) {
        du duVar = (du) objArr[0];
        int i = (f1905 + 71) % 128;
        f1906 = i;
        String str = duVar.f1908;
        int i2 = i + 83;
        f1905 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m4836() {
        int i = f1905;
        String str = this.f1911;
        f1906 = (i + 69) % 128;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m4837() {
        int i = (f1906 + 115) % 128;
        f1905 = i;
        String str = this.f1910;
        f1906 = (i + 15) % 128;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m4838() {
        ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        return (String) m4835(new Object[]{this});
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m4839() {
        int i = f1906 + 93;
        f1905 = i % 128;
        if (i % 2 != 0) {
            return this.f1909;
        }
        String str = this.f1909;
        throw new ArithmeticException("divide by zero");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m4840() {
        int i = f1905;
        boolean z = this.f1907;
        int i2 = i + 119;
        f1906 = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw null;
    }
}
