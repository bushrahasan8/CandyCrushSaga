package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: zzcqx.class */
public final class zzcqx implements zzcqv {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcqx(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zza(Map map) {
        this.zza.zzx(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
