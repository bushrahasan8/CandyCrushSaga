package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: zzt.class */
public abstract class zzt extends com.google.android.gms.internal.auth_api.zzd implements zzs {
    public zzt() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
    @Override // com.google.android.gms.internal.auth_api.zzd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                zzc((GoogleSignInAccount) com.google.android.gms.internal.auth_api.zze.zzc(parcel, GoogleSignInAccount.CREATOR), (Status) com.google.android.gms.internal.auth_api.zze.zzc(parcel, Status.CREATOR));
                parcel2.writeNoException();
                return true;
            case 102:
                zze((Status) com.google.android.gms.internal.auth_api.zze.zzc(parcel, Status.CREATOR));
                parcel2.writeNoException();
                return true;
            case 103:
                zzf((Status) com.google.android.gms.internal.auth_api.zze.zzc(parcel, Status.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
