package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzt.class */
public abstract class zzt extends zzw implements zzu {
    public zzt() {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzw
    protected final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzx.zza(parcel, Bundle.CREATOR);
        zzx.zzb(parcel);
        zza(bundle);
        parcel2.writeNoException();
        return true;
    }
}
