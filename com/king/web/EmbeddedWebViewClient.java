package com.king.web;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Keep;
import com.king.logging.Logging;
import com.unity3d.services.UnityAdsConstants;

@Keep
/* loaded from: EmbeddedWebViewClient.class */
class EmbeddedWebViewClient extends WebViewClient {
    private static final String TAG = "EmbeddedWebViewClient";
    private final int mListener;
    private final int mMessageListener;
    private final String mMessageUrlPrefix;
    private boolean mWebViewLaunchError = false;
    private WebViewListener mWebViewListener;

    public EmbeddedWebViewClient(WebViewListener webViewListener, int i, int i2, String str) {
        this.mWebViewListener = webViewListener;
        this.mMessageListener = i;
        this.mListener = i2;
        this.mMessageUrlPrefix = str + "://";
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (this.mWebViewLaunchError) {
            return;
        }
        this.mWebViewListener.onWebViewPageLoadSuccess(this.mListener);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        if (this.mWebViewLaunchError) {
            return;
        }
        this.mWebViewLaunchError = true;
        this.mWebViewListener.onWebViewPageLoadError(this.mListener, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = TAG;
        Logging.logDebug(str2, "WebView wants to load url: " + str);
        if (!str.startsWith(this.mMessageUrlPrefix)) {
            webView.loadUrl(str);
            return false;
        }
        Logging.logDebug(str2, "Got webview message, parsing...");
        String[] split = str.substring(this.mMessageUrlPrefix.length()).split(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, 3);
        Logging.logDebug(str2, "NAMESPACE: " + split[0]);
        Logging.logDebug(str2, "MESSAGE: " + split[1]);
        Logging.logDebug(str2, "PARAMETERS: " + split[2]);
        this.mWebViewListener.onWebViewMessage(this.mMessageListener, split[0], split[1], split[2]);
        return true;
    }
}
