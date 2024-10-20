package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.hw;
import com.ironsource.m4;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* loaded from: ib.class */
public final class ib {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2493 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2494 = 287397560;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int[] f2495 = {320353924, 305501684, 120736463, -1487269434, 937338651, -1557176916, -1931081448, 1516266337, -782447808, 1135034193, -864233785, -853939239, 1466501687, 1687974209, 555093016, -755638684, 2102040641, -1791453261};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2496;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final String f2497;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Map f2498;

    public ib() {
        Object[] objArr = new Object[1];
        a(((Process.getThreadPriority(0) + 20) >> 6) + 12, TextUtils.getTrimmedLength("") + 9, true, 248 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u000b\u0006￣\u0011��\u0002\u0007\uffff￬\u000f\u0002\u0001", objArr);
        this.f2497 = ((String) objArr[0]).intern();
        this.f2498 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r7, int r8, boolean r9, int r10, java.lang.String r11, java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ib.a(int, int, boolean, int, java.lang.String, java.lang.Object[]):void");
    }

    private static void b(int[] iArr, int i, Object[] objArr) {
        m mVar = new m();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f2495;
        int[] iArr3 = iArr2;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr4 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                $10 = ($11 + 73) % 128;
                int i3 = iArr2[i2];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122833333);
                    if (obj == null) {
                        obj = ((Class) b.m3371(Gravity.getAbsoluteGravity(0, 0), (char) TextUtils.getCapsMode("", 0, 0), 40 - TextUtils.lastIndexOf("", '0'))).getMethod(m4.p, Integer.TYPE);
                        map.put(122833333, obj);
                    }
                    iArr4[i2] = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i3))).intValue();
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
        int[] iArr6 = f2495;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                int i5 = iArr6[i4];
                Map map2 = b.f452;
                Object obj2 = map2.get(122833333);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(Process.myTid() >> 22, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.red(0) + 41)).getMethod(m4.p, Integer.TYPE);
                    map2.put(122833333, obj2);
                }
                iArr7[i4] = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i5))).intValue();
            }
            $11 = ($10 + 71) % 128;
            iArr6 = iArr7;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
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
            m.m5748(iArr5);
            $10 = ($11 + 9) % 128;
            for (int i8 = 0; i8 < 16; i8++) {
                $11 = ($10 + 9) % 128;
                int i9 = mVar.f3039 ^ iArr5[i8];
                mVar.f3039 = i9;
                int m5749 = m.m5749(i9);
                Map map3 = b.f452;
                Object obj3 = map3.get(10695560);
                if (obj3 == null) {
                    obj3 = ((Class) b.m3371((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (char) ((-1) - MotionEvent.axisFromString("")), 41 - View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("k", Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(10695560, obj3);
                }
                int intValue = ((Integer) ((Method) obj3).invoke(null, mVar, Integer.valueOf(m5749), mVar, mVar)).intValue();
                mVar.f3039 = mVar.f3038;
                mVar.f3038 = intValue;
            }
            int i10 = mVar.f3039;
            int i11 = mVar.f3038;
            mVar.f3039 = i11;
            mVar.f3038 = i10;
            int i12 = i10 ^ iArr5[16];
            mVar.f3038 = i12;
            int i13 = i11 ^ iArr5[17];
            mVar.f3039 = i13;
            cArr[0] = (char) (i13 >>> 16);
            cArr[1] = (char) i13;
            cArr[2] = (char) (i12 >>> 16);
            cArr[3] = (char) i12;
            m.m5748(iArr5);
            int i14 = mVar.f3040;
            cArr2[i14 * 2] = cArr[0];
            cArr2[(i14 * 2) + 1] = cArr[1];
            cArr2[(i14 * 2) + 2] = cArr[2];
            cArr2[(i14 * 2) + 3] = cArr[3];
            Map map4 = b.f452;
            Object obj4 = map4.get(1365438799);
            if (obj4 == null) {
                obj4 = ((Class) b.m3371((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (char) (AndroidCharacter.getMirror('0') - '0'), 40 - TextUtils.lastIndexOf("", '0', 0, 0))).getMethod("m", Object.class, Object.class);
                map4.put(1365438799, obj4);
            }
            ((Method) obj4).invoke(null, mVar, mVar);
            $10 = ($11 + 81) % 128;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static /* synthetic */ Object m5293(Object[] objArr) {
        hy hyVar = (hy) objArr[0];
        Object obj = objArr[1];
        String str = (String) objArr[2];
        int i = f2496 + 31;
        f2493 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (hyVar == null) {
            Object[] objArr2 = new Object[1];
            a(12 - TextUtils.getCapsMode("", 0, 0), 10 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), true, AndroidCharacter.getMirror('0') + 200, "\u000b\u0006￣\u0011��\u0002\u0007\uffff￬\u000f\u0002\u0001", objArr2);
            String intern = ((String) objArr2[0]).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            Object[] objArr3 = new Object[1];
            a(2 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1 - Color.alpha(0), false, (Process.myTid() >> 22) + 194, "\ufff3\r", objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(str);
            v.m5753(intern, sb.toString());
            f2496 = (f2493 + 87) % 128;
            return null;
        }
        Object[] objArr4 = new Object[1];
        a(TextUtils.getCapsMode("", 0, 0) + 12, Color.blue(0) + 9, true, 248 - Color.red(0), "\u000b\u0006￣\u0011��\u0002\u0007\uffff￬\u000f\u0002\u0001", objArr4);
        String intern2 = ((String) objArr4[0]).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        Object[] objArr5 = new Object[1];
        a(2 - View.getDefaultSize(0, 0), 1 - (KeyEvent.getMaxKeyCode() >> 16), false, (ViewConfiguration.getPressedStateDuration() >> 16) + 194, "\ufff3\r", objArr5);
        sb2.append(((String) objArr5[0]).intern());
        sb2.append(str);
        Object[] objArr6 = new Object[1];
        b(new int[]{1957441677, -896802156, -1352451419, 904755537}, (Process.myPid() >> 22) + 8, objArr6);
        sb2.append(((String) objArr6[0]).intern());
        sb2.append(hyVar.mo5267());
        v.m5753(intern2, sb2.toString());
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static hy m5294(Object obj, Object obj2, hy hyVar) {
        f2496 = (f2493 + 13) % 128;
        if (!(obj instanceof Collection)) {
            if (obj instanceof Map) {
                return new hz((Map) obj, obj2, hyVar);
            }
            return null;
        }
        hz hzVar = new hz((Collection) obj, obj2, hyVar);
        int i = f2493 + 9;
        f2496 = i % 128;
        if (i % 2 == 0) {
            return hzVar;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ Object m5295(Object[] objArr) {
        hz hzVar = new hz((Field) objArr[0], objArr[1], (hy) objArr[2]);
        int i = f2496 + 27;
        f2493 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return hzVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m5296(Object[] objArr, int i, int i2, int i3) {
        Object m5310;
        int i4 = i3 ^ (-1);
        int i5 = (i4 | i) ^ (-1);
        int i6 = ((i ^ (-1)) | i2) ^ (-1);
        int i7 = (i * 765) + (i2 * (-1527)) + ((i2 | i5) * 764) + ((((i4 | i2) ^ (-1)) | i6) * (-1528)) + ((((i | (i2 ^ (-1))) ^ (-1)) | i6 | i5) * 764);
        if (i7 == 1) {
            m5310 = m5310(objArr);
        } else if (i7 == 2) {
            m5310 = m5300(objArr);
        } else if (i7 == 3) {
            m5310 = m5293(objArr);
        } else if (i7 != 4) {
            m5310 = m5295(objArr);
        } else {
            ib ibVar = (ib) objArr[0];
            Object obj = objArr[1];
            ia iaVar = new ia((hw) objArr[2]);
            iaVar.m5285();
            m5310 = new ArrayList(iaVar.m5284());
            f2493 = (f2496 + 3) % 128;
        }
        return m5310;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static List<Object> m5297(Class cls, Object obj, hp hpVar) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<Field> it = hv.m5211().m5213().m5133(cls, hpVar).iterator();
            while (it.hasNext()) {
                f2496 = (f2493 + 57) % 128;
                arrayList.add(it.next().get(obj));
            }
            f2493 = (f2496 + 49) % 128;
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13, View.MeasureSpec.getMode(0) + 9, true, 248 - View.resolveSize(0, 0), "\u000b\u0006￣\u0011��\u0002\u0007\uffff￬\u000f\u0002\u0001", objArr);
            String intern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            b(new int[]{1230459618, -732046614, -1827798924, 884550847, -141992385, 1938405088, -1981717091, 959490126}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(hpVar.m5149());
            Object[] objArr3 = new Object[1];
            b(new int[]{-699033137, 858074387, -1592983512, -1893056785, 137776929, 1235907536}, 11 - Color.red(0), objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(cls);
            Object[] objArr4 = new Object[1];
            b(new int[]{-1638716002, 751734217, -1206916821, -1394993517}, 6 - ExpandableListView.getPackedPositionType(0L), objArr4);
            sb.append(((String) objArr4[0]).intern());
            v.m5763(intern, sb.toString());
        }
        return arrayList;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static List m5298(Object obj, hw hwVar, int i) {
        f2496 = (f2493 + 19) % 128;
        List m5299 = m5299(obj, hwVar.m5227(i), hwVar.m5225(i));
        int i2 = f2496 + 79;
        f2493 = i2 % 128;
        if (i2 % 2 != 0) {
            return m5299;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static List m5299(Object obj, boolean z, boolean z2) {
        ArrayList arrayList;
        int i = f2493 + 115;
        int i2 = i % 128;
        f2496 = i2;
        if (i % 2 != 0) {
            boolean z3 = obj instanceof Collection;
            throw null;
        }
        if (obj instanceof Collection) {
            int i3 = i2 + 39;
            f2493 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (z) {
                arrayList = new ArrayList((Collection) obj);
                return arrayList;
            }
        }
        arrayList = null;
        if (obj instanceof Map) {
            arrayList = null;
            if (z2) {
                Map map = (Map) obj;
                arrayList = new ArrayList(map.values());
                arrayList.addAll(map.keySet());
            }
        }
        return arrayList;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m5300(Object[] objArr) {
        ib ibVar = (ib) objArr[0];
        Object obj = objArr[1];
        hu huVar = (hu) objArr[2];
        f2496 = (f2493 + 33) % 128;
        try {
            hy m5308 = ibVar.m5308(m5304(obj, (List) huVar.m5210().get(0), null), huVar, 1);
            int i = f2493 + 83;
            f2496 = i % 128;
            if (i % 2 == 0) {
                return m5308;
            }
            throw null;
        } catch (Exception e) {
            Object[] objArr2 = new Object[1];
            a(13 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 9 - TextUtils.getOffsetAfter("", 0), true, ImageFormat.getBitsPerPixel(0) + 249, "\u000b\u0006￣\u0011��\u0002\u0007\uffff￬\u000f\u0002\u0001", objArr2);
            String intern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(TextUtils.indexOf("", "", 0, 0) + 35, 31 - (ViewConfiguration.getTouchSlop() >> 8), false, 244 - View.resolveSizeAndState(0, 0, 0), "\u0013\uffc1\b\u0006\u0015\u0015\n\u000f\b\uffc1\ufff0\u0003\u000b\u0006\u0004\u0015\uffe7\n\u0006\r\u0005\uffc1\u0007\u0013\u0010\u000e\uffc1\u0011\u0002\u0015\t￦\u0013\u0013\u0010", objArr3);
            v.m5760(intern, ((String) objArr3[0]).intern(), e);
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private String m5301(Object obj, Class cls, String str) {
        String str2;
        loop0: while (cls != null && !cls.equals(Object.class)) {
            f2496 = (f2493 + 69) % 128;
            Field[] m5303 = m5303(cls);
            int length = m5303.length;
            for (int i = 0; i < length; i++) {
                int i2 = f2496 + 27;
                f2493 = i2 % 128;
                if (i2 % 2 == 0) {
                    Field field = m5303[i];
                    field.setAccessible(true);
                    try {
                        str2 = (String) field.get(obj);
                    } catch (Exception e) {
                    }
                    if (str2 == null) {
                        continue;
                    }
                } else {
                    Field field2 = m5303[i];
                    field2.setAccessible(true);
                    str2 = (String) field2.get(obj);
                    if (str2 == null) {
                        continue;
                    }
                }
                int i3 = f2496 + 17;
                f2493 = i3 % 128;
                if (i3 % 2 == 0) {
                    Pattern.compile(str).matcher(str2).matches();
                    throw null;
                    break loop0;
                }
                if (Pattern.compile(str).matcher(str2).matches()) {
                    return str2;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static List m5302(Object obj) {
        f2493 = (f2496 + 73) % 128;
        List m5299 = m5299(obj, true, true);
        f2496 = (f2493 + 3) % 128;
        return m5299;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Field[] m5303(Class cls) {
        ArrayList arrayList = new ArrayList();
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (i < length) {
            f2493 = (f2496 + 1) % 128;
            Field field = declaredFields[i];
            if (field.getType().equals(String.class)) {
                f2496 = (f2493 + 71) % 128;
                arrayList.add(field);
                f2496 = (f2493 + 101) % 128;
            }
            i++;
            f2493 = (f2496 + 69) % 128;
        }
        return (Field[]) arrayList.toArray(new Field[0]);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static hy m5304(Object obj, List list, hy hyVar) {
        int i = f2496 + 101;
        f2493 = i % 128;
        if (i % 2 == 0) {
            list.iterator();
            throw new ArithmeticException("divide by zero");
        }
        Iterator it = list.iterator();
        while (true) {
            Object obj2 = obj;
            if (!it.hasNext()) {
                return hyVar;
            }
            Field field = (Field) it.next();
            if (WeakReference.class.isAssignableFrom(field.getType())) {
                int i2 = f2493 + 93;
                f2496 = i2 % 128;
                if (i2 % 2 != 0) {
                    ((WeakReference) field.get(obj2)).get();
                    throw null;
                }
                obj = ((WeakReference) field.get(obj2)).get();
                f2493 = (f2496 + 73) % 128;
            } else {
                obj = field.get(obj2);
            }
            hyVar = (hy) m5296(new Object[]{field, obj2, hyVar}, -2117131649, 2117131649, (int) System.currentTimeMillis());
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static <T> T m5305(Class cls, Object obj, hp hpVar, T t) {
        try {
            Field m5132 = hv.m5211().m5213().m5132(cls, hpVar);
            if (m5132 == null) {
                f2493 = (f2496 + 87) % 128;
                return t;
            }
            int i = f2496 + 113;
            f2493 = i % 128;
            if (i % 2 != 0) {
                return (T) m5132.get(obj);
            }
            m5132.get(obj);
            throw new ArithmeticException("divide by zero");
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a(12 - View.resolveSizeAndState(0, 0, 0), 8 - TextUtils.lastIndexOf("", '0', 0), true, (ViewConfiguration.getPressedStateDuration() >> 16) + 248, "\u000b\u0006￣\u0011��\u0002\u0007\uffff￬\u000f\u0002\u0001", objArr);
            String intern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            b(new int[]{1230459618, -732046614, -1827798924, 884550847, -141992385, 1938405088, -1981717091, 959490126}, Color.green(0) + 14, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(hpVar.m5149());
            Object[] objArr3 = new Object[1];
            b(new int[]{-699033137, 858074387, -1592983512, -1893056785, 137776929, 1235907536}, 11 - View.resolveSizeAndState(0, 0, 0), objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(cls);
            Object[] objArr4 = new Object[1];
            b(new int[]{-1638716002, 751734217, -1206916821, -1394993517}, 6 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr4);
            sb.append(((String) objArr4[0]).intern());
            v.m5763(intern, sb.toString());
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m5306(Object obj, List list) {
        int i = f2496;
        f2493 = (i + 47) % 128;
        if (obj == null) {
            return false;
        }
        int i2 = i + 49;
        f2493 = i2 % 128;
        if (i2 % 2 != 0) {
            return kg.m5688(obj.getClass(), list);
        }
        kg.m5688(obj.getClass(), list);
        throw new ArithmeticException("divide by zero");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Field[] m5307(Class cls, int i) {
        f2493 = (f2496 + 91) % 128;
        Field[] declaredFields = cls.getDeclaredFields();
        int i2 = 0;
        while (cls != null && i2 != i) {
            int i3 = f2493 + 15;
            f2496 = i3 % 128;
            if (i3 % 2 != 0) {
                cls.getSuperclass();
                throw new ArithmeticException("divide by zero");
            }
            Class superclass = cls.getSuperclass();
            Field[] fieldArr = declaredFields;
            cls = superclass;
            if (superclass != null) {
                cls = superclass;
                fieldArr = kg.m5694(declaredFields, cls.getDeclaredFields());
                f2493 = (f2496 + 113) % 128;
            }
            i2++;
            declaredFields = fieldArr;
        }
        return declaredFields;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private hy m5308(hy hyVar, hu huVar, int i) {
        hy m5304;
        if (i >= huVar.m5210().size()) {
            return hyVar;
        }
        int i2 = f2493 + 45;
        f2496 = i2 % 128;
        if (i2 % 2 != 0) {
            m5302(hyVar.mo5267());
            throw null;
        }
        List list = (List) huVar.m5210().get(i);
        Object mo5267 = hyVar.mo5267();
        List m5302 = m5302(mo5267);
        if (m5302 != null) {
            for (Object obj : m5302) {
                try {
                    m5304 = m5304(obj, list, m5294(mo5267, obj, hyVar));
                } catch (Exception e) {
                }
                if (m5304 != null) {
                    return m5308(m5304, huVar, i + 1);
                }
                continue;
            }
            f2493 = (f2496 + 41) % 128;
            return null;
        }
        Object[] objArr = new Object[1];
        a(Color.rgb(0, 0, 0) + 16777228, Color.argb(0, 0, 0, 0) + 9, true, KeyEvent.normalizeMetaState(0) + 248, "\u000b\u0006￣\u0011��\u0002\u0007\uffff￬\u000f\u0002\u0001", objArr);
        String intern = ((String) objArr[0]).intern();
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        b(new int[]{1487820427, -1014256128, 1582700549, -571202734, 1247889748, -707762111, -834953006, 1160311815, 1487027336, 2051111700, 1604783491, 1762020176, -1064217006, 1436999637, 1108559487, 1605506645, 1971615234, -1126295276, -1377587530, 946907843}, 'U' - AndroidCharacter.getMirror('0'), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(mo5267.getClass());
        v.m5763(intern, sb.toString());
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private hy m5309(hy hyVar, ia iaVar, int i) {
        hy hyVar2;
        Object m5296;
        Object mo5267 = hyVar.mo5267();
        if (iaVar.m5286().contains(mo5267)) {
            return null;
        }
        f2496 = (f2493 + 61) % 128;
        if (iaVar.m5283().contains(mo5267)) {
            return null;
        }
        if (iaVar.m5287().m5223(i) && m5311(iaVar.m5287().m5222(), hyVar)) {
            int i2 = f2493 + 33;
            f2496 = i2 % 128;
            if (i2 % 2 != 0) {
                iaVar.m5290();
                throw null;
            }
            if (iaVar.m5290()) {
                iaVar.m5288(hyVar);
                iaVar.m5289((ia) mo5267);
            }
            return hyVar;
        }
        if (mo5267 instanceof WeakReference) {
            int i3 = f2493 + 45;
            f2496 = i3 % 128;
            if (i3 % 2 != 0) {
                ((WeakReference) mo5267).get();
                throw null;
            }
            if (((WeakReference) mo5267).get() != null && !(!iaVar.m5287().m5221(i))) {
                WeakReference weakReference = (WeakReference) mo5267;
                if (m5306(weakReference.get(), iaVar.m5287().m5224())) {
                    int i4 = i + 1;
                    hyVar2 = (hy) m5296(new Object[]{this, weakReference.get(), iaVar, Integer.valueOf(i4), hyVar}, -55647217, 55647218, i4);
                    return hyVar2;
                }
            }
        }
        if (m5306(mo5267, iaVar.m5287().m5224())) {
            int i5 = f2496 + 23;
            f2493 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = i >>> 1;
                m5296 = m5296(new Object[]{this, mo5267, iaVar, Integer.valueOf(i6), hyVar}, -55647217, 55647218, i6);
            } else {
                int i7 = i + 1;
                m5296 = m5296(new Object[]{this, mo5267, iaVar, Integer.valueOf(i7), hyVar}, -55647217, 55647218, i7);
            }
            hyVar2 = (hy) m5296;
        } else {
            if (iaVar.m5287().m5220() && mo5267 != null) {
                f2493 = (f2496 + 77) % 128;
                iaVar.m5286().add(mo5267);
            }
            List m5298 = m5298(mo5267, iaVar.m5287(), i);
            hu m5291 = iaVar.m5291();
            if (m5298 != null) {
                Iterator it = m5298.iterator();
                hyVar2 = null;
                while (it.hasNext()) {
                    hy m5294 = m5294(mo5267, it.next(), hyVar);
                    m5291.m5208();
                    hyVar2 = m5309(m5294, iaVar, i);
                    if (hyVar2 != null && !iaVar.m5290()) {
                        return hyVar2;
                    }
                    m5291.m5209();
                }
            } else {
                hyVar2 = null;
            }
        }
        return hyVar2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static /* synthetic */ Object m5310(Object[] objArr) {
        Field field;
        hy hyVar;
        ib ibVar = (ib) objArr[0];
        Object obj = objArr[1];
        int i = 2;
        ia iaVar = (ia) objArr[2];
        int intValue = ((Number) objArr[3]).intValue();
        hy hyVar2 = (hy) objArr[4];
        if (intValue == iaVar.m5287().m5228() || obj == null || iaVar.m5286().contains(obj)) {
            return null;
        }
        if (intValue > 0 && (obj instanceof Activity)) {
            return null;
        }
        iaVar.m5286().add(obj);
        try {
            Field[] mo5172 = iaVar.m5287().m5226() != null ? iaVar.m5287().m5226().mo5172(obj) : m5307(obj.getClass(), iaVar.m5287().m5229(intValue));
            hu m5291 = iaVar.m5291();
            int length = mo5172.length;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = f2493 + 31;
                f2496 = i3 % 128;
                if (i3 % i != 0) {
                    field = mo5172[i2];
                    field.setAccessible(true);
                    m5291.m5207(field);
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = field;
                    objArr2[1] = obj;
                    objArr2[i] = hyVar2;
                    hyVar = ibVar.m5309((hy) m5296(objArr2, -2117131649, 2117131649, (int) System.currentTimeMillis()), iaVar, intValue);
                    if (hyVar == null) {
                        continue;
                        m5291.m5206(field);
                    }
                } else {
                    Field field2 = mo5172[i2];
                    field2.setAccessible(true);
                    m5291.m5207(field2);
                    Object[] objArr3 = new Object[3];
                    objArr3[0] = field2;
                    objArr3[1] = obj;
                    objArr3[i] = hyVar2;
                    hy m5309 = ibVar.m5309((hy) m5296(objArr3, -2117131649, 2117131649, (int) System.currentTimeMillis()), iaVar, intValue);
                    field = field2;
                    if (m5309 != null) {
                        field = field2;
                        hyVar = m5309;
                    }
                    i = 2;
                    m5291.m5206(field);
                }
                if (!iaVar.m5290()) {
                    int i4 = f2496 + 1;
                    f2493 = i4 % 128;
                    if (i4 % 2 == 0) {
                        throw new ArithmeticException("divide by zero");
                    }
                    return hyVar;
                }
                i = 2;
                m5291.m5206(field);
            }
            return null;
        } catch (Throwable th) {
            Object[] objArr4 = new Object[1];
            a(12 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.indexOf("", "") + 9, true, 248 - TextUtils.indexOf("", "", 0, 0), "\u000b\u0006￣\u0011��\u0002\u0007\uffff￬\u000f\u0002\u0001", objArr4);
            String intern = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            b(new int[]{1230459618, -732046614, -1827798924, 884550847, -141992385, 1938405088, 694180168, 1315059238, 1370779455, 818353517, -1284475066, 2018376245, -553338550, 1908331788}, 24 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr5);
            v.m5760(intern, ((String) objArr5[0]).intern(), th);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m5311(hx hxVar, hy hyVar) {
        int i = f2496 + 109;
        f2493 = i % 128;
        try {
            if (i % 2 != 0) {
                return hxVar.mo4612(hyVar);
            }
            hxVar.mo4612(hyVar);
            throw null;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final <T> hy<T> m5312(Object obj, hx hxVar, hr hrVar, List<String> list, int i) {
        hy<T> m5313 = m5313(obj, new hw.d().m5243(true).m5233(hxVar, hrVar, list, i));
        int i2 = f2496 + 109;
        f2493 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m5313;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final <T> hy<T> m5313(Object obj, hw hwVar) {
        long currentTimeMillis = System.currentTimeMillis();
        hw.e m5219 = hwVar.m5219(obj.getClass());
        hu huVar = (hu) this.f2498.get(m5219);
        if (huVar != null) {
            int i = f2496 + 85;
            f2493 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            hy<T> hyVar = (hy) m5296(new Object[]{this, obj, huVar}, 1337179994, -1337179992, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
            if (hyVar != null && m5311(hwVar.m5222(), hyVar)) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                b(new int[]{528768148, 1087442388, -1325737713, 680387417, 1149034332, -757630662, -167360481, 362267859, -192304726, 864161140}, ((byte) KeyEvent.getModifierMetaStateMask()) + 20, objArr);
                sb.append(((String) objArr[0]).intern());
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                Object[] objArr2 = new Object[1];
                a(2 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.getTrimmedLength("") + 2, true, (ViewConfiguration.getPressedStateDuration() >> 16) + 261, "\u0003�", objArr2);
                sb.append(((String) objArr2[0]).intern());
                m5296(new Object[]{hyVar, obj, sb.toString()}, -1838872543, 1838872546, (int) System.currentTimeMillis());
                int i2 = f2493 + 97;
                f2496 = i2 % 128;
                if (i2 % 2 == 0) {
                    return hyVar;
                }
                throw null;
            }
            Object[] objArr3 = new Object[1];
            a(KeyEvent.keyCodeFromString("") + 12, 10 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 248, "\u000b\u0006￣\u0011��\u0002\u0007\uffff￬\u000f\u0002\u0001", objArr3);
            String intern = ((String) objArr3[0]).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            Object[] objArr4 = new Object[1];
            a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, TextUtils.getOffsetAfter("", 0) + 5, true, 239 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u001a\u0007\u0016ￆ￠\u0019\u0019\u000f\u0013ￆ\u000e", objArr4);
            sb2.append(((String) objArr4[0]).intern());
            v.m5763(intern, sb2.toString());
            this.f2498.remove(m5219);
        }
        ia iaVar = new ia(hwVar);
        hy<T> hyVar2 = (hy) m5296(new Object[]{this, obj, iaVar, 0, null}, -55647217, 55647218, 0);
        if (hyVar2 == null) {
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr5 = new Object[1];
            a(TextUtils.getOffsetBefore("", 0) + 13, 5 - ExpandableListView.getPackedPositionGroup(0L), false, TextUtils.getTrimmedLength("") + 240, "\tￅ\u000e\u0013ￅ\u0013\u0014\u0019ￅ\u000b\u0014\u001a\u0013", objArr5);
            sb3.append(((String) objArr5[0]).intern());
            sb3.append(System.currentTimeMillis() - currentTimeMillis);
            Object[] objArr6 = new Object[1];
            a(ImageFormat.getBitsPerPixel(0) + 5, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, true, 224 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\"ￕ￡(", objArr6);
            sb3.append(((String) objArr6[0]).intern());
            sb3.append(iaVar.m5286().size());
            Object[] objArr7 = new Object[1];
            b(new int[]{1103965345, 1022909248, 198587250, -2092081991, 640837621, -1844425783, 440106474, 2026984023}, MotionEvent.axisFromString("") + 16, objArr7);
            sb3.append(((String) objArr7[0]).intern());
            m5296(new Object[]{null, obj, sb3.toString()}, -1838872543, 1838872546, (int) System.currentTimeMillis());
            return null;
        }
        StringBuilder sb4 = new StringBuilder();
        Object[] objArr8 = new Object[1];
        a(9 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 6 - (ViewConfiguration.getJumpTapTimeout() >> 16), false, (-16776976) - Color.rgb(0, 0, 0), "\u0013\tￅ\u000e\u0013ￅ\u000b\u0014\u001a", objArr8);
        sb4.append(((String) objArr8[0]).intern());
        sb4.append(System.currentTimeMillis() - currentTimeMillis);
        Object[] objArr9 = new Object[1];
        a(4 - Color.red(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, true, (ViewConfiguration.getTouchSlop() >> 8) + 224, "\"ￕ￡(", objArr9);
        sb4.append(((String) objArr9[0]).intern());
        sb4.append(iaVar.m5286().size());
        Object[] objArr10 = new Object[1];
        b(new int[]{1103965345, 1022909248, 198587250, -2092081991, 640837621, -1844425783, 440106474, 2026984023}, 15 - (ViewConfiguration.getTouchSlop() >> 8), objArr10);
        sb4.append(((String) objArr10[0]).intern());
        m5296(new Object[]{hyVar2, obj, sb4.toString()}, -1838872543, 1838872546, (int) System.currentTimeMillis());
        this.f2498.put(m5219, iaVar.m5291());
        int i3 = f2496 + 39;
        f2493 = i3 % 128;
        if (i3 % 2 != 0) {
            return hyVar2;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m5314(Object obj, String str) {
        int i = f2496 + 91;
        f2493 = i % 128;
        if (i % 2 != 0) {
            return m5301(obj, obj.getClass(), str);
        }
        m5301(obj, obj.getClass(), str);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m5315(Class cls, String str) {
        int i = f2493 + 57;
        f2496 = i % 128;
        String m5301 = m5301((Object) null, cls, str);
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        int i2 = f2493 + 97;
        f2496 = i2 % 128;
        if (i2 % 2 == 0) {
            return m5301;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final List<hy> m5316(Object obj, hw hwVar) {
        return (List) m5296(new Object[]{this, obj, hwVar}, 1411819898, -1411819894, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m5317(Object obj, List<String> list, int i) {
        ia iaVar = new ia(new hw.d().m5232(true).m5236(true).m5237(-1).m5234(new hx(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ib.3

            /* renamed from: ｋ, reason: contains not printable characters */
            private ib f2499;

            {
                this.f2499 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.hx
            /* renamed from: ﾇ */
            public final boolean mo4612(hy hyVar) {
                return hyVar.mo5267() instanceof String;
            }
        }, list, i));
        iaVar.m5285();
        ArrayList arrayList = new ArrayList(iaVar.m5283());
        f2496 = (f2493 + 13) % 128;
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m5318(Object obj, JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int i = (f2496 + 79) % 128;
        f2493 = i;
        f2496 = (i + 41) % 128;
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            int i3 = f2493 + 95;
            f2496 = i3 % 128;
            if (i3 % 2 != 0) {
                m5314(obj, jSONArray.optString(i2));
                throw null;
            }
            String m5314 = m5314(obj, jSONArray.optString(i2));
            if (m5314 != null) {
                return m5314;
            }
            i2++;
            f2493 = (f2496 + 117) % 128;
        }
        return null;
    }
}
