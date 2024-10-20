package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: zzgpw.class */
public final class zzgpw {
    private Integer zza;
    private Integer zzb;
    private zzgpx zzc;

    private zzgpw() {
        this.zza = null;
        this.zzb = null;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgpw(zzgpv zzgpvVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzgpx.zzd;
    }

    public final zzgpw zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzgpw zzb(int i) throws GeneralSecurityException {
        if (i >= 10 && i <= 16) {
            this.zzb = Integer.valueOf(i);
            return this;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
    }

    public final zzgpw zzc(zzgpx zzgpxVar) {
        this.zzc = zzgpxVar;
        return this;
    }

    public final zzgpz zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzgpz(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }
}
