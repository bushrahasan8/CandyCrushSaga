package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzbuk.class */
public final class zzbuk extends zzayg implements zzbum {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbuk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbum
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbum
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayi.zzd(zza, zzeVar);
        zzbm(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbum
    public final void zzg(zzbtk zzbtkVar) throws RemoteException {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbtkVar);
        zzbm(1, zza);
    }
}
