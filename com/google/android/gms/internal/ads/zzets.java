package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: zzets.class */
public final class zzets implements zzexq {
    private final zzgey zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzets(zzgey zzgeyVar) {
        this.zza = zzgeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzetr
            public final zzets zza;

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzett(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - com.google.android.gms.ads.internal.zzt.zzo().zzi().zzh().zza());
            }
        });
    }
}
