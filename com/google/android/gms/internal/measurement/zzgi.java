package com.google.android.gms.internal.measurement;

/* loaded from: zzgi.class */
public final class zzgi {
    private static zzgh zza;

    public static zzgh zza() {
        zzgh zzghVar;
        synchronized (zzgi.class) {
            try {
                if (zza == null) {
                    zza(new zzgk());
                }
                zzghVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzghVar;
    }

    private static void zza(zzgh zzghVar) {
        synchronized (zzgi.class) {
            try {
                if (zza != null) {
                    throw new IllegalStateException("init() already called");
                }
                zza = zzghVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
