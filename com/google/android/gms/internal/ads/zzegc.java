package com.google.android.gms.internal.ads;

/* loaded from: zzegc.class */
public final class zzegc {
    private long zza = 0;
    private int zzb = 0;
    private long zzc = 0;
    private long zzd = 0;
    private long zze = 0;
    private final Object zzf = new Object();
    private final Object zzg = new Object();
    private final Object zzh = new Object();
    private final Object zzi = new Object();
    private final Object zzj = new Object();

    public final int zza() {
        int i;
        synchronized (this.zzg) {
            i = this.zzb;
        }
        return i;
    }

    public final long zzb() {
        long j;
        synchronized (this) {
            synchronized (this.zzj) {
                j = this.zze;
            }
        }
        return j;
    }

    public final long zzc() {
        long j;
        synchronized (this) {
            synchronized (this.zzi) {
                j = this.zzd;
            }
        }
        return j;
    }

    public final long zzd() {
        long j;
        synchronized (this) {
            synchronized (this.zzf) {
                j = this.zza;
            }
        }
        return j;
    }

    public final long zze() {
        long j;
        synchronized (this.zzh) {
            j = this.zzc;
        }
        return j;
    }

    public final void zzf(long j) {
        synchronized (this) {
            synchronized (this.zzj) {
                this.zze = j;
            }
        }
    }

    public final void zzg(long j) {
        synchronized (this) {
            synchronized (this.zzi) {
                this.zzd = j;
            }
        }
    }

    public final void zzh(long j) {
        synchronized (this) {
            synchronized (this.zzf) {
                this.zza = j;
            }
        }
    }

    public final void zzi(int i) {
        synchronized (this.zzg) {
            this.zzb = i;
        }
    }

    public final void zzj(long j) {
        synchronized (this.zzh) {
            this.zzc = j;
        }
    }
}
