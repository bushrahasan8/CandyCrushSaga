package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.m4;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: hh.class */
public final class hh extends hf<View.OnTouchListener> implements View.OnTouchListener {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2354 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int[] f2355;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2356;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private c f2357;

    /* loaded from: hh$c.class */
    public interface c {
        boolean dz_(hh hhVar, View view, MotionEvent motionEvent);
    }

    static {
        m5109();
        SystemClock.elapsedRealtime();
        int i = f2354 + 73;
        f2356 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    public hh(View.OnTouchListener onTouchListener, c cVar) {
        super(onTouchListener);
        this.f2357 = cVar;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int[] iArr2;
        int length;
        m mVar = new m();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f2355;
        int[] iArr4 = iArr3;
        if (iArr3 != null) {
            int i2 = $11 + 59;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                length = iArr3.length;
                iArr4 = new int[length];
            } else {
                length = iArr3.length;
                iArr4 = new int[length];
            }
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = iArr3[i3];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122833333);
                    if (obj == null) {
                        obj = ((Class) b.m3371((-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 41 - TextUtils.getCapsMode("", 0, 0))).getMethod(m4.p, Integer.TYPE);
                        map.put(122833333, obj);
                    }
                    iArr4[i3] = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i4))).intValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        int length2 = iArr4.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = f2355;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            for (int i5 = 0; i5 < length3; i5++) {
                int i6 = $11 + 97;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = iArr6[i5];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(122833333);
                    if (obj2 == null) {
                        obj2 = ((Class) b.m3371((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) TextUtils.indexOf("", "", 0), 41 - ExpandableListView.getPackedPositionType(0L))).getMethod(m4.p, Integer.TYPE);
                        map2.put(122833333, obj2);
                    }
                    iArr7[i5] = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i7))).intValue();
                } else {
                    int i8 = iArr6[i5];
                    Map map3 = b.f452;
                    Object obj3 = map3.get(122833333);
                    if (obj3 == null) {
                        obj3 = ((Class) b.m3371(Color.red(0), (char) (Process.myTid() >> 22), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 41)).getMethod(m4.p, Integer.TYPE);
                        map3.put(122833333, obj3);
                    }
                    iArr7[i5] = ((Integer) ((Method) obj3).invoke(null, Integer.valueOf(i8))).intValue();
                }
            }
            iArr2 = iArr7;
        } else {
            iArr2 = iArr6;
        }
        System.arraycopy(iArr2, 0, iArr5, 0, length2);
        mVar.f3040 = 0;
        while (true) {
            int i9 = mVar.f3040;
            if (i9 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i10 = iArr[i9];
            char c2 = (char) (i10 >> 16);
            cArr[0] = c2;
            char c3 = (char) i10;
            cArr[1] = c3;
            char c4 = (char) (iArr[i9 + 1] >> 16);
            cArr[2] = c4;
            char c5 = (char) iArr[i9 + 1];
            cArr[3] = c5;
            mVar.f3039 = (c2 << 16) + c3;
            mVar.f3038 = (c4 << 16) + c5;
            m.m5748(iArr5);
            int i11 = 0;
            while (i11 < 16) {
                $10 = ($11 + 101) % 128;
                int i12 = mVar.f3039 ^ iArr5[i11];
                mVar.f3039 = i12;
                int m5749 = m.m5749(i12);
                Map map4 = b.f452;
                Object obj4 = map4.get(10695560);
                if (obj4 == null) {
                    obj4 = ((Class) b.m3371((-1) - MotionEvent.axisFromString(""), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 41)).getMethod("k", Object.class, Integer.TYPE, Object.class, Object.class);
                    map4.put(10695560, obj4);
                }
                int intValue = ((Integer) ((Method) obj4).invoke(null, mVar, Integer.valueOf(m5749), mVar, mVar)).intValue();
                mVar.f3039 = mVar.f3038;
                mVar.f3038 = intValue;
                i11++;
                $10 = ($11 + 79) % 128;
            }
            int i13 = mVar.f3039;
            int i14 = mVar.f3038;
            mVar.f3039 = i14;
            mVar.f3038 = i13;
            int i15 = i13 ^ iArr5[16];
            mVar.f3038 = i15;
            int i16 = i14 ^ iArr5[17];
            mVar.f3039 = i16;
            cArr[0] = (char) (i16 >>> 16);
            cArr[1] = (char) i16;
            cArr[2] = (char) (i15 >>> 16);
            cArr[3] = (char) i15;
            m.m5748(iArr5);
            int i17 = mVar.f3040;
            cArr2[i17 * 2] = cArr[0];
            cArr2[(i17 * 2) + 1] = cArr[1];
            cArr2[(i17 * 2) + 2] = cArr[2];
            cArr2[(i17 * 2) + 3] = cArr[3];
            Map map5 = b.f452;
            Object obj5 = map5.get(1365438799);
            if (obj5 == null) {
                obj5 = ((Class) b.m3371(ViewConfiguration.getFadingEdgeLength() >> 16, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 41)).getMethod("m", Object.class, Object.class);
                map5.put(1365438799, obj5);
            }
            ((Method) obj5).invoke(null, mVar, mVar);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static void m5109() {
        f2355 = new int[]{-1313319917, 2095086691, -1417377474, -657253319, 777122240, 1801214449, -1958505360, 1878993031, -351783840, -302944717, -46814169, 886513934, 912376772, 996873688, -273894426, -140832054, -1536531035, -1880979384};
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = f2354 + 57;
        f2356 = i % 128;
        try {
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a(new int[]{988771940, 2054303781, 388574506, -532334328, -923317716, -17422726, -1532785210, 1014499007, -337086052, -1322321457, 1161237704, 1428214924}, 24 - Color.green(0), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new int[]{843931770, 1379040352, 1236784475, 1291948035, -245576658, 1626007269, 1621560703, 1063887328, 663080415, 1596525672, 1369158339, -828084597, 1662931321, -605729824}, 29 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (i % 2 != 0) {
            this.f2357.dz_(this, view, motionEvent);
            throw null;
        }
        this.f2357.dz_(this, view, motionEvent);
        if (mo3633() == null) {
            f2354 = (f2356 + 65) % 128;
            return false;
        }
        f2356 = (f2354 + 117) % 128;
        boolean onTouch = mo3633().onTouch(view, motionEvent);
        f2354 = (f2356 + 45) % 128;
        return onTouch;
    }
}
