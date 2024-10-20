package com.google.android.gms.auth.account;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzd.class */
public abstract class zzd extends com.google.android.gms.internal.auth.zzb implements zzc {
    public static zzc zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return queryLocalInterface instanceof zzc ? (zzc) queryLocalInterface : new zze(iBinder);
    }
}
