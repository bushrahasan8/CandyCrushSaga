package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: zzblx.class */
public final class zzblx implements zzbng {
    private final zzbly zza;

    public zzblx(zzbly zzblyVar) {
        this.zza = zzblyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            zzcec.zzj("App event with no name parameter.");
        } else {
            this.zza.zzb(str, (String) map.get("info"));
        }
    }
}
