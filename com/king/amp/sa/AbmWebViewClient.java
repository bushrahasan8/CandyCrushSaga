package com.king.amp.sa;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.j0$;
import com.applovin.impl.sdk.x$;
import java.util.Locale;

/* loaded from: AbmWebViewClient.class */
public class AbmWebViewClient extends WebViewClient {
    protected final String TAG = "AbmWebViewClient";
    private IWebViewClientEventsListener mListener;

    public AbmWebViewClient(IWebViewClientEventsListener iWebViewClientEventsListener) {
        this.mListener = iWebViewClientEventsListener;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Log.d("AbmWebViewClient", "onPageFinished, URL = " + str);
        IWebViewClientEventsListener iWebViewClientEventsListener = this.mListener;
        if (iWebViewClientEventsListener != null) {
            iWebViewClientEventsListener.onPageFinished(str);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Log.d("AbmWebViewClient", "onPageStarted, URL = " + str);
        IWebViewClientEventsListener iWebViewClientEventsListener = this.mListener;
        if (iWebViewClientEventsListener != null) {
            iWebViewClientEventsListener.onPageStarted(str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IWebViewClientEventsListener iWebViewClientEventsListener = this.mListener;
        if (iWebViewClientEventsListener != null) {
            iWebViewClientEventsListener.onReceivedError(i, str, str2);
        }
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.getUrl().getPath().endsWith("/favicon.ico")) {
            return;
        }
        Log.e("AbmWebViewClient", "onReceivedError, error = " + webResourceError.getErrorCode() + ", " + ((Object) webResourceError.getDescription()) + ", Request = " + webResourceRequest.getUrl());
        IWebViewClientEventsListener iWebViewClientEventsListener = this.mListener;
        if (iWebViewClientEventsListener != null) {
            iWebViewClientEventsListener.onReceivedError(webResourceRequest, webResourceError);
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Log.e("AbmWebViewClient", "onReceivedHttpError, status code = " + webResourceResponse.getStatusCode() + ", " + webResourceResponse.getReasonPhrase() + ", request = " + webResourceRequest.getUrl());
        IWebViewClientEventsListener iWebViewClientEventsListener = this.mListener;
        if (iWebViewClientEventsListener != null) {
            iWebViewClientEventsListener.onReceivedHttpError(webResourceRequest, webResourceResponse);
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Log.e("AbmWebViewClient", "onReceivedSslError, URL = " + sslError.getUrl() + ", Error = " + sslError.getPrimaryError());
        IWebViewClientEventsListener iWebViewClientEventsListener = this.mListener;
        if (iWebViewClientEventsListener != null) {
            iWebViewClientEventsListener.onReceivedSslError(sslErrorHandler, sslError);
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.e("AbmWebViewClient", "WebView process crashed!");
        if (Build.VERSION.SDK_INT >= 26) {
            Log.e("AbmWebViewClient", "Did crash? " + j0$.ExternalSyntheticApiModelOutline0.m(renderProcessGoneDetail) + ", priority = " + x$.ExternalSyntheticApiModelOutline0.m(renderProcessGoneDetail));
        } else {
            Log.e("AbmWebViewClient", "Detail = " + renderProcessGoneDetail);
        }
        IWebViewClientEventsListener iWebViewClientEventsListener = this.mListener;
        if (iWebViewClientEventsListener != null) {
            iWebViewClientEventsListener.onRenderProcessGone(renderProcessGoneDetail);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri parse = Uri.parse(webResourceRequest.getUrl().toString().toLowerCase(Locale.US));
        IWebViewClientEventsListener iWebViewClientEventsListener = this.mListener;
        WebResourceResponse shouldInterceptRequest = iWebViewClientEventsListener == null ? null : iWebViewClientEventsListener.shouldInterceptRequest(parse);
        if (shouldInterceptRequest == null) {
            shouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
        }
        return shouldInterceptRequest;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        IWebViewClientEventsListener iWebViewClientEventsListener = this.mListener;
        WebResourceResponse shouldInterceptRequest = iWebViewClientEventsListener == null ? null : iWebViewClientEventsListener.shouldInterceptRequest(Uri.parse(str));
        if (shouldInterceptRequest == null) {
            shouldInterceptRequest = super.shouldInterceptRequest(webView, str);
        }
        return shouldInterceptRequest;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri parse = Uri.parse(webResourceRequest.getUrl().toString().toLowerCase(Locale.US));
        IWebViewClientEventsListener iWebViewClientEventsListener = this.mListener;
        boolean booleanValue = (iWebViewClientEventsListener == null ? null : Boolean.valueOf(iWebViewClientEventsListener.shouldOverrideUrlLoading(parse))).booleanValue();
        if (booleanValue) {
            Log.d("AbmWebViewClient", "Should override: " + webResourceRequest.getUrl());
        }
        return booleanValue ? true : super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
