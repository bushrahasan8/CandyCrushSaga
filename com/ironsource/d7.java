package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.t2;
import com.ironsource.w7;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.model.AdPayload;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: d7.class */
public class d7 implements w7 {
    private static final String h = "d7";
    private final String a;
    private String b;
    private WebView c;
    private b7 d;
    private w6 e;
    private Context f;

    /* loaded from: d7$a.class */
    class a implements Runnable {
        final String a;
        final JSONObject b;
        final String c;
        final d7 d;

        a(d7 d7Var, String str, JSONObject jSONObject, String str2) {
            this.d = d7Var;
            this.a = str;
            this.b = jSONObject;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.d.c != null) {
                m7.a(hc.q, new h7().a(m4.z, "loadWithUrl | webView is not null").a());
            }
            try {
                this.d.b(this.a);
                this.d.c.loadUrl(this.d.a(this.b.getString("urlForWebView")));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", this.d.a);
                this.d.d.a(this.c, jSONObject);
            } catch (Exception e) {
                this.d.b(this.a, e.getMessage());
                m7.a(hc.q, new h7().a(m4.z, e.getMessage()).a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: d7$b.class */
    public class b implements Runnable {
        final String a;
        final String b;
        final d7 c;

        b(d7 d7Var, String str, String str2) {
            this.c = d7Var;
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.c.c != null) {
                    this.c.c.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", this.c.a);
                if (this.c.d != null) {
                    this.c.d.a(this.a, jSONObject);
                    this.c.d.b();
                }
                this.c.d = null;
                this.c.f = null;
            } catch (Exception e) {
                Log.e(d7.h, "performCleanup | could not destroy ISNAdView webView ID: " + this.c.a);
                m7.a(hc.r, new h7().a(m4.z, e.getMessage()).a());
                this.c.b(this.b, e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: d7$c.class */
    public class c implements w7.a {
        final String a;
        final d7 b;

        c(d7 d7Var, String str) {
            this.b = d7Var;
            this.a = str;
        }

        @Override // com.ironsource.w7.a
        public void a(String str) {
            Logger.i(d7.h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            this.b.b(this.a, str);
        }

        @Override // com.ironsource.w7.a
        public void b(String str) {
            Logger.i(d7.h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) this.b.c.getParent()).removeView(this.b.c);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.b.e();
        }
    }

    public d7(z6 z6Var, Context context, String str, w6 w6Var) {
        this.f = context;
        b7 b7Var = new b7();
        this.d = b7Var;
        b7Var.g(str);
        this.a = str;
        this.d.a(z6Var);
        this.e = w6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        String str2 = str;
        if (c(str)) {
            str2 = AdPayload.FILE_SCHEME + this.b + d(str);
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Logger.i(h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f);
        this.c = webView;
        webView.addJavascriptInterface(new a7(this), x6.e);
        this.c.setWebViewClient(new c7(new c(this, str)));
        re.a(this.c);
        this.d.a(this.c);
    }

    private boolean c(String str) {
        return str.startsWith(".");
    }

    private String d(String str) {
        String substring = str.substring(str.indexOf(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH) + 1);
        return substring.substring(substring.indexOf(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (this) {
            a("", "");
        }
    }

    @Override // com.ironsource.w7
    public void a(String str, String str2) {
        synchronized (this) {
            if (this.f == null) {
                return;
            }
            Logger.i(h, "performCleanup");
            o6.a.c(new b(this, str, str2));
        }
    }

    @Override // com.ironsource.w7
    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, t2.c.F);
            return;
        }
        Logger.i(h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(t2.h.t0)) {
                this.c.onPause();
            } else {
                if (!str.equals(t2.h.u0)) {
                    b(str3, t2.c.E);
                    return;
                }
                this.c.onResume();
            }
            this.d.f(str2);
        } catch (Exception e) {
            b(str3, t2.c.G);
        }
    }

    @Override // com.ironsource.w7
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.d.e(str);
        } catch (Exception e) {
            Logger.i(h, "sendHandleGetViewVisibility fail with reason: " + e.getMessage());
        }
    }

    public String b() {
        return this.a;
    }

    public void b(String str, String str2) {
        b7 b7Var = this.d;
        if (b7Var != null) {
            b7Var.a(str, str2);
        }
    }

    @Override // com.ironsource.w7
    public void b(JSONObject jSONObject, String str, String str2) {
        o6.a.c(new a(this, str2, jSONObject, str));
    }

    public b7 c() {
        return this.d;
    }

    @Override // com.ironsource.w7
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e) {
            Logger.i(h, "sendMessageToAd fail message: " + e.getMessage());
            throw e;
        }
    }

    public w6 d() {
        return this.e;
    }

    public void e(String str) {
        this.b = str;
    }

    @Override // com.ironsource.w7
    public WebView getPresentingView() {
        return this.c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.d.c(str);
    }
}
