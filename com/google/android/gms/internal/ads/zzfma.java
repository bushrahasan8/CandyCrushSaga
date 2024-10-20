package com.google.android.gms.internal.ads;

/* loaded from: zzfma.class */
final class zzfma {
    public final String zza;
    public final String zzb;

    public zzfma(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfma)) {
            return false;
        }
        zzfma zzfmaVar = (zzfma) obj;
        return this.zza.equals(zzfmaVar.zza) && this.zzb.equals(zzfmaVar.zzb);
    }

    public final int hashCode() {
        return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
    }
}
