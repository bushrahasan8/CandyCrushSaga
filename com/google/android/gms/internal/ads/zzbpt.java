package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzbpt.class */
public final class zzbpt extends zzayg implements zzbpv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zze(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpv
    public final void zzf() throws RemoteException {
        zzbm(1, zza());
    }
}
