package com.google.android.gms.internal.games_v2;

import androidx.lifecycle.LifecycleKt$;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: zzay.class */
public final /* synthetic */ class zzay {
    public static /* synthetic */ boolean zza(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!LifecycleKt$.ExternalSyntheticBackportWithForwarding0.m(atomicReference, obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
