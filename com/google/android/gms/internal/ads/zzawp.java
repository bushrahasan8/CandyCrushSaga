package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzawp.class */
public final class zzawp extends BroadcastReceiver {
    final zzawq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawp(zzawq zzawqVar) {
        this.zza = zzawqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzf();
    }
}
