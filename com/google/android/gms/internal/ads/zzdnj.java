package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

/* loaded from: zzdnj.class */
public final class zzdnj {
    zzbkn zza;
    zzbkk zzb;
    zzbla zzc;
    zzbkx zzd;
    zzbpy zze;
    final SimpleArrayMap zzf = new SimpleArrayMap();
    final SimpleArrayMap zzg = new SimpleArrayMap();

    public final zzdnj zza(zzbkk zzbkkVar) {
        this.zzb = zzbkkVar;
        return this;
    }

    public final zzdnj zzb(zzbkn zzbknVar) {
        this.zza = zzbknVar;
        return this;
    }

    public final zzdnj zzc(String str, zzbkt zzbktVar, zzbkq zzbkqVar) {
        this.zzf.put(str, zzbktVar);
        if (zzbkqVar != null) {
            this.zzg.put(str, zzbkqVar);
        }
        return this;
    }

    public final zzdnj zzd(zzbpy zzbpyVar) {
        this.zze = zzbpyVar;
        return this;
    }

    public final zzdnj zze(zzbkx zzbkxVar) {
        this.zzd = zzbkxVar;
        return this;
    }

    public final zzdnj zzf(zzbla zzblaVar) {
        this.zzc = zzblaVar;
        return this;
    }

    public final zzdnl zzg() {
        return new zzdnl(this);
    }
}
