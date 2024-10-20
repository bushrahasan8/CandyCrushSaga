package com.google.android.gms.internal.ads;

/* loaded from: zzacj.class */
public class zzacj implements zzadu {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzacj(long j, long j2, int i, int i2, boolean z) {
        long zzc;
        this.zza = j;
        this.zzb = j2;
        this.zzc = i2 == -1 ? 1 : i2;
        this.zze = i;
        if (j == -1) {
            this.zzd = -1L;
            zzc = -9223372036854775807L;
        } else {
            this.zzd = j - j2;
            zzc = zzc(j, j2, i);
        }
        this.zzf = zzc;
    }

    private static long zzc(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long j) {
        return zzc(j, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        long j2 = this.zzd;
        if (j2 == -1) {
            zzadv zzadvVar = new zzadv(0L, this.zzb);
            return new zzads(zzadvVar, zzadvVar);
        }
        long j3 = this.zzc;
        long j4 = (((this.zze * j) / 8000000) / j3) * j3;
        long j5 = j4;
        if (j2 != -1) {
            j5 = Math.min(j4, j2 - j3);
        }
        long max = this.zzb + Math.max(j5, 0L);
        long zzb = zzb(max);
        zzadv zzadvVar2 = new zzadv(zzb, max);
        if (this.zzd != -1 && zzb < j) {
            long j6 = max + this.zzc;
            if (j6 < this.zza) {
                return new zzads(zzadvVar2, new zzadv(zzb(j6), j6));
            }
        }
        return new zzads(zzadvVar2, zzadvVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return this.zzd != -1;
    }
}
