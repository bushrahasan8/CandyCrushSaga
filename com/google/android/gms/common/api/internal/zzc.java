package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: zzc.class */
final class zzc implements Runnable {
    final LifecycleCallback zza;
    final String zzb;
    final zzd zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(zzd zzdVar, LifecycleCallback lifecycleCallback, String str) {
        this.zzc = zzdVar;
        this.zza = lifecycleCallback;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        zzd zzdVar = this.zzc;
        i = zzdVar.zzc;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.zza;
            bundle = zzdVar.zzd;
            if (bundle != null) {
                String str = this.zzb;
                bundle3 = zzdVar.zzd;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i2 = this.zzc.zzc;
        if (i2 >= 2) {
            this.zza.onStart();
        }
        i3 = this.zzc.zzc;
        if (i3 >= 3) {
            this.zza.onResume();
        }
        i4 = this.zzc.zzc;
        if (i4 >= 4) {
            this.zza.onStop();
        }
        i5 = this.zzc.zzc;
        if (i5 >= 5) {
            this.zza.onDestroy();
        }
    }
}
