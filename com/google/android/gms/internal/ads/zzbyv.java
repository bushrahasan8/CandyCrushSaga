package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: zzbyv.class */
public final class zzbyv extends zzayg implements zzbyx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel zza = zza();
        zzayi.zzd(zza, zzbbVar);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzayi.zzd(zza, parcelFileDescriptor);
        zzbm(1, zza);
    }
}
