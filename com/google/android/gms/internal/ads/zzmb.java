package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: zzmb.class */
public final class zzmb {
    private final zzma zza;
    private final zzlz zzb;
    private final zzel zzc;
    private final zzcx zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzmb(zzlz zzlzVar, zzma zzmaVar, zzcx zzcxVar, int i, zzel zzelVar, Looper looper) {
        this.zzb = zzlzVar;
        this.zza = zzmaVar;
        this.zzd = zzcxVar;
        this.zzg = looper;
        this.zzc = zzelVar;
        this.zzh = i;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzma zzc() {
        return this.zza;
    }

    public final zzmb zzd() {
        zzek.zzf(!this.zzi);
        this.zzi = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzmb zze(Object obj) {
        zzek.zzf(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final zzmb zzf(int i) {
        zzek.zzf(!this.zzi);
        this.zze = i;
        return this;
    }

    public final Object zzg() {
        return this.zzf;
    }

    public final void zzh(boolean z) {
        synchronized (this) {
            this.zzj = z | this.zzj;
            this.zzk = true;
            notifyAll();
        }
    }

    public final boolean zzi(long j) throws InterruptedException, TimeoutException {
        boolean z;
        synchronized (this) {
            zzek.zzf(this.zzi);
            zzek.zzf(this.zzg.getThread() != Thread.currentThread());
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j;
            while (!this.zzk) {
                if (j2 <= 0) {
                    throw new TimeoutException("Message delivery timed out.");
                }
                wait(j2);
                j2 = (elapsedRealtime + j) - SystemClock.elapsedRealtime();
            }
            z = this.zzj;
        }
        return z;
    }

    public final boolean zzj() {
        synchronized (this) {
        }
        return false;
    }
}
