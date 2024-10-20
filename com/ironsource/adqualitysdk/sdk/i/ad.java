package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;

/* loaded from: ad.class */
public class ad {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f78 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f79;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Handler f80;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f81;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static Handler f82;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f83;

    static {
        m3023();
        f82 = new Handler(Looper.getMainLooper());
        int i = f78 + 73;
        f79 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x028c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ad.a(int, int, char, java.lang.Object[]):void");
    }

    public static Handler l_() {
        int i = f78 + 37;
        int i2 = i % 128;
        f79 = i2;
        if (i % 2 != 0) {
            throw null;
        }
        Handler handler = f82;
        int i3 = i2 + 9;
        f78 = i3 % 128;
        if (i3 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return handler;
    }

    public static Handler m_() {
        Handler handler;
        synchronized (ad.class) {
            try {
                if (f80 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    long elapsedCpuTime = Process.getElapsedCpuTime();
                    Object[] objArr = new Object[1];
                    a((uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + 9, 1 - (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 49763), objArr);
                    HandlerThread handlerThread = new HandlerThread(((String) objArr[0]).intern());
                    handlerThread.start();
                    f80 = new Handler(handlerThread.getLooper());
                }
                handler = f80;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m3018(is isVar) {
        f79 = (f78 + 29) % 128;
        l_().post(isVar);
        f78 = (f79 + 115) % 128;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m3019(is isVar, long j) {
        f79 = (f78 + 75) % 128;
        l_().postDelayed(isVar, j);
        int i = f78 + 119;
        f79 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m3020() {
        int i = f78 + 121;
        f79 = i % 128;
        if (i % 2 != 0) {
            Looper.myLooper();
            Looper.getMainLooper();
            throw null;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            f78 = (f79 + 67) % 128;
            return true;
        }
        f78 = (f79 + 113) % 128;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m3021(Object[] objArr) {
        is isVar = (is) objArr[0];
        int i = f79 + 23;
        f78 = i % 128;
        if (i % 2 == 0) {
            m_().post(isVar);
            throw new ArithmeticException("divide by zero");
        }
        m_().post(isVar);
        int i2 = f78 + 25;
        f79 = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m3022(Object[] objArr, int i, int i2, int i3) {
        return m3021(objArr);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static void m3023() {
        f81 = new char[]{53020, 25607, 39184, 52776, 25384, 39009, 52596, 25206, 38721, 52313};
        f83 = 7275636488114710055L;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m3024(is isVar) {
        int i = f78 + 59;
        f79 = i % 128;
        if (i % 2 != 0) {
            m3020();
            throw null;
        }
        if (!m3020()) {
            isVar.run();
            return;
        }
        int i2 = f79 + 31;
        f78 = i2 % 128;
        if (i2 % 2 == 0) {
            m_().post(isVar);
            throw new ArithmeticException("divide by zero");
        }
        m_().post(isVar);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m3025(is isVar) {
        m3021(new Object[]{isVar});
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m3026(is isVar, long j) {
        f78 = (f79 + 113) % 128;
        m_().postDelayed(isVar, j);
        f79 = (f78 + 43) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m3027(is isVar) {
        int i = f78 + 101;
        f79 = i % 128;
        if (i % 2 != 0) {
            m3020();
            throw null;
        }
        if (m3020()) {
            isVar.run();
        } else {
            m3018(isVar);
            f79 = (f78 + 105) % 128;
        }
    }
}
