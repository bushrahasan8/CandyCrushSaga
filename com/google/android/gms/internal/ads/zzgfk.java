package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.t2;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzgfk.class */
public final class zzgfk extends zzged {
    private ListenableFuture zza;
    private ScheduledFuture zzb;

    private zzgfk(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ListenableFuture zzf(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgfk zzgfkVar = new zzgfk(listenableFuture);
        zzgfh zzgfhVar = new zzgfh(zzgfkVar);
        zzgfkVar.zzb = scheduledExecutorService.schedule(zzgfhVar, j, timeUnit);
        listenableFuture.addListener(zzgfhVar, zzgeb.INSTANCE);
        return zzgfkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgdb
    public final String zza() {
        ListenableFuture listenableFuture = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (listenableFuture == null) {
            return null;
        }
        String str = "inputFuture=[" + listenableFuture.toString() + t2.i.e;
        String str2 = str;
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            str2 = str;
            if (delay > 0) {
                str2 = str + ", remaining delay=[" + delay + " ms]";
            }
        }
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.zzgdb
    protected final void zzb() {
        zzr(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
