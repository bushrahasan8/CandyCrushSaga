package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.t2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzgdj.class */
public abstract class zzgdj extends zzged implements Runnable {
    public static final int zzc = 0;
    ListenableFuture zza;
    Object zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgdj(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
        boolean isCancelled = isCancelled();
        boolean z = true;
        boolean z2 = listenableFuture == null;
        if (obj != null) {
            z = false;
        }
        if ((isCancelled | z2) || z) {
            return;
        }
        this.zza = null;
        if (listenableFuture.isCancelled()) {
            zzs(listenableFuture);
            return;
        }
        try {
            try {
                Object zze = zze(obj, zzgen.zzp(listenableFuture));
                this.zzb = null;
                zzf(zze);
            } catch (Throwable th) {
                try {
                    zzgff.zza(th);
                    zzd(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zzd(e);
        } catch (CancellationException e2) {
            cancel(false);
        } catch (ExecutionException e3) {
            zzd(e3.getCause());
        } catch (Exception e4) {
            zzd(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgdb
    public final String zza() {
        String str;
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (zza != null) {
                return str.concat(zza);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + t2.i.e;
    }

    @Override // com.google.android.gms.internal.ads.zzgdb
    protected final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    abstract Object zze(Object obj, Object obj2) throws Exception;

    abstract void zzf(Object obj);
}
