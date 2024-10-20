package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.do, reason: invalid class name */
/* loaded from: do.class */
public class Cdo extends db implements cn {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: טּ, reason: contains not printable characters */
    private static int f1817 = 1;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static char f1818;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static char f1819;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static char f1820;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static char f1821;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f1822;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1823;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f1824;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f1825;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f1826;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1828;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f1831;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f1832;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f1829 = "";

    /* renamed from: ｋ, reason: contains not printable characters */
    private double f1830 = -1.0d;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private boolean f1827 = false;

    static {
        m4778();
        KeyEvent.normalizeMetaState(0);
        View.resolveSize(0, 0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        TextUtils.getCapsMode("", 0, 0);
        ViewConfiguration.getScrollDefaultDelay();
        ViewConfiguration.getScrollBarSize();
        Gravity.getAbsoluteGravity(0, 0);
        PointF.length(0.0f, 0.0f);
        ViewConfiguration.getMaximumDrawingCacheSize();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        ViewConfiguration.getPressedStateDuration();
        ViewConfiguration.getGlobalActionKeyTimeout();
        ViewConfiguration.getScrollDefaultDelay();
        f1822 = (f1817 + 21) % 128;
    }

    private static void a(int[] iArr, String str, int i, String str2, Object[] objArr) {
        char[] cArr;
        int i2 = $11 + 79;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str3 = str2;
        if (str2 != null) {
            str3 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) str3;
        if (str != null) {
            str = str.toCharArray();
        }
        char[] cArr2 = (char[]) str;
        r rVar = new r();
        char[] cArr3 = f1826;
        char[] cArr4 = cArr3;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr5 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                char c = cArr3[i3];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122475841);
                    if (obj == null) {
                        obj = ((Class) b.m3371(((byte) KeyEvent.getModifierMetaStateMask()) + 1, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 41 - View.combineMeasuredStates(0, 0))).getMethod("b", Integer.TYPE);
                        map.put(122475841, obj);
                    }
                    cArr5[i3] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr5;
        }
        int i4 = f1823;
        Map map2 = b.f452;
        Object obj2 = map2.get(122565214);
        if (obj2 == null) {
            obj2 = ((Class) b.m3371(ViewConfiguration.getScrollDefaultDelay() >> 16, (char) (Process.myTid() >> 22), 40 - MotionEvent.axisFromString(""))).getMethod("e", Integer.TYPE);
            map2.put(122565214, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i4))).intValue();
        if (f1824) {
            $11 = ($10 + 33) % 128;
            int length2 = bArr.length;
            rVar.f3052 = length2;
            char[] cArr6 = new char[length2];
            rVar.f3051 = 0;
            while (true) {
                int i5 = rVar.f3051;
                int i6 = rVar.f3052;
                if (i5 >= i6) {
                    String str4 = new String(cArr6);
                    $10 = ($11 + 59) % 128;
                    objArr[0] = str4;
                    return;
                }
                $10 = ($11 + 105) % 128;
                cArr6[i5] = (char) (cArr4[bArr[(i6 - 1) - i5] + i] - intValue);
                Map map3 = b.f452;
                Object obj3 = map3.get(-1176441533);
                if (obj3 == null) {
                    obj3 = ((Class) b.m3371(1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) View.MeasureSpec.getMode(0), TextUtils.getOffsetBefore("", 0) + 41)).getMethod("a", Object.class, Object.class);
                    map3.put(-1176441533, obj3);
                }
                ((Method) obj3).invoke(null, rVar, rVar);
            }
        } else if (f1825) {
            int i7 = $10 + 89;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                int length3 = cArr2.length;
                rVar.f3052 = length3;
                cArr = new char[length3];
                rVar.f3051 = 1;
            } else {
                int length4 = cArr2.length;
                rVar.f3052 = length4;
                cArr = new char[length4];
                rVar.f3051 = 0;
            }
            while (true) {
                int i8 = rVar.f3051;
                int i9 = rVar.f3052;
                if (i8 >= i9) {
                    objArr[0] = new String(cArr);
                    return;
                }
                $10 = ($11 + 7) % 128;
                cArr[i8] = (char) (cArr4[cArr2[(i9 - 1) - i8] - i] - intValue);
                Map map4 = b.f452;
                Object obj4 = map4.get(-1176441533);
                if (obj4 == null) {
                    obj4 = ((Class) b.m3371((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 41)).getMethod("a", Object.class, Object.class);
                    map4.put(-1176441533, obj4);
                }
                ((Method) obj4).invoke(null, rVar, rVar);
            }
        } else {
            int length5 = iArr.length;
            rVar.f3052 = length5;
            char[] cArr7 = new char[length5];
            rVar.f3051 = 0;
            while (true) {
                int i10 = rVar.f3051;
                int i11 = rVar.f3052;
                if (i10 >= i11) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i10] = (char) (cArr4[iArr[(i11 - 1) - i10] - i] - intValue);
                    rVar.f3051 = i10 + 1;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108, types: [int] */
    private static void b(String str, int i, Object[] objArr) {
        boolean z = 3;
        if (str != null) {
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        p pVar = new p();
        char[] cArr2 = new char[cArr.length];
        pVar.f3046 = 0;
        char[] cArr3 = new char[2];
        $11 = ($10 + 79) % 128;
        while (true) {
            int i2 = pVar.f3046;
            if (i2 >= cArr.length) {
                break;
            }
            int i3 = ($11 + 125) % 128;
            $10 = i3;
            cArr3[0] = cArr[i2];
            cArr3[1] = cArr[i2 + 1];
            $11 = (i3 + 111) % 128;
            char c = 58224;
            int i4 = 0;
            boolean z2 = z;
            while (i4 < 16) {
                $10 = ($11 + 17) % 128;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                char c4 = (char) (f1821 ^ 8584761702560213004L);
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[z2 ? 1 : 0] = Integer.valueOf(f1818);
                    objArr2[2] = Integer.valueOf(c3 >>> 5);
                    objArr2[1] = Integer.valueOf((c3 + c) ^ ((c3 << 4) + c4));
                    objArr2[0] = Integer.valueOf(c2);
                    Map map = b.f452;
                    Object obj = map.get(-952725446);
                    if (obj == null) {
                        Class cls = (Class) b.m3371(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), MotionEvent.axisFromString("") + 42);
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
                    char c5 = cArr3[0];
                    char c6 = (char) (f1819 ^ 8584761702560213004L);
                    char c7 = f1820;
                    Object obj2 = map.get(-952725446);
                    if (obj2 == null) {
                        Class cls3 = (Class) b.m3371(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getScrollBarSize() >> 8), 40 - TextUtils.lastIndexOf("", '0'));
                        Class<?> cls4 = Integer.TYPE;
                        obj2 = cls3.getMethod("x", cls4, cls4, cls4, cls4);
                        map.put(-952725446, obj2);
                    }
                    cArr3[0] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c5), Integer.valueOf((charValue + c) ^ ((charValue << 4) + c6)), Integer.valueOf(charValue >>> 5), Integer.valueOf(c7))).charValue();
                    c -= 40503;
                    i4++;
                    z2 = 3;
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
                obj3 = ((Class) b.m3371(Color.blue(0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf((CharSequence) "", '0') + 42)).getMethod("u", Object.class, Object.class);
                map2.put(-1234941609, obj3);
            }
            ((Method) obj3).invoke(null, pVar, pVar);
            z = z2;
        }
        String str2 = new String(cArr2, 0, i);
        int i6 = $10 + 73;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private boolean m4768() {
        return ((Boolean) m4772(new Object[]{this}, -898311875, 898311875, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue())).booleanValue();
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private String m4769() {
        int i = f1822;
        int i2 = i + 1;
        f1817 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.f1832;
        int i3 = i + 39;
        f1817 = i3 % 128;
        if (i3 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return str;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String m4770() {
        String intern;
        int i = f1817 + 19;
        f1822 = i % 128;
        if (i % 2 != 0) {
            m4768();
            throw null;
        }
        if (m4768()) {
            Object[] objArr = new Object[1];
            a(null, null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\u0088\u0087\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0081", objArr);
            intern = ((String) objArr[0]).intern();
        } else {
            Object[] objArr2 = new Object[1];
            a(null, null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0086\u0087\u0088\u0088\u008a\u0089", objArr2);
            intern = ((String) objArr2[0]).intern();
            f1817 = (f1822 + 67) % 128;
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr3 = new Object[1];
        b("᭷얾⋅鴒ꐡ簰꼓\uecf1�’", 10 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(this.f1829);
        Object[] objArr4 = new Object[1];
        a(null, null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u008b", objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(intern);
        return sb.toString();
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private boolean m4771() {
        return ((Boolean) m4772(new Object[]{this}, 177158391, -177158389, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue())).booleanValue();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m4772(Object[] objArr, int i, int i2, int i3) {
        Object obj;
        int i4 = i ^ (-1);
        int i5 = (i * (-623)) + (i2 * (-623)) + (i4 * (-624)) + ((i4 | i2) * 624) + ((i | i2) * 624);
        if (i5 == 1) {
            Cdo cdo = (Cdo) objArr[0];
            String str = (String) objArr[1];
            int i6 = f1817;
            f1822 = (i6 + 75) % 128;
            cdo.f1832 = str;
            f1822 = (i6 + 55) % 128;
            obj = null;
        } else if (i5 != 2) {
            obj = m4777(objArr);
        } else {
            Cdo cdo2 = (Cdo) objArr[0];
            int i7 = (f1817 + 125) % 128;
            f1822 = i7;
            boolean z = cdo2.f1827;
            f1817 = (i7 + 69) % 128;
            obj = Boolean.valueOf(z);
        }
        return obj;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String m4773() {
        int i = (f1822 + 67) % 128;
        f1817 = i;
        String str = this.f1831;
        f1822 = (i + 97) % 128;
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m4774(boolean z) {
        int i = (f1822 + 43) % 128;
        f1817 = i;
        this.f1828 = z;
        f1822 = (i + 25) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private String m4775() {
        int i = (f1817 + 27) % 128;
        f1822 = i;
        String str = this.f1829;
        f1817 = (i + 87) % 128;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m4776(String str) {
        int i = f1822 + 75;
        f1817 = i % 128;
        this.f1829 = str;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m4777(Object[] objArr) {
        Cdo cdo = (Cdo) objArr[0];
        int i = f1817 + 27;
        int i2 = i % 128;
        f1822 = i2;
        boolean z = cdo.f1828;
        if (i % 2 != 0) {
            throw null;
        }
        f1817 = (i2 + 49) % 128;
        return Boolean.valueOf(z);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m4778() {
        f1825 = true;
        f1826 = new char[]{6624, 6419, 6426, 6421, 6629, 6420, 6627, 6424, 6628, 6631, 6616, 6418, 6597, 6425, 6648, 6427, 6625, 6651, 6626, 6431, 6417, 6429, 6599, 6644, 6416, 6646, 6655};
        f1824 = true;
        f1823 = 343349638;
        f1821 = (char) 35993;
        f1820 = (char) 16754;
        f1818 = (char) 39522;
        f1819 = (char) 40231;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Double m4779() {
        int i = f1817 + 43;
        f1822 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        double d = this.f1830;
        f1822 = (f1817 + 99) % 128;
        return Double.valueOf(d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00bb, code lost:
    
        if (r8.equals(((java.lang.String) r0[0]).intern()) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x025e, code lost:
    
        if (r8.equals(((java.lang.String) r0[0]).intern()) != false) goto L57;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.cn
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo3719(java.lang.String r8, java.util.List<java.lang.Object> r9, com.ironsource.adqualitysdk.sdk.i.cp r10) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.Cdo.mo3719(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.cp):java.lang.Object");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject m4780() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(ig.f2583, this.f1831);
            double d = this.f1830;
            if (d > -1.0d) {
                int i = f1817 + 105;
                f1822 = i % 128;
                if (i % 2 != 0) {
                    jSONObject2.put(ig.f2529, d);
                    throw new ArithmeticException("divide by zero");
                }
                jSONObject2.put(ig.f2529, d);
            }
            jSONObject2.put(ig.f2533, this.f1832);
        } catch (JSONException e) {
        }
        try {
            if (jSONObject2.length() > 0) {
                if (!(!this.f1827)) {
                    jSONObject2.put(ig.f2532, true);
                }
                jSONObject.put(ig.f2531, jSONObject2);
            }
            f1822 = (f1817 + 53) % 128;
        } catch (JSONException e2) {
        }
        return jSONObject;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m4781(String str) {
        m4772(new Object[]{this, str}, 148794035, -148794034, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m4782(boolean z) {
        int i = f1822 + 101;
        int i2 = i % 128;
        f1817 = i2;
        this.f1827 = z;
        if (i % 2 == 0) {
            throw null;
        }
        f1822 = (i2 + 25) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m4783(Double d) {
        f1822 = (f1817 + 91) % 128;
        this.f1830 = d.doubleValue();
        f1822 = (f1817 + 11) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m4784(String str) {
        int i = f1817 + 57;
        f1822 = i % 128;
        this.f1831 = str;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
