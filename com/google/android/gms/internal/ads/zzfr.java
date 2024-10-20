package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: zzfr.class */
public final class zzfr implements zzel {
    @Override // com.google.android.gms.internal.ads.zzel
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzel
    public final zzew zzb(Looper looper, Handler.Callback callback) {
        return new zzfu(new Handler(looper, callback));
    }
}
