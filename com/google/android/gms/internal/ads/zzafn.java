package com.google.android.gms.internal.ads;

/* loaded from: zzafn.class */
final class zzafn extends zzadi {
    private final long zza;

    public zzafn(zzacv zzacvVar, long j) {
        super(zzacvVar);
        zzek.zzd(zzacvVar.zzf() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadi, com.google.android.gms.internal.ads.zzacv
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadi, com.google.android.gms.internal.ads.zzacv
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadi, com.google.android.gms.internal.ads.zzacv
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
