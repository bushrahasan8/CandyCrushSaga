package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzcaj.class */
public abstract class zzcaj extends zzayh implements zzcak {
    public zzcaj() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static zzcak zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return queryLocalInterface instanceof zzcak ? (zzcak) queryLocalInterface : new zzcai(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
            return true;
        }
        if (i != 2) {
            return false;
        }
        int zze = zze();
        parcel2.writeNoException();
        parcel2.writeInt(zze);
        return true;
    }
}
