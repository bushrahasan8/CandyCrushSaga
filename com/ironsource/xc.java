package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: xc.class */
public class xc extends Thread {
    private static xc b;
    private a a;

    /* loaded from: xc$a.class */
    private class a extends HandlerThread {
        private Handler a;
        final xc b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xc xcVar, String str) {
            super(str);
            this.b = xcVar;
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.d());
        }

        Handler a() {
            return this.a;
        }

        void b() {
            this.a = new Handler(getLooper());
        }
    }

    private xc() {
        a aVar = new a(this, getClass().getSimpleName());
        this.a = aVar;
        aVar.start();
        this.a.b();
    }

    public static xc a() {
        xc xcVar;
        synchronized (xc.class) {
            try {
                if (b == null) {
                    b = new xc();
                }
                xcVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xcVar;
    }

    public void a(Runnable runnable) {
        synchronized (this) {
            a aVar = this.a;
            if (aVar == null) {
                return;
            }
            Handler a2 = aVar.a();
            if (a2 != null) {
                a2.post(runnable);
            }
        }
    }
}
