package com.google.android.gms.internal.games_v2;

import android.app.Application;
import androidx.lifecycle.LifecycleKt$;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: zzau.class */
public final class zzau {
    private static final AtomicReference zza = new AtomicReference();
    private final zzat zzb;
    private final zzav zzc;

    zzau(Application application, zzav zzavVar) {
        this.zzb = new zzat(this, application, null);
        this.zzc = zzavVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzau zza(Application application) {
        AtomicReference atomicReference = zza;
        zzau zzauVar = (zzau) atomicReference.get();
        if (zzauVar != null) {
            return zzauVar;
        }
        zzau zzauVar2 = new zzau(application, zzax.zza(application));
        while (!LifecycleKt$.ExternalSyntheticBackportWithForwarding0.m(atomicReference, (Object) null, zzauVar2) && atomicReference.get() == null) {
        }
        return (zzau) Preconditions.checkNotNull((zzau) zza.get());
    }

    public final void zzc() {
        zzez.zza("AutomaticGamesAuthenticator", "startWatching()");
        zzat.zza(this.zzb);
    }
}
