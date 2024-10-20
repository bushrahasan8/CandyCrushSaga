package com.google.android.gms.games.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzan.class */
public abstract class zzan extends com.google.android.gms.internal.games_v2.zzb implements zzao {
    public zzan() {
        super("com.google.android.gms.games.internal.IGamesClient");
    }

    @Override // com.google.android.gms.internal.games_v2.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1001) {
            return false;
        }
        com.google.android.gms.internal.games_v2.zzan zzb = zzb();
        parcel2.writeNoException();
        com.google.android.gms.internal.games_v2.zzc.zze(parcel2, zzb);
        return true;
    }
}
