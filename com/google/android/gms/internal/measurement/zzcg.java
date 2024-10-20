package com.google.android.gms.internal.measurement;

/* loaded from: zzcg.class */
final class zzcg extends zzcm {
    private String zza;
    private boolean zzb;
    private boolean zzc;
    private zzcl zzd;
    private byte zze;

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcj zza() {
        if (this.zze == 3 && this.zza != null && this.zzd != null) {
            return new zzcd(this.zza, this.zzd);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" fileOwner");
        }
        if ((this.zze & 1) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if ((this.zze & 2) == 0) {
            sb.append(" skipChecks");
        }
        if (this.zzd == null) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:" + String.valueOf(sb));
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcm zza(zzcl zzclVar) {
        if (zzclVar == null) {
            throw new NullPointerException("Null filePurpose");
        }
        this.zzd = zzclVar;
        return this;
    }

    public final zzcm zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcm zza(boolean z) {
        this.zzb = false;
        this.zze = (byte) (this.zze | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcm
    public final zzcm zzb(boolean z) {
        this.zzc = false;
        this.zze = (byte) (this.zze | 2);
        return this;
    }
}
