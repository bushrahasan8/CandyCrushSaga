package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: zzcdc.class */
public final class zzcdc {
    public final ListenableFuture zza(Context context, int i) {
        zzceu zzceuVar = new zzceu();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        if (zzcdv.zzt(context)) {
            zzcep.zza.execute(new zzcdb(this, context, zzceuVar));
        }
        return zzceuVar;
    }
}
