package com.google.android.gms.internal.gcm;

import java.io.PrintStream;

/* loaded from: zzq.class */
public final class zzq {
    private static final zzr zzdq;
    private static final int zzdr;

    /* loaded from: zzq$zzd.class */
    static final class zzd extends zzr {
        zzd() {
        }

        @Override // com.google.android.gms.internal.gcm.zzr
        public final void zzd(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009b  */
    static {
        /*
            r0 = 1
            r5 = r0
            java.lang.Integer r0 = zzac()     // Catch: java.lang.Throwable -> L42
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L22
            r0 = r7
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L1e
            r1 = 19
            if (r0 < r1) goto L22
            com.google.android.gms.internal.gcm.zzv r0 = new com.google.android.gms.internal.gcm.zzv     // Catch: java.lang.Throwable -> L1e
            r6 = r0
            r0 = r6
            r0.<init>()     // Catch: java.lang.Throwable -> L1e
            goto L90
        L1e:
            r6 = move-exception
            goto L45
        L22:
            java.lang.String r0 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r0 = java.lang.Boolean.getBoolean(r0)     // Catch: java.lang.Throwable -> L1e
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L37
            com.google.android.gms.internal.gcm.zzu r0 = new com.google.android.gms.internal.gcm.zzu     // Catch: java.lang.Throwable -> L1e
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L1e
            r6 = r0
            goto L90
        L37:
            com.google.android.gms.internal.gcm.zzq$zzd r0 = new com.google.android.gms.internal.gcm.zzq$zzd     // Catch: java.lang.Throwable -> L1e
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L1e
            r6 = r0
            goto L90
        L42:
            r6 = move-exception
            r0 = 0
            r7 = r0
        L45:
            java.io.PrintStream r0 = java.lang.System.err
            r10 = r0
            java.lang.Class<com.google.android.gms.internal.gcm.zzq$zzd> r0 = com.google.android.gms.internal.gcm.zzq.zzd.class
            java.lang.String r0 = r0.getName()
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r8
            int r2 = r2.length()
            r3 = 133(0x85, float:1.86E-43)
            int r2 = r2 + r3
            r1.<init>(r2)
            r9 = r0
            r0 = r9
            java.lang.String r1 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            java.lang.String r1 = "will be used. The error is: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = r9
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            r0 = r6
            r1 = r10
            r0.printStackTrace(r1)
            com.google.android.gms.internal.gcm.zzq$zzd r0 = new com.google.android.gms.internal.gcm.zzq$zzd
            r1 = r0
            r1.<init>()
            r6 = r0
        L90:
            r0 = r6
            com.google.android.gms.internal.gcm.zzq.zzdq = r0
            r0 = r7
            if (r0 != 0) goto L9b
            goto La0
        L9b:
            r0 = r7
            int r0 = r0.intValue()
            r5 = r0
        La0:
            r0 = r5
            com.google.android.gms.internal.gcm.zzq.zzdr = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gcm.zzq.m1961clinit():void");
    }

    private static Integer zzac() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            PrintStream printStream = System.err;
            printStream.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(printStream);
            return null;
        }
    }

    public static void zzd(Throwable th, Throwable th2) {
        zzdq.zzd(th, th2);
    }
}
