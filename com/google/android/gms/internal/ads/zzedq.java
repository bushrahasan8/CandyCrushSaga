package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: zzedq.class */
public final class zzedq extends zzedw {
    private zzbym zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedq(Context context, ScheduledExecutorService scheduledExecutorService) {
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
                    this.zzd.zzp().zze(this.zzh, new zzedv(this));
                } catch (RemoteException e) {
                    this.zza.zzd(new zzecf(1));
                }
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzo().zzw(th, "RemoteAdsServiceProxyClientTask.onConnected");
                this.zza.zzd(th);
            }
        }
    }

    public final ListenableFuture zza(zzbym zzbymVar, long j) {
        synchronized (this) {
            if (this.zzb) {
                return zzgen.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
            }
            this.zzb = true;
            this.zzh = zzbymVar;
            zzb();
            ListenableFuture zzo = zzgen.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
            zzo.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzedp
                public final zzedq zza;

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
