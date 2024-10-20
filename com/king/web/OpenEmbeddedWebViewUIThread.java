package com.king.web;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.Keep;
import com.king.core.activityhelper.ActivityHelper;
import com.king.logging.Logging;

@Keep
/* loaded from: OpenEmbeddedWebViewUIThread.class */
class OpenEmbeddedWebViewUIThread implements Runnable {
    private static final String TAG = "OpenEmbeddedWebViewUIThread";
    private float mHRel;
    private int mListener;
    private int mMessageListener;
    private final String mMessageUrlScheme;
    private boolean mShowAfterOpen;
    private String mUrl;
    private float mWRel;
    private final WebViewListener mWebViewListener;
    private float mXRel;
    private float mYRel;

    /* renamed from: com.king.web.OpenEmbeddedWebViewUIThread$1, reason: invalid class name */
    /* loaded from: OpenEmbeddedWebViewUIThread$1.class */
    class AnonymousClass1 implements View.OnKeyListener {
        final OpenEmbeddedWebViewUIThread this$0;

        AnonymousClass1(OpenEmbeddedWebViewUIThread openEmbeddedWebViewUIThread) {
            this.this$0 = openEmbeddedWebViewUIThread;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            Activity activity = ActivityHelper.getInstance().getActivity();
            if (keyEvent.getAction() == 0 && i == 4) {
                Logging.logDebug(OpenEmbeddedWebViewUIThread.TAG, "detected BACK button down");
                activity.runOnUiThread(new Runnable(this) { // from class: com.king.web.OpenEmbeddedWebViewUIThread.1.1
                    final AnonymousClass1 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.this$1.this$0.mWebViewListener.onWebViewBackKeyDown();
                    }
                });
                return true;
            }
            if (keyEvent.getAction() != 1 || i != 4) {
                return false;
            }
            Logging.logDebug(OpenEmbeddedWebViewUIThread.TAG, "detected BACK button up");
            activity.runOnUiThread(new Runnable(this) { // from class: com.king.web.OpenEmbeddedWebViewUIThread.1.2
                final AnonymousClass1 this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$1.this$0.mWebViewListener.onWebViewBackKeyUp();
                }
            });
            return false;
        }
    }

    /* loaded from: OpenEmbeddedWebViewUIThread$CustomWebView.class */
    private static class CustomWebView extends WebView {
        public CustomWebView(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0 || action == 1) {
                Logging.logDebug(OpenEmbeddedWebViewUIThread.TAG, "embedded webview touched");
                if (!hasFocus()) {
                    requestFocus();
                }
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public OpenEmbeddedWebViewUIThread(WebViewListener webViewListener, String str, float f, float f2, float f3, float f4, int i, int i2, boolean z, String str2) {
        this.mUrl = str;
        this.mMessageListener = i;
        this.mListener = i2;
        this.mXRel = f;
        this.mYRel = f2;
        this.mWRel = f3;
        this.mHRel = f4;
        this.mShowAfterOpen = z;
        this.mWebViewListener = webViewListener;
        this.mMessageUrlScheme = str2;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"SetJavaScriptEnabled"})
    public void run() {
        WebViewHelper.RemoveEmbeddedView();
        CustomWebView customWebView = new CustomWebView(ActivityHelper.getInstance().getActivity());
        customWebView.getSettings().setJavaScriptEnabled(true);
        customWebView.getSettings().setDomStorageEnabled(true);
        customWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        customWebView.getSettings().setAllowFileAccessFromFileURLs(true);
        customWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
        customWebView.getSettings().setAllowFileAccess(true);
        customWebView.setVisibility(this.mShowAfterOpen ? 0 : 8);
        customWebView.setWebChromeClient(new WebChromeClient());
        customWebView.setWebViewClient(new EmbeddedWebViewClient(this.mWebViewListener, this.mMessageListener, this.mListener, this.mMessageUrlScheme));
        customWebView.setFocusable(true);
        customWebView.setFocusableInTouchMode(true);
        customWebView.setClickable(true);
        customWebView.setBackgroundColor(0);
        customWebView.requestFocus(130);
        WebViewHelper.setWebView(customWebView);
        WebViewHelper.repositionEmbeddedWebView(this.mXRel, this.mYRel, this.mWRel, this.mHRel);
        String str = TAG;
        Logging.logDebug(str, "showing embedded webview to display: " + this.mUrl);
        ViewGroup viewGroup = (ViewGroup) ActivityHelper.getInstance().getActivity().findViewById(R.id.content);
        if (viewGroup != null) {
            viewGroup.addView(customWebView);
            customWebView.loadUrl(this.mUrl);
            View rootView = customWebView.getRootView();
            if (rootView != null) {
                rootView.requestLayout();
            }
        } else {
            Logging.logWarning(str, "Failed to show embedded web view - no ViewGroup from Activity");
        }
        customWebView.setOnKeyListener(new AnonymousClass1(this));
    }
}
