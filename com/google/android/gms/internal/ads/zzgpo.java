package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: zzgpo.class */
public final class zzgpo {
    private zzgpz zza = null;
    private zzgxr zzb = null;
    private Integer zzc = null;

    private zzgpo() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgpo(zzgpn zzgpnVar) {
    }

    public final zzgpo zza(zzgxr zzgxrVar) throws GeneralSecurityException {
        this.zzb = zzgxrVar;
        return this;
    }

    public final zzgpo zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgpo zzc(zzgpz zzgpzVar) {
        this.zza = zzgpzVar;
        return this;
    }

    public final zzgpq zzd() throws GeneralSecurityException {
        zzgxr zzgxrVar;
        zzgxq zzb;
        zzgpz zzgpzVar = this.zza;
        if (zzgpzVar == null || (zzgxrVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgpzVar.zzc() != zzgxrVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgpzVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzgpx.zzd) {
            zzb = zzgxq.zzb(new byte[0]);
        } else if (this.zza.zze() == zzgpx.zzc || this.zza.zze() == zzgpx.zzb) {
            zzb = zzgxq.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zze() != zzgpx.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzb = zzgxq.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzgpq(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
