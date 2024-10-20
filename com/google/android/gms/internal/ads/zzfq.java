package com.google.android.gms.internal.ads;

/* loaded from: zzfq.class */
public final class zzfq {
    public static final zzfq zza = new zzfq(-1, -1);
    public static final zzfq zzb = new zzfq(0, 0);
    private final int zzc;
    private final int zzd;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r5 >= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r4 >= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzfq(int r4, int r5) {
        /*
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = 0
            r7 = r0
            r0 = r4
            r1 = -1
            if (r0 == r1) goto L13
            r0 = r7
            r6 = r0
            r0 = r4
            if (r0 < 0) goto L21
        L13:
            r0 = r5
            r1 = -1
            if (r0 == r1) goto L1f
            r0 = r7
            r6 = r0
            r0 = r5
            if (r0 < 0) goto L21
        L1f:
            r0 = 1
            r6 = r0
        L21:
            r0 = r6
            com.google.android.gms.internal.ads.zzek.zzd(r0)
            r0 = r3
            r1 = r4
            r0.zzc = r1
            r0 = r3
            r1 = r5
            r0.zzd = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfq.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfq)) {
            return false;
        }
        zzfq zzfqVar = (zzfq) obj;
        return this.zzc == zzfqVar.zzc && this.zzd == zzfqVar.zzd;
    }

    public final int hashCode() {
        int i = this.zzc;
        return ((i >>> 16) | (i << 16)) ^ this.zzd;
    }

    public final String toString() {
        return this.zzc + "x" + this.zzd;
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzc;
    }
}
