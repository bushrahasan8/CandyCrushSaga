package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzb.class */
public final class zzb extends com.google.android.gms.internal.common.zzi {
    final BaseGmsClient zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.zza = baseGmsClient;
    }

    private static final void zza(Message message) {
        zzc zzcVar = (zzc) message.obj;
        zzcVar.zzc();
        zzcVar.zzg();
    }

    private static final boolean zzb(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        ConnectionResult connectionResult3;
        ConnectionResult connectionResult4;
        ConnectionResult connectionResult5;
        ConnectionResult connectionResult6;
        boolean z;
        if (this.zza.zzd.get() != message.arg1) {
            if (zzb(message)) {
                zza(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i == 1 || i == 7 || ((i == 4 && !this.zza.enableLocalFallback()) || message.what == 5)) && !this.zza.isConnecting()) {
            zza(message);
            return;
        }
        int i2 = message.what;
        PendingIntent pendingIntent = null;
        if (i2 == 4) {
            this.zza.zzB = new ConnectionResult(message.arg2);
            if (BaseGmsClient.zzo(this.zza)) {
                BaseGmsClient baseGmsClient = this.zza;
                z = baseGmsClient.zzC;
                if (!z) {
                    baseGmsClient.zzp(3, null);
                    return;
                }
            }
            BaseGmsClient baseGmsClient2 = this.zza;
            connectionResult4 = baseGmsClient2.zzB;
            if (connectionResult4 != null) {
                connectionResult6 = baseGmsClient2.zzB;
                connectionResult5 = connectionResult6;
            } else {
                connectionResult5 = new ConnectionResult(8);
            }
            this.zza.zzc.onReportServiceBinding(connectionResult5);
            this.zza.onConnectionFailed(connectionResult5);
            return;
        }
        if (i2 == 5) {
            BaseGmsClient baseGmsClient3 = this.zza;
            connectionResult = baseGmsClient3.zzB;
            if (connectionResult != null) {
                connectionResult3 = baseGmsClient3.zzB;
                connectionResult2 = connectionResult3;
            } else {
                connectionResult2 = new ConnectionResult(8);
            }
            this.zza.zzc.onReportServiceBinding(connectionResult2);
            this.zza.onConnectionFailed(connectionResult2);
            return;
        }
        if (i2 == 3) {
            Object obj = message.obj;
            if (obj instanceof PendingIntent) {
                pendingIntent = (PendingIntent) obj;
            }
            ConnectionResult connectionResult7 = new ConnectionResult(message.arg2, pendingIntent);
            this.zza.zzc.onReportServiceBinding(connectionResult7);
            this.zza.onConnectionFailed(connectionResult7);
            return;
        }
        if (i2 == 6) {
            this.zza.zzp(5, null);
            BaseGmsClient baseGmsClient4 = this.zza;
            baseConnectionCallbacks = baseGmsClient4.zzw;
            if (baseConnectionCallbacks != null) {
                baseConnectionCallbacks2 = baseGmsClient4.zzw;
                baseConnectionCallbacks2.onConnectionSuspended(message.arg2);
            }
            this.zza.onConnectionSuspended(message.arg2);
            BaseGmsClient.zzn(this.zza, 5, 1, null);
            return;
        }
        if (i2 == 2 && !this.zza.isConnected()) {
            zza(message);
            return;
        }
        if (zzb(message)) {
            ((zzc) message.obj).zze();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
