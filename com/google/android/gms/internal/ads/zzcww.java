package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: zzcww.class */
public final class zzcww {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzcww(Executor executor, ScheduledExecutorService scheduledExecutorService, ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(final zzcww zzcwwVar, List list, final zzgej zzgejVar) {
        if (list == null || list.isEmpty()) {
            zzcwwVar.zza.execute(new Runnable(zzgejVar) { // from class: com.google.android.gms.internal.ads.zzcwr
                public final zzgej zza;

                {
                    this.zza = zzgejVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(new zzead(3));
                }
            });
            return;
        }
        ListenableFuture zzh = zzgen.zzh(null);
        Iterator it = list.iterator();
        ListenableFuture listenableFuture = zzh;
        while (true) {
            ListenableFuture listenableFuture2 = listenableFuture;
            if (!it.hasNext()) {
                zzgen.zzr(listenableFuture2, new zzcwv(zzcwwVar, zzgejVar), zzcwwVar.zza);
                return;
            } else {
                final ListenableFuture listenableFuture3 = (ListenableFuture) it.next();
                listenableFuture = zzgen.zzn(zzgen.zzf(listenableFuture2, Throwable.class, new zzgdu(zzgejVar) { // from class: com.google.android.gms.internal.ads.zzcws
                    public final zzgej zza;

                    {
                        this.zza = zzgejVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzgdu
                    public final ListenableFuture zza(Object obj) {
                        this.zza.zza((Throwable) obj);
                        return zzgen.zzh(null);
                    }
                }, zzcwwVar.zza), new zzgdu(zzcwwVar, zzgejVar, listenableFuture3) { // from class: com.google.android.gms.internal.ads.zzcwt
                    public final zzcww zza;
                    public final zzgej zzb;
                    public final ListenableFuture zzc;

                    {
                        this.zza = zzcwwVar;
                        this.zzb = zzgejVar;
                        this.zzc = listenableFuture3;
                    }

                    @Override // com.google.android.gms.internal.ads.zzgdu
                    public final ListenableFuture zza(Object obj) {
                        return this.zza.zza(this.zzb, this.zzc, (zzcwh) obj);
                    }
                }, zzcwwVar.zza);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zza(zzgej zzgejVar, ListenableFuture listenableFuture, zzcwh zzcwhVar) throws Exception {
        if (zzcwhVar != null) {
            zzgejVar.zzb(zzcwhVar);
        }
        return zzgen.zzo(listenableFuture, ((Long) zzbin.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzgej zzgejVar) {
        zzgen.zzr(this.zzc, new zzcwu(this, zzgejVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
