package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: zzghn.class */
public final class zzghn {
    private zzghz zza = null;
    private zzgxr zzb = null;
    private zzgxr zzc = null;
    private Integer zzd = null;

    private zzghn() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzghn(zzghm zzghmVar) {
    }

    public final zzghn zza(zzgxr zzgxrVar) {
        this.zzb = zzgxrVar;
        return this;
    }

    public final zzghn zzb(zzgxr zzgxrVar) {
        this.zzc = zzgxrVar;
        return this;
    }

    public final zzghn zzc(Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzghn zzd(zzghz zzghzVar) {
        this.zza = zzghzVar;
        return this;
    }

    public final zzghp zze() throws GeneralSecurityException {
        zzgxq zzb;
        zzghz zzghzVar = this.zza;
        if (zzghzVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzgxr zzgxrVar = this.zzb;
        if (zzgxrVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzghzVar.zzb() != zzgxrVar.zza()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzghzVar.zzc() != this.zzc.zza()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzghx.zzc) {
            zzb = zzgxq.zzb(new byte[0]);
        } else if (this.zza.zzg() == zzghx.zzb) {
            zzb = zzgxq.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzd.intValue()).array());
        } else {
            if (this.zza.zzg() != zzghx.zza) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
            }
            zzb = zzgxq.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzd.intValue()).array());
        }
        return new zzghp(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
    }
}
