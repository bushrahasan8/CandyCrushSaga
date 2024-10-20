package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: kc.class */
public abstract class kc implements Runnable {
    public abstract void a() throws Exception;

    public void a(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "SafeRunnable", t);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (Throwable th) {
            try {
                a(th);
            } catch (Throwable th2) {
            }
        }
    }
}
