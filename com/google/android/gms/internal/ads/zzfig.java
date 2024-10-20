package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: zzfig.class */
public final class zzfig {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgey zzc;

    public zzfig(Callable callable, zzgey zzgeyVar) {
        this.zzb = callable;
        this.zzc = zzgeyVar;
    }

    public final ListenableFuture zza() {
        ListenableFuture listenableFuture;
        synchronized (this) {
            zzc(1);
            listenableFuture = (ListenableFuture) this.zza.poll();
        }
        return listenableFuture;
    }

    public final void zzb(ListenableFuture listenableFuture) {
        synchronized (this) {
            this.zza.addFirst(listenableFuture);
        }
    }

    public final void zzc(int i) {
        synchronized (this) {
            int size = this.zza.size();
            for (int i2 = 0; i2 < i - size; i2++) {
                this.zza.add(this.zzc.zzb(this.zzb));
            }
        }
    }
}
