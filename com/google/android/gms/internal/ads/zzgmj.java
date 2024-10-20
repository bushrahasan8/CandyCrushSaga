package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: zzgmj.class */
public final class zzgmj extends zzgmk {
    public zzgmj(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    final zzgmi zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgmh(bArr, i);
    }
}
