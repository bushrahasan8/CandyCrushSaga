package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: zzavs.class */
final class zzavs implements zzavx {
    final Activity zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavs(zzavy zzavyVar, Activity activity) {
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzavx
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.zza);
    }
}
