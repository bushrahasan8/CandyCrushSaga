package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: zzgrw.class */
public final class zzgrw {
    public static final zzgrw zza = new zzgru().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (obj instanceof zzgrw) {
            return this.zzb.equals(((zzgrw) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}
