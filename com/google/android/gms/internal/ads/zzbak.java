package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzbak.class */
public final class zzbak extends zzayg implements zzbam {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzb(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayi.zzd(zza, zzeVar);
        zzbm(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzd(zzbaj zzbajVar) throws RemoteException {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbajVar);
        zzbm(1, zza);
    }
}
