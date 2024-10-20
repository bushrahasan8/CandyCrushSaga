package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: zzcjd.class */
final class zzcjd implements DialogInterface.OnClickListener {
    final JsResult zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcjd(JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.cancel();
    }
}
