package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayg;

/* loaded from: zzcq.class */
public final class zzcq extends zzayg implements zzcs {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zze() throws RemoteException {
        zzbm(1, zza());
    }
}
