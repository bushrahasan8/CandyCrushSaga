package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.m4;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: fa.class */
public final class fa extends ep {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2084 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2085;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f2086 = {1676725399, -315070020, -1534845229, 2109974291, -2000622286, 1787698474, 2139574554, 1917750271, -767880338, 1408419967, -1937510701, -1750606662, 287326567, 559349464, 750079026, -1502029889, 2068571898, 1370505565};

    public fa(eb ebVar, eb ebVar2, dr drVar) {
        super(ebVar, ebVar2, drVar);
    }

    private static void c(int[] iArr, int i, Object[] objArr) {
        m mVar = new m();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f2086;
        int[] iArr3 = iArr2;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr4 = new int[length];
            int i2 = 0;
            while (i2 < length) {
                int i3 = iArr2[i2];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122833333);
                    if (obj == null) {
                        obj = ((Class) b.m3371(TextUtils.getTrimmedLength(""), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 41 - (ViewConfiguration.getScrollBarSize() >> 8))).getMethod(m4.p, Integer.TYPE);
                        map.put(122833333, obj);
                    }
                    iArr4[i2] = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i3))).intValue();
                    i2++;
                    $10 = ($11 + 43) % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = f2086;
        int[] iArr7 = iArr6;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr8 = new int[length3];
            int i4 = 0;
            while (i4 < length3) {
                int i5 = $10 + 55;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = iArr6[i4];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(122833333);
                    if (obj2 == null) {
                        obj2 = ((Class) b.m3371(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 41 - ExpandableListView.getPackedPositionGroup(0L))).getMethod(m4.p, Integer.TYPE);
                        map2.put(122833333, obj2);
                    }
                    iArr8[i4] = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i6))).intValue();
                } else {
                    int i7 = iArr6[i4];
                    Map map3 = b.f452;
                    Object obj3 = map3.get(122833333);
                    if (obj3 == null) {
                        obj3 = ((Class) b.m3371(ViewConfiguration.getKeyRepeatDelay() >> 16, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Color.argb(0, 0, 0, 0) + 41)).getMethod(m4.p, Integer.TYPE);
                        map3.put(122833333, obj3);
                    }
                    iArr8[i4] = ((Integer) ((Method) obj3).invoke(null, Integer.valueOf(i7))).intValue();
                    i4++;
                }
            }
            iArr7 = iArr8;
        }
        System.arraycopy(iArr7, 0, iArr5, 0, length2);
        mVar.f3040 = 0;
        while (true) {
            int i8 = mVar.f3040;
            if (i8 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            $11 = ($10 + 25) % 128;
            int i9 = iArr[i8];
            char c = (char) (i9 >> 16);
            cArr[0] = c;
            char c2 = (char) i9;
            cArr[1] = c2;
            char c3 = (char) (iArr[i8 + 1] >> 16);
            cArr[2] = c3;
            char c4 = (char) iArr[i8 + 1];
            cArr[3] = c4;
            mVar.f3039 = (c << 16) + c2;
            mVar.f3038 = (c3 << 16) + c4;
            m.m5748(iArr5);
            for (int i10 = 0; i10 < 16; i10++) {
                int i11 = mVar.f3039 ^ iArr5[i10];
                mVar.f3039 = i11;
                int m5749 = m.m5749(i11);
                Map map4 = b.f452;
                Object obj4 = map4.get(10695560);
                if (obj4 == null) {
                    obj4 = ((Class) b.m3371((Process.getThreadPriority(0) + 20) >> 6, (char) View.resolveSize(0, 0), 41 - Gravity.getAbsoluteGravity(0, 0))).getMethod("k", Object.class, Integer.TYPE, Object.class, Object.class);
                    map4.put(10695560, obj4);
                }
                int intValue = ((Integer) ((Method) obj4).invoke(null, mVar, Integer.valueOf(m5749), mVar, mVar)).intValue();
                mVar.f3039 = mVar.f3038;
                mVar.f3038 = intValue;
            }
            int i12 = mVar.f3039;
            int i13 = mVar.f3038;
            mVar.f3039 = i13;
            mVar.f3038 = i12;
            int i14 = i12 ^ iArr5[16];
            mVar.f3038 = i14;
            int i15 = i13 ^ iArr5[17];
            mVar.f3039 = i15;
            cArr[0] = (char) (i15 >>> 16);
            cArr[1] = (char) i15;
            cArr[2] = (char) (i14 >>> 16);
            cArr[3] = (char) i14;
            m.m5748(iArr5);
            int i16 = mVar.f3040;
            cArr2[i16 * 2] = cArr[0];
            cArr2[(i16 * 2) + 1] = cArr[1];
            cArr2[(i16 * 2) + 2] = cArr[2];
            cArr2[(i16 * 2) + 3] = cArr[3];
            Map map5 = b.f452;
            Object obj5 = map5.get(1365438799);
            if (obj5 == null) {
                obj5 = ((Class) b.m3371(1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), (-16777175) - Color.rgb(0, 0, 0))).getMethod("m", Object.class, Object.class);
                map5.put(1365438799, obj5);
            }
            ((Method) obj5).invoke(null, mVar, mVar);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ep
    /* renamed from: ﻐ */
    public final Number mo4974(Number number, Number number2) {
        int i = f2085;
        int i2 = i + 71;
        f2084 = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = number instanceof Double;
            throw null;
        }
        if ((number instanceof Double) || (number2 instanceof Double)) {
            double doubleValue = number.doubleValue();
            double doubleValue2 = number2.doubleValue();
            f2085 = (f2084 + 55) % 128;
            return Double.valueOf(doubleValue % doubleValue2);
        }
        if (!(number instanceof Long)) {
            int i3 = i + 19;
            f2084 = i3 % 128;
            if (i3 % 2 == 0) {
                boolean z2 = number2 instanceof Long;
                throw null;
            }
            if (!(number2 instanceof Long)) {
                return Integer.valueOf(number.intValue() % number2.intValue());
            }
        }
        return Long.valueOf(number.longValue() % number2.longValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ei
    /* renamed from: ﻛ */
    public final String mo4955() {
        int i = f2084 + 119;
        f2085 = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            c(new int[]{-328066110, 794786882}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            ((String) objArr[0]).intern();
            throw new ArithmeticException("divide by zero");
        }
        Object[] objArr2 = new Object[1];
        c(new int[]{-328066110, 794786882}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
        String intern = ((String) objArr2[0]).intern();
        f2085 = (f2084 + 83) % 128;
        return intern;
    }
}
