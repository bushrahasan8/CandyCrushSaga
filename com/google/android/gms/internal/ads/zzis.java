package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: zzis.class */
public final class zzis {
    public final String zza;
    public final zzam zzb;
    public final zzam zzc;
    public final int zzd;
    public final int zze;

    public zzis(String str, zzam zzamVar, zzam zzamVar2, int i, int i2) {
        boolean z = true;
        int i3 = i2;
        if (i != 0) {
            if (i2 == 0) {
                i3 = 0;
                z = true;
            } else {
                z = false;
                i3 = i2;
            }
        }
        zzek.zzd(z);
        zzek.zzc(str);
        this.zza = str;
        this.zzb = zzamVar;
        zzamVar2.getClass();
        this.zzc = zzamVar2;
        this.zzd = i;
        this.zze = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzis.class != obj.getClass()) {
            return false;
        }
        zzis zzisVar = (zzis) obj;
        return this.zzd == zzisVar.zzd && this.zze == zzisVar.zze && this.zza.equals(zzisVar.zza) && this.zzb.equals(zzisVar.zzb) && this.zzc.equals(zzisVar.zzc);
    }

    public final int hashCode() {
        return ((((((((this.zzd + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
