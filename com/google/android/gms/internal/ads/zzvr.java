package com.google.android.gms.internal.ads;

/* loaded from: zzvr.class */
final class zzvr {
    public final int zza;
    public final boolean zzb;

    public zzvr(int i, boolean z) {
        this.zza = i;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzvr.class != obj.getClass()) {
            return false;
        }
        zzvr zzvrVar = (zzvr) obj;
        return this.zza == zzvrVar.zza && this.zzb == zzvrVar.zzb;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
