package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: zzebs.class */
public final class zzebs extends zzebq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebs(Context context) {
        this.zzf = new zzbye(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, new zzebp(this));
                } catch (RemoteException | IllegalArgumentException e) {
                    this.zza.zzd(new zzecf(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzw(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zzd(new zzecf(1));
                }
            }
        }
    }

    public final ListenableFuture zzb(zzbze zzbzeVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbzeVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzebr
                public final zzebs zza;

                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza();
                }
            }, zzcep.zzf);
            return this.zza;
        }
    }
}
