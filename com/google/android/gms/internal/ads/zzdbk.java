package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: zzdbk.class */
public final class zzdbk extends zzdgl implements zzdbb {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzdbk(zzdbj zzdbjVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzo(zzdbjVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzu(new zzdgk(zzeVar) { // from class: com.google.android.gms.internal.ads.zzdbc
            public final com.google.android.gms.ads.internal.client.zze zza;

            {
                this.zza = zzeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdbb) obj).zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzb() {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdbd
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdbb) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbb
    public final void zzc(final zzdkv zzdkvVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzu(new zzdgk(zzdkvVar) { // from class: com.google.android.gms.internal.ads.zzdbf
            public final zzdkv zza;

            {
                this.zza = zzdkvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdbb) obj).zzc(this.zza);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        synchronized (this) {
            zzcec.zzg("Timeout waiting for show call succeed to be called.");
            zzc(new zzdkv("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final void zze() {
        synchronized (this) {
            ScheduledFuture scheduledFuture = this.zzc;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdbe
            public final zzdbk zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzkj)).intValue(), TimeUnit.MILLISECONDS);
    }
}
