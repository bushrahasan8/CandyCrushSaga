package com.google.android.gms.internal.location;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: zzbl.class */
public final class zzbl extends zzbk {
    public static boolean zza(@NullableDecl Object obj, @NullableDecl Object obj2) {
        boolean z = true;
        if (obj != obj2) {
            if (obj == null) {
                z = false;
            } else {
                if (!obj.equals(obj2)) {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }
}
