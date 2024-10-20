package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.common.base.Optional;

/* loaded from: zzhf.class */
public final class zzhf {
    private static volatile Optional zza = Optional.absent();
    private static final Object zzb = new Object();

    private static boolean zza(Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
    
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zza(android.content.Context r4, android.net.Uri r5) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhf.zza(android.content.Context, android.net.Uri):boolean");
    }
}
