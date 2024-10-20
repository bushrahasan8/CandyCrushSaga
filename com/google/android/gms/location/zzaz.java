package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzaz.class */
public abstract class zzaz extends com.google.android.gms.internal.location.zzb implements zzba {
    public zzaz() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static zzba zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof zzba ? (zzba) queryLocalInterface : new zzay(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzd((LocationResult) com.google.android.gms.internal.location.zzc.zzb(parcel, LocationResult.CREATOR));
            return true;
        }
        if (i != 2) {
            return false;
        }
        zze((LocationAvailability) com.google.android.gms.internal.location.zzc.zzb(parcel, LocationAvailability.CREATOR));
        return true;
    }
}
