package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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
import com.qq.e.ads.LiteAbstractAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.IGDTAdManager;
import com.qq.e.comm.managers.status.APPStatus;
import com.qq.e.comm.managers.status.SDKStatus;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: ck.class */
public final class ck extends bm {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1335 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1336 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int[] f1337;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] f1338;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1339;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static short[] f1340;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1341;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1342;

    static {
        m4344();
        Color.blue(0);
        Process.myPid();
        TextUtils.indexOf("", "");
        SystemClock.elapsedRealtime();
        ImageFormat.getBitsPerPixel(0);
        ImageFormat.getBitsPerPixel(0);
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getPressedStateDuration();
        KeyEvent.keyCodeFromString("");
        View.resolveSizeAndState(0, 0, 0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        TypedValue.complexToFloat(0);
        TextUtils.getOffsetAfter("", 0);
        ImageFormat.getBitsPerPixel(0);
        KeyEvent.getMaxKeyCode();
        KeyEvent.getMaxKeyCode();
        TextUtils.getCapsMode("", 0, 0);
        View.MeasureSpec.getSize(0);
        Color.blue(0);
        SystemClock.uptimeMillis();
        ImageFormat.getBitsPerPixel(0);
        ViewConfiguration.getTapTimeout();
        ViewConfiguration.getMinimumFlingVelocity();
        TextUtils.getTrimmedLength("");
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getScrollBarFadeDuration();
        ExpandableListView.getPackedPositionForChild(0, 0);
        AudioTrack.getMinVolume();
        Color.argb(0, 0, 0, 0);
        KeyEvent.keyCodeFromString("");
        ViewConfiguration.getGlobalActionKeyTimeout();
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getMaximumFlingVelocity();
        ViewConfiguration.getJumpTapTimeout();
        View.resolveSize(0, 0);
        View.getDefaultSize(0, 0);
        ExpandableListView.getPackedPositionGroup(0L);
        Gravity.getAbsoluteGravity(0, 0);
        Process.myTid();
        TextUtils.getOffsetAfter("", 0);
        ViewConfiguration.getDoubleTapTimeout();
        ExpandableListView.getPackedPositionGroup(0L);
        TextUtils.getTrimmedLength("");
        TextUtils.getTrimmedLength("");
        ExpandableListView.getPackedPositionType(0L);
        ExpandableListView.getPackedPositionGroup(0L);
        TextUtils.lastIndexOf("", '0', 0);
        ViewConfiguration.getMaximumFlingVelocity();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        KeyEvent.getDeadChar(0, 0);
        TextUtils.getCapsMode("", 0, 0);
        View.MeasureSpec.getSize(0);
        ViewConfiguration.getEdgeSlop();
        SystemClock.elapsedRealtime();
        ViewConfiguration.getMinimumFlingVelocity();
        View.combineMeasuredStates(0, 0);
        ViewConfiguration.getZoomControlsTimeout();
        KeyEvent.keyCodeFromString("");
        SystemClock.currentThreadTimeMillis();
        KeyEvent.getModifierMetaStateMask();
        ViewConfiguration.getGlobalActionKeyTimeout();
        ViewConfiguration.getJumpTapTimeout();
        Color.rgb(0, 0, 0);
        ViewConfiguration.getTapTimeout();
        PointF.length(0.0f, 0.0f);
        ExpandableListView.getPackedPositionForGroup(0);
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getKeyRepeatDelay();
        Process.getGidForName("");
        TextUtils.getTrimmedLength("");
        View.MeasureSpec.getMode(0);
        View.resolveSize(0, 0);
        TextUtils.getCapsMode("", 0, 0);
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getTouchSlop();
        TextUtils.getTrimmedLength("");
        TextUtils.indexOf("", "", 0, 0);
        ViewConfiguration.getEdgeSlop();
        TextUtils.getTrimmedLength("");
        ViewConfiguration.getScrollDefaultDelay();
        Drawable.resolveOpacity(0, 0);
        ImageFormat.getBitsPerPixel(0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        ViewConfiguration.getPressedStateDuration();
        TextUtils.getOffsetBefore("", 0);
        SystemClock.elapsedRealtime();
        TextUtils.indexOf("", "", 0, 0);
        Gravity.getAbsoluteGravity(0, 0);
        KeyEvent.getMaxKeyCode();
        ViewConfiguration.getGlobalActionKeyTimeout();
        View.resolveSize(0, 0);
        ViewConfiguration.getScrollFriction();
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        MotionEvent.axisFromString("");
        ViewConfiguration.getEdgeSlop();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        f1336 = (f1335 + 55) % 128;
    }

    public ck(String str) {
        super(str);
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        int i4;
        boolean z;
        int length;
        int i5;
        q qVar = new q();
        StringBuilder sb = new StringBuilder();
        int i6 = f1341;
        try {
            Map map = b.f452;
            Object obj = map.get(-1903297911);
            if (obj == null) {
                Class cls = (Class) b.m3371(Color.rgb(0, 0, 0) + 16777216, (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 41);
                Class<?> cls2 = Integer.TYPE;
                obj = cls.getMethod("g", cls2, cls2);
                map.put(-1903297911, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i2), Integer.valueOf(i6))).intValue();
            if (intValue == -1) {
                $11 = ($10 + 117) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = f1338;
                byte[] bArr2 = bArr;
                if (bArr != null) {
                    int i7 = $11 + 59;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        length = bArr.length;
                        bArr2 = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr.length;
                        bArr2 = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        byte b2 = bArr[i5];
                        Map map2 = b.f452;
                        Object obj2 = map2.get(122654587);
                        if (obj2 == null) {
                            obj2 = ((Class) b.m3371(TextUtils.indexOf("", "", 0), (char) ((-1) - Process.getGidForName("")), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 41)).getMethod("h", Integer.TYPE);
                            map2.put(122654587, obj2);
                        }
                        bArr2[i5] = ((Byte) ((Method) obj2).invoke(null, Integer.valueOf(b2))).byteValue();
                        i5++;
                    }
                }
                if (bArr2 != null) {
                    byte[] bArr3 = f1338;
                    int i8 = f1339;
                    Map map3 = b.f452;
                    Object obj3 = map3.get(-1903297911);
                    if (obj3 == null) {
                        Class cls3 = (Class) b.m3371(1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) Color.alpha(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 40);
                        Class<?> cls4 = Integer.TYPE;
                        obj3 = cls3.getMethod("g", cls4, cls4);
                        map3.put(-1903297911, obj3);
                    }
                    intValue = (byte) (((byte) (bArr3[((Integer) ((Method) obj3).invoke(null, Integer.valueOf(i3), Integer.valueOf(i8))).intValue()] ^ 8044072489887092822L)) + ((int) (f1341 ^ 8044072489887092822L)));
                    $11 = ($10 + 107) % 128;
                } else {
                    intValue = (short) (((short) (f1340[i3 + ((int) (f1339 ^ 8044072489887092822L))] ^ 8044072489887092822L)) + ((int) (f1341 ^ 8044072489887092822L)));
                }
            }
            if (intValue > 0) {
                qVar.f3047 = ((i3 + intValue) - 2) + ((int) (f1339 ^ 8044072489887092822L)) + i4;
                int i9 = f1342;
                Map map4 = b.f452;
                Object obj4 = map4.get(-2107390936);
                if (obj4 == null) {
                    Class cls5 = (Class) b.m3371(View.combineMeasuredStates(0, 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 41 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    Class<?> cls6 = Integer.TYPE;
                    obj4 = cls5.getMethod("f", Object.class, cls6, cls6, Object.class);
                    map4.put(-2107390936, obj4);
                }
                ((StringBuilder) ((Method) obj4).invoke(null, qVar, Integer.valueOf(i), Integer.valueOf(i9), sb)).append(qVar.f3049);
                qVar.f3048 = qVar.f3049;
                byte[] bArr4 = f1338;
                byte[] bArr5 = bArr4;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    bArr5 = new byte[length2];
                    for (int i10 = 0; i10 < length2; i10++) {
                        bArr5[i10] = (byte) (bArr4[i10] ^ 8044072489887092822L);
                    }
                }
                if (bArr5 != null) {
                    z = true;
                } else {
                    $10 = ($11 + 103) % 128;
                    z = false;
                }
                qVar.f3050 = 1;
                while (qVar.f3050 < intValue) {
                    if (z) {
                        $11 = ($10 + 113) % 128;
                        byte[] bArr6 = f1338;
                        qVar.f3047 = qVar.f3047 - 1;
                        qVar.f3049 = (char) (qVar.f3048 + (((byte) (((byte) (bArr6[r0] ^ 8044072489887092822L)) + s)) ^ b));
                    } else {
                        short[] sArr = f1340;
                        qVar.f3047 = qVar.f3047 - 1;
                        qVar.f3049 = (char) (qVar.f3048 + (((short) (((short) (sArr[r0] ^ 8044072489887092822L)) + s)) ^ b));
                    }
                    sb.append(qVar.f3049);
                    qVar.f3048 = qVar.f3049;
                    qVar.f3050++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void b(int[] iArr, int i, Object[] objArr) {
        int[] iArr2;
        m mVar = new m();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f1337;
        int[] iArr4 = iArr3;
        if (iArr3 != null) {
            $10 = ($11 + 71) % 128;
            int length = iArr3.length;
            int[] iArr5 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                $10 = ($11 + 85) % 128;
                int i3 = iArr3[i2];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122833333);
                    if (obj == null) {
                        obj = ((Class) b.m3371((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (char) Color.blue(0), 42 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).getMethod(m4.p, Integer.TYPE);
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
        int[] iArr7 = f1337;
        if (iArr7 != null) {
            int length3 = iArr7.length;
            int[] iArr8 = new int[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                int i5 = iArr7[i4];
                Map map2 = b.f452;
                Object obj2 = map2.get(122833333);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(TextUtils.lastIndexOf("", '0') + 1, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 42)).getMethod(m4.p, Integer.TYPE);
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
                String str = new String(cArr2, 0, i);
                $11 = ($10 + 35) % 128;
                objArr[0] = str;
                return;
            }
            $11 = ($10 + 71) % 128;
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
            for (int i8 = 0; i8 < 16; i8++) {
                $10 = ($11 + 103) % 128;
                int i9 = mVar.f3039 ^ iArr6[i8];
                mVar.f3039 = i9;
                int m5749 = m.m5749(i9);
                Map map3 = b.f452;
                Object obj3 = map3.get(10695560);
                if (obj3 == null) {
                    obj3 = ((Class) b.m3371((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 41)).getMethod("k", Object.class, Integer.TYPE, Object.class, Object.class);
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
            int i12 = i10 ^ iArr6[16];
            mVar.f3038 = i12;
            int i13 = i11 ^ iArr6[17];
            mVar.f3039 = i13;
            cArr[0] = (char) (i13 >>> 16);
            cArr[1] = (char) i13;
            cArr[2] = (char) (i12 >>> 16);
            cArr[3] = (char) i12;
            m.m5748(iArr6);
            int i14 = mVar.f3040;
            cArr2[i14 * 2] = cArr[0];
            cArr2[(i14 * 2) + 1] = cArr[1];
            cArr2[(i14 * 2) + 2] = cArr[2];
            cArr2[(i14 * 2) + 3] = cArr[3];
            Map map4 = b.f452;
            Object obj4 = map4.get(1365438799);
            if (obj4 == null) {
                obj4 = ((Class) b.m3371(1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 41 - View.resolveSize(0, 0))).getMethod("m", Object.class, Object.class);
                map4.put(1365438799, obj4);
            }
            ((Method) obj4).invoke(null, mVar, mVar);
        }
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static IGDTAdManager m4342() {
        f1335 = (f1336 + 57) % 128;
        IGDTAdManager gDTAdManger = GDTAdSdk.getGDTAdManger();
        int i = f1336 + 21;
        f1335 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return gDTAdManger;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m4343(Object[] objArr, int i, int i2, int i3) {
        Object m4348;
        int i4 = i2 ^ (-1);
        int i5 = ((i4 | i) | i3) ^ (-1);
        int i6 = (i * 477) + (i2 * (-475)) + (((((i ^ (-1)) | i2) ^ (-1)) | i5) * (-476)) + (i5 * 952) + (((i | (i4 | (i3 ^ (-1)))) ^ (-1)) * 476);
        if (i6 == 1) {
            APPStatus aPPStatus = (APPStatus) objArr[0];
            f1336 = (f1335 + 101) % 128;
            m4348 = m4348(aPPStatus);
            f1335 = (f1336 + 21) % 128;
        } else if (i6 != 2) {
            UnifiedInterstitialAD unifiedInterstitialAD = (UnifiedInterstitialAD) objArr[0];
            f1335 = (f1336 + 89) % 128;
            m4348 = unifiedInterstitialAD.getExt();
            f1335 = (f1336 + 81) % 128;
        } else {
            m4348 = m4350(objArr);
        }
        return m4348;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m4344() {
        f1339 = 162236230;
        f1341 = 1798721657;
        f1342 = -776778445;
        f1338 = new byte[]{87, 93, -49, -117, -63, 92, -15, 3, 17, -87, 27, 83, 55, 102, -85, 25, 9, -31, 29, 25, 105, 95, 21, -21, 4, -39, 71, -86, 24, -25, -27, 109, -17, 23, -53, -36, 31, -3, 62, 23, -31, 16, 106, -31, 104, -17, -9, -16, 85, -31, -3, 45, 35, 41, 95, -6, -67, 59, 16, -18, 66, 92, -108, 90, -110, 118, -89, -22, 68, -102, 92, 81, -8, -21, 71, 68, 72, -89, 44, 88, 68, 84, -98, 80, 42, 89, 4, -122, -21, 93, -52, -2, -26, -12, -4, -40, -41, -28, -10, -123, -4, -14, -29, -7, -14, -5, -12, -36, -124, -1, -56, -18, -26, -57, -25, -40, -97, -57, -58, -43, -33, -25, -35, -27, -39, 52, -19, -41, -118, -27, -37, -24, -26, -37, -32, -35, -59, -115, -36, 41, -17, -25, -60, -28, -39, -4, -60, -57, 50, -81, -37, -41, 39, -111, 35, -83, -42, 23, -23, -24, -38, 64, 118, -2, 72, -16, 92, -95, -8, 78, -120, 118, 119, -22, -3, 65, 78, 90, -20, 73, 76, -26, -2, 81, -15, 92, -23, 81, 94, -17, 61, -25, 22, 29, -25, 29, -31, -31, -27, 17, -24, -51, 13, 19, 18, -17, 21, 23, -55, 21, -21, 105, -31, 17, 22, 5, 104, 31, -51, 23, -8, -19, 23, -19, 17, 17, 21, -31, 26, 61, -3, -29, -28, 31, -27, -25, 25, -118, 125, -123, -116, 82, -70, 93, 93, -68, -91, -67, -70, 103, -99, 99, -101, 107, 96, 119, 98, 105, -72, 96, 107, -111, 121, -104, -104, 123, Byte.MIN_VALUE, 120, 121, 105, 99, -114, 28, 28, -125, 74, 80, 106, -67, 74, -32, -102, -29, -78, -19, -121, -98, -19, -1, -68, -97, -102, -109, -99, -101, -7, -101, -95, -97, -89, -105, -102, -117, -100, -107, 89, -101, -95, -108, -101, -119, 118, -87, -88, -107, -85, -83, -113, 50, 49, 91, 25, 9, 55, -94, 96, -117, -98, 124, -66, 65, -46, -43, -122, 40, -46, -120, -57, -72, 47, -89, -90, -13, -126, -45, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86};
        f1337 = new int[]{-412561691, -1317459770, -883306936, 872246859, 1675862673, -1748153886, 66641310, -1863871356, -1517675566, -1564531800, -1252367233, 696619900, 1561795592, -1412261523, -1160484516, 313067911, 2137422194, 1628031866};
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ IGDTAdManager m4345() {
        int i = f1336 + 91;
        f1335 = i % 128;
        if (i % 2 != 0) {
            m4342();
            throw null;
        }
        IGDTAdManager m4342 = m4342();
        int i2 = f1335 + 115;
        f1336 = i2 % 128;
        if (i2 % 2 != 0) {
            return m4342;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ Map m4346(LiteAbstractAD liteAbstractAD) {
        int i = f1336 + 67;
        f1335 = i % 128;
        Map m4351 = m4351(liteAbstractAD);
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m4351;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Map m4347(RewardVideoAD rewardVideoAD) {
        int i = f1336 + 103;
        f1335 = i % 128;
        if (i % 2 == 0) {
            return rewardVideoAD.getExts();
        }
        rewardVideoAD.getExts();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m4348(APPStatus aPPStatus) {
        int i = f1335 + 69;
        f1336 = i % 128;
        if (i % 2 == 0) {
            aPPStatus.getAPPID();
            throw null;
        }
        String appid = aPPStatus.getAPPID();
        f1335 = (f1336 + 43) % 128;
        return appid;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ int m4349(RewardVideoAD rewardVideoAD) {
        f1336 = (f1335 + 15) % 128;
        int m4352 = m4352(rewardVideoAD);
        f1335 = (f1336 + 85) % 128;
        return m4352;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m4350(Object[] objArr) {
        RewardVideoAD rewardVideoAD = (RewardVideoAD) objArr[0];
        int i = f1336 + 59;
        f1335 = i % 128;
        Map m4347 = m4347(rewardVideoAD);
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        f1336 = (f1335 + 53) % 128;
        return m4347;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Map m4351(LiteAbstractAD liteAbstractAD) {
        f1335 = (f1336 + 73) % 128;
        Map extraInfo = liteAbstractAD.getExtraInfo();
        f1336 = (f1335 + 73) % 128;
        return extraInfo;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int m4352(RewardVideoAD rewardVideoAD) {
        int i = f1335 + 73;
        f1336 = i % 128;
        if (i % 2 == 0) {
            rewardVideoAD.getRewardAdType();
            throw null;
        }
        int rewardAdType = rewardVideoAD.getRewardAdType();
        f1336 = (f1335 + 87) % 128;
        return rewardAdType;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Map m4353(UnifiedInterstitialAD unifiedInterstitialAD) {
        int i = f1335 + 85;
        f1336 = i % 128;
        Object[] objArr = new Object[1];
        if (i % 2 != 0) {
            objArr[0] = unifiedInterstitialAD;
            return (Map) m4343(objArr, 392801076, -392801076, (int) System.currentTimeMillis());
        }
        objArr[0] = unifiedInterstitialAD;
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x07c5, code lost:
    
        if (r11.equals(((java.lang.String) r0[0]).intern()) != false) goto L88;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Class mo3627(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 3237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ck.mo3627(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Map mo3628() {
        HashMap hashMap = new HashMap();
        Object[] objArr = new Object[1];
        b(new int[]{-195869397, -1054263431, 645494338, -870014217, -187459613, 923681340, -1012885307, -1800129337}, Color.rgb(0, 0, 0) + 16777230, objArr);
        hashMap.put(((String) objArr[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ck.2

            /* renamed from: ｋ, reason: contains not printable characters */
            private ck f1344;

            {
                this.f1344 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ck.m4345();
            }
        });
        Object[] objArr2 = new Object[1];
        a((short) (TextUtils.lastIndexOf("", '0', 0, 0) + 6), (byte) ((Process.myPid() >> 22) - 30), 1165681410 - (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 40, (-1654511053) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
        hashMap.put(((String) objArr2[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ck.5

            /* renamed from: ﾒ, reason: contains not printable characters */
            private ck f1347;

            {
                this.f1347 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return (String) ck.m4343(new Object[]{(APPStatus) list.get(0)}, 767868473, -767868472, (int) System.currentTimeMillis());
            }
        });
        Object[] objArr3 = new Object[1];
        b(new int[]{-1606217831, 1561359168, 1622726434, -1826248880, 1451511701, 497396109}, TextUtils.indexOf("", "", 0, 0) + 12, objArr3);
        hashMap.put(((String) objArr3[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ck.4

            /* renamed from: ｋ, reason: contains not printable characters */
            private ck f1346;

            {
                this.f1346 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ck.m4346((LiteAbstractAD) list.get(0));
            }
        });
        Object[] objArr4 = new Object[1];
        b(new int[]{1786990506, 446676978, -1770857758, -2047350127, 989114117, 1149637077, -161068743, 707569311}, 15 - TextUtils.indexOf("", ""), objArr4);
        hashMap.put(((String) objArr4[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ck.3

            /* renamed from: ﾇ, reason: contains not printable characters */
            private ck f1345;

            {
                this.f1345 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return Integer.valueOf(ck.m4349((RewardVideoAD) list.get(0)));
            }
        });
        Object[] objArr5 = new Object[1];
        a((short) ((-50) - Color.green(0)), (byte) (TextUtils.getOffsetBefore("", 0) - 83), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1165681410, TextUtils.lastIndexOf("", '0', 0) - 31, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1654511044, objArr5);
        hashMap.put(((String) objArr5[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ck.1

            /* renamed from: ﾒ, reason: contains not printable characters */
            private ck f1343;

            {
                this.f1343 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return (Map) ck.m4343(new Object[]{(RewardVideoAD) list.get(0)}, 148629768, -148629766, (int) System.currentTimeMillis());
            }
        });
        Object[] objArr6 = new Object[1];
        b(new int[]{-664170452, 640141230, -1843148217, -1829533745, 854562264, -1061584704, 552213937, -1468893202, -1375184774, 1310624113}, 18 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr6);
        hashMap.put(((String) objArr6[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.ck.7

            /* renamed from: ﾒ, reason: contains not printable characters */
            private ck f1348;

            {
                this.f1348 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return ck.m4353((UnifiedInterstitialAD) list.get(0));
            }
        });
        int i = f1336 + 29;
        f1335 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return hashMap;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾒ */
    public final String mo3629() {
        int i = f1335 + 45;
        f1336 = i % 128;
        if (i % 2 != 0) {
            return SDKStatus.getIntegrationSDKVersion();
        }
        SDKStatus.getIntegrationSDKVersion();
        throw null;
    }
}
