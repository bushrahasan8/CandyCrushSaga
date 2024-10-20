package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: zzedw.class */
public abstract class zzedw implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzceu zza = new zzceu();
    protected boolean zzb = false;
    protected boolean zzc = false;
    protected zzbyh zzd;
    protected Context zze;
    protected Looper zzf;
    protected ScheduledExecutorService zzg;

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        String format = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", Integer.valueOf(connectionResult.getErrorCode()));
        zzcec.zze(format);
        this.zza.zzd(new zzecf(1, format));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        zzcec.zze(format);
        this.zza.zzd(new zzecf(1, format));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzb() {
        synchronized (this) {
            if (this.zzd == null) {
                this.zzd = new zzbyh(this.zze, this.zzf, this, this);
            }
            this.zzd.checkAvailabilityAndConnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzc() {
        synchronized (this) {
            this.zzc = true;
            zzbyh zzbyhVar = this.zzd;
            if (zzbyhVar == null) {
                return;
            }
            if (!zzbyhVar.isConnected()) {
                if (this.zzd.isConnecting()) {
                }
                Binder.flushPendingCommands();
            }
            this.zzd.disconnect();
            Binder.flushPendingCommands();
        }
    }
}
