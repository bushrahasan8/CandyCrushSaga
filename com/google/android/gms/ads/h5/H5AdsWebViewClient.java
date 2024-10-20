package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzboa;
import com.google.android.gms.internal.ads.zzbon;

/* loaded from: H5AdsWebViewClient.class */
public final class H5AdsWebViewClient extends zzboa {
    private final zzbon zza;

    public H5AdsWebViewClient(Context context, WebView webView) {
        this.zza = new zzbon(context, webView);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzboa
    protected WebViewClient getDelegate() {
        return this.zza;
    }

    public WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    public void setDelegateWebViewClient(WebViewClient webViewClient) {
        this.zza.zzb(webViewClient);
    }
}
