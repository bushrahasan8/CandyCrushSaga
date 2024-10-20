package com.google.android.gms.iid;

import android.content.Intent;

/* loaded from: zzf.class */
final class zzf implements Runnable {
    private final Intent zzbf;
    private final Intent zzbg;
    private final zze zzbh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf(zze zzeVar, Intent intent, Intent intent2) {
        this.zzbh = zzeVar;
        this.zzbf = intent;
        this.zzbg = intent2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbh.handleIntent(this.zzbf);
        this.zzbh.zzf(this.zzbg);
    }
}
