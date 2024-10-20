package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: zzcrn.class */
public final class zzcrn implements zzcqv {
    private final zzfgl zza;

    public zzcrn(zzfgl zzfglVar) {
        this.zza = zzfglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zza.zzb(Boolean.parseBoolean(str));
        } catch (Exception e) {
            throw new IllegalStateException("Invalid render_in_browser state", e);
        }
    }
}
