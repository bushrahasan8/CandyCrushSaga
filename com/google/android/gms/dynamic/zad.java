package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: zad.class */
final class zad implements zah {
    final FrameLayout zaa;
    final LayoutInflater zab;
    final ViewGroup zac;
    final Bundle zad;
    final DeferredLifecycleHelper zae;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zad(DeferredLifecycleHelper deferredLifecycleHelper, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.zae = deferredLifecycleHelper;
        this.zaa = frameLayout;
        this.zab = layoutInflater;
        this.zac = viewGroup;
        this.zad = bundle;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 2;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        this.zaa.removeAllViews();
        lifecycleDelegate2 = this.zae.zaa;
        this.zaa.addView(lifecycleDelegate2.onCreateView(this.zab, this.zac, this.zad));
    }
}
