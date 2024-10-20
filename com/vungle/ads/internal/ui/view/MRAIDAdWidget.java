package com.vungle.ads.internal.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcessClient;
import android.widget.RelativeLayout;
import androidx.webkit.internal.ApiHelperForQ$;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.util.HandlerScheduler;
import com.vungle.ads.internal.util.ViewUtility;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: MRAIDAdWidget.class */
public final class MRAIDAdWidget extends RelativeLayout {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "MRAIDAdWidget";
    private CloseDelegate closeDelegate;
    private OnViewTouchListener onViewTouchListener;
    private OrientationDelegate orientationDelegate;
    private WebView webView;

    /* loaded from: MRAIDAdWidget$CloseDelegate.class */
    public interface CloseDelegate {
        void close();
    }

    /* loaded from: MRAIDAdWidget$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: MRAIDAdWidget$DestroyRunnable.class */
    private static final class DestroyRunnable implements Runnable {
        private final WebView webView;

        public DestroyRunnable(WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.webView = webView;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.webView.stopLoading();
                if (Build.VERSION.SDK_INT >= 29) {
                    ApiHelperForQ$.ExternalSyntheticApiModelOutline2.m(this.webView, (WebViewRenderProcessClient) null);
                }
                this.webView.loadData("", null, null);
                this.webView.destroy();
            } catch (Throwable th) {
            }
        }
    }

    /* loaded from: MRAIDAdWidget$OnViewTouchListener.class */
    public interface OnViewTouchListener {
        boolean onTouch(MotionEvent motionEvent);
    }

    /* loaded from: MRAIDAdWidget$OrientationDelegate.class */
    public interface OrientationDelegate {
        void setOrientation(int i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRAIDAdWidget(Context context) throws InstantiationException {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        WebView webView = ViewUtility.INSTANCE.getWebView(context);
        this.webView = webView;
        if (webView != null) {
            webView.setLayoutParams(layoutParams);
        }
        if (webView != null) {
            webView.setTag("VungleWebView");
        }
        addView(webView, layoutParams);
        bindListeners();
        prepare();
    }

    private final void applyDefault(WebView webView) {
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindListeners() {
        WebView webView;
        final OnViewTouchListener onViewTouchListener = this.onViewTouchListener;
        if (onViewTouchListener == null || (webView = this.webView) == null) {
            return;
        }
        webView.setOnTouchListener(new View.OnTouchListener(onViewTouchListener) { // from class: com.vungle.ads.internal.ui.view.MRAIDAdWidget$$ExternalSyntheticLambda0
            public final MRAIDAdWidget.OnViewTouchListener f$0;

            {
                this.f$0 = onViewTouchListener;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m6939bindListeners$lambda1$lambda0;
                m6939bindListeners$lambda1$lambda0 = MRAIDAdWidget.m6939bindListeners$lambda1$lambda0(this.f$0, view, motionEvent);
                return m6939bindListeners$lambda1$lambda0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindListeners$lambda-1$lambda-0, reason: not valid java name */
    public static final boolean m6939bindListeners$lambda1$lambda0(OnViewTouchListener it, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(it, "$it");
        return it.onTouch(motionEvent);
    }

    public static /* synthetic */ void getCloseDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOrientationDelegate$vungle_ads_release$annotations() {
    }

    private final void prepare() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setLayerType(2, null);
            webView.setBackgroundColor(0);
            webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
            webView.setVisibility(8);
        }
    }

    public final void close() {
        CloseDelegate closeDelegate = this.closeDelegate;
        if (closeDelegate != null) {
            closeDelegate.close();
        }
    }

    public final void destroyWebView(long j) {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setWebChromeClient(null);
            removeAllViews();
            if (j <= 0) {
                new DestroyRunnable(webView).run();
            } else {
                new HandlerScheduler().schedule(new DestroyRunnable(webView), j);
            }
        }
    }

    public final CloseDelegate getCloseDelegate$vungle_ads_release() {
        return this.closeDelegate;
    }

    public final OnViewTouchListener getOnViewTouchListener$vungle_ads_release() {
        return this.onViewTouchListener;
    }

    public final OrientationDelegate getOrientationDelegate$vungle_ads_release() {
        return this.orientationDelegate;
    }

    public final String getUrl() {
        WebView webView = this.webView;
        return webView != null ? webView.getUrl() : null;
    }

    public final void linkWebView(WebViewClient vngWebViewClient) {
        Intrinsics.checkNotNullParameter(vngWebViewClient, "vngWebViewClient");
        WebView webView = this.webView;
        if (webView != null) {
            applyDefault(webView);
            webView.setWebViewClient(vngWebViewClient);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ViewGroup.LayoutParams layoutParams;
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -1;
            layoutParams2.width = -1;
        }
        WebView webView = this.webView;
        if (webView == null || (layoutParams = webView.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = -1;
        layoutParams.width = -1;
    }

    public final void pauseWeb() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
    }

    public final void resumeWeb() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onResume();
        }
    }

    public final void setCloseDelegate(CloseDelegate closeDelegate) {
        Intrinsics.checkNotNullParameter(closeDelegate, "closeDelegate");
        this.closeDelegate = closeDelegate;
    }

    public final void setCloseDelegate$vungle_ads_release(CloseDelegate closeDelegate) {
        this.closeDelegate = closeDelegate;
    }

    public final void setOnViewTouchListener(OnViewTouchListener onViewTouchListener) {
        this.onViewTouchListener = onViewTouchListener;
    }

    public final void setOnViewTouchListener$vungle_ads_release(OnViewTouchListener onViewTouchListener) {
        this.onViewTouchListener = onViewTouchListener;
    }

    public final void setOrientation(int i) {
        OrientationDelegate orientationDelegate = this.orientationDelegate;
        if (orientationDelegate != null) {
            orientationDelegate.setOrientation(i);
        }
    }

    public final void setOrientationDelegate(OrientationDelegate orientationDelegate) {
        this.orientationDelegate = orientationDelegate;
    }

    public final void setOrientationDelegate$vungle_ads_release(OrientationDelegate orientationDelegate) {
        this.orientationDelegate = orientationDelegate;
    }

    public final void showWebsite(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Log.d(TAG, "loadUrl: " + url);
        WebView webView = this.webView;
        if (webView != null) {
            webView.setVisibility(0);
            webView.loadUrl(url);
        }
    }
}
