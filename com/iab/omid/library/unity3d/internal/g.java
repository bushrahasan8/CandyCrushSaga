package com.iab.omid.library.unity3d.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.unity3d.adsession.ErrorType;
import com.ironsource.t2;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import org.json.JSONObject;

/* loaded from: g.class */
public class g {
    private static g a = new g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: g$a.class */
    public class a implements Runnable {
        final WebView a;
        final String b;
        final g c;

        a(g gVar, WebView webView, String str) {
            this.c = gVar;
            this.a = webView;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.c(this.a, this.b);
        }
    }

    private g() {
    }

    public static final g a() {
        return a;
    }

    public void a(WebView webView, String str) {
        a(webView, "finishSession", str);
    }

    public void a(WebView webView, String str, float f) {
        a(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    public void a(WebView webView, String str, ErrorType errorType, String str2) {
        a(webView, MRAIDPresenter.ERROR, errorType.toString(), str2, str);
    }

    public void a(WebView webView, String str, String str2) {
        a(webView, "setNativeViewHierarchy", str2, str);
    }

    public void a(WebView webView, String str, String str2, JSONObject jSONObject) {
        a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    public void a(WebView webView, String str, JSONObject jSONObject) {
        a(webView, t2.a.e, jSONObject, str);
    }

    public void a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    void a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            com.iab.omid.library.unity3d.utils.d.a("The WebView is null for " + str);
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        a(sb, objArr);
        sb.append(")}");
        a(webView, sb);
    }

    void a(WebView webView, StringBuilder sb) {
        String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            c(webView, sb2);
        } else {
            handler.post(new a(this, webView, sb2));
        }
    }

    public void a(WebView webView, JSONObject jSONObject) {
        a(webView, "setLastActivity", jSONObject);
    }

    void a(StringBuilder sb, Object[] objArr) {
        String obj;
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (Object obj2 : objArr) {
            if (obj2 == null) {
                obj = "null";
            } else {
                if (obj2 instanceof String) {
                    obj = obj2.toString();
                    if (!obj.startsWith("{")) {
                        sb.append('\"');
                        sb.append(obj);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj2);
                }
                sb.append(",");
            }
            sb.append(obj);
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
    }

    public void b(WebView webView, String str) {
        a(webView, "publishImpressionEvent", str);
    }

    public void b(WebView webView, String str, String str2) {
        a(webView, "setState", str2, str);
    }

    public void b(WebView webView, String str, JSONObject jSONObject) {
        a(webView, "publishLoadedEvent", jSONObject, str);
    }

    public void c(WebView webView, String str, String str2) {
        if (str == null || TextUtils.isEmpty(str2)) {
            return;
        }
        c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    public boolean c(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (IllegalStateException e) {
            webView.loadUrl("javascript: " + str);
            return true;
        }
    }
}
