package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzbys.class */
public final class zzbys extends zzayg implements zzbyu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbys(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zze(zzbym zzbymVar, zzbyx zzbyxVar) throws RemoteException {
        Parcel zza = zza();
        zzayi.zzd(zza, zzbymVar);
        zzayi.zzf(zza, zzbyxVar);
        zzbm(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzf(zzbyi zzbyiVar, zzbyx zzbyxVar) throws RemoteException {
        Parcel zza = zza();
        zzayi.zzd(zza, zzbyiVar);
        zzayi.zzf(zza, zzbyxVar);
        zzbm(1, zza);
    }
}
