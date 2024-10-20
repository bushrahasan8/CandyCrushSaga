package com.google.android.gms.games.internal;

/* loaded from: zzl.class */
public final class zzl {
    public static final zzl zza = new zzl(new zzj(null));
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;

    private zzl(zzj zzjVar) {
        boolean z;
        boolean z2;
        boolean z3;
        z = zzjVar.zza;
        this.zzb = z;
        z2 = zzjVar.zzb;
        this.zzc = z2;
        z3 = zzjVar.zzc;
        this.zzd = z3;
    }

    public static zzj zza() {
        return new zzj(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzl.class != obj.getClass()) {
            return false;
        }
        zzl zzlVar = (zzl) obj;
        return this.zzb == zzlVar.zzb && this.zzc == zzlVar.zzc && this.zzd == zzlVar.zzd;
    }

    public final int hashCode() {
        return ((((this.zzb ? 1 : 0) * 31) + (this.zzc ? 1 : 0)) * 31) + (this.zzd ? 1 : 0);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
