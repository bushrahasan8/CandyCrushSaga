package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: zzang.class */
final class zzang {
    private final zzaea zza;
    private final zzgn zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private boolean zzo;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final zzanf zzi = new zzanf(null);
    private final zzanf zzj = new zzanf(null);
    private boolean zzk = false;

    public zzang(zzaea zzaeaVar, boolean z, boolean z2) {
        this.zza = zzaeaVar;
        byte[] bArr = new byte[128];
        this.zze = bArr;
        this.zzd = new zzgn(bArr, 0, 0);
    }

    private final void zzg(int i) {
        long j = this.zzm;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z = this.zzn;
        this.zza.zzt(j, z ? 1 : 0, (int) (this.zzg - this.zzl), i, null);
    }

    public final void zza(long j) {
        this.zzg = j;
        zzg(0);
        this.zzk = false;
    }

    public final void zzb(zzgk zzgkVar) {
        this.zzc.append(zzgkVar.zza, zzgkVar);
    }

    public final void zzc(zzgl zzglVar) {
        this.zzb.append(zzglVar.zzd, zzglVar);
    }

    public final void zzd() {
        this.zzk = false;
    }

    public final void zze(long j, int i, long j2, boolean z) {
        this.zzf = i;
        this.zzh = j2;
        this.zzg = j;
        this.zzo = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (r0 == 1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzf(long r8, int r10, boolean r11) {
        /*
            r7 = this;
            r0 = r7
            int r0 = r0.zzf
            r13 = r0
            r0 = 0
            r12 = r0
            r0 = r13
            r1 = 9
            if (r0 == r1) goto L13
            goto L46
        L13:
            r0 = r11
            if (r0 == 0) goto L2c
            r0 = r7
            boolean r0 = r0.zzk
            if (r0 == 0) goto L2c
            r0 = r7
            r1 = r10
            r2 = r8
            r3 = r7
            long r3 = r3.zzg
            long r2 = r2 - r3
            int r2 = (int) r2
            int r1 = r1 + r2
            r0.zzg(r1)
        L2c:
            r0 = r7
            r1 = r7
            long r1 = r1.zzg
            r0.zzl = r1
            r0 = r7
            r1 = r7
            long r1 = r1.zzh
            r0.zzm = r1
            r0 = r7
            r1 = 0
            r0.zzn = r1
            r0 = r7
            r1 = 1
            r0.zzk = r1
        L46:
            r0 = r7
            boolean r0 = r0.zzo
            r14 = r0
            r0 = r7
            boolean r0 = r0.zzn
            r11 = r0
            r0 = r7
            int r0 = r0.zzf
            r13 = r0
            r0 = r13
            r1 = 5
            if (r0 == r1) goto L6f
            r0 = r12
            r10 = r0
            r0 = r14
            if (r0 == 0) goto L71
            r0 = r12
            r10 = r0
            r0 = r13
            r1 = 1
            if (r0 != r1) goto L71
        L6f:
            r0 = 1
            r10 = r0
        L71:
            r0 = r11
            r1 = r10
            r0 = r0 | r1
            r11 = r0
            r0 = r7
            r1 = r11
            r0.zzn = r1
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzang.zzf(long, int, boolean):boolean");
    }
}
