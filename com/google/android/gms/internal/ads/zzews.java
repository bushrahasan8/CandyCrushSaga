package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: zzews.class */
public final class zzews implements zzexp {
    private final String zza;
    private final Bundle zzb;

    public zzews(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.zza);
        if (this.zzb.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", this.zzb);
    }
}
