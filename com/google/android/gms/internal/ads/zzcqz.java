package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: zzcqz.class */
public final class zzcqz implements zzcqv {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcqz(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zza(Map map) {
        this.zza.zzz(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
