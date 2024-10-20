package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: zzbis.class */
public final class zzbis {
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();
    static final AtomicBoolean zza = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbiq zza() {
        return (zzbiq) zzb.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbir zzb() {
        return (zzbir) zzc.get();
    }

    public static void zzc(zzbiq zzbiqVar) {
        zzb.set(zzbiqVar);
    }
}
