package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

/* loaded from: zzi.class */
public class zzi extends Handler {
    private final Looper zza;

    public zzi() {
        this.zza = Looper.getMainLooper();
    }

    public zzi(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }

    public zzi(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zza = Looper.getMainLooper();
    }
}
