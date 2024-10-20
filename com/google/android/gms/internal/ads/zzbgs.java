package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: zzbgs.class */
public final class zzbgs {
    private final Map zza = new HashMap();
    private final zzbgu zzb;

    public zzbgs(zzbgu zzbguVar) {
        this.zzb = zzbguVar;
    }

    public final zzbgu zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbgr zzbgrVar) {
        this.zza.put(str, zzbgrVar);
    }

    public final void zzc(String str, String str2, long j) {
        zzbgr zzbgrVar = (zzbgr) this.zza.get(str2);
        if (zzbgrVar != null) {
            this.zzb.zze(zzbgrVar, j, str);
        }
        this.zza.put(str, new zzbgr(j, null, null));
    }
}
