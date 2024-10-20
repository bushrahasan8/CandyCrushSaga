package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: zzgrm.class */
public final class zzgrm implements zzgqf {
    private final zzgpq zza;

    public zzgrm(zzgpq zzgpqVar) throws GeneralSecurityException {
        if (!zzgmv.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.zza = zzgpqVar;
    }
}
