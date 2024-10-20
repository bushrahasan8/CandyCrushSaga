package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: zzftt.class */
public class zzftt extends Handler {
    private final Looper zza;

    public zzftt() {
        this.zza = Looper.getMainLooper();
    }

    public zzftt(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zza(message);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zza(Message message) {
        super.dispatchMessage(message);
    }
}
