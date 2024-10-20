package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzccg.class */
public final class zzccg implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccg(zzcch zzcchVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(SCION_TASK_EXECUTOR) #" + this.zza.getAndIncrement());
    }
}
