package com.google.android.gms.auth;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzay;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzi.class */
public final class zzi implements zzj<Boolean> {
    private final String zzt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzi(String str) {
        this.zzt = str;
    }

    @Override // com.google.android.gms.auth.zzj
    public final /* synthetic */ Boolean zzb(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Object zza;
        Logger logger;
        zza = zzd.zza(com.google.android.gms.internal.auth.zzf.zza(iBinder).zza(this.zzt));
        Bundle bundle = (Bundle) zza;
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzay zzc = zzay.zzc(string);
        if (zzay.SUCCESS.equals(zzc)) {
            return Boolean.TRUE;
        }
        if (!zzay.zza(zzc)) {
            throw new GoogleAuthException(string);
        }
        logger = zzd.zzn;
        String valueOf = String.valueOf(zzc);
        StringBuilder sb = new StringBuilder(valueOf.length() + 31);
        sb.append("isUserRecoverableError status: ");
        sb.append(valueOf);
        logger.w("GoogleAuthUtil", sb.toString());
        throw new UserRecoverableAuthException(string, intent);
    }
}
