package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: zztf.class */
final class zztf {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zztf(String str, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != zztf.class) {
            return false;
        }
        zztf zztfVar = (zztf) obj;
        return TextUtils.equals(this.zza, zztfVar.zza) && this.zzb == zztfVar.zzb && this.zzc == zztfVar.zzc;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        int i = 1231;
        int i2 = true != this.zzb ? 1237 : 1231;
        if (true != this.zzc) {
            i = 1237;
        }
        return ((((hashCode + 31) * 31) + i2) * 31) + i;
    }
}
