package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: zzgqk.class */
public final class zzgqk {
    private zzgqx zza = null;
    private zzgxr zzb = null;
    private Integer zzc = null;

    private zzgqk() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgqk(zzgqj zzgqjVar) {
    }

    public final zzgqk zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgqk zzb(zzgxr zzgxrVar) {
        this.zzb = zzgxrVar;
        return this;
    }

    public final zzgqk zzc(zzgqx zzgqxVar) {
        this.zza = zzgqxVar;
        return this;
    }

    public final zzgqm zzd() throws GeneralSecurityException {
        zzgxr zzgxrVar;
        zzgxq zzb;
        zzgqx zzgqxVar = this.zza;
        if (zzgqxVar == null || (zzgxrVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgqxVar.zzc() != zzgxrVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgqxVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzgqv.zzd) {
            zzb = zzgxq.zzb(new byte[0]);
        } else if (this.zza.zzg() == zzgqv.zzc || this.zza.zzg() == zzgqv.zzb) {
            zzb = zzgxq.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzg() != zzgqv.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
            }
            zzb = zzgxq.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzgqm(this.zza, this.zzb, zzb, this.zzc, null);
    }
}
