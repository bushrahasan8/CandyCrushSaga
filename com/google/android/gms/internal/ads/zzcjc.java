package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: zzcjc.class */
final class zzcjc implements DialogInterface.OnCancelListener {
    final JsResult zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcjc(JsResult jsResult) {
        this.zza = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zza.cancel();
    }
}
