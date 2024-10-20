package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: zzclh.class */
public final class zzclh {
    private zzcei zza;
    private Context zzb;
    private WeakReference zzc;

    public final zzclh zzc(Context context) {
        this.zzc = new WeakReference(context);
        Context context2 = context;
        if (context.getApplicationContext() != null) {
            context2 = context.getApplicationContext();
        }
        this.zzb = context2;
        return this;
    }

    public final zzclh zzd(zzcei zzceiVar) {
        this.zza = zzceiVar;
        return this;
    }
}
