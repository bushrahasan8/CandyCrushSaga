package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzcl.class */
public final class zzcl extends BroadcastReceiver {
    final zzcm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcl(zzcm zzcmVar) {
        this.zza = zzcmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zze(context, intent);
    }
}
