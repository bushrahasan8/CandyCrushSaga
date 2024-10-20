package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.m4;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: ea.class */
public final class ea {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1963 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f1964 = -6658373272926553794L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1965;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f1966;

    /* renamed from: ｋ, reason: contains not printable characters */
    private int f1967;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private c f1968;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ﻛ' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: ea$c.class */
    public static final class c {
        private static int $10 = 0;
        private static int $11 = 1;

        /* renamed from: ﭖ, reason: contains not printable characters */
        private static int f1969 = 1;

        /* renamed from: ﮌ, reason: contains not printable characters */
        private static int f1970;

        /* renamed from: ﮐ, reason: contains not printable characters */
        public static final c f1971;

        /* renamed from: ﱟ, reason: contains not printable characters */
        public static final c f1972;

        /* renamed from: ﱡ, reason: contains not printable characters */
        public static final c f1973;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int[] f1974;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static final c[] f1975;

        /* renamed from: ﻐ, reason: contains not printable characters */
        public static final c f1976;

        /* renamed from: ﻛ, reason: contains not printable characters */
        public static final c f1977;

        /* renamed from: ｋ, reason: contains not printable characters */
        public static final c f1978;

        /* renamed from: ﾇ, reason: contains not printable characters */
        public static final c f1979;

        /* renamed from: ﾒ, reason: contains not printable characters */
        public static final c f1980;

        static {
            m4933();
            Object[] objArr = new Object[1];
            a(new int[]{1242701160, 1275403646, 2016539750, 1981023744}, 6 - Process.getGidForName(""), objArr);
            c cVar = new c(((String) objArr[0]).intern(), 0);
            f1977 = cVar;
            Object[] objArr2 = new Object[1];
            a(new int[]{521087333, 582957764, -1036758542, 1120714031, -2134717935, -1125802236}, 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
            c cVar2 = new c(((String) objArr2[0]).intern(), 1);
            f1980 = cVar2;
            Object[] objArr3 = new Object[1];
            a(new int[]{646899958, 1516698743, -731298557, -76997178}, (Process.myPid() >> 22) + 8, objArr3);
            c cVar3 = new c(((String) objArr3[0]).intern(), 2);
            f1978 = cVar3;
            Object[] objArr4 = new Object[1];
            a(new int[]{-801334159, -278907886, 1801960694, -706702202}, 6 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr4);
            c cVar4 = new c(((String) objArr4[0]).intern(), 3);
            f1976 = cVar4;
            Object[] objArr5 = new Object[1];
            a(new int[]{1525066194, -1003652763, -355914224, 2147181765}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 7, objArr5);
            c cVar5 = new c(((String) objArr5[0]).intern(), 4);
            f1979 = cVar5;
            Object[] objArr6 = new Object[1];
            a(new int[]{-1666763863, 405482408, -419122074, 100650761}, 7 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr6);
            c cVar6 = new c(((String) objArr6[0]).intern(), 5);
            f1971 = cVar6;
            Object[] objArr7 = new Object[1];
            a(new int[]{346972757, -986857234, -1700930693, -1375504578}, 7 - Color.alpha(0), objArr7);
            c cVar7 = new c(((String) objArr7[0]).intern(), 6);
            f1972 = cVar7;
            Object[] objArr8 = new Object[1];
            a(new int[]{-446419454, -726526514, 411667754, -208662828}, (Process.myPid() >> 22) + 5, objArr8);
            c cVar8 = new c(((String) objArr8[0]).intern(), 7);
            f1973 = cVar8;
            f1975 = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8};
            f1969 = (f1970 + 35) % 128;
        }

        private c(String str, int i) {
        }

        private static void a(int[] iArr, int i, Object[] objArr) {
            int[] iArr2;
            m mVar = new m();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = f1974;
            int[] iArr4 = iArr3;
            if (iArr3 != null) {
                int length = iArr3.length;
                int[] iArr5 = new int[length];
                int i2 = 0;
                while (i2 < length) {
                    int i3 = iArr3[i2];
                    try {
                        Map map = b.f452;
                        Object obj = map.get(122833333);
                        if (obj == null) {
                            obj = ((Class) b.m3371(ExpandableListView.getPackedPositionGroup(0L), (char) (Color.rgb(0, 0, 0) + 16777216), 41 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod(m4.p, Integer.TYPE);
                            map.put(122833333, obj);
                        }
                        iArr5[i2] = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i3))).intValue();
                        i2++;
                        $10 = ($11 + 117) % 128;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                $11 = ($10 + 17) % 128;
                iArr4 = iArr5;
            }
            int length2 = iArr4.length;
            int[] iArr6 = new int[length2];
            int[] iArr7 = f1974;
            if (iArr7 != null) {
                int length3 = iArr7.length;
                int[] iArr8 = new int[length3];
                for (int i4 = 0; i4 < length3; i4++) {
                    int i5 = iArr7[i4];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(122833333);
                    if (obj2 == null) {
                        obj2 = ((Class) b.m3371((-16777216) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getTapTimeout() >> 16), Color.green(0) + 41)).getMethod(m4.p, Integer.TYPE);
                        map2.put(122833333, obj2);
                    }
                    iArr8[i4] = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i5))).intValue();
                }
                iArr2 = iArr8;
            } else {
                iArr2 = iArr7;
            }
            System.arraycopy(iArr2, 0, iArr6, 0, length2);
            mVar.f3040 = 0;
            while (true) {
                int i6 = mVar.f3040;
                if (i6 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i);
                    return;
                }
                int i7 = iArr[i6];
                char c = (char) (i7 >> 16);
                cArr[0] = c;
                char c2 = (char) i7;
                cArr[1] = c2;
                char c3 = (char) (iArr[i6 + 1] >> 16);
                cArr[2] = c3;
                char c4 = (char) iArr[i6 + 1];
                cArr[3] = c4;
                mVar.f3039 = (c << 16) + c2;
                mVar.f3038 = (c3 << 16) + c4;
                m.m5748(iArr6);
                int i8 = 0;
                while (i8 < 16) {
                    int i9 = $10 + 27;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = mVar.f3039 ^ iArr6[i8];
                        mVar.f3039 = i10;
                        int m5749 = m.m5749(i10);
                        Map map3 = b.f452;
                        Object obj3 = map3.get(10695560);
                        if (obj3 == null) {
                            obj3 = ((Class) b.m3371(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), TextUtils.indexOf("", "") + 41)).getMethod("k", Object.class, Integer.TYPE, Object.class, Object.class);
                            map3.put(10695560, obj3);
                        }
                        int intValue = ((Integer) ((Method) obj3).invoke(null, mVar, Integer.valueOf(m5749), mVar, mVar)).intValue();
                        mVar.f3039 = mVar.f3038;
                        mVar.f3038 = intValue;
                        i8 += 120;
                    } else {
                        int i11 = mVar.f3039 ^ iArr6[i8];
                        mVar.f3039 = i11;
                        int m57492 = m.m5749(i11);
                        Map map4 = b.f452;
                        Object obj4 = map4.get(10695560);
                        if (obj4 == null) {
                            obj4 = ((Class) b.m3371(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 41)).getMethod("k", Object.class, Integer.TYPE, Object.class, Object.class);
                            map4.put(10695560, obj4);
                        }
                        int intValue2 = ((Integer) ((Method) obj4).invoke(null, mVar, Integer.valueOf(m57492), mVar, mVar)).intValue();
                        mVar.f3039 = mVar.f3038;
                        mVar.f3038 = intValue2;
                        i8++;
                    }
                }
                int i12 = mVar.f3039;
                int i13 = mVar.f3038;
                mVar.f3039 = i13;
                mVar.f3038 = i12;
                int i14 = i12 ^ iArr6[16];
                mVar.f3038 = i14;
                int i15 = i13 ^ iArr6[17];
                mVar.f3039 = i15;
                cArr[0] = (char) (i15 >>> 16);
                cArr[1] = (char) i15;
                cArr[2] = (char) (i14 >>> 16);
                cArr[3] = (char) i14;
                m.m5748(iArr6);
                int i16 = mVar.f3040;
                cArr2[i16 * 2] = cArr[0];
                cArr2[(i16 * 2) + 1] = cArr[1];
                cArr2[(i16 * 2) + 2] = cArr[2];
                cArr2[(i16 * 2) + 3] = cArr[3];
                Map map5 = b.f452;
                Object obj5 = map5.get(1365438799);
                if (obj5 == null) {
                    obj5 = ((Class) b.m3371(View.resolveSizeAndState(0, 0, 0), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 41)).getMethod("m", Object.class, Object.class);
                    map5.put(1365438799, obj5);
                }
                ((Method) obj5).invoke(null, mVar, mVar);
            }
        }

        public static c valueOf(String str) {
            f1970 = (f1969 + 105) % 128;
            c cVar = (c) Enum.valueOf(c.class, str);
            f1970 = (f1969 + 115) % 128;
            return cVar;
        }

        public static c[] values() {
            f1969 = (f1970 + 1) % 128;
            c[] cVarArr = (c[]) f1975.clone();
            int i = f1970 + 1;
            f1969 = i % 128;
            if (i % 2 != 0) {
                return cVarArr;
            }
            throw null;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        static void m4933() {
            f1974 = new int[]{-412968978, 1360822897, 38412554, 377346937, -2011983861, -1386705274, -20772696, 663670619, -527269986, 1144241274, -931808094, -1476970830, -1431604416, -1810327816, 368668417, 1916725611, 1397575770, -202156283};
        }
    }

    public ea(c cVar, String str, int i) {
        this.f1968 = cVar;
        this.f1966 = str;
        this.f1967 = i;
    }

    private static void a(String str, int i, Object[] objArr) {
        int i2 = $10 + 9;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            str = str.toCharArray();
        }
        n nVar = new n();
        char[] m5750 = n.m5750(f1964 ^ (-7438370749274812225L), (char[]) str, i);
        nVar.f3042 = 4;
        while (true) {
            int i3 = nVar.f3042;
            if (i3 >= m5750.length) {
                objArr[0] = new String(m5750, 4, m5750.length - 4);
                return;
            }
            $10 = ($11 + 111) % 128;
            int i4 = i3 - 4;
            nVar.f3041 = i4;
            long j = m5750[i3] ^ m5750[i3 % 4];
            long j2 = i4;
            long j3 = f1964;
            try {
                Map map = b.f452;
                Object obj = map.get(983860882);
                if (obj == null) {
                    Class cls = (Class) b.m3371(Color.argb(0, 0, 0, 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 41 - (ViewConfiguration.getTouchSlop() >> 8));
                    Class<?> cls2 = Long.TYPE;
                    obj = cls.getMethod("p", cls2, cls2, cls2);
                    map.put(983860882, obj);
                }
                m5750[i3] = ((Character) ((Method) obj).invoke(null, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3))).charValue();
                Object obj2 = map.get(-2082235053);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371((-1) - TextUtils.indexOf((CharSequence) "", '0'), (char) KeyEvent.getDeadChar(0, 0), 41 - (KeyEvent.getMaxKeyCode() >> 16))).getMethod("q", Object.class, Object.class);
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

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m4917(Object[] objArr, int i, int i2, int i3) {
        Object m4918;
        int i4 = i2 ^ (-1);
        int i5 = (i3 | i2) ^ (-1);
        if ((i * (-391)) + (i2 * (-195)) + ((((i4 | i) ^ (-1)) | i5) * (-196)) + ((i2 | i) * 392) + (((((i ^ (-1)) | i4) ^ (-1)) | i5) * 196) != 1) {
            ea eaVar = (ea) objArr[0];
            f1965 = (f1963 + 19) % 128;
            if (eaVar.m4928() == c.f1976) {
                f1965 = (f1963 + 27) % 128;
                m4918 = Boolean.TRUE;
            } else {
                f1965 = (f1963 + 29) % 128;
                m4918 = Boolean.FALSE;
            }
        } else {
            m4918 = m4918(objArr);
        }
        return m4918;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static /* synthetic */ Object m4918(Object[] objArr) {
        ea eaVar = (ea) objArr[0];
        int i = (f1963 + 85) % 128;
        f1965 = i;
        String str = eaVar.f1966;
        int i2 = i + 13;
        f1963 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1968);
        Object[] objArr = new Object[1];
        a("寽寇ᰈ�笩", View.resolveSizeAndState(0, 0, 0) + 1, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(this.f1966);
        String obj = sb.toString();
        f1963 = (f1965 + 35) % 128;
        return obj;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final boolean m4919() {
        f1963 = (f1965 + 3) % 128;
        if (m4928() == c.f1977) {
            return true;
        }
        f1965 = (f1963 + 23) % 128;
        return false;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final boolean m4920() {
        f1965 = (f1963 + 93) % 128;
        if (m4928() != c.f1980) {
            return false;
        }
        f1963 = (f1965 + 121) % 128;
        return true;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m4921() {
        boolean z = false;
        if (m4928() == c.f1978) {
            int i = f1963 + 59;
            f1965 = i % 128;
            if (i % 2 == 0) {
                z = true;
            }
            return z;
        }
        int i2 = f1963 + 89;
        f1965 = i2 % 128;
        if (i2 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m4922() {
        int i = f1963 + 7;
        f1965 = i % 128;
        if (i % 2 != 0) {
            m4928();
            c cVar = c.f1973;
            throw new ArithmeticException("divide by zero");
        }
        if (m4928() != c.f1973) {
            return false;
        }
        f1963 = (f1965 + 123) % 128;
        return true;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final boolean m4923() {
        f1963 = (f1965 + 113) % 128;
        if (m4928() == c.f1971) {
            return true;
        }
        f1965 = (f1963 + 45) % 128;
        return false;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m4924() {
        int i = f1963 + 103;
        f1965 = i % 128;
        if (i % 2 != 0) {
            m4928();
            c cVar = c.f1979;
            throw new ArithmeticException("divide by zero");
        }
        if (m4928() == c.f1979) {
            return true;
        }
        f1963 = (f1965 + 5) % 128;
        return false;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m4925() {
        int i = f1963 + 121;
        f1965 = i % 128;
        if (i % 2 != 0) {
            m4928();
            c cVar = c.f1977;
            throw null;
        }
        if (m4928() == c.f1972) {
            f1963 = (f1965 + 25) % 128;
            return true;
        }
        f1963 = (f1965 + 41) % 128;
        return false;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m4926() {
        return ((Boolean) m4917(new Object[]{this}, 899215560, -899215560, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue())).booleanValue();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int m4927() {
        int i = f1963;
        int i2 = this.f1967;
        int i3 = i + 19;
        f1965 = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final c m4928() {
        int i = f1965;
        int i2 = i + 105;
        f1963 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        c cVar = this.f1968;
        f1963 = (i + 63) % 128;
        return cVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m4929() {
        return (String) m4917(new Object[]{this}, 159653782, -159653781, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m4930(String str) {
        int i = f1963 + 17;
        f1965 = i % 128;
        if (i % 2 != 0) {
            this.f1966.equals(str);
            throw null;
        }
        boolean equals = this.f1966.equals(str);
        f1963 = (f1965 + 3) % 128;
        return equals;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m4931() {
        if (!m4926()) {
            f1965 = (f1963 + 7) % 128;
            if (!m4924()) {
                f1963 = (f1965 + 31) % 128;
                if (!m4923() && !m4925()) {
                    return false;
                }
            }
        }
        f1963 = (f1965 + 43) % 128;
        return true;
    }
}
