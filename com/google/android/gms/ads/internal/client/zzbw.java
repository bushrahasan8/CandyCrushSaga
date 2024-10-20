package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayg;

/* loaded from: zzbw.class */
public final class zzbw extends zzayg implements zzby {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zze() throws RemoteException {
        zzbm(1, zza());
    }
}
