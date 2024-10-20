package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: zzbvp.class */
final class zzbvp implements View.OnClickListener {
    final zzbvq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvp(zzbvq zzbvqVar) {
        this.zza = zzbvqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zza(true);
    }
}
