package com.google.android.gms.internal.ads;

/* loaded from: zzadt.class */
public class zzadt implements zzadu {
    private final long zza;
    private final zzads zzb;

    public zzadt(long j, long j2) {
        this.zza = j;
        zzadv zzadvVar = j2 == 0 ? zzadv.zza : new zzadv(0L, j2);
        this.zzb = new zzads(zzadvVar, zzadvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return false;
    }
}
