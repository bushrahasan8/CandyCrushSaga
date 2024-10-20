package com.google.android.gms.internal.auth_api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* loaded from: zzx.class */
public final class zzx extends zzc implements zzw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    @Override // com.google.android.gms.internal.auth_api.zzw
    public final void zzc(com.google.android.gms.internal.auth-api.zzu zzuVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zze.zzc(obtainAndWriteInterfaceToken, (IInterface) zzuVar);
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.auth_api.zzw
    public final void zzc(com.google.android.gms.internal.auth-api.zzu zzuVar, CredentialRequest credentialRequest) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zze.zzc(obtainAndWriteInterfaceToken, (IInterface) zzuVar);
        zze.zzc(obtainAndWriteInterfaceToken, credentialRequest);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.auth_api.zzw
    public final void zzc(com.google.android.gms.internal.auth-api.zzu zzuVar, com.google.android.gms.internal.auth-api.zzs zzsVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zze.zzc(obtainAndWriteInterfaceToken, (IInterface) zzuVar);
        zze.zzc(obtainAndWriteInterfaceToken, (Parcelable) zzsVar);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.auth_api.zzw
    public final void zzc(com.google.android.gms.internal.auth-api.zzu zzuVar, com.google.android.gms.internal.auth-api.zzy zzyVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zze.zzc(obtainAndWriteInterfaceToken, (IInterface) zzuVar);
        zze.zzc(obtainAndWriteInterfaceToken, (Parcelable) zzyVar);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }
}
