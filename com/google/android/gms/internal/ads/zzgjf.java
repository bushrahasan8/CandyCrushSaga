package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: zzgjf.class */
public final class zzgjf {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private zzgjg zzd;

    private zzgjf() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgjf(zzgje zzgjeVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgjg.zzc;
    }

    public final zzgjf zza(int i) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzgjf zzb(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzgjf zzc(int i) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzgjf zzd(zzgjg zzgjgVar) {
        this.zzd = zzgjgVar;
        return this;
    }

    public final zzgji zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        this.zzb.intValue();
        this.zzc.intValue();
        return new zzgji(intValue, 12, 16, this.zzd, null);
    }
}
