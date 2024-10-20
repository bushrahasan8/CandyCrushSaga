package com.google.android.gms.internal.auth_api_phone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzf.class */
public final class zzf extends zza implements zze {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    @Override // com.google.android.gms.internal.auth_api_phone.zze
    public final void zza(com.google.android.gms.internal.auth-api-phone.zzg zzgVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(obtainAndWriteInterfaceToken, (IInterface) zzgVar);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }
}
