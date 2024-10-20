package com.king.popupwebview.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Keep;
import com.applovin.impl.j0$;
import com.king.popupwebview.ILoadingListener;
import com.king.popupwebview.IMessageListener;
import com.king.popupwebview.IPopup;
import com.king.popupwebview.IResponseCallback;
import com.king.popupwebview.PageState;

/* JADX INFO: Access modifiers changed from: package-private */
@Keep
/* loaded from: Popup.class */
public class Popup implements IPopup {
    private static final String BLANK_PAGE_URL = "about:blank";
    private static final String ERROR_INVALID_JAVASCRIPT = "invalid javascript";
    private static final String ERROR_WEB_PAGE_NOT_LOADED = "web page is not loaded";
    private final ActivityWrapper activityWrapper;
    private boolean forceFullscreen;
    private final MessageBus messageBus;
    private WebView webView = null;
    private String loadingTargetUrl = "about:blank";
    private boolean autoShowOnLoaded = false;
    private volatile PopupDialog popupDialog = null;
    private volatile PageState pageState = null;

    /* loaded from: Popup$CustomWebViewClient.class */
    private final class CustomWebViewClient extends WebViewClient {
        final Popup this$0;

        private CustomWebViewClient(Popup popup) {
            this.this$0 = popup;
        }

        private void clearWebView() {
            this.this$0.messageBus.cancelAllResponses();
            this.this$0.loadingTargetUrl = "about:blank";
            this.this$0.pageState = PageState.BLANK;
            this.this$0.webView.loadUrl("about:blank");
        }

        private void notifyError(String str) {
            this.this$0.messageBus.firePageError(str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (this.this$0.pageState == null || this.this$0.pageState == PageState.BLANK) {
                if (this.this$0.popupDialog != null) {
                    this.this$0.popupDialog.close();
                }
            } else if (webView == this.this$0.webView && this.this$0.pageState == PageState.LOADING && webView.getProgress() >= 100 && this.this$0.loadingTargetUrl.equals(webView.getOriginalUrl())) {
                this.this$0.pageState = PageState.LOADED;
                this.this$0.messageBus.firePageLoaded();
                if (this.this$0.autoShowOnLoaded) {
                    this.this$0.show();
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (webView == this.this$0.webView) {
                clearWebView();
                notifyError(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != this.this$0.webView) {
                return false;
            }
            clearWebView();
            StringBuilder sb = new StringBuilder();
            sb.append("onRenderProcessGone: ");
            sb.append(j0$.ExternalSyntheticApiModelOutline0.m(renderProcessGoneDetail) ? "crashed" : "killed by the system");
            notifyError(sb.toString());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (URLUtil.isValidUrl(str)) {
                return false;
            }
            try {
                webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            } catch (ActivityNotFoundException | NullPointerException e) {
                e.printStackTrace();
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Popup(ActivityWrapper activityWrapper, boolean z) {
        this.forceFullscreen = z;
        if (activityWrapper == null) {
            throw new IllegalArgumentException("invalid null activity wrapper");
        }
        this.activityWrapper = activityWrapper;
        this.messageBus = new MessageBus(this);
        initializeWebResources(this.forceFullscreen);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializeWebResources(boolean z) {
        this.activityWrapper.runOnUIThread(new Runnable(this, z) { // from class: com.king.popupwebview.internal.Popup.1
            final Popup this$0;
            final boolean val$forceFullscreen;

            {
                this.this$0 = this;
                this.val$forceFullscreen = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.popupDialog == null) {
                    Popup popup = this.this$0;
                    popup.webView = popup.activityWrapper.createWebView();
                    if (this.this$0.webView != null) {
                        this.this$0.webView.setLayerType(2, null);
                        this.this$0.webView.setBackgroundColor(0);
                        this.this$0.webView.setOverScrollMode(2);
                        WebSettings settings = this.this$0.webView.getSettings();
                        settings.setAllowFileAccess(true);
                        settings.setAllowFileAccessFromFileURLs(true);
                        settings.setDomStorageEnabled(true);
                        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
                        settings.setMediaPlaybackRequiresUserGesture(false);
                        settings.setUseWideViewPort(true);
                        this.this$0.messageBus.registerJavascriptInterface(this.this$0.webView);
                        this.this$0.webView.setWebChromeClient(new WebChromeClient());
                        this.this$0.webView.setWebViewClient(new CustomWebViewClient());
                        Popup popup2 = this.this$0;
                        popup2.popupDialog = new PopupDialog(popup2.webView, this.val$forceFullscreen);
                        this.this$0.loadingTargetUrl = "about:blank";
                        this.this$0.pageState = PageState.BLANK;
                        this.this$0.webView.loadUrl("about:blank");
                    }
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String normalizeUrl(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.king.popupwebview.internal.Popup.normalizeUrl(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recycleIfBlankAndHidden() {
        if (this.webView == null || isVisible() || this.loadingTargetUrl != "about:blank") {
            return;
        }
        recycleWebResources();
    }

    @Override // com.king.popupwebview.IPopup
    public void clearCache() {
        this.activityWrapper.runOnUIThread(new Runnable(this) { // from class: com.king.popupwebview.internal.Popup.6
            final Popup this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.webView != null) {
                    this.this$0.webView.clearCache(true);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void executeJavascript(String str, ValueCallback<String> valueCallback) {
        if (this.webView == null) {
            initializeWebResources(this.forceFullscreen);
        }
        if (str == null || str.isEmpty()) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue(ERROR_INVALID_JAVASCRIPT);
            }
        } else if (this.pageState == PageState.LOADED || this.pageState == PageState.LOADING) {
            this.webView.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue(ERROR_WEB_PAGE_NOT_LOADED);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void executeJavascriptOnUIThread(String str, ValueCallback<String> valueCallback) {
        this.activityWrapper.runOnUIThread(new Runnable(this, str, valueCallback) { // from class: com.king.popupwebview.internal.Popup.3
            final Popup this$0;
            final ValueCallback val$resultCallback;
            final String val$script;

            {
                this.this$0 = this;
                this.val$script = str;
                this.val$resultCallback = valueCallback;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.executeJavascript(this.val$script, this.val$resultCallback);
            }
        });
    }

    protected void finalize() throws Throwable {
        recycleWebResources();
        super.finalize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityWrapper getActivityWrapper() {
        return this.activityWrapper;
    }

    @Override // com.king.popupwebview.IPopup
    public PageState getPageState() {
        PageState pageState = this.pageState;
        PageState pageState2 = pageState;
        if (pageState == null) {
            pageState2 = PageState.BLANK;
        }
        return pageState2;
    }

    @Override // com.king.popupwebview.IPopup
    public void hide() {
        this.activityWrapper.runOnUIThread(new Runnable(this) { // from class: com.king.popupwebview.internal.Popup.5
            final Popup this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.autoShowOnLoaded = false;
                if (this.this$0.popupDialog != null) {
                    this.this$0.popupDialog.close();
                }
                this.this$0.recycleIfBlankAndHidden();
            }
        });
    }

    @Override // com.king.popupwebview.IPopup
    public boolean isVisible() {
        PopupDialog popupDialog = this.popupDialog;
        return popupDialog != null ? popupDialog.isOpened() : false;
    }

    @Override // com.king.popupwebview.IPopup
    public void loadPage(String str) {
        loadPage(str, true);
    }

    @Override // com.king.popupwebview.IPopup
    public void loadPage(String str, boolean z) {
        String normalizeUrl = normalizeUrl(str);
        if (normalizeUrl == null) {
            unloadPage();
        } else {
            this.activityWrapper.runOnUIThread(new Runnable(this, z, normalizeUrl) { // from class: com.king.popupwebview.internal.Popup.7
                final Popup this$0;
                final boolean val$autoShow;
                final String val$targetUrl;

                {
                    this.this$0 = this;
                    this.val$autoShow = z;
                    this.val$targetUrl = normalizeUrl;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (this.this$0.webView == null) {
                        Popup popup = this.this$0;
                        popup.initializeWebResources(popup.forceFullscreen);
                    }
                    if (this.this$0.pageState != null) {
                        this.this$0.autoShowOnLoaded = this.val$autoShow;
                        PageState pageState = this.this$0.pageState;
                        PageState pageState2 = PageState.LOADING;
                        if (pageState != pageState2) {
                            this.this$0.messageBus.cancelAllResponses();
                            this.this$0.pageState = pageState2;
                        } else if (this.val$targetUrl.equals(this.this$0.loadingTargetUrl)) {
                            return;
                        }
                        this.this$0.loadingTargetUrl = this.val$targetUrl;
                        this.this$0.webView.loadUrl(this.val$targetUrl);
                    }
                }
            });
        }
    }

    @Override // com.king.popupwebview.IPopup
    public void postMessage(String str, String str2) {
        postMessage(str, str2, null);
    }

    @Override // com.king.popupwebview.IPopup
    public void postMessage(String str, String str2, IResponseCallback iResponseCallback) {
        this.activityWrapper.runOnUIThread(new Runnable(this, str, str2, iResponseCallback) { // from class: com.king.popupwebview.internal.Popup.9
            final Popup this$0;
            final String val$msgName;
            final String val$msgPayload;
            final IResponseCallback val$responseCB;

            {
                this.this$0 = this;
                this.val$msgName = str;
                this.val$msgPayload = str2;
                this.val$responseCB = iResponseCallback;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.pageState == PageState.LOADED) {
                    this.this$0.messageBus.postMessage(this.val$msgName, this.val$msgPayload, this.val$responseCB);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void recycleWebResources() {
        this.activityWrapper.runOnUIThread(new Runnable(this) { // from class: com.king.popupwebview.internal.Popup.2
            final Popup this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.messageBus.cancelAllResponses();
                this.this$0.loadingTargetUrl = "about:blank";
                this.this$0.pageState = null;
                this.this$0.autoShowOnLoaded = false;
                if (this.this$0.popupDialog != null) {
                    this.this$0.popupDialog.destroy();
                    this.this$0.popupDialog = null;
                }
                if (this.this$0.webView != null) {
                    this.this$0.webView.destroy();
                    this.this$0.webView = null;
                }
            }
        });
    }

    @Override // com.king.popupwebview.IPopup
    public void setLoadingListener(ILoadingListener iLoadingListener) {
        this.messageBus.setLoadingListener(iLoadingListener);
    }

    @Override // com.king.popupwebview.IPopup
    public void setMessageListener(IMessageListener iMessageListener) {
        this.messageBus.setMessageListener(iMessageListener);
    }

    @Override // com.king.popupwebview.IPopup
    public void show() {
        this.activityWrapper.runOnUIThread(new Runnable(this) { // from class: com.king.popupwebview.internal.Popup.4
            final Popup this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.webView == null) {
                    Popup popup = this.this$0;
                    popup.initializeWebResources(popup.forceFullscreen);
                }
                if (this.this$0.pageState == PageState.LOADED) {
                    this.this$0.popupDialog.open(this.this$0);
                    if (this.this$0.popupDialog.isOpened()) {
                        return;
                    }
                    this.this$0.recycleWebResources();
                }
            }
        });
    }

    @Override // com.king.popupwebview.IPopup
    public void unloadPage() {
        this.activityWrapper.runOnUIThread(new Runnable(this) { // from class: com.king.popupwebview.internal.Popup.8
            final Popup this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.pageState != null) {
                    PageState pageState = this.this$0.pageState;
                    PageState pageState2 = PageState.BLANK;
                    if (pageState != pageState2) {
                        this.this$0.loadingTargetUrl = "about:blank";
                        if (this.this$0.pageState != PageState.LOADING) {
                            this.this$0.messageBus.cancelAllResponses();
                        }
                        this.this$0.pageState = pageState2;
                        this.this$0.webView.loadUrl("about:blank");
                        this.this$0.recycleIfBlankAndHidden();
                    }
                }
            }
        });
    }
}
