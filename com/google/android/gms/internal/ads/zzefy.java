package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: zzefy.class */
public final class zzefy {
    private final zzefu zza;
    private final zzgey zzb;

    public zzefy(zzefu zzefuVar, zzgey zzgeyVar) {
        this.zza = zzefuVar;
        this.zzb = zzgeyVar;
    }

    public final void zza(zzfkp zzfkpVar) {
        final zzefu zzefuVar = this.zza;
        Objects.requireNonNull(zzefuVar);
        zzgen.zzr(this.zzb.zzb(new Callable(zzefuVar) { // from class: com.google.android.gms.internal.ads.zzefw
            public final zzefu zza;

            {
                this.zza = zzefuVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.getWritableDatabase();
            }
        }), new zzefx(this, zzfkpVar), this.zzb);
    }
}
