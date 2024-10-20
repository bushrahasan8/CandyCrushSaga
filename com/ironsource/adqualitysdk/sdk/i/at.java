package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* loaded from: at.class */
public final class at {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f386 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static long f387;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f388;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f389;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final String f390;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f391;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f392;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f393;

    static {
        m3303();
        MotionEvent.axisFromString("");
        ViewConfiguration.getMaximumDrawingCacheSize();
        AudioTrack.getMinVolume();
        int i = f388 + 77;
        f386 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    public at() {
        float complexToFloat = TypedValue.complexToFloat(0);
        Object[] objArr = new Object[1];
        a((complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + 35, View.MeasureSpec.getMode(0), (char) Color.blue(0), objArr);
        this.f393 = ((String) objArr[0]).intern();
        int mode = View.MeasureSpec.getMode(0);
        int trimmedLength = TextUtils.getTrimmedLength("");
        Object[] objArr2 = new Object[1];
        a(mode + 35, trimmedLength + 35, (char) (KeyEvent.getMaxKeyCode() >> 16), objArr2);
        this.f391 = ((String) objArr2[0]).intern();
        int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration();
        int red = Color.red(0);
        Object[] objArr3 = new Object[1];
        a((scrollBarFadeDuration >> 16) + 35, 70 - red, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
        this.f392 = ((String) objArr3[0]).intern();
        int resolveOpacity = Drawable.resolveOpacity(0, 0);
        int combineMeasuredStates = View.combineMeasuredStates(0, 0);
        Object[] objArr4 = new Object[1];
        a(15 - resolveOpacity, combineMeasuredStates + 105, (char) Color.blue(0), objArr4);
        this.f390 = ((String) objArr4[0]).intern();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e9, code lost:
    
        r0[r0] = (char) r0[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01f3, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.b.f452;
        r11 = r0.get(518145355);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0206, code lost:
    
        if (r11 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x020c, code lost:
    
        r11 = ((java.lang.Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.view.Gravity.getAbsoluteGravity(0, 0) + 41)).getMethod("i", java.lang.Object.class, java.lang.Object.class);
        r0.put(518145355, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x024a, code lost:
    
        ((java.lang.reflect.Method) r11).invoke(null, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0261, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.at.a(int, int, char, java.lang.Object[]):void");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static String m3302() {
        Object obj;
        int i = f388 + 49;
        f386 = i % 128;
        if (i % 2 == 0) {
            int myPid = Process.myPid();
            int tapTimeout = ViewConfiguration.getTapTimeout();
            Object[] objArr = new Object[1];
            a(81 >>> (myPid << 114), 91 >> (tapTimeout >> 70), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            int myPid2 = Process.myPid();
            int tapTimeout2 = ViewConfiguration.getTapTimeout();
            Object[] objArr2 = new Object[1];
            a(15 - (myPid2 >> 22), (tapTimeout2 >> 16) + 105, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m3303() {
        f389 = new char[]{3394, 19150, 33406, 56298, 4889, 26816, 41061, 63989, 12739, 35095, 50923, 7806, 22427, 44884, 58535, 15423, 29774, 52691, 1387, 17134, 39427, 54165, 11044, 24820, 47327, 61524, 18915, 33134, 56979, 5705, 28590, 42868, 65353, 13525, 35943, 3394, 19150, 33406, 56298, 4889, 26816, 41061, 63989, 12741, 35095, 50923, 7806, 22427, 44884, 58535, 15423, 29774, 52691, 1387, 17134, 39427, 54165, 11044, 24820, 47327, 61524, 18915, 33134, 56979, 5705, 28590, 42868, 65353, 13525, 35943, 3394, 19150, 33406, 56298, 4889, 26816, 41061, 63989, 12747, 35095, 50923, 7806, 22427, 44884, 58535, 15423, 29774, 52691, 1387, 17134, 39427, 54165, 11044, 24820, 47327, 61524, 18915, 33134, 56979, 5705, 28590, 42868, 65353, 13525, 35943, 3422, 19144, 33387, 56313, 4879, 26776, 41003, 63929, 12737, 35092, 50913, 7788, 22468, 44830, 58536, 13076, 28436, 10449, 57408, 47604, 28929, 2742, 49706, 39842, 21400, 60282, 42199, 31778, 13729, 52564, 34537};
        f387 = -4072889256939992390L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Object m3304(Object[] objArr) {
        at atVar = (at) objArr[0];
        String str = (String) objArr[1];
        int i = f386 + 25;
        f388 = i % 128;
        String m3305 = m3305(atVar.f391, str);
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        int i2 = f386 + 121;
        f388 = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m3305;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m3305(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            f386 = (f388 + 73) % 128;
        } else {
            str = "";
        }
        sb.append(str);
        int red = Color.red(0);
        int myTid = Process.myTid();
        Object[] objArr = new Object[1];
        a(red + 1, 120 - (myTid >> 22), (char) (AndroidCharacter.getMirror('0') + 15841), objArr);
        sb.append(((String) objArr[0]).intern());
        int i = f386;
        if (str2 != null) {
            int i2 = i + 101;
            f388 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } else {
            f388 = (i + 41) % 128;
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m3307(String str) {
        ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        return (String) m3304(new Object[]{this, str});
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m3308() {
        int i = (f386 + 91) % 128;
        f388 = i;
        String str = this.f392;
        int i2 = i + 113;
        f386 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m3309(String str) {
        f386 = (f388 + 125) % 128;
        String m3305 = m3305(this.f393, str);
        int i = f388 + 75;
        f386 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m3305;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m3310() {
        int i = f386 + 35;
        f388 = i % 128;
        if (i % 2 == 0) {
            return this.f393;
        }
        throw null;
    }
}
