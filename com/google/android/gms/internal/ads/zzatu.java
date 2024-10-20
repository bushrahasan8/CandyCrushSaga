package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: zzatu.class */
public final class zzatu extends zzats {
    public String zza;
    public long zzb;
    public String zzc;
    public String zzd;
    public String zze;

    public zzatu() {
        this.zza = "E";
        this.zzb = -1L;
        this.zzc = "E";
        this.zzd = "E";
        this.zze = "E";
    }

    public zzatu(String str) {
        this.zza = "E";
        long j = -1;
        this.zzb = -1L;
        this.zzc = "E";
        this.zzd = "E";
        this.zze = "E";
        HashMap zza = zzats.zza(str);
        if (zza != null) {
            this.zza = zza.get(0) == null ? "E" : (String) zza.get(0);
            this.zzb = zza.get(1) != null ? ((Long) zza.get(1)).longValue() : j;
            this.zzc = zza.get(2) == null ? "E" : (String) zza.get(2);
            this.zzd = zza.get(3) == null ? "E" : (String) zza.get(3);
            this.zze = zza.get(4) == null ? "E" : (String) zza.get(4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzats
    protected final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(4, this.zze);
        hashMap.put(3, this.zzd);
        hashMap.put(2, this.zzc);
        hashMap.put(1, Long.valueOf(this.zzb));
        return hashMap;
    }
}
