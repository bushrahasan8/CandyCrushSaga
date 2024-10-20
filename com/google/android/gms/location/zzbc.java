package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzbc.class */
public abstract class zzbc extends com.google.android.gms.internal.location.zzb implements zzbd {
    public zzbc() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static zzbd zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof zzbd ? (zzbd) queryLocalInterface : new zzbb(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzd((Location) com.google.android.gms.internal.location.zzc.zzb(parcel, Location.CREATOR));
        return true;
    }
}
