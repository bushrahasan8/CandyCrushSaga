package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* loaded from: zzbq.class */
public final class zzbq {
    private static final HashSet zza = new HashSet();
    private static String zzb = "media3.common";

    public static String zza() {
        String str;
        synchronized (zzbq.class) {
            try {
                str = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static void zzb(String str) {
        synchronized (zzbq.class) {
            try {
                if (zza.add(str)) {
                    zzb = zzb + ", " + str;
                }
            } finally {
            }
        }
    }
}
