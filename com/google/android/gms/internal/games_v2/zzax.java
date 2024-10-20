package com.google.android.gms.internal.games_v2;

import android.app.Application;
import androidx.lifecycle.LifecycleKt$;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: zzax.class */
public final class zzax {
    private static final AtomicReference zza = new AtomicReference();

    public static zzav zza(Application application) {
        AtomicReference atomicReference = zza;
        zzav zzavVar = (zzav) atomicReference.get();
        if (zzavVar != null) {
            return zzavVar;
        }
        zzo zza2 = zzq.zza();
        zza2.zza(9);
        zza2.zzb(application.getPackageName());
        zzq zzc = zza2.zzc();
        com.google.android.gms.games.internal.zzg zzb = com.google.android.gms.games.internal.zzg.zzb(application);
        zzbl zzblVar = new zzbl(application, zzb, com.google.android.gms.games.internal.v2.resolution.zzb.zza(), new zzbp(application, zzb, new zzaw(application, zzc), null), null);
        while (!LifecycleKt$.ExternalSyntheticBackportWithForwarding0.m(atomicReference, (Object) null, zzblVar) && atomicReference.get() == null) {
        }
        return (zzav) Preconditions.checkNotNull((zzav) zza.get());
    }
}
