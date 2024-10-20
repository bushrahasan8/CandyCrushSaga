package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: zzesf.class */
public final class zzesf {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzese zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzese zza() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzese zzeseVar) {
        this.zzb = zzeseVar;
    }

    public final void zzc(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
