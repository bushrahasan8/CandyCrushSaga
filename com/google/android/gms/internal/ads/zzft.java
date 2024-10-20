package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* loaded from: zzft.class */
final class zzft implements zzev {
    private Message zza;
    private zzfu zzb;

    private zzft() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzft(zzfs zzfsVar) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzfu.zzl(this);
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        zzd();
    }

    public final zzft zzb(Message message, zzfu zzfuVar) {
        this.zza = message;
        this.zzb = zzfuVar;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        zzd();
        return sendMessageAtFrontOfQueue;
    }
}
