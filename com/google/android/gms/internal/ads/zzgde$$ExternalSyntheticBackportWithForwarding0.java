package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* loaded from: zzgde$$ExternalSyntheticBackportWithForwarding0.class */
public abstract /* synthetic */ class zzgde$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ boolean m(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
