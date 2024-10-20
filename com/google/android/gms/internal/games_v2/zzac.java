package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: zzac.class */
public abstract class zzac extends zzb implements zzad {
    public zzac() {
        super("com.google.android.gms.games.internal.connect.IGamesConnectCallbacks");
    }

    @Override // com.google.android.gms.internal.games_v2.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        zzaa zzaaVar = (zzaa) zzc.zza(parcel, zzaa.CREATOR);
        zzc.zzb(parcel);
        zzb(status, zzaaVar);
        return true;
    }
}
