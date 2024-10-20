package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzfwd.class */
public final class zzfwd implements ServiceConnection {
    final zzfwe zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfwd(zzfwe zzfweVar, zzfwc zzfwcVar) {
        this.zza = zzfweVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzfwe.zzf(this.zza).zzc("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.zza.zzc().post(new zzfwa(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzfwe.zzf(this.zza).zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.zza.zzc().post(new zzfwb(this));
    }
}
