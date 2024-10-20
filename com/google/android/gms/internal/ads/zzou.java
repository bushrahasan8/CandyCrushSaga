package com.google.android.gms.internal.ads;

/* loaded from: zzou.class */
final class zzou {
    final zzov zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzur zze;
    private boolean zzf;
    private boolean zzg;

    public zzou(zzov zzovVar, String str, int i, zzur zzurVar) {
        this.zza = zzovVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzurVar == null ? -1L : zzurVar.zzd;
        if (zzurVar == null || !zzurVar.zzb()) {
            return;
        }
        this.zze = zzurVar;
    }

    public final void zzg(int i, zzur zzurVar) {
        if (this.zzd == -1 && i == this.zzc && zzurVar != null) {
            zzov zzovVar = this.zza;
            long j = zzurVar.zzd;
            if (j >= zzov.zza(zzovVar)) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzj(int i, zzur zzurVar) {
        if (zzurVar == null) {
            return i == this.zzc;
        }
        zzur zzurVar2 = this.zze;
        return zzurVar2 == null ? !zzurVar.zzb() && zzurVar.zzd == this.zzd : zzurVar.zzd == zzurVar2.zzd && zzurVar.zzb == zzurVar2.zzb && zzurVar.zzc == zzurVar2.zzc;
    }

    public final boolean zzk(zzmq zzmqVar) {
        zzur zzurVar = zzmqVar.zzd;
        if (zzurVar == null) {
            return this.zzc != zzmqVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        if (zzurVar.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzcx zzcxVar = zzmqVar.zzb;
        int zza = zzcxVar.zza(zzurVar.zza);
        int zza2 = zzcxVar.zza(this.zze.zza);
        zzur zzurVar2 = zzmqVar.zzd;
        if (zzurVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        if (!zzurVar2.zzb()) {
            int i = zzmqVar.zzd.zze;
            return i == -1 || i > this.zze.zzb;
        }
        zzur zzurVar3 = zzmqVar.zzd;
        int i2 = zzurVar3.zzb;
        int i3 = zzurVar3.zzc;
        zzur zzurVar4 = this.zze;
        int i4 = zzurVar4.zzb;
        boolean z = true;
        if (i2 <= i4) {
            if (i2 != i4) {
                z = false;
            } else {
                if (i3 <= zzurVar4.zzc) {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r9 < r8.zzc()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(com.google.android.gms.internal.ads.zzcx r7, com.google.android.gms.internal.ads.zzcx r8) {
        /*
            r6 = this;
            r0 = r6
            int r0 = r0.zzc
            r9 = r0
            r0 = r9
            r1 = r7
            int r1 = r1.zzc()
            if (r0 < r1) goto L1d
            r0 = r9
            r1 = r8
            int r1 = r1.zzc()
            if (r0 >= r1) goto L18
            goto L70
        L18:
            r0 = -1
            r9 = r0
            goto L70
        L1d:
            r0 = r7
            r1 = r9
            r2 = r6
            com.google.android.gms.internal.ads.zzov r2 = r2.zza
            com.google.android.gms.internal.ads.zzcw r2 = com.google.android.gms.internal.ads.zzov.zzc(r2)
            r3 = 0
            com.google.android.gms.internal.ads.zzcw r0 = r0.zze(r1, r2, r3)
            r0 = r6
            com.google.android.gms.internal.ads.zzov r0 = r0.zza
            com.google.android.gms.internal.ads.zzcw r0 = com.google.android.gms.internal.ads.zzov.zzc(r0)
            int r0 = r0.zzp
            r9 = r0
        L36:
            r0 = r9
            r1 = r6
            com.google.android.gms.internal.ads.zzov r1 = r1.zza
            com.google.android.gms.internal.ads.zzcw r1 = com.google.android.gms.internal.ads.zzov.zzc(r1)
            int r1 = r1.zzq
            if (r0 > r1) goto L18
            r0 = r8
            r1 = r7
            r2 = r9
            java.lang.Object r1 = r1.zzf(r2)
            int r0 = r0.zza(r1)
            r10 = r0
            r0 = r10
            r1 = -1
            if (r0 == r1) goto L6a
            r0 = r8
            r1 = r10
            r2 = r6
            com.google.android.gms.internal.ads.zzov r2 = r2.zza
            com.google.android.gms.internal.ads.zzcu r2 = com.google.android.gms.internal.ads.zzov.zzb(r2)
            r3 = 0
            com.google.android.gms.internal.ads.zzcu r0 = r0.zzd(r1, r2, r3)
            int r0 = r0.zzd
            r9 = r0
            goto L70
        L6a:
            int r9 = r9 + 1
            goto L36
        L70:
            r0 = r6
            r1 = r9
            r0.zzc = r1
            r0 = r9
            r1 = -1
            if (r0 != r1) goto L7c
            r0 = 0
            return r0
        L7c:
            r0 = r6
            com.google.android.gms.internal.ads.zzur r0 = r0.zze
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L87
            r0 = 1
            return r0
        L87:
            r0 = r8
            r1 = r7
            java.lang.Object r1 = r1.zza
            int r0 = r0.zza(r1)
            r1 = -1
            if (r0 == r1) goto L95
            r0 = 1
            return r0
        L95:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzou.zzl(com.google.android.gms.internal.ads.zzcx, com.google.android.gms.internal.ads.zzcx):boolean");
    }
}
