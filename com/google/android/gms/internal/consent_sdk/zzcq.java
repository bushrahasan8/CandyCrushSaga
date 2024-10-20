package com.google.android.gms.internal.consent_sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzcq.class */
public final class zzcq implements Executor {
    private final ThreadPoolExecutor zzb;
    private final AtomicInteger zza = new AtomicInteger(1);
    private WeakReference zzc = new WeakReference(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcq(String str) {
        final String str2 = "Google consent worker";
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory(this, str2) { // from class: com.google.android.gms.internal.consent_sdk.zzcp
            public final zzcq zza;
            public final String zzb = "Google consent worker";

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return this.zza.zza(this.zzb, runnable);
            }
        });
        this.zzb = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.zzc.get()) {
            runnable.run();
        } else {
            this.zzb.execute(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Thread zza(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, "Google consent worker #" + this.zza.getAndIncrement());
        this.zzc = new WeakReference(thread);
        return thread;
    }
}
