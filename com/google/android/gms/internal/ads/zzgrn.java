package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: zzgrn.class */
public final class zzgrn implements zzgqf {
    private final zzgqm zza;

    public zzgrn(zzgqm zzgqmVar) throws GeneralSecurityException {
        if (!zzgmv.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = zzgqmVar;
    }
}
