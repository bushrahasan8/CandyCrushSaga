package com.king.web;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Keep;

@Keep
/* loaded from: LaunchHiddenWebViewClient.class */
class LaunchHiddenWebViewClient extends WebViewClient {
    private boolean mHiddenWebViewLaunchError = false;
    private int mListener;
    private WebViewListener mWebViewListener;

    public LaunchHiddenWebViewClient(WebViewListener webViewListener, int i) {
        this.mWebViewListener = webViewListener;
        this.mListener = i;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        if (this.mHiddenWebViewLaunchError) {
            return;
        }
        this.mWebViewListener.onWebViewPageLoadSuccess(this.mListener);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        if (this.mHiddenWebViewLaunchError) {
            return;
        }
        this.mHiddenWebViewLaunchError = true;
        this.mWebViewListener.onWebViewPageLoadError(this.mListener, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return false;
    }
}
