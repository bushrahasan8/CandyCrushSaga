package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: zzemq.class */
public final class zzemq {
    private zzemh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzemq() {
    }

    private zzemq(zzemh zzemhVar) {
        this.zza = zzemhVar;
    }

    public static zzemq zzb(zzemh zzemhVar) {
        return new zzemq(zzemhVar);
    }

    public final zzemh zza(Clock clock, zzemj zzemjVar, zzeis zzeisVar, zzfny zzfnyVar) {
        zzemh zzemhVar = this.zza;
        return zzemhVar != null ? zzemhVar : new zzemh(clock, zzemjVar, zzeisVar, zzfnyVar);
    }
}
