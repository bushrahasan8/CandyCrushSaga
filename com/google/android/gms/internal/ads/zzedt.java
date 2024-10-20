package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: zzedt.class */
public final class zzedt extends zzedw {
    private zzbyi zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedt(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzt().zzb();
        this.zzg = scheduledExecutorService;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            this.zzc = true;
            try {
                try {
                    this.zzd.zzp().zzf(this.zzh, new zzedv(this));
                } catch (RemoteException e) {
                    this.zza.zzd(new zzecf(1));
                }
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzo().zzw(th, "RemoteAdsServiceSignalClientTask.onConnected");
                this.zza.zzd(th);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedw, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        zzcec.zze(format);
        this.zza.zzd(new zzecf(1, format));
    }

    public final ListenableFuture zza(zzbyi zzbyiVar, long j) {
        synchronized (this) {
            if (this.zzb) {
                return zzgen.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
            }
            this.zzb = true;
            this.zzh = zzbyiVar;
            zzb();
            ListenableFuture zzo = zzgen.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
            zzo.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzeds
                public final zzedt zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc();
                }
            }, zzcep.zzf);
            return zzo;
        }
    }
}
