package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: zzewc.class */
public final class zzewc implements zzexp {
    private final Bundle zza;

    public zzewc(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.zza;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
