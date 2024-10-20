package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzbow.class */
public final class zzbow extends zzayg implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbow(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzboq zzboqVar, zzbov zzbovVar) throws RemoteException {
        Parcel zza = zza();
        zzayi.zzd(zza, zzboqVar);
        zzayi.zzf(zza, zzbovVar);
        zzbn(2, zza);
    }
}
