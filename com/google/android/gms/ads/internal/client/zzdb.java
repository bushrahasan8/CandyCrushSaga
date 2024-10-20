package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayg;

/* loaded from: zzdb.class */
public final class zzdb extends zzayg implements zzdd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdd
    public final void zze() throws RemoteException {
        zzbm(1, zza());
    }
}
