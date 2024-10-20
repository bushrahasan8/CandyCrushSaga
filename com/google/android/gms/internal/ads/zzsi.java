package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: zzsi.class */
final class zzsi extends Handler {
    final zzsk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzsi(zzsk zzskVar, Looper looper) {
        super(looper);
        this.zza = zzskVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzsk.zza(this.zza, message);
    }
}
