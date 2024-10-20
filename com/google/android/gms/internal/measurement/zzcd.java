package com.google.android.gms.internal.measurement;

/* loaded from: zzcd.class */
final class zzcd extends zzcj {
    private final String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final zzcc zze;
    private final zzce zzf;
    private final zzcl zzg;

    private zzcd(String str, boolean z, boolean z2, zzcc zzccVar, zzce zzceVar, zzcl zzclVar) {
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
        this.zze = null;
        this.zzf = null;
        this.zzg = zzclVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcj)) {
            return false;
        }
        zzcj zzcjVar = (zzcj) obj;
        if (!this.zzb.equals(zzcjVar.zzd()) || this.zzc != zzcjVar.zze() || this.zzd != zzcjVar.zzf()) {
            return false;
        }
        zzcc zzccVar = this.zze;
        if (zzccVar == null) {
            if (zzcjVar.zza() != null) {
                return false;
            }
        } else if (!zzccVar.equals(zzcjVar.zza())) {
            return false;
        }
        zzce zzceVar = this.zzf;
        if (zzceVar == null) {
            if (zzcjVar.zzb() != null) {
                return false;
            }
        } else if (!zzceVar.equals(zzcjVar.zzb())) {
            return false;
        }
        return this.zzg.equals(zzcjVar.zzc());
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode();
        int i = 1237;
        int i2 = this.zzc ? 1231 : 1237;
        if (this.zzd) {
            i = 1231;
        }
        zzcc zzccVar = this.zze;
        int i3 = 0;
        int hashCode2 = zzccVar == null ? 0 : zzccVar.hashCode();
        zzce zzceVar = this.zzf;
        if (zzceVar != null) {
            i3 = zzceVar.hashCode();
        }
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i) * 1000003) ^ hashCode2) * 1000003) ^ i3) * 1000003) ^ this.zzg.hashCode();
    }

    public final String toString() {
        return "FileComplianceOptions{fileOwner=" + this.zzb + ", hasDifferentDmaOwner=" + this.zzc + ", skipChecks=" + this.zzd + ", dataForwardingNotAllowedResolver=" + String.valueOf(this.zze) + ", multipleProductIdGroupsResolver=" + String.valueOf(this.zzf) + ", filePurpose=" + String.valueOf(this.zzg) + "}";
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final zzcc zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final zzce zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final zzcl zzc() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final String zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzcj
    public final boolean zzf() {
        return this.zzd;
    }
}
