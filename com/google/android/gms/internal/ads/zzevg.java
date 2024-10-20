package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: zzevg.class */
public final class zzevg implements zzexq {
    private final zzfgl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzevg(zzfgl zzfglVar) {
        this.zza = zzfglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final ListenableFuture zzb() {
        return zzgen.zzh(new zzevh(this.zza));
    }
}
