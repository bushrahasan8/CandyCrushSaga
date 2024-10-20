package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: zzgee.class */
public class zzgee extends zzgeo {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.zzgee] */
    public static zzgee zzu(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzgee ? (zzgee) listenableFuture : new zzgef(listenableFuture);
    }
}
