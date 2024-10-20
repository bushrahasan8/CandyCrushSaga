package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: zzazl.class */
final class zzazl implements Runnable {
    final View zza;
    final zzazp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazl(zzazp zzazpVar, View view) {
        this.zza = view;
        this.zzb = zzazpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
