package com.google.android.gms.internal.auth_api;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* loaded from: zzw.class */
public interface zzw extends IInterface {
    void zzc(com.google.android.gms.internal.auth-api.zzu zzuVar) throws RemoteException;

    void zzc(com.google.android.gms.internal.auth-api.zzu zzuVar, CredentialRequest credentialRequest) throws RemoteException;

    void zzc(com.google.android.gms.internal.auth-api.zzu zzuVar, com.google.android.gms.internal.auth-api.zzs zzsVar) throws RemoteException;

    void zzc(com.google.android.gms.internal.auth-api.zzu zzuVar, com.google.android.gms.internal.auth-api.zzy zzyVar) throws RemoteException;
}
