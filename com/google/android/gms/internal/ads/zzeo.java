package com.google.android.gms.internal.ads;

/* loaded from: zzeo.class */
public final class zzeo {
    private final zzel zza;
    private boolean zzb;

    public zzeo() {
        throw null;
    }

    public zzeo(zzel zzelVar) {
        this.zza = zzelVar;
    }

    public final void zza() throws InterruptedException {
        synchronized (this) {
            while (!this.zzb) {
                wait();
            }
        }
    }

    public final void zzb() {
        synchronized (this) {
            boolean z = false;
            while (!this.zzb) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final boolean zzc() {
        boolean z;
        synchronized (this) {
            z = this.zzb;
            this.zzb = false;
        }
        return z;
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this) {
            z = this.zzb;
        }
        return z;
    }

    public final boolean zze() {
        synchronized (this) {
            if (this.zzb) {
                return false;
            }
            this.zzb = true;
            notifyAll();
            return true;
        }
    }
}
