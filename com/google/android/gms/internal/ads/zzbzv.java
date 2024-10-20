package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzbzv.class */
public final class zzbzv extends zzayg implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbzu zzbzuVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbzuVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbm(2, zza);
    }
}
