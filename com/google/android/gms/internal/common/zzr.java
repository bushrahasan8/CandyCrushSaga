package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: zzr.class */
public final class zzr extends zzp {
    public static boolean zza(Object obj, Object obj2) {
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
