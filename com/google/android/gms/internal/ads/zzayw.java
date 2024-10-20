package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: zzayw.class */
final class zzayw implements zzazc {
    final Activity zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayw(zzazd zzazdVar, Activity activity) {
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.zza);
    }
}
