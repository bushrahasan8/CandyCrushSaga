package com.google.android.gms.internal.ads;

import com.ironsource.t2;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzgfn.class */
public final class zzgfn extends zzged implements RunnableFuture {
    private volatile zzgew zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgfn(zzgdt zzgdtVar) {
        this.zza = new zzgfl(this, zzgdtVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgfn(Callable callable) {
        this.zza = new zzgfm(this, callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgfn zze(Runnable runnable, Object obj) {
        return new zzgfn(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgew zzgewVar = this.zza;
        if (zzgewVar != null) {
            zzgewVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgdb
    protected final String zza() {
        zzgew zzgewVar = this.zza;
        if (zzgewVar == null) {
            return super.zza();
        }
        return "task=[" + zzgewVar.toString() + t2.i.e;
    }

    @Override // com.google.android.gms.internal.ads.zzgdb
    protected final void zzb() {
        zzgew zzgewVar;
        if (zzt() && (zzgewVar = this.zza) != null) {
            zzgewVar.zzh();
        }
        this.zza = null;
    }
}
