package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzbxu.class */
public final class zzbxu implements Thread.UncaughtExceptionHandler {
    final Thread.UncaughtExceptionHandler zza;
    final zzbxw zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxu(zzbxw zzbxwVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zza = uncaughtExceptionHandler;
        this.zzb = zzbxwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void uncaughtException(java.lang.Thread r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            r0 = r4
            com.google.android.gms.internal.ads.zzbxw r0 = r0.zzb     // Catch: java.lang.Throwable -> Lc
            r1 = r5
            r2 = r6
            r0.zzf(r1, r2)     // Catch: java.lang.Throwable -> Lc
            goto L12
        Lc:
            r7 = move-exception
            java.lang.String r0 = "AdMob exception reporter failed reporting the exception."
            com.google.android.gms.internal.ads.zzcec.zzg(r0)     // Catch: java.lang.Throwable -> L24
        L12:
            r0 = r4
            java.lang.Thread$UncaughtExceptionHandler r0 = r0.zza
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L23
            r0 = r7
            r1 = r5
            r2 = r6
            r0.uncaughtException(r1, r2)
        L23:
            return
        L24:
            r7 = move-exception
            r0 = r4
            java.lang.Thread$UncaughtExceptionHandler r0 = r0.zza
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L33
            goto L3c
        L33:
            r0 = r8
            r1 = r5
            r2 = r6
            r0.uncaughtException(r1, r2)
        L3c:
            r0 = r7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxu.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
