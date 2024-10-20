package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: zzgf.class */
public final class zzgf {
    public String zza;
    public Bundle zzb;
    private String zzc;
    private long zzd;

    private zzgf(String str, String str2, Bundle bundle, long j) {
        this.zza = str;
        this.zzc = str2;
        this.zzb = bundle == null ? new Bundle() : bundle;
        this.zzd = j;
    }

    public static zzgf zza(zzbf zzbfVar) {
        return new zzgf(zzbfVar.zza, zzbfVar.zzc, zzbfVar.zzb.zzb(), zzbfVar.zzd);
    }

    public final String toString() {
        return "origin=" + this.zzc + ",name=" + this.zza + ",params=" + String.valueOf(this.zzb);
    }

    public final zzbf zza() {
        return new zzbf(this.zza, new zzba(new Bundle(this.zzb)), this.zzc, this.zzd);
    }
}
