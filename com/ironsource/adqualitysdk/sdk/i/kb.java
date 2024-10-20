package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.m4;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: kb.class */
public final class kb {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2971 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2972;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int[] f2973;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2974 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2975;

    static {
        m5620();
        KeyEvent.getMaxKeyCode();
        Process.getGidForName("");
        ViewConfiguration.getZoomControlsTimeout();
        ViewConfiguration.getScrollFriction();
        ViewConfiguration.getKeyRepeatDelay();
        ViewConfiguration.getEdgeSlop();
        Color.red(0);
        Process.getElapsedCpuTime();
        TextUtils.getOffsetAfter("", 0);
        ViewConfiguration.getDoubleTapTimeout();
        KeyEvent.keyCodeFromString("");
        ViewConfiguration.getLongPressTimeout();
        TextUtils.indexOf((CharSequence) "", '0');
        TextUtils.indexOf((CharSequence) "", '0', 0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        KeyEvent.keyCodeFromString("");
        f2974 = (f2975 + 83) % 128;
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        int i2;
        if (str != null) {
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        s sVar = new s();
        char[] cArr2 = f2972;
        char[] cArr3 = cArr2;
        if (cArr2 != null) {
            $10 = ($11 + 7) % 128;
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                char c = cArr2[i3];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122714169);
                    if (obj == null) {
                        obj = ((Class) b.m3371(Process.myTid() >> 22, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 41 - View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("j", Integer.TYPE);
                        map.put(122714169, obj);
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
        char c2 = f2971;
        Map map2 = b.f452;
        Object obj2 = map2.get(122714169);
        if (obj2 == null) {
            obj2 = ((Class) b.m3371(ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) TextUtils.indexOf("", ""), 40 - TextUtils.indexOf((CharSequence) "", '0'))).getMethod("j", Integer.TYPE);
            map2.put(122714169, obj2);
        }
        char charValue = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c2))).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i4 = $11 + 99;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                sVar.f3058 = 1;
            } else {
                sVar.f3058 = 0;
            }
            while (true) {
                int i5 = sVar.f3058;
                if (i5 >= i2) {
                    break;
                }
                char c3 = cArr[i5];
                sVar.f3059 = c3;
                char c4 = cArr[i5 + 1];
                sVar.f3055 = c4;
                if (c3 == c4) {
                    cArr5[i5] = (char) (c3 - b);
                    cArr5[i5 + 1] = (char) (c4 - b);
                } else {
                    Map map3 = b.f452;
                    Object obj3 = map3.get(-707600991);
                    if (obj3 == null) {
                        Class cls = (Class) b.m3371(Process.myPid() >> 22, (char) TextUtils.getOffsetBefore("", 0), 40 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        Class<?> cls2 = Integer.TYPE;
                        obj3 = cls.getMethod("o", Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class);
                        map3.put(-707600991, obj3);
                    }
                    int intValue = ((Integer) ((Method) obj3).invoke(null, sVar, sVar, Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), sVar)).intValue();
                    int i6 = sVar.f3054;
                    if (intValue == i6) {
                        $10 = ($11 + 19) % 128;
                        Object obj4 = map3.get(1018245111);
                        if (obj4 == null) {
                            Class cls3 = (Class) b.m3371((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) TextUtils.indexOf("", "", 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 40);
                            Class<?> cls4 = Integer.TYPE;
                            obj4 = cls3.getMethod("l", Object.class, Object.class, cls4, cls4, Object.class, Object.class, cls4, cls4, Object.class, cls4, Object.class);
                            map3.put(1018245111, obj4);
                        }
                        int intValue2 = ((Integer) ((Method) obj4).invoke(null, sVar, sVar, Integer.valueOf(charValue), Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), Integer.valueOf(charValue), sVar, Integer.valueOf(charValue), sVar)).intValue();
                        int i7 = sVar.f3057;
                        int i8 = sVar.f3054;
                        int i9 = sVar.f3058;
                        cArr5[i9] = cArr3[intValue2];
                        cArr5[i9 + 1] = cArr3[(i7 * charValue) + i8];
                    } else {
                        int i10 = sVar.f3056;
                        int i11 = sVar.f3057;
                        if (i10 == i11) {
                            int i12 = ((sVar.f3053 + charValue) - 1) % charValue;
                            sVar.f3053 = i12;
                            int i13 = ((i6 + charValue) - 1) % charValue;
                            sVar.f3054 = i13;
                            int i14 = sVar.f3058;
                            cArr5[i14] = cArr3[(i10 * charValue) + i12];
                            cArr5[i14 + 1] = cArr3[(i11 * charValue) + i13];
                        } else {
                            int i15 = sVar.f3053;
                            int i16 = sVar.f3058;
                            cArr5[i16] = cArr3[(i10 * charValue) + i6];
                            cArr5[i16 + 1] = cArr3[(i11 * charValue) + i15];
                            $10 = ($11 + 71) % 128;
                        }
                    }
                }
                sVar.f3058 += 2;
            }
        }
        int i17 = 0;
        while (i17 < i) {
            int i18 = $10 + 13;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                cArr5[i17] = (char) (cArr5[i17] | 16821);
                i17 += 48;
            } else {
                cArr5[i17] = (char) (cArr5[i17] ^ 13722);
                i17++;
            }
        }
        objArr[0] = new String(cArr5);
    }

    private static void b(int[] iArr, int i, Object[] objArr) {
        m mVar = new m();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f2973;
        int[] iArr3 = iArr2;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr4 = new int[length];
            int i2 = 0;
            while (i2 < length) {
                int i3 = $10 + 3;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = iArr2[i2];
                    try {
                        Map map = b.f452;
                        Object obj = map.get(122833333);
                        if (obj == null) {
                            obj = ((Class) b.m3371((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), ImageFormat.getBitsPerPixel(0) + 42)).getMethod(m4.p, Integer.TYPE);
                            map.put(122833333, obj);
                        }
                        iArr4[i2] = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i4))).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i5 = iArr2[i2];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(122833333);
                    if (obj2 == null) {
                        obj2 = ((Class) b.m3371(TextUtils.indexOf("", ""), (char) KeyEvent.normalizeMetaState(0), 41 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod(m4.p, Integer.TYPE);
                        map2.put(122833333, obj2);
                    }
                    iArr4[i2] = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i5))).intValue();
                    i2++;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = f2973;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            for (int i6 = 0; i6 < length3; i6++) {
                $10 = ($11 + 81) % 128;
                int i7 = iArr6[i6];
                Map map3 = b.f452;
                Object obj3 = map3.get(122833333);
                if (obj3 == null) {
                    obj3 = ((Class) b.m3371(ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 40 - TextUtils.lastIndexOf("", '0', 0, 0))).getMethod(m4.p, Integer.TYPE);
                    map3.put(122833333, obj3);
                }
                iArr7[i6] = ((Integer) ((Method) obj3).invoke(null, Integer.valueOf(i7))).intValue();
            }
            iArr6 = iArr7;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        mVar.f3040 = 0;
        while (true) {
            int i8 = mVar.f3040;
            if (i8 >= iArr.length) {
                String str = new String(cArr2, 0, i);
                $11 = ($10 + 73) % 128;
                objArr[0] = str;
                return;
            }
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
            $10 = ($11 + 27) % 128;
            int i10 = 0;
            while (i10 < 16) {
                int i11 = $11 + 117;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = mVar.f3039 | iArr5[i10];
                    mVar.f3039 = i12;
                    int m5749 = m.m5749(i12);
                    Map map4 = b.f452;
                    Object obj4 = map4.get(10695560);
                    if (obj4 == null) {
                        obj4 = ((Class) b.m3371(ViewConfiguration.getLongPressTimeout() >> 16, (char) ((-1) - MotionEvent.axisFromString("")), TextUtils.indexOf((CharSequence) "", '0') + 42)).getMethod("k", Object.class, Integer.TYPE, Object.class, Object.class);
                        map4.put(10695560, obj4);
                    }
                    int intValue = ((Integer) ((Method) obj4).invoke(null, mVar, Integer.valueOf(m5749), mVar, mVar)).intValue();
                    mVar.f3039 = mVar.f3038;
                    mVar.f3038 = intValue;
                    i10 += 112;
                } else {
                    int i13 = mVar.f3039 ^ iArr5[i10];
                    mVar.f3039 = i13;
                    int m57492 = m.m5749(i13);
                    Map map5 = b.f452;
                    Object obj5 = map5.get(10695560);
                    if (obj5 == null) {
                        obj5 = ((Class) b.m3371(Color.rgb(0, 0, 0) + 16777216, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 40 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).getMethod("k", Object.class, Integer.TYPE, Object.class, Object.class);
                        map5.put(10695560, obj5);
                    }
                    int intValue2 = ((Integer) ((Method) obj5).invoke(null, mVar, Integer.valueOf(m57492), mVar, mVar)).intValue();
                    mVar.f3039 = mVar.f3038;
                    mVar.f3038 = intValue2;
                    i10++;
                }
            }
            int i14 = mVar.f3039;
            int i15 = mVar.f3038;
            mVar.f3039 = i15;
            mVar.f3038 = i14;
            int i16 = i14 ^ iArr5[16];
            mVar.f3038 = i16;
            int i17 = i15 ^ iArr5[17];
            mVar.f3039 = i17;
            cArr[0] = (char) (i17 >>> 16);
            cArr[1] = (char) i17;
            cArr[2] = (char) (i16 >>> 16);
            cArr[3] = (char) i16;
            m.m5748(iArr5);
            int i18 = mVar.f3040;
            cArr2[i18 * 2] = cArr[0];
            cArr2[(i18 * 2) + 1] = cArr[1];
            cArr2[(i18 * 2) + 2] = cArr[2];
            cArr2[(i18 * 2) + 3] = cArr[3];
            Map map6 = b.f452;
            Object obj6 = map6.get(1365438799);
            if (obj6 == null) {
                obj6 = ((Class) b.m3371(((byte) KeyEvent.getModifierMetaStateMask()) + 1, (char) ExpandableListView.getPackedPositionType(0L), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 40)).getMethod("m", Object.class, Object.class);
                map6.put(1365438799, obj6);
            }
            ((Method) obj6).invoke(null, mVar, mVar);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static String m5619() {
        f2975 = (f2974 + 43) % 128;
        try {
            Object[] objArr = new Object[1];
            b(new int[]{808145851, -1331896450, 1945783941, 1627753784, -1394943561, 437250212, 1848973152, 2022442799, -1604687958, -851635338, 627428705, -2104619091, -593146028, -1048143898, 915016090, 688299875}, 30 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
            Class.forName(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a((byte) (View.resolveSize(0, 0) + 13), "㗼", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr2);
            String intern = ((String) objArr2[0]).intern();
            int i = f2975 + 67;
            f2974 = i % 128;
            if (i % 2 != 0) {
                return intern;
            }
            throw null;
        } catch (ClassNotFoundException e) {
            try {
                Object[] objArr3 = new Object[1];
                b(new int[]{808145851, -1331896450, 2100060187, 1989769210, -161483438, 2082879898, 1286046154, -1713472577, -1806917207, 224880552, 884937514, -2045937027, 2065771925, 288735401, 2065771925, 288735401, 233133532, -1961909984, -107935663, -653724905, 1958656625, -2124632241, -1727222767, 1117622039, -1812412570, 1784576591, -753121439, 295618565, 333574883, 1592237836}, 60 - KeyEvent.getDeadChar(0, 0), objArr3);
                Class.forName(((String) objArr3[0]).intern());
                Object[] objArr4 = new Object[1];
                a((byte) (88 - (ViewConfiguration.getTouchSlop() >> 8)), "㙓", 1 - TextUtils.getOffsetBefore("", 0), objArr4);
                return ((String) objArr4[0]).intern();
            } catch (ClassNotFoundException e2) {
                Object[] objArr5 = new Object[1];
                a((byte) (8 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "㗻", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr5);
                return ((String) objArr5[0]).intern();
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m5620() {
        f2971 = (char) 44288;
        f2972 = new char[]{39163, 39145, 39683, 39685, 39165, 39090, 39167, 39100, 39161, 39695, 39144, 39160, 39135, 39680, 39159, 39155, 39152, 39684, 39151, 39686, 39078, 39158, 39133, 39099, 39162, 39682, 39150, 39681, 39153, 39694, 39154, 39146, 39148, 39687, 39157, 39113};
        f2973 = new int[]{-2000112468, 861926972, 2056718953, -918043683, -703746138, -118807721, 1833631699, -417917580, 1894888256, -602128457, -2098549786, 982485624, 937743069, -1113032519, -2085485288, -89217500, 1784788298, -1916436110};
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m5621(Context context, JSONObject jSONObject) {
        Object[] objArr = new Object[1];
        a((byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 94), "\u0014\"!\u001e\u0010\u0004\f\u0016", View.resolveSizeAndState(0, 0, 0) + 8, objArr);
        String intern = ((String) objArr[0]).intern();
        String packageName = context.getPackageName();
        try {
            Object[] objArr2 = new Object[1];
            a((byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 81), "!\u001f", 2 - Drawable.resolveOpacity(0, 0), objArr2);
            jSONObject.put(((String) objArr2[0]).intern(), packageName);
            f2975 = (f2974 + 3) % 128;
        } catch (JSONException e) {
            Object[] objArr3 = new Object[1];
            b(new int[]{-503159220, -1069256187, 1436942026, 1767506149, -2061457622, 1357941588, -631391053, 3095535, -794619281, -333478174, 480348908, 1668506085, 1957880302, -1365943045, -2012836426, 1108120489, 606693087, -1900179148}, 35 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
            v.m5760(intern, ((String) objArr3[0]).intern(), e);
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            Object[] objArr4 = new Object[1];
            b(new int[]{-21280116, 695394842}, 2 - ExpandableListView.getPackedPositionGroup(0L), objArr4);
            jSONObject.put(((String) objArr4[0]).intern(), packageManager.getInstallerPackageName(packageName));
        } catch (JSONException e2) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr5 = new Object[1];
            b(new int[]{-503159220, -1069256187, 1436942026, 1767506149, -2061457622, 1357941588, 212061143, 731426247, -1598548082, 801785892, -1799578896, -291984654, 472303970, 1692927663, 477790616, -824702923, 820459560, 814276249, -861705686, 1993993244, -1985801501, 2091993955, 1858495722, -1174803657, 1544582377, 2133863202}, 52 - (ViewConfiguration.getTapTimeout() >> 16), objArr5);
            sb.append(((String) objArr5[0]).intern());
            sb.append(e2.getLocalizedMessage());
            v.m5753(intern, sb.toString());
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            Object[] objArr6 = new Object[1];
            a((byte) (119 - Color.green(0)), "\u001e\u0007", 2 - ExpandableListView.getPackedPositionGroup(0L), objArr6);
            jSONObject.put(((String) objArr6[0]).intern(), Integer.toString(packageInfo.versionCode));
            Object[] objArr7 = new Object[1];
            a((byte) (59 - (ViewConfiguration.getPressedStateDuration() >> 16)), " \u001f", TextUtils.indexOf("", "", 0) + 2, objArr7);
            jSONObject.put(((String) objArr7[0]).intern(), packageInfo.versionName);
            f2974 = (f2975 + 113) % 128;
        } catch (PackageManager.NameNotFoundException e3) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr8 = new Object[1];
            a((byte) (92 - TextUtils.indexOf("", "", 0, 0)), "\r\u0010\u0004\r\u0006#\u0016\u000b\u0006\u0001\t\u000b\b\u001f��\n\u0010\u0002\u0002\u0006\n\u0019��\"\u0005\u0001\u000e \u0006\u0019\u000e\u001b㘖", 33 - KeyEvent.getDeadChar(0, 0), objArr8);
            sb2.append(((String) objArr8[0]).intern());
            sb2.append(packageName);
            Object[] objArr9 = new Object[1];
            b(new int[]{1756173852, 1909603781, -1574031515, -1840180700, -384099473, 1332836412}, 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr9);
            sb2.append(((String) objArr9[0]).intern());
            sb2.append(e3.getLocalizedMessage());
            v.m5753(intern, sb2.toString());
        } catch (JSONException e4) {
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr10 = new Object[1];
            a((byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 67), "\r\u0010\u0004\r\u0006#\u0016\u000b\n\u0001㙁㙁\n\u0001㘭㘭\r\u0001\u000e \u0016\u001e\f!\n\u001f��\u001e\r\t\t\u0010\t\u0013\u0015\f#��\b\t㘫㘫\u000e\u001b\u0013\b", 46 - (Process.myTid() >> 22), objArr10);
            sb3.append(((String) objArr10[0]).intern());
            sb3.append(e4.getLocalizedMessage());
            v.m5753(intern, sb3.toString());
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            Object[] objArr11 = new Object[1];
            b(new int[]{-722398122, -2116839427}, 2 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr11);
            jSONObject.put(((String) objArr11[0]).intern(), packageManager.getApplicationLabel(applicationInfo).toString());
        } catch (PackageManager.NameNotFoundException e5) {
            StringBuilder sb4 = new StringBuilder();
            Object[] objArr12 = new Object[1];
            a((byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 92), "\r\u0010\u0004\r\u0006#\u0016\u000b\u0006\u0001\t\u000b\b\u001f��\n\u0010\u0002\u0002\u0006\n\u0019��\"\u0005\u0001\u000e \u0006\u0019\u000e\u001b㘖", 33 - (ViewConfiguration.getEdgeSlop() >> 16), objArr12);
            sb4.append(((String) objArr12[0]).intern());
            sb4.append(packageName);
            Object[] objArr13 = new Object[1];
            b(new int[]{1756173852, 1909603781, -1574031515, -1840180700, -384099473, 1332836412}, ExpandableListView.getPackedPositionGroup(0L) + 10, objArr13);
            sb4.append(((String) objArr13[0]).intern());
            sb4.append(e5.getLocalizedMessage());
            v.m5753(intern, sb4.toString());
        } catch (JSONException e6) {
            StringBuilder sb5 = new StringBuilder();
            Object[] objArr14 = new Object[1];
            b(new int[]{-503159220, -1069256187, 1436942026, 1767506149, -2061457622, 1357941588, -926591926, 145037374, 784835352, -2057607040, 1199459922, 374679318, 1957880302, -1365943045, -2012836426, 1108120489, 1385617472, -372267975, 1252551804, 185052786, 2141609970, -484072189}, (-16777173) - Color.rgb(0, 0, 0), objArr14);
            sb5.append(((String) objArr14[0]).intern());
            sb5.append(e6.getLocalizedMessage());
            v.m5753(intern, sb5.toString());
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m5622(Context context, String str) {
        int i = f2975 + 65;
        f2974 = i % 128;
        if (i % 2 == 0) {
            context.checkCallingOrSelfPermission(str);
            throw null;
        }
        if (context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        int i2 = f2975 + 11;
        f2974 = i2 % 128;
        if (i2 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5623(Context context) {
        PackageInfo packageInfo;
        int i = f2975 + 65;
        f2974 = i % 128;
        try {
            if (i % 2 == 0) {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                packageInfo = packageManager.getPackageInfo(packageName, 0);
                context = packageName;
            } else {
                PackageManager packageManager2 = context.getPackageManager();
                String packageName2 = context.getPackageName();
                packageInfo = packageManager2.getPackageInfo(packageName2, 0);
                context = packageName2;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Object[] objArr = new Object[1];
            a((byte) (TextUtils.indexOf("", "", 0, 0) + 95), "\u0014\"!\u001e\u0010\u0004\f\u0016", 8 - Color.red(0), objArr);
            String intern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a((byte) (TextUtils.getCapsMode("", 0, 0) + 92), "\r\u0010\u0004\r\u0006#\u0016\u000b\u0006\u0001\t\u000b\b\u001f��\n\u0010\u0002\u0002\u0006\n\u0019��\"\u0005\u0001\u000e \u0006\u0019\u000e\u001b㘖", (-16777183) - Color.rgb(0, 0, 0), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append((String) context);
            Object[] objArr3 = new Object[1];
            b(new int[]{1756173852, 1909603781, -1574031515, -1840180700, -384099473, 1332836412}, 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(e.getLocalizedMessage());
            v.m5753(intern, sb.toString());
            return null;
        }
    }
}
