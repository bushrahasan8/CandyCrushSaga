package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzazn.class */
public final class zzazn implements Runnable {
    final ValueCallback zza;
    final zzazf zzb;
    final WebView zzc;
    final boolean zzd;
    final zzazp zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazn(zzazp zzazpVar, final zzazf zzazfVar, final WebView webView, final boolean z) {
        this.zzb = zzazfVar;
        this.zzc = webView;
        this.zzd = z;
        this.zze = zzazpVar;
        this.zza = new ValueCallback(this, zzazfVar, webView, z) { // from class: com.google.android.gms.internal.ads.zzazm
            public final zzazn zza;
            public final zzazf zzb;
            public final WebView zzc;
            public final boolean zzd;

            {
                this.zza = this;
                this.zzb = zzazfVar;
                this.zzc = webView;
                this.zzd = z;
            }

            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.zza.zze.zzd(this.zzb, this.zzc, (String) obj, this.zzd);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable th) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
