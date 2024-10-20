package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: zzpt.class */
public final class zzpt {
    private final Handler zza;
    private final zzpu zzb;

    public zzpt(Handler handler, zzpu zzpuVar) {
        this.zza = zzpuVar == null ? null : handler;
        this.zzb = zzpuVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, exc) { // from class: com.google.android.gms.internal.ads.zzpn
                public final zzpt zza;
                public final Exception zzb;

                {
                    this.zza = this;
                    this.zzb = exc;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(this.zzb);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, exc) { // from class: com.google.android.gms.internal.ads.zzpo
                public final zzpt zza;
                public final Exception zzb;

                {
                    this.zza = this;
                    this.zzb = exc;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk(this.zzb);
                }
            });
        }
    }

    public final void zzc(final zzpv zzpvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, zzpvVar) { // from class: com.google.android.gms.internal.ads.zzpl
                public final zzpt zza;
                public final zzpv zzb;

                {
                    this.zza = this;
                    this.zzb = zzpvVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl(this.zzb);
                }
            });
        }
    }

    public final void zzd(final zzpv zzpvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, zzpvVar) { // from class: com.google.android.gms.internal.ads.zzpm
                public final zzpt zza;
                public final zzpv zzb;

                {
                    this.zza = this;
                    this.zzb = zzpvVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm(this.zzb);
                }
            });
        }
    }

    public final void zze(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, str, j, j2) { // from class: com.google.android.gms.internal.ads.zzpr
                public final zzpt zza;
                public final String zzb;
                public final long zzc;
                public final long zzd;

                {
                    this.zza = this;
                    this.zzb = str;
                    this.zzc = j;
                    this.zzd = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn(this.zzb, this.zzc, this.zzd);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzps
                public final zzpt zza;
                public final String zzb;

                {
                    this.zza = this;
                    this.zzb = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(this.zzb);
                }
            });
        }
    }

    public final void zzg(final zzir zzirVar) {
        zzirVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, zzirVar) { // from class: com.google.android.gms.internal.ads.zzpi
                public final zzpt zza;
                public final zzir zzb;

                {
                    this.zza = this;
                    this.zzb = zzirVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(this.zzb);
                }
            });
        }
    }

    public final void zzh(final zzir zzirVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, zzirVar) { // from class: com.google.android.gms.internal.ads.zzph
                public final zzpt zza;
                public final zzir zzb;

                {
                    this.zza = this;
                    this.zzb = zzirVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzq(this.zzb);
                }
            });
        }
    }

    public final void zzi(final zzam zzamVar, final zzis zzisVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, zzamVar, zzisVar) { // from class: com.google.android.gms.internal.ads.zzpp
                public final zzpt zza;
                public final zzam zzb;
                public final zzis zzc;

                {
                    this.zza = this;
                    this.zzb = zzamVar;
                    this.zzc = zzisVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzr(this.zzb, this.zzc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(Exception exc) {
        int i = zzfy.zza;
        this.zzb.zza(exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(Exception exc) {
        int i = zzfy.zza;
        this.zzb.zzh(exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzpv zzpvVar) {
        int i = zzfy.zza;
        this.zzb.zzi(zzpvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(zzpv zzpvVar) {
        int i = zzfy.zza;
        this.zzb.zzj(zzpvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(String str, long j, long j2) {
        int i = zzfy.zza;
        this.zzb.zzb(str, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(String str) {
        int i = zzfy.zza;
        this.zzb.zzc(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(zzir zzirVar) {
        zzirVar.zza();
        int i = zzfy.zza;
        this.zzb.zzd(zzirVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(zzir zzirVar) {
        int i = zzfy.zza;
        this.zzb.zze(zzirVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzr(zzam zzamVar, zzis zzisVar) {
        int i = zzfy.zza;
        this.zzb.zzf(zzamVar, zzisVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzs(long j) {
        int i = zzfy.zza;
        this.zzb.zzg(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzt(boolean z) {
        int i = zzfy.zza;
        this.zzb.zzn(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzu(int i, long j, long j2) {
        int i2 = zzfy.zza;
        this.zzb.zzk(i, j, j2);
    }

    public final void zzv(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, j) { // from class: com.google.android.gms.internal.ads.zzpj
                public final zzpt zza;
                public final long zzb;

                {
                    this.zza = this;
                    this.zzb = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzs(this.zzb);
                }
            });
        }
    }

    public final void zzw(final boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.zzpq
                public final zzpt zza;
                public final boolean zzb;

                {
                    this.zza = this;
                    this.zzb = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzt(this.zzb);
                }
            });
        }
    }

    public final void zzx(final int i, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable(this, i, j, j2) { // from class: com.google.android.gms.internal.ads.zzpk
                public final zzpt zza;
                public final int zzb;
                public final long zzc;
                public final long zzd;

                {
                    this.zza = this;
                    this.zzb = i;
                    this.zzc = j;
                    this.zzd = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzu(this.zzb, this.zzc, this.zzd);
                }
            });
        }
    }
}
