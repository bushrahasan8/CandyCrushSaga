package com.google.android.gms.internal.ads;

/* loaded from: zzfw.class */
public final class zzfw {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzfw(long j) {
        zzi(0L);
    }

    public static long zzg(long j) {
        return (j * 1000000) / 90000;
    }

    public static long zzh(long j) {
        return (j * 90000) / 1000000;
    }

    public final long zza(long j) {
        long j2;
        synchronized (this) {
            if (!zzj()) {
                long j3 = this.zza;
                long j4 = j3;
                if (j3 == 9223372036854775806L) {
                    Long l = (Long) this.zzd.get();
                    l.getClass();
                    j4 = l.longValue();
                }
                this.zzb = j4 - j;
                notifyAll();
            }
            this.zzc = j;
            j2 = this.zzb;
        }
        return j + j2;
    }

    public final long zzb(long j) {
        synchronized (this) {
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            long j2 = this.zzc;
            long j3 = j;
            if (j2 != -9223372036854775807L) {
                long zzh = zzh(j2);
                long j4 = (4294967296L + zzh) / 8589934592L;
                long j5 = (((-1) + j4) * 8589934592L) + j;
                long j6 = j + (j4 * 8589934592L);
                j3 = j6;
                if (Math.abs(j5 - zzh) < Math.abs(j6 - zzh)) {
                    j3 = j5;
                }
            }
            return zza(zzg(j3));
        }
    }

    public final long zzc(long j) {
        synchronized (this) {
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            long j2 = this.zzc;
            long j3 = j;
            if (j2 != -9223372036854775807L) {
                long zzh = zzh(j2);
                long j4 = zzh / 8589934592L;
                Long.signum(j4);
                long j5 = (j4 * 8589934592L) + j;
                j3 = j + ((j4 + 1) * 8589934592L);
                if (j5 >= zzh) {
                    j3 = j5;
                }
            }
            return zza(zzg(j3));
        }
    }

    public final long zzd() {
        synchronized (this) {
            long j = this.zza;
            if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
                return -9223372036854775807L;
            }
            return j;
        }
    }

    public final long zze() {
        long zzd;
        synchronized (this) {
            long j = this.zzc;
            zzd = j != -9223372036854775807L ? j + this.zzb : zzd();
        }
        return zzd;
    }

    public final long zzf() {
        long j;
        synchronized (this) {
            j = this.zzb;
        }
        return j;
    }

    public final void zzi(long j) {
        synchronized (this) {
            this.zza = j;
            this.zzb = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
            this.zzc = -9223372036854775807L;
        }
    }

    public final boolean zzj() {
        long j;
        synchronized (this) {
            j = this.zzb;
        }
        return j != -9223372036854775807L;
    }
}
