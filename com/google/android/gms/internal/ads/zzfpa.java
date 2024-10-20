package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: zzfpa.class */
final class zzfpa implements Runnable {
    final WebView zza;
    final String zzb;
    final zzfpb zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpa(zzfpb zzfpbVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
        this.zzc = zzfpbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfpb.zzi(this.zza, this.zzb);
    }
}
