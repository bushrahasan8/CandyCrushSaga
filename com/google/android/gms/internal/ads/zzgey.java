package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: zzgey.class */
public interface zzgey extends ExecutorService {
    ListenableFuture zza(Runnable runnable);

    ListenableFuture zzb(Callable callable);
}
