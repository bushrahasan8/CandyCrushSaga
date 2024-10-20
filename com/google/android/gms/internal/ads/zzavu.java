package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: zzavu.class */
final class zzavu implements zzavx {
    final Activity zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavu(zzavy zzavyVar, Activity activity) {
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzavx
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.zza);
    }
}
