package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzh.class */
public final class zzh implements zzj<Bundle> {
    private final Account zzo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzh(Account account) {
        this.zzo = account;
    }

    @Override // com.google.android.gms.auth.zzj
    public final /* synthetic */ Bundle zzb(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Object zza;
        zza = zzd.zza(com.google.android.gms.internal.auth.zzf.zza(iBinder).zza(this.zzo));
        return (Bundle) zza;
    }
}
