package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.webkit.WebView;

/* loaded from: zzcs.class */
public final class zzcs {
    private static Boolean zza;

    private zzcs() {
    }

    @TargetApi(19)
    public static void zza(WebView webView, String str) {
        boolean booleanValue;
        synchronized (zzcs.class) {
            try {
                if (zza == null) {
                    try {
                        webView.evaluateJavascript("(function(){})()", null);
                        zza = Boolean.TRUE;
                    } catch (IllegalStateException e) {
                        zza = Boolean.FALSE;
                    }
                }
                booleanValue = zza.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (booleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            webView.loadUrl("javascript:".concat(str));
        }
    }
}
