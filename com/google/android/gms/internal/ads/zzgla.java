package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: zzgla.class */
public final class zzgla extends zzghh {
    private final zzglf zza;

    private zzgla(zzglf zzglfVar) {
        this.zza = zzglfVar;
    }

    public static zzgla zza(zzglf zzglfVar) throws GeneralSecurityException {
        return new zzgla(zzglfVar);
    }

    public final zzglf zzb() {
        return this.zza;
    }
}
