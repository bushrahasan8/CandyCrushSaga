package com.google.android.gms.internal.ads;

/* loaded from: zzgct.class */
public final class zzgct {
    public static char zza(long j) {
        char c = (char) j;
        zzfxe.zzg(((long) c) == j, "Out of range: %s", j);
        return c;
    }

    public static char zzb(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }
}
