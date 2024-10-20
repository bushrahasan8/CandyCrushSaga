package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.m4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: aw.class */
public final class aw extends au {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f399 = 0;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f400 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int[] f401;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f402;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char f403;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f404;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char f405;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final String f406;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final String f410;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final int f409 = (int) TimeUnit.SECONDS.toMillis(120);

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final int f407 = 40;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final int f408 = 9850;

    static {
        m3320();
        Process.getGidForName("");
        KeyEvent.keyCodeFromString("");
        TextUtils.lastIndexOf("", '0');
        f399 = (f400 + 79) % 128;
    }

    public aw(az azVar) {
        Object[] objArr = new Object[1];
        a(new int[]{-1213080236, -17241546, -646258158, 1505036909}, 7 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        this.f406 = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{1486184164, -46244565, 1408398079, -1789034233, 2090878290, -947543053}, 9 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
        this.f410 = ((String) objArr2[0]).intern();
        m3314(azVar);
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        m mVar = new m();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f401;
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
                        obj = ((Class) b.m3371(View.combineMeasuredStates(0, 0), (char) TextUtils.indexOf("", "", 0, 0), 'Y' - AndroidCharacter.getMirror('0'))).getMethod(m4.p, Integer.TYPE);
                        map.put(122833333, obj);
                    }
                    iArr4[i2] = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i3))).intValue();
                    i2++;
                    $10 = ($11 + 61) % 128;
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
        int[] iArr6 = f401;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                int i5 = iArr6[i4];
                Map map2 = b.f452;
                Object obj2 = map2.get(122833333);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(TextUtils.indexOf("", "", 0, 0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 41)).getMethod(m4.p, Integer.TYPE);
                    map2.put(122833333, obj2);
                }
                iArr7[i4] = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i5))).intValue();
            }
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
            $10 = ($11 + 35) % 128;
            for (int i8 = 0; i8 < 16; i8++) {
                int i9 = mVar.f3039 ^ iArr5[i8];
                mVar.f3039 = i9;
                int m5749 = m.m5749(i9);
                Map map3 = b.f452;
                Object obj3 = map3.get(10695560);
                if (obj3 == null) {
                    obj3 = ((Class) b.m3371(ViewConfiguration.getPressedStateDuration() >> 16, (char) TextUtils.getOffsetAfter("", 0), 41 - TextUtils.getTrimmedLength(""))).getMethod("k", Object.class, Integer.TYPE, Object.class, Object.class);
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
                obj4 = ((Class) b.m3371(TextUtils.getCapsMode("", 0, 0), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 42 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod("m", Object.class, Object.class);
                map4.put(1365438799, obj4);
            }
            ((Method) obj4).invoke(null, mVar, mVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v97, types: [int] */
    private static void b(String str, int i, Object[] objArr) {
        boolean z = 3;
        int i2 = 4;
        int i3 = $11 + 23;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        if (str != null) {
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        p pVar = new p();
        char[] cArr2 = new char[cArr.length];
        pVar.f3046 = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i4 = pVar.f3046;
            if (i4 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[i4];
            cArr3[1] = cArr[i4 + 1];
            char c = 58224;
            int i5 = 0;
            boolean z2 = z;
            while (i5 < 16) {
                $10 = ($11 + 49) % 128;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                char c4 = (char) (f402 ^ 8584761702560213004L);
                try {
                    Object[] objArr2 = new Object[i2];
                    objArr2[z2 ? 1 : 0] = Integer.valueOf(f404);
                    objArr2[2] = Integer.valueOf(c3 >>> 5);
                    objArr2[1] = Integer.valueOf((c3 + c) ^ ((c3 << 4) + c4));
                    objArr2[0] = Integer.valueOf(c2);
                    Map map = b.f452;
                    Object obj = map.get(-952725446);
                    if (obj == null) {
                        Class cls = (Class) b.m3371(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 41);
                        Class<?>[] clsArr = new Class[i2];
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
                    char c6 = (char) (f403 ^ 8584761702560213004L);
                    char c7 = f405;
                    Object obj2 = map.get(-952725446);
                    if (obj2 == null) {
                        Class cls3 = (Class) b.m3371(ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 41 - KeyEvent.keyCodeFromString(""));
                        Class<?> cls4 = Integer.TYPE;
                        obj2 = cls3.getMethod("x", cls4, cls4, cls4, cls4);
                        map.put(-952725446, obj2);
                    }
                    cArr3[0] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c5), Integer.valueOf((charValue + c) ^ ((charValue << 4) + c6)), Integer.valueOf(charValue >>> 5), Integer.valueOf(c7))).charValue();
                    c -= 40503;
                    i5++;
                    i2 = 4;
                    z2 = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = pVar.f3046;
            cArr2[i6] = cArr3[0];
            cArr2[i6 + 1] = cArr3[1];
            Map map2 = b.f452;
            Object obj3 = map2.get(-1234941609);
            if (obj3 == null) {
                obj3 = ((Class) b.m3371(KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 40 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).getMethod("u", Object.class, Object.class);
                map2.put(-1234941609, obj3);
            }
            ((Method) obj3).invoke(null, pVar, pVar);
            z = z2;
        }
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    static void m3320() {
        f401 = new int[]{1353324643, -1934252833, -711519644, -775437401, -1694178957, -1043601701, 2087968445, 1605714386, 1672220600, -1171094605, 267098286, 784423340, -1868725818, 599970565, 1199158115, -282481619, -1827282977, -1610160677};
        f402 = (char) 63427;
        f405 = (char) 34507;
        f404 = (char) 31188;
        f403 = (char) 37003;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Object m3321(Object[] objArr, int i, int i2, int i3) {
        Long valueOf;
        long optLong;
        int i4 = i | i2;
        int i5 = i ^ (-1);
        int i6 = i5 | (i3 ^ (-1));
        int i7 = (i3 | i4) ^ (-1);
        if ((i * 503) + (i2 * 503) + (i4 * (-502)) + (((((i2 ^ (-1)) | i5) ^ (-1)) | (i6 ^ (-1)) | i7) * (-502)) + ((((i6 | i2) ^ (-1)) | i7) * IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION) != 1) {
            aw awVar = (aw) objArr[0];
            int i8 = f400 + 15;
            f399 = i8 % 128;
            JSONObject m3312 = awVar.m3312();
            if (i8 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                b("\uf14e铰ꔦৰ", 2 >> KeyEvent.getDeadChar(1, 1), objArr2);
                optLong = m3312.optLong(((String) objArr2[0]).intern(), 1L);
            } else {
                Object[] objArr3 = new Object[1];
                b("\uf14e铰ꔦৰ", KeyEvent.getDeadChar(0, 0) + 3, objArr3);
                optLong = m3312.optLong(((String) objArr3[0]).intern(), 0L);
            }
            f400 = (f399 + 51) % 128;
            valueOf = Long.valueOf(optLong);
        } else {
            aw awVar2 = (aw) objArr[0];
            f399 = (f400 + 75) % 128;
            JSONObject m33122 = awVar2.m3312();
            Object[] objArr4 = new Object[1];
            b("腄\ufaee", (ViewConfiguration.getJumpTapTimeout() >> 16) + 2, objArr4);
            long optLong2 = m33122.optLong(((String) objArr4[0]).intern(), 0L);
            f400 = (f399 + 109) % 128;
            valueOf = Long.valueOf(optLong2);
        }
        return valueOf;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final long m3322() {
        return ((Long) m3321(new Object[]{this}, 227772586, -227772585, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue())).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        if (r7 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0041, code lost:
    
        if (r7 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00ea, code lost:
    
        r0 = new java.lang.Object[1];
        a(new int[]{-1213080236, -17241546, -646258158, 1505036909}, android.graphics.Color.red(0) + 7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x011c, code lost:
    
        return ((java.lang.String) r0[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0076, code lost:
    
        r0 = new java.lang.Object[1];
        b("\uf354簗", -android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), r0);
        r0 = ((java.lang.String) r0[0]).intern();
        r0 = new java.lang.Object[1];
        a(new int[]{-1213080236, -17241546, -646258158, 1505036909}, 7 - android.graphics.Color.red(0), r0);
        r0 = r7.optString(r0, ((java.lang.String) r0[0]).intern());
        r0 = com.ironsource.adqualitysdk.sdk.i.aw.f399 + 21;
        com.ironsource.adqualitysdk.sdk.i.aw.f400 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00e3, code lost:
    
        if ((r0 % 2) == 0) goto L13;
     */
    /* renamed from: ﱟ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m3323() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.aw.m3323():java.lang.String");
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final long m3324() {
        return ((Long) m3321(new Object[]{this}, 1223168515, -1223168515, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue())).longValue();
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final long m3325() {
        f399 = (f400 + 117) % 128;
        JSONObject m3312 = m3312();
        Object[] objArr = new Object[1];
        a(new int[]{-1580410140, 80183285}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1, objArr);
        long optLong = m3312.optLong(((String) objArr[0]).intern(), 0L);
        f400 = (f399 + 99) % 128;
        return optLong;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x010d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x010f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        if (r11 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0045, code lost:
    
        if (r11 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0110, code lost:
    
        r0 = new java.lang.Object[1];
        a(new int[]{1486184164, -46244565, 1408398079, -1789034233, 2090878290, -947543053}, 10 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0153, code lost:
    
        return ((java.lang.String) r0[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007e, code lost:
    
        r0 = new java.lang.Object[1];
        a(new int[]{-616672151, -1173936544}, 1 - android.graphics.Color.blue(0), r0);
        r0 = ((java.lang.String) r0[0]).intern();
        r0 = new java.lang.Object[1];
        a(new int[]{1486184164, -46244565, 1408398079, -1789034233, 2090878290, -947543053}, android.view.Gravity.getAbsoluteGravity(0, 0) + 9, r0);
        r0 = r11.optString(r0, ((java.lang.String) r0[0]).intern());
        r0 = com.ironsource.adqualitysdk.sdk.i.aw.f400 + 39;
        com.ironsource.adqualitysdk.sdk.i.aw.f399 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0108, code lost:
    
        if ((r0 % 2) != 0) goto L13;
     */
    /* renamed from: ﻏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m3326() {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.aw.m3326():java.lang.String");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final int m3327() {
        JSONObject m3312;
        String intern;
        int i;
        int i2 = f400 + 113;
        f399 = i2 % 128;
        if (i2 % 2 != 0) {
            m3312 = m3312();
            Object[] objArr = new Object[1];
            a(new int[]{-2109695649, 271639728}, 3 >>> TextUtils.indexOf("", "", 1, 1), objArr);
            intern = ((String) objArr[0]).intern();
            i = 32;
        } else {
            m3312 = m3312();
            Object[] objArr2 = new Object[1];
            a(new int[]{-2109695649, 271639728}, TextUtils.indexOf("", "", 0, 0) + 3, objArr2);
            intern = ((String) objArr2[0]).intern();
            i = 40;
        }
        int optInt = m3312.optInt(intern, i);
        f399 = (f400 + 111) % 128;
        return optInt;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int m3328() {
        JSONObject m3312;
        Object obj;
        int i = f399 + 23;
        f400 = i % 128;
        if (i % 2 == 0) {
            m3312 = m3312();
            Object[] objArr = new Object[1];
            b("ꀈ瀉揱䪚", 4 << View.MeasureSpec.getSize(0), objArr);
            obj = objArr[0];
        } else {
            m3312 = m3312();
            Object[] objArr2 = new Object[1];
            b("ꀈ瀉揱䪚", 3 - View.MeasureSpec.getSize(0), objArr2);
            obj = objArr2[0];
        }
        int optInt = m3312.optInt(((String) obj).intern(), this.f409);
        f399 = (f400 + 25) % 128;
        return optInt;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final int m3329() {
        f400 = (f399 + 51) % 128;
        JSONObject m3312 = m3312();
        Object[] objArr = new Object[1];
        a(new int[]{1867324362, 1139375399}, (ViewConfiguration.getTapTimeout() >> 16) + 3, objArr);
        int optInt = m3312.optInt(((String) objArr[0]).intern(), 9850);
        f399 = (f400 + 75) % 128;
        return optInt;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m3330() {
        List<String> m3363 = m3311().m3363();
        JSONObject m3312 = m3312();
        Object[] objArr = new Object[1];
        b("ῼۍ냁蕭", (KeyEvent.getMaxKeyCode() >> 16) + 3, objArr);
        m3363.addAll((List) ki.m5721(new Object[]{m3312, ((String) objArr[0]).intern(), new ArrayList()}, 1333401136, -1333401136, (int) System.currentTimeMillis()));
        int i = f400 + 33;
        f399 = i % 128;
        if (i % 2 == 0) {
            return m3363;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m3331() {
        List<String> m3359 = m3311().m3359();
        JSONObject m3312 = m3312();
        Object[] objArr = new Object[1];
        b("檌�냁蕭", ExpandableListView.getPackedPositionGroup(0L) + 3, objArr);
        m3359.addAll((List) ki.m5721(new Object[]{m3312, ((String) objArr[0]).intern(), new ArrayList()}, 1333401136, -1333401136, (int) System.currentTimeMillis()));
        f400 = (f399 + 97) % 128;
        return m3359;
    }
}
