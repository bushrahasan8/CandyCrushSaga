package com.king.amp.sa;

import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.king.abm.R$raw;
import com.king.amp.sa.AbmWebView;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.ByteArrayInputStream;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: AbmHtmlBridge.class */
public class AbmHtmlBridge implements AbmWebView.AbmWebviewVisibilityListener {
    private static String TAG = "AbmHtmlBridge";
    private final InteractiveAdActivity mActivity;
    private final AbmInteractiveAdListener mInteractiveAdListener;
    private final AbmWebView mWebView;

    /* loaded from: AbmHtmlBridge$AbmInteractiveAdListener.class */
    public interface AbmInteractiveAdListener {
        void onCriticalError(String str);

        void onCtaClick(String str);

        void onEngagementEvent(String str);

        void onOpen(String str);

        void onReward();
    }

    /* loaded from: AbmHtmlBridge$ViewState.class */
    public enum ViewState {
        LOADING,
        DEFAULT,
        RESIZED,
        EXPANDED,
        HIDDEN;

        public String toJavascriptString() {
            return toString().toLowerCase(Locale.US);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbmHtmlBridge(InteractiveAdActivity interactiveAdActivity, AbmWebView abmWebView, AbmInteractiveAdListener abmInteractiveAdListener) {
        this.mActivity = interactiveAdActivity;
        this.mWebView = abmWebView;
        this.mInteractiveAdListener = abmInteractiveAdListener;
        abmWebView.setVisibilityListener(this);
    }

    private void fireErrorEvent(String str, String str2) {
        injectJavaScript("window.mraidbridge.notifyErrorEvent(" + JSONObject.quote(str) + ", " + JSONObject.quote(str2) + ")");
    }

    private void fireNativeCommandCompleteEvent(String str) {
        injectJavaScript("window.mraidbridge.nativeCallComplete(" + JSONObject.quote(str) + ")");
    }

    private Map getQueryParamMap(Uri uri) {
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, TextUtils.join(",", uri.getQueryParameters(str)));
        }
        return hashMap;
    }

    private void injectJavaScript(String str) {
        Log.d(TAG, "Injecting Javascript into WebView:\n\t" + str);
        this.mWebView.evaluateJavascript("javascript:" + str, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void runJSCommand(String str, Map map) {
        boolean z;
        boolean z2;
        synchronized (this) {
            Log.d(TAG, "AbmHtmlBridge runJSCommand: " + str + " with params:" + map.toString());
            String lowerCase = str.toLowerCase();
            switch (lowerCase.hashCode()) {
                case -1914750514:
                    if (lowerCase.equals("onreward")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case -1856607801:
                    if (lowerCase.equals("playvideo")) {
                        z = 9;
                        break;
                    }
                    z = -1;
                    break;
                case -1503025504:
                    if (lowerCase.equals("createcalendarevent")) {
                        z = 12;
                        break;
                    }
                    z = -1;
                    break;
                case -1289167206:
                    if (lowerCase.equals("expand")) {
                        z = 8;
                        break;
                    }
                    z = -1;
                    break;
                case -1205414659:
                    if (lowerCase.equals("storepicture")) {
                        z = 10;
                        break;
                    }
                    z = -1;
                    break;
                case -934437708:
                    if (lowerCase.equals("resize")) {
                        z = 7;
                        break;
                    }
                    z = -1;
                    break;
                case -24043200:
                    if (lowerCase.equals("usecustomclose")) {
                        z = 6;
                        break;
                    }
                    z = -1;
                    break;
                case 3417674:
                    if (lowerCase.equals(MRAIDPresenter.OPEN)) {
                        z = 4;
                        break;
                    }
                    z = -1;
                    break;
                case 94756344:
                    if (lowerCase.equals("close")) {
                        z = 5;
                        break;
                    }
                    z = -1;
                    break;
                case 608220129:
                    if (lowerCase.equals("setorientationproperties")) {
                        z = 11;
                        break;
                    }
                    z = -1;
                    break;
                case 886505980:
                    if (lowerCase.equals("onengagementevent")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case 901642826:
                    if (lowerCase.equals("oncriticalerror")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                case 1892863063:
                    if (lowerCase.equals("onctaclick")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    this.mInteractiveAdListener.onEngagementEvent((String) map.get("event"));
                    z2 = true;
                    break;
                case true:
                    this.mInteractiveAdListener.onReward();
                    z2 = true;
                    break;
                case true:
                    this.mInteractiveAdListener.onCtaClick((String) map.get("url"));
                    z2 = true;
                    break;
                case true:
                    this.mInteractiveAdListener.onCriticalError((String) map.get(MRAIDPresenter.ERROR));
                    z2 = true;
                    break;
                case true:
                    this.mInteractiveAdListener.onOpen((String) map.get("url"));
                    z2 = true;
                    break;
                case true:
                case true:
                case true:
                case true:
                case true:
                case true:
                case true:
                case true:
                    Log.d(TAG, lowerCase + "is not yet supported.");
                    z2 = true;
                    break;
                default:
                    Log.d(TAG, lowerCase + "is not recognized.");
                    z2 = false;
                    break;
            }
            fireNativeCommandCompleteEvent(lowerCase);
            if (!z2) {
                fireErrorEvent(lowerCase, lowerCase + " is not supported");
            }
        }
    }

    private String stringifyRect(Rect rect) {
        return rect.left + "," + rect.top + "," + rect.width() + "," + rect.height();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void fireReadyEvent() {
        injectJavaScript("window.mraidbridge.fireReadyEvent()");
    }

    public void handlePageFinished(String str) {
        Log.i(TAG, "onPageFinished with progress: " + this.mWebView.getProgress());
    }

    public WebResourceResponse handleShouldInterceptRequest(Uri uri) {
        if (!"mraid.js".equals(uri.getLastPathSegment())) {
            return null;
        }
        try {
            return new WebResourceResponse("text/javascript", "UTF-8", new SequenceInputStream(Collections.enumeration(Arrays.asList(new ByteArrayInputStream("javascript:".getBytes()), this.mActivity.getResources().openRawResource(R$raw.abm_mraid)))));
        } catch (Exception e) {
            Log.e(TAG, "Unable to read resource", e);
            return null;
        }
    }

    public boolean handleShouldOverrideUrl(Uri uri) {
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if (!"mraid".equals(scheme) || host == null || host.isEmpty()) {
            return false;
        }
        try {
            runJSCommand(host, getQueryParamMap(uri));
            return true;
        } catch (IllegalArgumentException e) {
            String message = e.getMessage();
            Objects.requireNonNull(message);
            fireErrorEvent(host, message);
            return true;
        }
    }

    public void notifyCurrentPosition(Rect rect) {
        injectJavaScript("window.mraidbridge.setCurrentPosition(" + stringifyRect(rect) + ")");
    }

    public void notifyDefaultPosition(Rect rect) {
        injectJavaScript("window.mraidbridge.setDefaultPosition(" + stringifyRect(rect) + ")");
    }

    public void notifyMaxSize(int i, int i2) {
        injectJavaScript("window.mraidbridge.setMaxSize(" + i + ", " + i2 + ")");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyPlacementType() {
        injectJavaScript("window.mraidbridge.setPlacementType(" + JSONObject.quote("Interstitial") + ")");
    }

    public void notifyScreenSize(int i, int i2) {
        injectJavaScript("window.mraidbridge.setScreenSize(" + i + ", " + i2 + ")");
    }

    public void notifySizeChangeEvent(Rect rect) {
        injectJavaScript("window.mraidbridge.notifySizeChangeEvent(" + stringifyRect(rect) + ")");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifySupports() {
        injectJavaScript("window.mraidbridge.setSupports(false,false,false,false,true)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyViewState(ViewState viewState) {
        injectJavaScript("window.mraidbridge.setState(" + JSONObject.quote(viewState.toJavascriptString()) + ")");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyViewability(boolean z) {
        injectJavaScript("window.mraidbridge.fireChangeEvent(" + (z ? "{'viewable':'true'}" : "{'viewable':'false'}") + ")");
    }

    @Override // com.king.amp.sa.AbmWebView.AbmWebviewVisibilityListener
    public void onVisibilityChanged(boolean z) {
        notifyViewability(z);
    }
}
