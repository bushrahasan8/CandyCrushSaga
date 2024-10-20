package com.google.android.gms.internal.games_v2;

import androidx.lifecycle.LifecycleKt$;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: zzak.class */
public abstract class zzak {
    private final AtomicReference zza = new AtomicReference();

    protected abstract zzaj zza();

    public final void zzb() {
        zzaj zzajVar = (zzaj) this.zza.get();
        if (zzajVar != null) {
            zzajVar.zzd();
        }
    }

    public final void zzc(String str, int i) {
        zzaj zzajVar = (zzaj) this.zza.get();
        zzaj zzajVar2 = zzajVar;
        if (zzajVar == null) {
            zzajVar2 = zza();
            AtomicReference atomicReference = this.zza;
            while (true) {
                if (LifecycleKt$.ExternalSyntheticBackportWithForwarding0.m(atomicReference, (Object) null, zzajVar2)) {
                    break;
                } else if (atomicReference.get() != null) {
                    zzajVar2 = (zzaj) this.zza.get();
                    break;
                }
            }
        }
        zzajVar2.zzc(str, i);
    }
}
