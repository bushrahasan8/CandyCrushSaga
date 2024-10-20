package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: zzcjg.class */
final class zzcjg implements DialogInterface.OnClickListener {
    final JsPromptResult zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcjg(JsPromptResult jsPromptResult) {
        this.zza = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.cancel();
    }
}
