package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: zzgjs.class */
public final class zzgjs {
    private Integer zza;
    private zzgjt zzb;

    private zzgjs() {
        this.zza = null;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgjs(zzgjr zzgjrVar) {
        this.zza = null;
        this.zzb = zzgjt.zzc;
    }

    public final zzgjs zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzgjs zzb(zzgjt zzgjtVar) {
        this.zzb = zzgjtVar;
        return this;
    }

    public final zzgjv zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb != null) {
            return new zzgjv(num.intValue(), this.zzb, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }
}
