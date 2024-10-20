package com.king.web;

import android.net.Uri;
import android.webkit.WebView;
import androidx.annotation.Keep;
import com.king.logging.Logging;

@Keep
/* loaded from: SendEmbeddedMessageUIThread.class */
class SendEmbeddedMessageUIThread implements Runnable {
    private static final String TAG = "SendEmbeddedMessageUIThread";
    private WebView mEmbeddedWebView;
    private String mJavascript;

    public SendEmbeddedMessageUIThread(WebView webView, String str) {
        this.mJavascript = str;
        this.mEmbeddedWebView = webView;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.mEmbeddedWebView == null) {
            Logging.logWarning(TAG, "Failed to execute javascript, no embedded webview present");
            return;
        }
        String str = "javascript:" + Uri.encode(this.mJavascript);
        Logging.logDebug(TAG, "Loading URL: " + str);
        this.mEmbeddedWebView.loadUrl(str);
    }
}
