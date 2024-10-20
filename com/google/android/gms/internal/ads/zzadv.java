package com.google.android.gms.internal.ads;

import com.ironsource.t2;

/* loaded from: zzadv.class */
public final class zzadv {
    public static final zzadv zza = new zzadv(0, 0);
    public final long zzb;
    public final long zzc;

    public zzadv(long j, long j2) {
        this.zzb = j;
        this.zzc = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzadv.class != obj.getClass()) {
            return false;
        }
        zzadv zzadvVar = (zzadv) obj;
        return this.zzb == zzadvVar.zzb && this.zzc == zzadvVar.zzc;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        return "[timeUs=" + this.zzb + ", position=" + this.zzc + t2.i.e;
    }
}
