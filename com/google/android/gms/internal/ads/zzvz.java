package com.google.android.gms.internal.ads;

import com.google.android.gms.drive.ExecutionOptions;

/* loaded from: zzvz.class */
final class zzvz implements zzyr {
    public long zza;
    public long zzb;
    public zzyq zzc;
    public zzvz zzd;

    public zzvz(long j, int i) {
        zze(j, ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH);
    }

    public final int zza(long j) {
        long j2 = this.zza;
        int i = this.zzc.zzb;
        return (int) (j - j2);
    }

    public final zzvz zzb() {
        this.zzc = null;
        zzvz zzvzVar = this.zzd;
        this.zzd = null;
        return zzvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final zzyq zzc() {
        zzyq zzyqVar = this.zzc;
        zzyqVar.getClass();
        return zzyqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final zzyr zzd() {
        zzvz zzvzVar = this.zzd;
        if (zzvzVar == null || zzvzVar.zzc == null) {
            return null;
        }
        return zzvzVar;
    }

    public final void zze(long j, int i) {
        zzek.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + 65536;
    }
}
