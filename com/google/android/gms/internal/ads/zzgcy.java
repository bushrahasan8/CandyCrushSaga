package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzgcy.class */
public final class zzgcy extends zzgcz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgcy(ListenableFuture listenableFuture, Class cls, zzfws zzfwsVar) {
        super(listenableFuture, cls, zzfwsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    final /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        return ((zzfws) obj).apply(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    final void zzf(Object obj) {
        zzc(obj);
    }
}
