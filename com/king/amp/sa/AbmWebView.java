package com.king.amp.sa;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;

/* loaded from: AbmWebView.class */
public class AbmWebView extends WebView {
    private static String TAG = "AbmWebView";
    private AbmWebviewVisibilityListener mListener;

    /* loaded from: AbmWebView$AbmWebviewVisibilityListener.class */
    public interface AbmWebviewVisibilityListener {
        void onVisibilityChanged(boolean z);
    }

    public AbmWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onVisibilityChanged(View view, int i) {
        Log.d(TAG, "onVisibilityChanged to" + i);
        super.onVisibilityChanged(view, i);
        AbmWebviewVisibilityListener abmWebviewVisibilityListener = this.mListener;
        if (abmWebviewVisibilityListener != null) {
            abmWebviewVisibilityListener.onVisibilityChanged(i == 0);
        }
    }

    public void setVisibilityListener(AbmWebviewVisibilityListener abmWebviewVisibilityListener) {
        this.mListener = abmWebviewVisibilityListener;
    }
}
