package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzr.class */
public abstract class zzr extends com.google.android.gms.internal.auth_api.zzd implements zzq {
    public zzr() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.auth_api.zzd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzj();
            return true;
        }
        if (i != 2) {
            return false;
        }
        zzk();
        return true;
    }
}
