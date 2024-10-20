package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzbzt.class */
public abstract class zzbzt extends zzayh implements zzbzu {
    public zzbzt() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(zzc);
            return true;
        }
        if (i != 2) {
            return false;
        }
        int zzb = zzb();
        parcel2.writeNoException();
        parcel2.writeInt(zzb);
        return true;
    }
}
