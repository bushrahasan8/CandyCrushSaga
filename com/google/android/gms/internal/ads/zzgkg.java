package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: zzgkg.class */
public final class zzgkg extends zzghi {
    private final zzgkf zza;

    private zzgkg(zzgkf zzgkfVar) {
        this.zza = zzgkfVar;
    }

    public static zzgkg zzc(zzgkf zzgkfVar) {
        return new zzgkg(zzgkfVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgkg) && ((zzgkg) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzgkg.class, this.zza);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzggq
    public final boolean zza() {
        return this.zza != zzgkf.zzc;
    }

    public final zzgkf zzb() {
        return this.zza;
    }
}
