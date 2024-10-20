package com.google.android.gms.internal.ads;

/* loaded from: zzanc.class */
final class zzanc {
    private final zzaea zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzanc(zzaea zzaeaVar) {
        this.zza = zzaeaVar;
    }

    public final void zza(byte[] bArr, int i, int i2) {
        if (this.zzc) {
            int i3 = this.zzf;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.zzf = i3 + (i2 - i);
            } else {
                this.zzd = ((bArr[i4] & 192) >> 6) == 0;
                this.zzc = false;
            }
        }
    }

    public final void zzb(long j, int i, boolean z) {
        zzek.zzf(this.zzh != -9223372036854775807L);
        if (this.zze == 182 && z && this.zzb) {
            this.zza.zzt(this.zzh, this.zzd ? 1 : 0, (int) (j - this.zzg), i, null);
        }
        if (this.zze != 179) {
            this.zzg = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(int r5, long r6) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            r0.zze = r1
            r0 = r4
            r1 = 0
            r0.zzd = r1
            r0 = 1
            r10 = r0
            r0 = r5
            r8 = r0
            r0 = r5
            r1 = 182(0xb6, float:2.55E-43)
            if (r0 == r1) goto L23
            r0 = r5
            r1 = 179(0xb3, float:2.51E-43)
            if (r0 != r1) goto L2c
            r0 = 179(0xb3, float:2.51E-43)
            r8 = r0
        L23:
            r0 = 1
            r9 = r0
            r0 = r8
            r5 = r0
            goto L2f
        L2c:
            r0 = 0
            r9 = r0
        L2f:
            r0 = r4
            r1 = r9
            r0.zzb = r1
            r0 = r5
            r1 = 182(0xb6, float:2.55E-43)
            if (r0 != r1) goto L43
            r0 = r10
            r9 = r0
            goto L46
        L43:
            r0 = 0
            r9 = r0
        L46:
            r0 = r4
            r1 = r9
            r0.zzc = r1
            r0 = r4
            r1 = 0
            r0.zzf = r1
            r0 = r4
            r1 = r6
            r0.zzh = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanc.zzc(int, long):void");
    }

    public final void zzd() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }
}
