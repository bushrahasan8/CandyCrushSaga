package com.google.android.gms.internal.measurement;

/* loaded from: zzci.class */
public final class zzci {
    private static zzch zza = new zzck();

    public static zzch zza() {
        zzch zzchVar;
        synchronized (zzci.class) {
            try {
                zzchVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzchVar;
    }
}
