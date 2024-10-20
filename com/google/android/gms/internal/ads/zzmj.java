package com.google.android.gms.internal.ads;

/* loaded from: zzmj.class */
public final class zzmj {
    public static final zzmj zza;
    public static final zzmj zzb;
    public static final zzmj zzc;
    public static final zzmj zzd;
    public static final zzmj zze;
    public final long zzf;
    public final long zzg;

    static {
        zzmj zzmjVar = new zzmj(0L, 0L);
        zza = zzmjVar;
        zzb = new zzmj(Long.MAX_VALUE, Long.MAX_VALUE);
        zzc = new zzmj(Long.MAX_VALUE, 0L);
        zzd = new zzmj(0L, Long.MAX_VALUE);
        zze = zzmjVar;
    }

    public zzmj(long j, long j2) {
        zzek.zzd(j >= 0);
        zzek.zzd(j2 >= 0);
        this.zzf = j;
        this.zzg = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzmj.class != obj.getClass()) {
            return false;
        }
        zzmj zzmjVar = (zzmj) obj;
        return this.zzf == zzmjVar.zzf && this.zzg == zzmjVar.zzg;
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
