package com.google.android.gms.internal.games_v2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzae.class */
public final class zzae extends zza implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.connect.IGamesConnectService");
    }

    public final void zzd(zzad zzadVar, zzy zzyVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzf(zza, zzadVar);
        zzc.zzd(zza, zzyVar);
        zzc(2, zza);
    }
}
