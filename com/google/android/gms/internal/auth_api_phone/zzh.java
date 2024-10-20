package com.google.android.gms.internal.auth_api_phone;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: zzh.class */
public abstract class zzh extends zzb implements zzg {
    public zzh() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // com.google.android.gms.internal.auth_api_phone.zzb
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zza((Status) zzc.zza(parcel, Status.CREATOR));
        return true;
    }
}
