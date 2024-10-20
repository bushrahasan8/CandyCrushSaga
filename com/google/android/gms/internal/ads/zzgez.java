package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzgez.class */
public final class zzgez implements Executor {
    final Executor zza;
    final zzgdb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgez(Executor executor, zzgdb zzgdbVar) {
        this.zza = executor;
        this.zzb = zzgdbVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zzd(e);
        }
    }
}
