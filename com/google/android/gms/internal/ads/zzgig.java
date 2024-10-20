package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: zzgig.class */
public final class zzgig {
    private zzgiq zza = null;
    private zzgxr zzb = null;
    private Integer zzc = null;

    private zzgig() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgig(zzgif zzgifVar) {
    }

    public final zzgig zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgig zzb(zzgxr zzgxrVar) {
        this.zzb = zzgxrVar;
        return this;
    }

    public final zzgig zzc(zzgiq zzgiqVar) {
        this.zza = zzgiqVar;
        return this;
    }

    public final zzgii zzd() throws GeneralSecurityException {
        zzgxr zzgxrVar;
        zzgxq zzb;
        zzgiq zzgiqVar = this.zza;
        if (zzgiqVar == null || (zzgxrVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgiqVar.zzc() != zzgxrVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgiqVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzgio.zzc) {
            zzb = zzgxq.zzb(new byte[0]);
        } else if (this.zza.zzd() == zzgio.zzb) {
            zzb = zzgxq.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzd() != zzgio.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzb = zzgxq.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzgii(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
