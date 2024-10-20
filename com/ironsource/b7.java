package com.ironsource;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: b7.class */
public class b7 {
    private z6 a;
    private WebView c;
    private String d;
    private String e = b7.class.getSimpleName();
    private String[] f = {"handleGetViewVisibility"};
    private final String[] g = {x6.h, x6.i, x6.g, "handleGetViewVisibility", x6.j};
    private fe b = new fe();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: b7$b.class */
    public class b implements Runnable {
        final String a;
        final String b;
        final b7 c;

        b(b7 b7Var, String str, String str2) {
            this.c = b7Var;
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.c.c.evaluateJavascript(this.a, null);
            } catch (Throwable th) {
                Log.e(this.c.e, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.b + "Android API level: " + Build.VERSION.SDK_INT);
            }
        }
    }

    private String a(String str) {
        return String.format(x6.u, str);
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.b.a());
        } catch (Exception e) {
            Log.e(this.e, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            e.printStackTrace();
        }
        return jSONObject2;
    }

    private void d() {
        if (this.a == null || this.b == null) {
            return;
        }
        a(x6.a, a());
    }

    private void d(String str) {
        o6.a.c(new b(this, "javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}", str));
    }

    private boolean h(String str) {
        for (String str2 : this.f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(String str) {
        return str.equalsIgnoreCase(x6.k);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(x6.s, this.b.a());
            jSONObject.put(x6.p, jSONObject2);
            jSONObject.put("adViewId", c());
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = new JSONObject();
        }
        return jSONObject;
    }

    public void a(WebView webView) {
        this.c = webView;
    }

    public void a(z6 z6Var) {
        this.a = z6Var;
    }

    public void a(String str, int i, boolean z) {
        this.b.a(str, i, z);
        if (i(str)) {
            d();
        }
    }

    public void a(String str, String str2) {
        z6 z6Var = this.a;
        if (z6Var != null) {
            z6Var.a(str, str2, this.d);
        }
    }

    public void a(String str, String str2, String str3) throws JSONException {
        if (this.c == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.e, str4);
            this.a.a(str3, str4, this.d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException e) {
            str = "\"" + str + "\"";
        }
        d(a(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.d);
        a(str2, jSONObject);
    }

    public void a(String str, JSONObject jSONObject) {
        z6 z6Var = this.a;
        if (z6Var != null) {
            z6Var.a(str, jSONObject);
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        a(a(jSONObject).toString(), str, str2);
    }

    public void b() {
        this.a = null;
        this.b = null;
    }

    public String c() {
        return this.d;
    }

    public void c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            if (TextUtils.isEmpty(optString) || !h(optString)) {
                a(jSONObject.optString(x6.v, x6.c), jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                a(jSONObject, (String) null, (String) null);
            }
        } catch (JSONException e) {
            Log.e(this.e, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            e.printStackTrace();
        }
    }

    public void e() {
        if (this.a == null || this.b == null) {
            return;
        }
        a(x6.b, a());
    }

    public void e(String str) throws JSONException {
        JSONObject a = this.b.a();
        a.put("adViewId", this.d);
        a(str, a);
    }

    public void f(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.d);
            a(str, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void g(String str) {
        this.d = str;
    }
}
