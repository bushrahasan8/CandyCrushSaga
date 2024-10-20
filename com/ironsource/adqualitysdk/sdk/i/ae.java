package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: ae.class */
public abstract class ae<K, T> implements x<K, T> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f84 = false;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f85 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static long f86;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f87;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f88;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f89;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f90;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f91;

    /* renamed from: ｋ, reason: contains not printable characters */
    private x f92;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private x f93 = new x(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ae.3

        /* renamed from: ﾇ, reason: contains not printable characters */
        private ae f94;

        {
            this.f94 = this;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.x
        /* renamed from: ﻐ */
        public final void mo2993(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.x
        /* renamed from: ﻐ */
        public final void mo2994(JSONObject jSONObject, K k, Object obj, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.x
        /* renamed from: ﻛ */
        public final void mo2995(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.x
        /* renamed from: ﻛ */
        public final void mo2996(JSONObject jSONObject, K k, Object obj, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.x
        /* renamed from: ｋ */
        public final void mo2997(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.x
        /* renamed from: ﾇ */
        public final void mo2998(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.x
        /* renamed from: ﾇ */
        public final void mo2999(JSONObject jSONObject, K k, Object obj, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.x
        /* renamed from: ﾒ */
        public final void mo3000(JSONObject jSONObject, K k, T t) {
        }
    };

    static {
        m3029();
        KeyEvent.normalizeMetaState(0);
        int i = f85 + 75;
        f88 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void b(int[] iArr, String str, int i, String str2, Object[] objArr) {
        String str3 = str2;
        if (str2 != null) {
            str3 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) str3;
        if (str != null) {
            int i2 = $11 + 5;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        r rVar = new r();
        char[] cArr2 = f91;
        char[] cArr3 = cArr2;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                $10 = ($11 + 13) % 128;
                char c = cArr2[i3];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122475841);
                    if (obj == null) {
                        obj = ((Class) b.m3371(TextUtils.indexOf("", ""), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 40)).getMethod("b", Integer.TYPE);
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
            $11 = ($10 + 77) % 128;
            cArr3 = cArr4;
        }
        int i4 = f89;
        Map map2 = b.f452;
        Object obj2 = map2.get(122565214);
        if (obj2 == null) {
            obj2 = ((Class) b.m3371((-1) - TextUtils.lastIndexOf("", '0', 0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 41 - Gravity.getAbsoluteGravity(0, 0))).getMethod("e", Integer.TYPE);
            map2.put(122565214, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i4))).intValue();
        if (f84) {
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
                    obj3 = ((Class) b.m3371(View.MeasureSpec.getSize(0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 42)).getMethod("a", Object.class, Object.class);
                    map3.put(-1176441533, obj3);
                }
                ((Method) obj3).invoke(null, rVar, rVar);
            }
        } else {
            if (f90) {
                int length3 = cArr.length;
                rVar.f3052 = length3;
                char[] cArr6 = new char[length3];
                rVar.f3051 = 0;
                while (true) {
                    int i7 = rVar.f3051;
                    int i8 = rVar.f3052;
                    if (i7 >= i8) {
                        break;
                    }
                    cArr6[i7] = (char) (cArr3[cArr[(i8 - 1) - i7] - i] - intValue);
                    Map map4 = b.f452;
                    Object obj4 = map4.get(-1176441533);
                    if (obj4 == null) {
                        obj4 = ((Class) b.m3371(ViewConfiguration.getScrollDefaultDelay() >> 16, (char) KeyEvent.keyCodeFromString(""), 41 - Color.argb(0, 0, 0, 0))).getMethod("a", Object.class, Object.class);
                        map4.put(-1176441533, obj4);
                    }
                    ((Method) obj4).invoke(null, rVar, rVar);
                }
                String str4 = new String(cArr6);
                int i9 = $10 + 123;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    throw new ArithmeticException("divide by zero");
                }
                objArr[0] = str4;
                return;
            }
            int length4 = iArr.length;
            rVar.f3052 = length4;
            char[] cArr7 = new char[length4];
            rVar.f3051 = 0;
            while (true) {
                int i10 = rVar.f3051;
                int i11 = rVar.f3052;
                if (i10 >= i11) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    $11 = ($10 + 77) % 128;
                    cArr7[i10] = (char) (cArr3[iArr[(i11 - 1) - i10] - i] - intValue);
                    rVar.f3051 = i10 + 1;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ae.c(int, int, char, java.lang.Object[]):void");
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    static void m3029() {
        f90 = true;
        f91 = new char[]{6632, 6407, 6603, 6400, 6454, 6459, 6463, 6408, 6448, 6404, 6641, 6451, 6455, 6457, 6453, 6450, 6406, 6403, 6418, 6461, 6627, 6427, 6458, 6628, 6402, 6401};
        f84 = true;
        f89 = 343349675;
        f87 = new char[]{3435, 54275, 49040, 34478, 26738, 13250, 6791, 64602, 50983, 44795, 28690, 3435, 54275, 49040, 34478, 26738, 13250, 6791, 64602, 50983, 44795, 28680, 23299, 8900, 1452, 61297, 46729, 39312, 25412, 19066, 26062, 48294, 55093, 60939, 215, 23393, 29234, 38129, 44931, 3433, 54290, 49091, 34489, 26737, 13254, 6852, 64596, 50996, 44794, 28742, 23313, 8844, 3338, 54346, 49040};
        f86 = 3328098378142045287L;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private x m3030() {
        int i = (f88 + 49) % 128;
        f85 = i;
        x xVar = this.f92;
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = this.f93;
        f88 = (i + 29) % 128;
        return xVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m3031(Object[] objArr) {
        ae aeVar = (ae) objArr[0];
        JSONObject jSONObject = (JSONObject) objArr[1];
        Object obj = objArr[2];
        Object obj2 = objArr[3];
        f88 = (f85 + 5) % 128;
        JSONObject m3032 = aeVar.m3032(jSONObject, obj2);
        int myPid = Process.myPid();
        int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout();
        Object[] objArr2 = new Object[1];
        c((myPid >> 22) + 13, (jumpTapTimeout >> 16) + 39, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
        aeVar.m3035(((String) objArr2[0]).intern(), m3032);
        aeVar.m3030().mo2997(m3032, obj, obj2);
        int i = f88 + 111;
        f85 = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private JSONObject m3032(JSONObject jSONObject, Object obj) {
        int i = f88 + 93;
        f85 = i % 128;
        try {
        } catch (JSONException e) {
            Object[] objArr = new Object[1];
            b(null, null, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0089\u008c\u0097\u008e\u0096\u008e\u008a\u0087\u0082\u0094\u0088\u0095\u0082\u0081", objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(null, null, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, "\u0094\u0097\u0085\u009a\u0083\u008d\u0094\u008a\u008f\u008a\u0083\u0099\u0094\u0084\u008d\u0088\u008a\u008e\u0091\u0083\u008e\u0097\u008e\u008e\u0098", objArr2);
            v.m5760(intern, ((String) objArr2[0]).intern(), e);
        }
        if (i % 2 == 0) {
            jSONObject.has(ig.f2580);
            throw null;
        }
        if (!jSONObject.has(ig.f2580)) {
            int i2 = f88 + 35;
            f85 = i2 % 128;
            if (i2 % 2 == 0) {
                jSONObject.put(ig.f2580, mo3036(obj));
                throw null;
            }
            jSONObject.put(ig.f2580, mo3036(obj));
        }
        if (!jSONObject.has(ig.f2574)) {
            int i3 = f88 + 81;
            f85 = i3 % 128;
            if (i3 % 2 == 0) {
                jSONObject.put(ig.f2574, jv.m5591());
                throw new ArithmeticException("divide by zero");
            }
            jSONObject.put(ig.f2574, jv.m5591());
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ﾒ, reason: contains not printable characters */
    private static /* synthetic */ Object m3033(Object[] objArr) {
        ae aeVar = (ae) objArr[0];
        JSONObject jSONObject = (JSONObject) objArr[1];
        Object obj = objArr[2];
        Object obj2 = objArr[3];
        f85 = (f88 + 121) % 128;
        JSONObject m3032 = aeVar.m3032(jSONObject, obj2);
        float complexToFraction = TypedValue.complexToFraction(0, 0.0f, 0.0f);
        int resolveOpacity = Drawable.resolveOpacity(0, 0);
        Object[] objArr2 = new Object[1];
        c((complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)) + 9, resolveOpacity + 30, (char) (26789 - (KeyEvent.getMaxKeyCode() >> 16)), objArr2);
        aeVar.m3035(((String) objArr2[0]).intern(), m3032);
        aeVar.m3030().mo3000(m3032, obj, obj2);
        int i = f85 + 29;
        f88 = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m3034(Object[] objArr, int i, int i2, int i3) {
        int i4 = i ^ (-1);
        int i5 = i2 ^ (-1);
        return ((((i * (-947)) + (i2 * 949)) + ((((i5 | i3) ^ (-1)) | i4) * (-948))) + ((((i3 ^ (-1)) | (i4 | i5)) ^ (-1)) * (-948))) + ((i | i5) * 948) != 1 ? m3031(objArr) : m3033(objArr);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m3035(String str, JSONObject jSONObject) {
        Object[] objArr = new Object[1];
        b(null, null, View.MeasureSpec.makeMeasureSpec(0, 0) + 127, "\u0089\u008c\u0097\u008e\u0096\u008e\u008a\u0087\u0082\u0094\u0088\u0095\u0082\u0081", objArr);
        String intern = ((String) objArr[0]).intern();
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
        int green = Color.green(0);
        Object[] objArr2 = new Object[1];
        c(resolveSizeAndState + 3, 52 - green, (char) (Process.myTid() >> 22), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str);
        v.m5772(intern, sb.toString(), jSONObject);
        int i = f88 + 93;
        f85 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﻐ */
    public final void mo2993(JSONObject jSONObject, K k, T t) {
        JSONObject m3032;
        Object obj;
        int i = f85 + 37;
        f88 = i % 128;
        if (i % 2 != 0) {
            m3032 = m3032(jSONObject, t);
            Object[] objArr = new Object[1];
            b(null, null, 61 % Color.blue(1), "\u008b\u0082\u008a\u0092\u0091\u0088\u008d\u008d\u0088\u0083\u0090\u008a\u0084\u008f", objArr);
            obj = objArr[0];
        } else {
            m3032 = m3032(jSONObject, t);
            Object[] objArr2 = new Object[1];
            b(null, null, 127 - Color.blue(0), "\u008b\u0082\u008a\u0092\u0091\u0088\u008d\u008d\u0088\u0083\u0090\u008a\u0084\u008f", objArr2);
            obj = objArr2[0];
        }
        m3035(((String) obj).intern(), m3032);
        m3030().mo2993(m3032, k, t);
        f88 = (f85 + 123) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﻐ */
    public final void mo2994(JSONObject jSONObject, K k, Object obj, T t) {
        f85 = (f88 + 33) % 128;
        JSONObject m3032 = m3032(jSONObject, t);
        int pressedStateDuration = ViewConfiguration.getPressedStateDuration();
        int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout();
        Object[] objArr = new Object[1];
        c(11 - (pressedStateDuration >> 16), jumpTapTimeout >> 16, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr);
        m3035(((String) objArr[0]).intern(), m3032);
        m3030().mo2994(m3032, k, obj, t);
        int i = f85 + 95;
        f88 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﻛ */
    public void mo2995(JSONObject jSONObject, K k, T t) {
        f88 = (f85 + 47) % 128;
        JSONObject m3032 = m3032(jSONObject, t);
        Object[] objArr = new Object[1];
        b(null, null, 175 - AndroidCharacter.getMirror('0'), "\u008b\u0082\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
        m3035(((String) objArr[0]).intern(), m3032);
        m3030().mo2995(m3032, k, t);
        f85 = (f88 + 11) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﻛ */
    public final void mo2996(JSONObject jSONObject, K k, Object obj, T t) {
        JSONObject m3032;
        Object obj2;
        int i = f88 + 45;
        f85 = i % 128;
        if (i % 2 == 0) {
            m3032 = m3032(jSONObject, t);
            Object[] objArr = new Object[1];
            b(null, null, 109 << (ViewConfiguration.getEdgeSlop() % 109), "\u008b\u008d\u0094\u008a\u008f\u008a\u0083\u0091\u0091\u0093", objArr);
            obj2 = objArr[0];
        } else {
            m3032 = m3032(jSONObject, t);
            Object[] objArr2 = new Object[1];
            b(null, null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, "\u008b\u008d\u0094\u008a\u008f\u008a\u0083\u0091\u0091\u0093", objArr2);
            obj2 = objArr2[0];
        }
        m3035(((String) obj2).intern(), m3032);
        m3030().mo2996(m3032, k, obj, t);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ｋ */
    public final void mo2997(JSONObject jSONObject, K k, T t) {
        m3034(new Object[]{this, jSONObject, k, t}, -999436983, 999436983, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    protected abstract String mo3036(Object obj);

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﾇ */
    public void mo2998(JSONObject jSONObject, K k, T t) {
        f85 = (f88 + 55) % 128;
        JSONObject m3032 = m3032(jSONObject, t);
        Object[] objArr = new Object[1];
        b(null, null, 127 - View.resolveSizeAndState(0, 0, 0), "\u008b\u0088\u008e\u008d\u008c\u008a\u0083\u0082\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
        m3035(((String) objArr[0]).intern(), m3032);
        m3030().mo2998(m3032, k, t);
        f88 = (f85 + 59) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﾇ */
    public final void mo2999(JSONObject jSONObject, K k, Object obj, T t) {
        f88 = (f85 + 13) % 128;
        JSONObject m3032 = m3032(jSONObject, t);
        int myPid = Process.myPid();
        int indexOf = TextUtils.indexOf((CharSequence) "", '0');
        Object[] objArr = new Object[1];
        c(19 - (myPid >> 22), indexOf + 12, (char) TextUtils.getOffsetBefore("", 0), objArr);
        m3035(((String) objArr[0]).intern(), m3032);
        m3030().mo2999(m3032, k, obj, t);
        int i = f85 + 83;
        f88 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m3037(x<K, T> xVar) {
        int i = f88;
        this.f92 = xVar;
        int i2 = i + 39;
        f85 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﾒ */
    public final void mo3000(JSONObject jSONObject, K k, T t) {
        m3034(new Object[]{this, jSONObject, k, t}, -201375043, 201375044, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }
}
