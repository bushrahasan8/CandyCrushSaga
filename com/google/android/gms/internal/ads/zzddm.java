package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: zzddm.class */
public final class zzddm extends zzdgl {
    private final ScheduledExecutorService zzb;
    private final Clock zzc;
    private long zzd;
    private long zze;
    private boolean zzf;
    private ScheduledFuture zzg;

    public zzddm(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = false;
        this.zzb = scheduledExecutorService;
        this.zzc = clock;
    }

    private final void zze(long j) {
        synchronized (this) {
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzg.cancel(true);
            }
            this.zzd = this.zzc.elapsedRealtime() + j;
            this.zzg = this.zzb.schedule(new zzddl(this, null), j, TimeUnit.MILLISECONDS);
        }
    }

    public final void zza() {
        synchronized (this) {
            this.zzf = false;
            zze(0L);
        }
    }

    public final void zzb() {
        synchronized (this) {
            if (this.zzf) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.zze = -1L;
            } else {
                this.zzg.cancel(true);
                this.zze = this.zzd - this.zzc.elapsedRealtime();
            }
            this.zzf = true;
        }
    }

    public final void zzc() {
        synchronized (this) {
            if (this.zzf) {
                if (this.zze > 0 && this.zzg.isCancelled()) {
                    zze(this.zze);
                }
                this.zzf = false;
            }
        }
    }

    public final void zzd(int i) {
        synchronized (this) {
            if (i > 0) {
                long millis = TimeUnit.SECONDS.toMillis(i);
                if (this.zzf) {
                    long j = this.zze;
                    if (j <= 0 || millis >= j) {
                        millis = j;
                    }
                    this.zze = millis;
                    return;
                }
                long elapsedRealtime = this.zzc.elapsedRealtime();
                long j2 = this.zzd;
                if (elapsedRealtime > j2 || j2 - this.zzc.elapsedRealtime() > millis) {
                    zze(millis);
                }
            }
        }
    }
}
