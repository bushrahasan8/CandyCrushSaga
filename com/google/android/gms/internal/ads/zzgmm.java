package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: zzgmm.class */
public final class zzgmm extends zzgmk {
    public zzgmm(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    final zzgmi zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgml(bArr, i);
    }
}
