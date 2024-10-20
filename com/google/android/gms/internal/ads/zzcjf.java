package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: zzcjf.class */
final class zzcjf implements DialogInterface.OnCancelListener {
    final JsPromptResult zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcjf(JsPromptResult jsPromptResult) {
        this.zza = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zza.cancel();
    }
}
