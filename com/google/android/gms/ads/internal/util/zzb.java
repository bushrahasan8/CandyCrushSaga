package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcep;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: zzb.class */
public abstract class zzb {
    private final Runnable zza = new zza(this);
    private volatile Thread zzb;

    public abstract void zza();

    public ListenableFuture zzb() {
        return zzcep.zza.zza(this.zza);
    }
}
