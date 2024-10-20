package com.google.android.gms.ads.search;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.mediation.NetworkExtras;

/* loaded from: zzb.class */
public final class zzb {
    private final zzdw zza = new zzdw();
    private String zzb;

    public final zzb zzb(Class cls, Bundle bundle) {
        this.zza.zzo(cls, bundle);
        return this;
    }

    public final zzb zzc(NetworkExtras networkExtras) {
        this.zza.zzs(networkExtras);
        return this;
    }

    public final zzb zzd(Class cls, Bundle bundle) {
        this.zza.zzr(cls, bundle);
        return this;
    }

    public final zzb zze(String str) {
        this.zzb = str;
        return this;
    }
}
