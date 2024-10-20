package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* loaded from: zzbzr.class */
public final class zzbzr extends zzbzt {
    private final String zza;
    private final int zzb;

    public zzbzr(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zzbzr)) {
            return false;
        }
        zzbzr zzbzrVar = (zzbzr) obj;
        return Objects.equal(this.zza, zzbzrVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzbzrVar.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzbzu
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbzu
    public final String zzc() {
        return this.zza;
    }
}
