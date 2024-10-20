package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.t2;

/* loaded from: zzeve.class */
public final class zzeve implements zzexp {
    public final Bundle zza;

    public zzeve(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzfhv.zza(bundle, t2.h.G);
        zza.putBundle("android_mem_info", this.zza);
        bundle.putBundle(t2.h.G, zza);
    }
}
