package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: zzawe.class */
public final class zzawe extends zzats {
    public Long zza;
    public Long zzb;

    public zzawe() {
    }

    public zzawe(String str) {
        HashMap zza = zzats.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Long) zza.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzats
    protected final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        return hashMap;
    }
}
