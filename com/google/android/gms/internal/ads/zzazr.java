package com.google.android.gms.internal.ads;

import java.security.MessageDigest;

/* loaded from: zzazr.class */
public abstract class zzazr {
    private static MessageDigest zzb;
    protected final Object zza = new Object();

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x0038
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    protected final java.security.MessageDigest zza() {
        /*
            r3 = this;
            r0 = r3
            java.lang.Object r0 = r0.zza
            r5 = r0
            r0 = r5
            monitor-enter(r0)
            java.security.MessageDigest r0 = com.google.android.gms.internal.ads.zzazr.zzb     // Catch: java.lang.Throwable -> L13
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L17
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            r0 = r6
            return r0
        L13:
            r6 = move-exception
            goto L34
        L17:
            r0 = 0
            r4 = r0
        L19:
            r0 = r4
            r1 = 2
            if (r0 >= r1) goto L2c
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> L13 java.security.NoSuchAlgorithmException -> L38
            com.google.android.gms.internal.ads.zzazr.zzb = r0     // Catch: java.lang.Throwable -> L13 java.security.NoSuchAlgorithmException -> L38
        L26:
            int r4 = r4 + 1
            goto L19
        L2c:
            java.security.MessageDigest r0 = com.google.android.gms.internal.ads.zzazr.zzb     // Catch: java.lang.Throwable -> L13
            r6 = r0
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            r0 = r6
            return r0
        L34:
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            r0 = r6
            throw r0
        L38:
            r6 = move-exception
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazr.zza():java.security.MessageDigest");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte[] zzb(String str);
}
