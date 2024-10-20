package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzbuh.class */
public final class zzbuh extends zzayg implements zzbuj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbuh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbm(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayi.zzd(zza, zzeVar);
        zzbm(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzg() throws RemoteException {
        zzbm(2, zza());
    }
}
