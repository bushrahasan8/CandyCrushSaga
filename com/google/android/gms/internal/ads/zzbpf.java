package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzbpf.class */
public final class zzbpf extends zzayg implements zzbph {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbm(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzf() throws RemoteException {
        zzbm(2, zza());
    }
}
