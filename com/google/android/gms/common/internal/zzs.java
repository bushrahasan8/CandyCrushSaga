package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzs.class */
public final class zzs extends GmsClientSupervisor {
    private final HashMap zzb = new HashMap();
    private final Context zzc;
    private volatile Handler zzd;
    private final zzr zze;
    private final ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;
    private volatile Executor zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(Context context, Looper looper, Executor executor) {
        zzr zzrVar = new zzr(this, null);
        this.zze = zzrVar;
        this.zzc = context.getApplicationContext();
        this.zzd = new com.google.android.gms.internal.common.zzi(looper, zzrVar);
        this.zzf = ConnectionTracker.getInstance();
        this.zzg = UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS;
        this.zzh = 300000L;
        this.zzi = executor;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final void zza(zzo zzoVar, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            zzp zzpVar = (zzp) this.zzb.get(zzoVar);
            if (zzpVar == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + zzoVar.toString());
            }
            if (!zzpVar.zzh(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + zzoVar.toString());
            }
            zzpVar.zzf(serviceConnection, str);
            if (zzpVar.zzi()) {
                this.zzd.sendMessageDelayed(this.zzd.obtainMessage(0, zzoVar), this.zzg);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final boolean zzc(zzo zzoVar, ServiceConnection serviceConnection, String str, Executor executor) {
        zzp zzpVar;
        boolean zzj;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            zzp zzpVar2 = (zzp) this.zzb.get(zzoVar);
            Executor executor2 = executor;
            if (executor == null) {
                executor2 = this.zzi;
            }
            if (zzpVar2 == null) {
                zzp zzpVar3 = new zzp(this, zzoVar);
                zzpVar3.zzd(serviceConnection, serviceConnection, str);
                zzpVar3.zze(str, executor2);
                this.zzb.put(zzoVar, zzpVar3);
                zzpVar = zzpVar3;
            } else {
                this.zzd.removeMessages(0, zzoVar);
                if (zzpVar2.zzh(serviceConnection)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + zzoVar.toString());
                }
                zzpVar2.zzd(serviceConnection, serviceConnection, str);
                int zza = zzpVar2.zza();
                if (zza == 1) {
                    serviceConnection.onServiceConnected(zzpVar2.zzb(), zzpVar2.zzc());
                    zzpVar = zzpVar2;
                } else if (zza != 2) {
                    zzpVar = zzpVar2;
                } else {
                    zzpVar2.zze(str, executor2);
                    zzpVar = zzpVar2;
                }
            }
            zzj = zzpVar.zzj();
        }
        return zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(Executor executor) {
        synchronized (this.zzb) {
            this.zzi = executor;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(Looper looper) {
        synchronized (this.zzb) {
            this.zzd = new com.google.android.gms.internal.common.zzi(looper, this.zze);
        }
    }
}
