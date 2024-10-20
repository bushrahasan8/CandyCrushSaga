package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: zzebq.class */
public abstract class zzebq implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzceu zza = new zzceu();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbze zze;
    protected zzbye zzf;

    public void onConnectionFailed(ConnectionResult connectionResult) {
        zzcec.zze("Disconnected from remote ad request service.");
        this.zza.zzd(new zzecf(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzcec.zze("Cannot connect to remote service, fallback to local instance.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza() {
        synchronized (this.zzb) {
            this.zzd = true;
            if (!this.zzf.isConnected()) {
                if (this.zzf.isConnecting()) {
                }
                Binder.flushPendingCommands();
            }
            this.zzf.disconnect();
            Binder.flushPendingCommands();
        }
    }
}
