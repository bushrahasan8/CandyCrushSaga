package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzgea.class */
public final class zzgea extends zzgdm {
    private zzgdz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgea(zzfzv zzfzvVar, boolean z, Executor executor, Callable callable) {
        super(zzfzvVar, z, false);
        this.zza = new zzgdy(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgdm
    final void zzf(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgdb
    protected final void zzq() {
        zzgdz zzgdzVar = this.zza;
        if (zzgdzVar != null) {
            zzgdzVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdm
    final void zzu() {
        zzgdz zzgdzVar = this.zza;
        if (zzgdzVar != null) {
            zzgdzVar.zzf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgdm
    public final void zzy(int i) {
        super.zzy(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
