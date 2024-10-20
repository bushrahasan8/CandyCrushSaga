package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: zzgfe.class */
public final class zzgfe {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.zzgey] */
    public static zzgey zza(ExecutorService executorService) {
        return executorService instanceof zzgey ? (zzgey) executorService : executorService instanceof ScheduledExecutorService ? new zzgfd((ScheduledExecutorService) executorService) : new zzgfa(executorService);
    }

    public static Executor zzb() {
        return zzgeb.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor zzc(Executor executor, zzgdb zzgdbVar) {
        executor.getClass();
        return executor == zzgeb.INSTANCE ? executor : new zzgez(executor, zzgdbVar);
    }
}
