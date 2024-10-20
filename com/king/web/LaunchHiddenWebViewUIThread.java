package com.king.web;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.Keep;
import com.king.logging.Logging;

@Keep
/* loaded from: LaunchHiddenWebViewUIThread.class */
class LaunchHiddenWebViewUIThread implements Runnable {
    private static final String TAG = "LaunchHiddenWebViewUIThread";
    private Activity mActivity;
    private int mListener;
    private String mUrl;
    private WebViewListener mWebViewListener;

    public LaunchHiddenWebViewUIThread(Activity activity, WebViewListener webViewListener, int i, String str) {
        this.mActivity = activity;
        this.mWebViewListener = webViewListener;
        this.mListener = i;
        this.mUrl = str;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"SetJavaScriptEnabled"})
    public void run() {
        WebView webView = new WebView(this.mActivity);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setVisibility(8);
        webView.setWebViewClient(new LaunchHiddenWebViewClient(this.mWebViewListener, this.mListener));
        ViewGroup viewGroup = (ViewGroup) this.mActivity.findViewById(R.id.content);
        if (viewGroup == null) {
            Logging.logWarning(TAG, "Failed to load hidden web view - no ViewGroup from Activity");
        } else {
            viewGroup.addView(webView);
            webView.loadUrl(this.mUrl);
        }
    }
}
