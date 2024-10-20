package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: zzewb.class */
public final class zzewb implements zzexq {
    private final Bundle zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzewb(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final ListenableFuture zzb() {
        return zzgen.zzh(new zzewc(this.zza));
    }
}
