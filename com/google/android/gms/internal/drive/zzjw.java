package com.google.android.gms.internal.drive;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzjw.class */
public final class zzjw {
    private static final Class<?> zzok = zzce();

    private static Class<?> zzce() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static zzjx zzcf() {
        if (zzok != null) {
            try {
                return zzn("getEmptyRegistry");
            } catch (Exception e) {
            }
        }
        return zzjx.zzoo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.drive.zzjx zzcg() {
        /*
            java.lang.Class<?> r0 = com.google.android.gms.internal.drive.zzjw.zzok
            if (r0 == 0) goto Lf
            java.lang.String r0 = "loadGeneratedRegistry"
            com.google.android.gms.internal.drive.zzjx r0 = zzn(r0)     // Catch: java.lang.Exception -> L27
            r3 = r0
            goto L11
        Lf:
            r0 = 0
            r3 = r0
        L11:
            r0 = r3
            r2 = r0
            r0 = r3
            if (r0 != 0) goto L1b
            com.google.android.gms.internal.drive.zzjx r0 = com.google.android.gms.internal.drive.zzjx.zzcg()
            r2 = r0
        L1b:
            r0 = r2
            r3 = r0
            r0 = r2
            if (r0 != 0) goto L25
            com.google.android.gms.internal.drive.zzjx r0 = zzcf()
            r3 = r0
        L25:
            r0 = r3
            return r0
        L27:
            r2 = move-exception
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzjw.zzcg():com.google.android.gms.internal.drive.zzjx");
    }

    private static final zzjx zzn(String str) throws Exception {
        return (zzjx) zzok.getDeclaredMethod(str, null).invoke(null, null);
    }
}
