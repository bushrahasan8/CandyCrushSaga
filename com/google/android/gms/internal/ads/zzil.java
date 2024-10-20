package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzil.class */
public final class zzil {
    private final Context zza;
    private final zzij zzb;

    public zzil(Context context, Handler handler, zzik zzikVar) {
        this.zza = context.getApplicationContext();
        this.zzb = new zzij(this, handler, zzikVar);
    }
}
