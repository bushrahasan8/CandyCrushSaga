package com.google.android.gms.internal.ads;

/* loaded from: zzpg.class */
public final class zzpg {
    public static final zzpg zza = new zzpe().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzpg(zzpe zzpeVar, zzpf zzpfVar) {
        boolean z;
        boolean z2;
        boolean z3;
        z = zzpeVar.zza;
        this.zzb = z;
        z2 = zzpeVar.zzb;
        this.zzc = z2;
        z3 = zzpeVar.zzc;
        this.zzd = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzpg.class != obj.getClass()) {
            return false;
        }
        zzpg zzpgVar = (zzpg) obj;
        return this.zzb == zzpgVar.zzb && this.zzc == zzpgVar.zzc && this.zzd == zzpgVar.zzd;
    }

    public final int hashCode() {
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.zzd ? 1 : 0);
    }
}
