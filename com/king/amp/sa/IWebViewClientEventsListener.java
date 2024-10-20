package com.king.amp.sa;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* loaded from: IWebViewClientEventsListener.class */
public interface IWebViewClientEventsListener {
    void onPageFinished(String str);

    void onPageStarted(String str, Bitmap bitmap);

    void onReceivedError(int i, String str, String str2);

    void onReceivedError(WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    void onReceivedHttpError(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    void onReceivedSslError(SslErrorHandler sslErrorHandler, SslError sslError);

    boolean onRenderProcessGone(RenderProcessGoneDetail renderProcessGoneDetail);

    WebResourceResponse shouldInterceptRequest(Uri uri);

    boolean shouldOverrideUrlLoading(Uri uri);
}
