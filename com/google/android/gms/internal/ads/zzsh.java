package com.google.android.gms.internal.ads;

import androidx.lifecycle.LifecycleKt$;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: zzsh.class */
public final /* synthetic */ class zzsh {
    public static /* synthetic */ boolean zza(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!LifecycleKt$.ExternalSyntheticBackportWithForwarding0.m(atomicReference, (Object) null, obj2)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }
}
