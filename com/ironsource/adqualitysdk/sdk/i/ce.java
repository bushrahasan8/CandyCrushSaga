package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import com.ironsource.adqualitysdk.sdk.i.bm;
import com.ironsource.m4;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJAdUnit;
import com.tapjoy.TJAdUnitActivity;
import com.tapjoy.TJAdUnitJSBridge;
import com.tapjoy.TJAwardCurrencyListener;
import com.tapjoy.TJContentActivity;
import com.tapjoy.TJCurrency;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementData;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.TJSplitWebView;
import com.tapjoy.TJVideoListener;
import com.tapjoy.TJWebView;
import com.tapjoy.Tapjoy;
import com.tapjoy.mraid.view.ActionHandler;
import com.tapjoy.mraid.view.Browser;
import com.tapjoy.mraid.view.MraidView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: ce.class */
public final class ce extends bm {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1218 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1219;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1220;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f1221;

    static {
        m4186();
        ViewConfiguration.getDoubleTapTimeout();
        AndroidCharacter.getMirror('0');
        Color.rgb(0, 0, 0);
        TextUtils.getTrimmedLength("");
        SystemClock.uptimeMillis();
        Color.red(0);
        Process.getThreadPriority(0);
        ViewConfiguration.getJumpTapTimeout();
        AudioTrack.getMaxVolume();
        AudioTrack.getMaxVolume();
        ViewConfiguration.getPressedStateDuration();
        SystemClock.currentThreadTimeMillis();
        TextUtils.indexOf("", "");
        Process.getGidForName("");
        Color.argb(0, 0, 0, 0);
        KeyEvent.getModifierMetaStateMask();
        Color.argb(0, 0, 0, 0);
        TextUtils.indexOf("", "");
        ViewConfiguration.getFadingEdgeLength();
        View.getDefaultSize(0, 0);
        KeyEvent.normalizeMetaState(0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        SystemClock.elapsedRealtime();
        Process.getGidForName("");
        TextUtils.getTrimmedLength("");
        ViewConfiguration.getTapTimeout();
        ViewConfiguration.getScrollBarFadeDuration();
        TextUtils.indexOf("", "", 0, 0);
        Color.red(0);
        AndroidCharacter.getMirror('0');
        ExpandableListView.getPackedPositionType(0L);
        SystemClock.elapsedRealtime();
        Gravity.getAbsoluteGravity(0, 0);
        ViewConfiguration.getDoubleTapTimeout();
        ExpandableListView.getPackedPositionForGroup(0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        TextUtils.getOffsetBefore("", 0);
        Color.alpha(0);
        ViewConfiguration.getScrollBarSize();
        ViewConfiguration.getGlobalActionKeyTimeout();
        Process.getThreadPriority(0);
        ExpandableListView.getPackedPositionChild(0L);
        KeyEvent.keyCodeFromString("");
        ViewConfiguration.getTapTimeout();
        KeyEvent.getMaxKeyCode();
        Color.red(0);
        Gravity.getAbsoluteGravity(0, 0);
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getWindowTouchSlop();
        View.getDefaultSize(0, 0);
        View.MeasureSpec.getMode(0);
        Color.rgb(0, 0, 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        TextUtils.lastIndexOf("", '0', 0, 0);
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getScrollFriction();
        ImageFormat.getBitsPerPixel(0);
        ViewConfiguration.getTapTimeout();
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getEdgeSlop();
        ViewConfiguration.getLongPressTimeout();
        Color.argb(0, 0, 0, 0);
        KeyEvent.keyCodeFromString("");
        Color.blue(0);
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getMaximumFlingVelocity();
        Color.blue(0);
        int i = f1220 + 55;
        f1218 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ce(String str) {
        super(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r7, int r8, boolean r9, int r10, java.lang.String r11, java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ce.a(int, int, boolean, int, java.lang.String, java.lang.Object[]):void");
    }

    private static void b(int[] iArr, int i, Object[] objArr) {
        int[] iArr2;
        m mVar = new m();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f1221;
        int[] iArr4 = iArr3;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr5 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                $11 = ($10 + 53) % 128;
                int i3 = iArr3[i2];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122833333);
                    if (obj == null) {
                        obj = ((Class) b.m3371(Color.alpha(0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 42)).getMethod(m4.p, Integer.TYPE);
                        map.put(122833333, obj);
                    }
                    iArr5[i2] = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i3))).intValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr5;
        }
        int length2 = iArr4.length;
        int[] iArr6 = new int[length2];
        int[] iArr7 = f1221;
        if (iArr7 != null) {
            int length3 = iArr7.length;
            int[] iArr8 = new int[length3];
            int i4 = 0;
            while (i4 < length3) {
                int i5 = $11 + 55;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = iArr7[i4];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(122833333);
                    if (obj2 == null) {
                        obj2 = ((Class) b.m3371(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) (ViewConfiguration.getTapTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 41)).getMethod(m4.p, Integer.TYPE);
                        map2.put(122833333, obj2);
                    }
                    iArr8[i4] = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i6))).intValue();
                    i4 >>>= 1;
                } else {
                    int i7 = iArr7[i4];
                    Map map3 = b.f452;
                    Object obj3 = map3.get(122833333);
                    if (obj3 == null) {
                        obj3 = ((Class) b.m3371((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 40 - TextUtils.lastIndexOf("", '0'))).getMethod(m4.p, Integer.TYPE);
                        map3.put(122833333, obj3);
                    }
                    iArr8[i4] = ((Integer) ((Method) obj3).invoke(null, Integer.valueOf(i7))).intValue();
                    i4++;
                }
            }
            iArr2 = iArr8;
        } else {
            iArr2 = iArr7;
        }
        System.arraycopy(iArr2, 0, iArr6, 0, length2);
        mVar.f3040 = 0;
        while (true) {
            int i8 = mVar.f3040;
            if (i8 >= iArr.length) {
                String str = new String(cArr2, 0, i);
                $11 = ($10 + 63) % 128;
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
            m.m5748(iArr6);
            for (int i10 = 0; i10 < 16; i10++) {
                int i11 = mVar.f3039 ^ iArr6[i10];
                mVar.f3039 = i11;
                int m5749 = m.m5749(i11);
                Map map4 = b.f452;
                Object obj4 = map4.get(10695560);
                if (obj4 == null) {
                    obj4 = ((Class) b.m3371(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 42)).getMethod("k", Object.class, Integer.TYPE, Object.class, Object.class);
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
                obj5 = ((Class) b.m3371(ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), TextUtils.getTrimmedLength("") + 41)).getMethod("m", Object.class, Object.class);
                map5.put(1365438799, obj5);
            }
            ((Method) obj5).invoke(null, mVar, mVar);
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static TJPlacementVideoListener m4178(TJPlacement tJPlacement) {
        int i = f1220 + 65;
        f1218 = i % 128;
        if (i % 2 != 0) {
            return tJPlacement.getVideoListener();
        }
        tJPlacement.getVideoListener();
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static String m4179(TJPlacementData tJPlacementData) {
        f1218 = (f1220 + 117) % 128;
        String httpResponse = tJPlacementData.getHttpResponse();
        int i = f1220 + 63;
        f1218 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return httpResponse;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ TJPlacementVideoListener m4180(TJPlacement tJPlacement) {
        f1220 = (f1218 + 11) % 128;
        TJPlacementVideoListener m4178 = m4178(tJPlacement);
        int i = f1218 + 17;
        f1220 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m4178;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m4181(TJPlacementData tJPlacementData) {
        f1220 = (f1218 + 97) % 128;
        String str = (String) m4193(new Object[]{tJPlacementData}, -906050102, 906050103, (int) System.currentTimeMillis());
        f1218 = (f1220 + 65) % 128;
        return str;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ Object m4182(Object[] objArr) {
        TJPlacementData tJPlacementData = (TJPlacementData) objArr[0];
        f1218 = (f1220 + 9) % 128;
        String m4194 = m4194(tJPlacementData);
        int i = f1220 + 53;
        f1218 = i % 128;
        if (i % 2 != 0) {
            return m4194;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m4183(TJPlacement tJPlacement) {
        f1220 = (f1218 + 91) % 128;
        String name = tJPlacement.getName();
        f1220 = (f1218 + 99) % 128;
        return name;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ String m4184(TJPlacementData tJPlacementData) {
        f1220 = (f1218 + 59) % 128;
        String m4179 = m4179(tJPlacementData);
        f1220 = (f1218 + 13) % 128;
        return m4179;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m4185(TJSplitWebView tJSplitWebView) {
        int i = f1218 + 5;
        f1220 = i % 128;
        String lastUrl = tJSplitWebView.getLastUrl();
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        f1220 = (f1218 + 9) % 128;
        return lastUrl;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m4186() {
        f1219 = 287397517;
        f1221 = new int[]{-2119781862, -752867114, -1212735991, 1743897506, -855981686, 1288495356, 1969491609, 271691412, -254236750, -99291761, -1705068787, -212441288, 510387777, -601221719, -736788807, -1361222088, 1988957282, 939222375};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m4187(Object[] objArr) {
        boolean z = 21;
        String str = (String) objArr[1];
        int i = f1218 + 35;
        f1220 = i % 128;
        if (i % 2 != 0) {
            str.hashCode();
            throw null;
        }
        switch (str.hashCode()) {
            case -1983375197:
                Object[] objArr2 = new Object[1];
                a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, MotionEvent.axisFromString("") + 14, false, 260 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\uffdd\uffff\u0010\u0005\u000b\n￮\u0001\r\u0011\u0001\u000f\u0010\ufff0￦", objArr2);
                if (str.equals(((String) objArr2[0]).intern())) {
                    f1220 = (f1218 + 15) % 128;
                    z = 22;
                    break;
                }
                z = -1;
                break;
            case -1687314074:
                Object[] objArr3 = new Object[1];
                a(29 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2, false, 259 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0002\u000f��\f\nￋ\u0011\ufffe\r\u0007\f\u0016ￋ\n\u000f\ufffe\u0006\u0001ￋ\u0013\u0006\u0002\u0014ￋ\uffdf\u000f\f\u0014\u0010", objArr3);
                if (str.equals(((String) objArr3[0]).intern())) {
                    f1220 = (f1218 + 113) % 128;
                    z = 8;
                    break;
                }
                z = -1;
                break;
            case -1640254126:
                Object[] objArr4 = new Object[1];
                b(new int[]{-1290839894, -1544740817, 1822498156, 1332829037, 39591308, 261700354, -1875004608, 701134910, -1743014973, 553826442}, 17 - (ViewConfiguration.getTouchSlop() >> 8), objArr4);
                if (str.equals(((String) objArr4[0]).intern())) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case -1628534628:
                Object[] objArr5 = new Object[1];
                a(9 - TextUtils.indexOf("", ""), 6 - TextUtils.indexOf("", "", 0), false, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 260, "\u0005��\ufff2\u0005\u0001\u0013￩\u000e�", objArr5);
                if (str.equals(((String) objArr5[0]).intern())) {
                    z = 9;
                    break;
                }
                z = -1;
                break;
            case -1429063965:
                Object[] objArr6 = new Object[1];
                a((ViewConfiguration.getLongPressTimeout() >> 16) + 19, (ViewConfiguration.getWindowTouchSlop() >> 8) + 15, true, View.combineMeasuredStates(0, 0) + 260, "\u0010\u000f\u0005￨\u0010\n\u0001\t\u0001\uffff�\b￬￦\ufff0\u000e\u0001\n\u0001", objArr6);
                if (str.equals(((String) objArr6[0]).intern())) {
                    z = 14;
                    break;
                }
                z = -1;
                break;
            case -1414965228:
                Object[] objArr7 = new Object[1];
                a(((byte) KeyEvent.getModifierMetaStateMask()) + 14, AndroidCharacter.getMirror('0') - '/', true, 260 - (ViewConfiguration.getPressedStateDuration() >> 16), "\uffdd\u000e\u0001\b��\n�￤\n\u000b\u0005\u0010\uffff", objArr7);
                if (str.equals(((String) objArr7[0]).intern())) {
                    z = 5;
                    break;
                }
                z = -1;
                break;
            case -1147119309:
                Object[] objArr8 = new Object[1];
                a(20 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17, false, (ViewConfiguration.getLongPressTimeout() >> 16) + 256, "\rￎ\u0014\u0001\u0010\n\u000f\u0019ￎ\ufff4￪\ufff7\u0005\u0002\ufff6\t\u0005\u0017\u0003\u000f", objArr8);
                if (str.equals(((String) objArr8[0]).intern())) {
                    z = 12;
                    break;
                }
                z = -1;
                break;
            case -872754855:
                Object[] objArr9 = new Object[1];
                b(new int[]{158829809, 968331148, 138915505, -462369153, -130268615, 120103675, -2021071853, -1714292411}, (KeyEvent.getMaxKeyCode() >> 16) + 15, objArr9);
                if (str.equals(((String) objArr9[0]).intern())) {
                    z = 4;
                    break;
                }
                z = -1;
                break;
            case -721136035:
                b(new int[]{-495831853, 522233144, 1260821111, -432721626}, 7 - ImageFormat.getBitsPerPixel(0), new Object[1]);
                if (!(!str.equals(((String) r0[0]).intern()))) {
                    z = 13;
                    break;
                }
                z = -1;
                break;
            case -668579974:
                Object[] objArr10 = new Object[1];
                b(new int[]{500257770, 2142052332, 708680840, 661980389, -2109633792, -784938590, 2086270528, -503839739, -620796774, 1893057513, 1988612752, 1643350607, 1612976328, 2146325813, -851110723, 1273898891}, 31 - (Process.myPid() >> 22), objArr10);
                if (str.equals(((String) objArr10[0]).intern())) {
                    f1220 = (f1218 + 113) % 128;
                    z = 10;
                    break;
                }
                z = -1;
                break;
            case -593336436:
                Object[] objArr11 = new Object[1];
                a(MotionEvent.axisFromString("") + 24, 2 - Process.getGidForName(""), true, 261 - Color.blue(0), "ￜ￥\uffef\r��\t��\u000f\u000e\u0004\uffe7\u0014\ufffe\t��\r\r\u0010\uffde\uffff\r￼\u0012", objArr11);
                if (str.equals(((String) objArr11[0]).intern())) {
                    z = 23;
                    break;
                }
                z = -1;
                break;
            case -217417742:
                Object[] objArr12 = new Object[1];
                b(new int[]{500257770, 2142052332, 708680840, 661980389, -2109633792, -784938590, 2086270528, -503839739, -620796774, 1893057513, -1055605733, 1488318527, 1546846255, 1022226690, 1913164343, -1558299679, -327162105, -1884083198}, 35 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr12);
                if (str.equals(((String) objArr12[0]).intern())) {
                    z = 6;
                    break;
                }
                z = -1;
                break;
            case 178410181:
                Object[] objArr13 = new Object[1];
                a((ViewConfiguration.getEdgeSlop() >> 16) + 25, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23, false, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 258, "\r\u000bￌ\u0012\uffff\u000e\b\r\u0017ￌ\ufff2￨\ufff1\u000e\n\u0007\u0012\ufff5\u0003��\ufff4\u0007\u0003\u0015\u0001", objArr13);
                if (str.equals(((String) objArr13[0]).intern())) {
                    z = 25;
                    break;
                }
                z = -1;
                break;
            case 206635148:
                Object[] objArr14 = new Object[1];
                a(16 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 7 - TextUtils.indexOf("", "", 0, 0), false, (ViewConfiguration.getPressedStateDuration() >> 16) + 259, "��\u0011\u0006\u0013\u0006\u0011\u0016\ufff1\uffe7\uffde\u0001\ufff2\u000b\u0006\u0011\uffde", objArr14);
                if (str.equals(((String) objArr14[0]).intern())) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case 268330895:
                Object[] objArr15 = new Object[1];
                a((ViewConfiguration.getEdgeSlop() >> 16) + 16, 12 - TextUtils.indexOf("", "", 0, 0), true, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 253, "\u0016￦\ufff7￮\u0018\r\u0012\ufff9\b￥￮\ufff8\t\u000b\b\r", objArr15);
                if (str.equals(((String) objArr15[0]).intern())) {
                    z = 19;
                    break;
                }
                z = -1;
                break;
            case 327820672:
                Object[] objArr16 = new Object[1];
                a(KeyEvent.keyCodeFromString("") + 24, 1 - (ViewConfiguration.getTouchSlop() >> 8), true, AndroidCharacter.getMirror('0') + 212, "\ufff0\u000e\u0001\n\u0001\u0010\u000f\u0005￨\u000b\u0001��\u0005\ufff2\u0010\n\u0001\t\u0001\uffff�\b￬￦", objArr16);
                if (str.equals(((String) objArr16[0]).intern())) {
                    z = 18;
                    break;
                }
                z = -1;
                break;
            case 705136807:
                Object[] objArr17 = new Object[1];
                b(new int[]{799378052, -686531655, 803498761, -2022391299, 76592479, -1209765330}, ImageFormat.getBitsPerPixel(0) + 11, objArr17);
                if (str.equals(((String) objArr17[0]).intern())) {
                    z = 20;
                    break;
                }
                z = -1;
                break;
            case 741045788:
                Object[] objArr18 = new Object[1];
                b(new int[]{500257770, 2142052332, 708680840, 661980389, 994781268, -2132621128, -41120919, -691459732, 1269043665, 553271432, 483239413, -699137882, -117754445, -1667215553}, 27 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr18);
                if (str.equals(((String) objArr18[0]).intern())) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case 832039888:
                b(new int[]{-495831853, 522233144, 1260821111, -432721626, -705646583, -2043155344, -246288477, 1764796080, 623571396, 601963214, -1927275087, 1070459420}, View.resolveSizeAndState(0, 0, 0) + 23, new Object[1]);
                if (!(!str.equals(((String) r0[0]).intern()))) {
                    f1218 = (f1220 + 125) % 128;
                    z = 16;
                    break;
                }
                z = -1;
                break;
            case 906946425:
                Object[] objArr19 = new Object[1];
                b(new int[]{1807340582, 1972257859, -758240470, -534092232, 623571396, 601963214, -1927275087, 1070459420}, 15 - Drawable.resolveOpacity(0, 0), objArr19);
                if (str.equals(((String) objArr19[0]).intern())) {
                    z = 15;
                    break;
                }
                z = -1;
                break;
            case 1317517621:
                Object[] objArr20 = new Object[1];
                b(new int[]{800637390, -1335117100, 660118875, -887758623, -1590112365, -827241223, -1206985502, 484918196}, TextUtils.lastIndexOf("", '0', 0, 0) + 15, objArr20);
                if (str.equals(((String) objArr20[0]).intern())) {
                    z = 24;
                    break;
                }
                z = -1;
                break;
            case 1504750787:
                Object[] objArr21 = new Object[1];
                a(View.MeasureSpec.getMode(0) + 9, TextUtils.getCapsMode("", 0, 0) + 8, false, 255 - TextUtils.indexOf("", "", 0), "￫\ufff8\u0006\u0003\ufff7\n\u0006\u0018\ufff5", objArr21);
                if (str.equals(((String) objArr21[0]).intern())) {
                    z = 11;
                    break;
                }
                z = -1;
                break;
            case 1519750415:
                Object[] objArr22 = new Object[1];
                b(new int[]{158829809, 968331148, 138915505, -462369153, 1241934982, 1043272216}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, objArr22);
                if (str.equals(((String) objArr22[0]).intern())) {
                    int i2 = f1218 + 79;
                    f1220 = i2 % 128;
                    if (i2 % 2 != 0) {
                        z = 74;
                        break;
                    }
                }
                z = -1;
                break;
            case 1815593736:
                Object[] objArr23 = new Object[1];
                a(7 - (ViewConfiguration.getPressedStateDuration() >> 16), 2 - TextUtils.lastIndexOf("", '0', 0), false, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 264, "\n￼\t\uffd9\t\u0006\u000e", objArr23);
                if (str.equals(((String) objArr23[0]).intern())) {
                    z = 7;
                    break;
                }
                z = -1;
                break;
            case 1891461874:
                Object[] objArr24 = new Object[1];
                b(new int[]{-495831853, 522233144, 1260821111, -432721626, 2047087300, -352521477, 329135444, -653862374, 2134615824, 1936775503, -1912489975, 338987169}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 21, objArr24);
                if (str.equals(((String) objArr24[0]).intern())) {
                    z = 17;
                    break;
                }
                z = -1;
                break;
            case 2041573826:
                Object[] objArr25 = new Object[1];
                b(new int[]{500257770, 2142052332, 708680840, 661980389, 994781268, -2132621128, -231971198, -992199536, -493740640, 973202851, -1057031425, 1832636434, 1374368755, -1431752095}, Drawable.resolveOpacity(0, 0) + 28, objArr25);
                if (str.equals(((String) objArr25[0]).intern())) {
                    f1220 = (f1218 + 17) % 128;
                    z = 3;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
            case false:
            case true:
                return TJAdUnitActivity.class;
            case true:
            case true:
                return TJContentActivity.class;
            case true:
                return TJPlacementData.class;
            case true:
            case true:
                return ActionHandler.class;
            case true:
            case true:
                return Browser.class;
            case true:
            case true:
                return MraidView.class;
            case true:
            case true:
                return TJWebView.class;
            case true:
                return TJAdUnit.class;
            case true:
                return TJPlacementListener.class;
            case true:
                return TJVideoListener.class;
            case true:
                return TJAdUnit.TJAdUnitWebViewListener.class;
            case true:
                return TJAdUnit.TJAdUnitVideoListener.class;
            case true:
                return TJPlacementVideoListener.class;
            case true:
                return TJAdUnitJSBridge.class;
            case true:
                return TJCurrency.class;
            case true:
                return TJPlacement.class;
            case true:
                return TJActionRequest.class;
            case true:
                return TJAwardCurrencyListener.class;
            case true:
            case VIEW_NOT_VISIBLE_ON_PLAY_VALUE:
                return TJSplitWebView.class;
            default:
                return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m4188(TJPlacement tJPlacement) {
        f1220 = (f1218 + 79) % 128;
        String m4183 = m4183(tJPlacement);
        f1218 = (f1220 + 85) % 128;
        return m4183;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ String m4189(TJSplitWebView tJSplitWebView) {
        int i = f1220 + 25;
        f1218 = i % 128;
        if (i % 2 != 0) {
            return m4185(tJSplitWebView);
        }
        m4185(tJSplitWebView);
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static TJPlacementListener m4190(TJPlacement tJPlacement) {
        f1218 = (f1220 + 53) % 128;
        TJPlacementListener listener = tJPlacement.getListener();
        int i = f1218 + 21;
        f1220 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return listener;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m4191(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        f1218 = (f1220 + 89) % 128;
        tJPlacement.setVideoListener(tJPlacementVideoListener);
        int i = f1218 + 91;
        f1220 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ TJPlacementListener m4192(TJPlacement tJPlacement) {
        f1218 = (f1220 + 5) % 128;
        TJPlacementListener m4190 = m4190(tJPlacement);
        f1220 = (f1218 + 69) % 128;
        return m4190;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m4193(Object[] objArr, int i, int i2, int i3) {
        Object placementName;
        int i4 = i2 ^ (-1);
        int i5 = i4 | i;
        int i6 = (i * (-129)) + (i2 * 131) + (((((i3 ^ (-1)) | i4) | i) ^ (-1)) * 130) + ((i5 ^ (-1)) * (-260)) + (((((i ^ (-1)) | i2) ^ (-1)) | ((i5 | i3) ^ (-1))) * 130);
        if (i6 != 1) {
            placementName = i6 != 2 ? m4182(objArr) : m4187(objArr);
        } else {
            TJPlacementData tJPlacementData = (TJPlacementData) objArr[0];
            f1218 = (f1220 + 83) % 128;
            placementName = tJPlacementData.getPlacementName();
            f1218 = (f1220 + 15) % 128;
        }
        return placementName;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m4194(TJPlacementData tJPlacementData) {
        f1220 = (f1218 + 63) % 128;
        String url = tJPlacementData.getUrl();
        int i = f1220 + 79;
        f1218 = i % 128;
        if (i % 2 != 0) {
            return url;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m4195(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i = f1218 + 65;
        f1220 = i % 128;
        m4191(tJPlacement, tJPlacementVideoListener);
        if (i % 2 != 0) {
            throw null;
        }
        int i2 = f1218 + 73;
        f1220 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Class mo3627(String str) {
        return (Class) m4193(new Object[]{this, str}, -165417408, 165417410, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Map mo3628() {
        HashMap hashMap = new HashMap();
        Object[] objArr = new Object[1];
        a(15 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16), true, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 260, "￩\u000f\t��\b��\ufffe￼\u0007￫\u000f��\u0002��\b￼", objArr);
        hashMap.put(((String) objArr[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.1

            /* renamed from: ﻐ, reason: contains not printable characters */
            private ce f1222;

            {
                this.f1222 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ce.m4181((TJPlacementData) list.get(0));
            }
        });
        Object[] objArr2 = new Object[1];
        b(new int[]{85908422, -35586002, -33436149, -2075049562}, (Process.myTid() >> 22) + 6, objArr2);
        hashMap.put(((String) objArr2[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.3

            /* renamed from: ｋ, reason: contains not printable characters */
            private ce f1224;

            {
                this.f1224 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return (String) ce.m4193(new Object[]{(TJPlacementData) list.get(0)}, 1421130226, -1421130226, (int) System.currentTimeMillis());
            }
        });
        Object[] objArr3 = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) + 15, 3 - (Process.myPid() >> 22), true, 265 - KeyEvent.normalizeMetaState(0), "\u000b￼\ufffe￼\n\u0005\u0006\u0007\n￼￩\u0007\u000b\u000b\uffdf", objArr3);
        hashMap.put(((String) objArr3[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.5

            /* renamed from: ｋ, reason: contains not printable characters */
            private ce f1226;

            {
                this.f1226 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ce.m4184((TJPlacementData) list.get(0));
            }
        });
        Object[] objArr4 = new Object[1];
        a(Color.blue(0) + 7, TextUtils.indexOf((CharSequence) "", '0', 0) + 8, true, Color.red(0) + 260, "\u0001\t�￪\u0010\u0001\u0003", objArr4);
        hashMap.put(((String) objArr4[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.2

            /* renamed from: ﾒ, reason: contains not printable characters */
            private ce f1223;

            {
                this.f1223 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ce.m4188((TJPlacement) list.get(0));
            }
        });
        Object[] objArr5 = new Object[1];
        b(new int[]{1937699174, 1382724144, 623571396, 601963214, -1927275087, 1070459420}, 12 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr5);
        hashMap.put(((String) objArr5[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.4

            /* renamed from: ﻛ, reason: contains not printable characters */
            private ce f1225;

            {
                this.f1225 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ce.m4192((TJPlacement) list.get(0));
            }
        });
        Object[] objArr6 = new Object[1];
        b(new int[]{697639890, -60521972, -122218844, 1854941428, 25633010, -1691683780, 1192857653, -1917662638}, KeyEvent.getDeadChar(0, 0) + 16, objArr6);
        hashMap.put(((String) objArr6[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.7

            /* renamed from: ﻐ, reason: contains not printable characters */
            private ce f1227;

            {
                this.f1227 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ce.m4180((TJPlacement) list.get(0));
            }
        });
        Object[] objArr7 = new Object[1];
        b(new int[]{1533361981, -225094649, -122218844, 1854941428, 25633010, -1691683780, 1192857653, -1917662638}, 16 - ExpandableListView.getPackedPositionGroup(0L), objArr7);
        hashMap.put(((String) objArr7[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.9

            /* renamed from: ｋ, reason: contains not printable characters */
            private ce f1229;

            {
                this.f1229 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                ce.m4195((TJPlacement) list.get(0), (TJPlacementVideoListener) list.get(1));
                return null;
            }
        });
        Object[] objArr8 = new Object[1];
        a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10, 9 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), false, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 263, "\ufffe\r￥\ufffa\f\r￮\u000b\u0005��", objArr8);
        hashMap.put(((String) objArr8[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ce.8

            /* renamed from: ﾇ, reason: contains not printable characters */
            private ce f1228;

            {
                this.f1228 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ce.m4189((TJSplitWebView) list.get(0));
            }
        });
        f1220 = (f1218 + 67) % 128;
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾒ */
    public final String mo3629() {
        int i = f1220 + 107;
        f1218 = i % 128;
        if (i % 2 == 0) {
            Tapjoy.getVersion();
            throw new ArithmeticException("divide by zero");
        }
        String version = Tapjoy.getVersion();
        f1220 = (f1218 + 45) % 128;
        return version;
    }
}
