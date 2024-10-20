package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: zzqd.class */
final class zzqd {
    private final zzqc zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzqd(AudioTrack audioTrack) {
        int i = zzfy.zza;
        this.zza = new zzqc(audioTrack);
        zzh(0);
    }

    private final void zzh(int i) {
        this.zzb = i;
        long j = 10000;
        if (i == 0) {
            this.zze = 0L;
            this.zzf = -1L;
            this.zzc = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.zzd = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.zzd = j;
    }

    @TargetApi(19)
    public final long zza() {
        return this.zza.zza();
    }

    @TargetApi(19)
    public final long zzb() {
        return this.zza.zzb();
    }

    public final void zzc() {
        if (this.zzb == 4) {
            zzh(0);
        }
    }

    public final void zzd() {
        zzh(4);
    }

    public final void zze() {
        zzh(0);
    }

    public final boolean zzf() {
        return this.zzb == 2;
    }

    @TargetApi(19)
    public final boolean zzg(long j) {
        boolean z = false;
        if (j - this.zze < this.zzd) {
            return false;
        }
        zzqc zzqcVar = this.zza;
        this.zze = j;
        boolean zzc = zzqcVar.zzc();
        int i = this.zzb;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (!zzc) {
                        zzh(0);
                        return false;
                    }
                    z = true;
                } else if (i != 3) {
                    z = zzc;
                } else if (zzc) {
                    zzh(0);
                    return true;
                }
            } else if (zzc) {
                if (this.zza.zza() > this.zzf) {
                    zzh(2);
                    return true;
                }
                z = true;
            } else {
                zzh(0);
            }
        } else if (zzc) {
            if (this.zza.zzb() >= this.zzc) {
                this.zzf = this.zza.zza();
                zzh(1);
                return true;
            }
        } else if (j - this.zzc > 500000) {
            zzh(3);
            return false;
        }
        return z;
    }
}
