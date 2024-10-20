package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* loaded from: zzdc.class */
public final class zzdc extends Handler {
    private static zzdb zza;
    private final Looper zzb;

    public zzdc() {
        this.zzb = Looper.getMainLooper();
    }

    public zzdc(Looper looper) {
        super(looper);
        this.zzb = Looper.getMainLooper();
    }
}
