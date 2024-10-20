package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: zzetq.class */
public final class zzetq implements zzexq {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzexq zzc;
    private final long zzd;

    public zzetq(zzexq zzexqVar, long j, Clock clock) {
        this.zzb = clock;
        this.zzc = zzexqVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 16;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0.zza() != false) goto L6;
     */
    @Override // com.google.android.gms.internal.ads.zzexq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        /*
            r7 = this;
            r0 = r7
            java.util.concurrent.atomic.AtomicReference r0 = r0.zza
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzetp r0 = (com.google.android.gms.internal.ads.zzetp) r0
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L1c
            r0 = r11
            r10 = r0
            r0 = r11
            boolean r0 = r0.zza()
            if (r0 == 0) goto L45
        L1c:
            r0 = r7
            com.google.android.gms.internal.ads.zzexq r0 = r0.zzc
            r11 = r0
            r0 = r7
            long r0 = r0.zzd
            r8 = r0
            r0 = r7
            com.google.android.gms.common.util.Clock r0 = r0.zzb
            r10 = r0
            com.google.android.gms.internal.ads.zzetp r0 = new com.google.android.gms.internal.ads.zzetp
            r1 = r0
            r2 = r11
            com.google.common.util.concurrent.ListenableFuture r2 = r2.zzb()
            r3 = r8
            r4 = r10
            r1.<init>(r2, r3, r4)
            r10 = r0
            r0 = r7
            java.util.concurrent.atomic.AtomicReference r0 = r0.zza
            r1 = r10
            r0.set(r1)
        L45:
            r0 = r10
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zza
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzetq.zzb():com.google.common.util.concurrent.ListenableFuture");
    }
}
