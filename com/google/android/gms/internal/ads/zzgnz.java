package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: zzgnz.class */
public final class zzgnz {
    private static final zzgnz zza = new zzgnz();
    private static final zzgny zzb = new zzgny(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgnz zza() {
        return zza;
    }

    public final zzgry zzb() {
        zzgry zzgryVar = (zzgry) this.zzc.get();
        zzgry zzgryVar2 = zzgryVar;
        if (zzgryVar == null) {
            zzgryVar2 = zzb;
        }
        return zzgryVar2;
    }
}
