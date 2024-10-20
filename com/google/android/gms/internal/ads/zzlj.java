package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzlj.class */
public final class zzlj {
    public final zzur zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlj(zzur zzurVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        zzek.zzd(!z4 || z2);
        zzek.zzd(z3 ? z2 : true);
        this.zza = zzurVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = false;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzlj.class != obj.getClass()) {
            return false;
        }
        zzlj zzljVar = (zzlj) obj;
        return this.zzb == zzljVar.zzb && this.zzc == zzljVar.zzc && this.zzd == zzljVar.zzd && this.zze == zzljVar.zze && this.zzg == zzljVar.zzg && this.zzh == zzljVar.zzh && this.zzi == zzljVar.zzi && zzfy.zzF(this.zza, zzljVar.zza);
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        long j = this.zze;
        long j2 = this.zzd;
        return ((((((((((((((hashCode + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j2)) * 31) + ((int) j)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzlj zza(long j) {
        return j == this.zzc ? this : new zzlj(this.zza, this.zzb, j, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzlj zzb(long j) {
        return j == this.zzb ? this : new zzlj(this.zza, j, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
