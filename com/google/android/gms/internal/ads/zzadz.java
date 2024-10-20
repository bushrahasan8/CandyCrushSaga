package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: zzadz.class */
public final class zzadz {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzadz(int i, byte[] bArr, int i2, int i3) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzadz.class != obj.getClass()) {
            return false;
        }
        zzadz zzadzVar = (zzadz) obj;
        return this.zza == zzadzVar.zza && this.zzc == zzadzVar.zzc && this.zzd == zzadzVar.zzd && Arrays.equals(this.zzb, zzadzVar.zzb);
    }

    public final int hashCode() {
        return (((((this.zza * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
