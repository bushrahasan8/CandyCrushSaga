package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* loaded from: zzgx.class */
public final /* synthetic */ class zzgx {
    public static <V> V zza(zzha<V> zzhaVar) {
        V zza;
        try {
            zza = zzhaVar.zza();
        } catch (SecurityException e) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                zza = zzhaVar.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return zza;
    }
}
