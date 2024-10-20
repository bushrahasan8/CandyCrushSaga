package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.t2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: e7.class */
public class e7 implements l0 {
    private static final String b = "e7";
    private static e7 c;
    private final Map a = Collections.synchronizedMap(new HashMap());

    /* loaded from: e7$a.class */
    class a implements Runnable {
        final d7 a;
        final Context b;
        final String c;
        final e7 d;

        a(e7 e7Var, d7 d7Var, Context context, String str) {
            this.d = e7Var;
            this.a = d7Var;
            this.b = context;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d.a.put(this.c, new y6(this.a, this.b));
        }
    }

    public static e7 a() {
        e7 e7Var;
        synchronized (e7.class) {
            try {
                if (c == null) {
                    c = new e7();
                }
                e7Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e7Var;
    }

    private w6 a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(t2.h.O));
            String obj = jSONObject2.get("height").toString();
            String obj2 = jSONObject2.get("width").toString();
            return new w6(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get("label").toString());
        } catch (Exception e) {
            return new w6();
        }
    }

    private w6 b(JSONObject jSONObject) {
        w6 w6Var;
        w6 w6Var2 = new w6();
        try {
            w6Var = a(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            w6Var = w6Var2;
        }
        return w6Var;
    }

    private boolean d(JSONObject jSONObject) {
        try {
            return jSONObject.getBoolean(t2.h.s0);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.ironsource.l0
    public w7 a(String str) {
        if (str.isEmpty() || !this.a.containsKey(str)) {
            return null;
        }
        return (w7) this.a.get(str);
    }

    public void a(z6 z6Var, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "loadWithUrl fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        w6 b2 = b(jSONObject);
        if (this.a.containsKey(string)) {
            Logger.i(b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        d7 d7Var = new d7(z6Var, context, string, b2);
        d7Var.e(IronSourceStorageUtils.getNetworkStorageDir(context));
        d7Var.b(jSONObject, str, str2);
        if (d(jSONObject)) {
            o6.a.c(new a(this, d7Var, context, string));
        } else {
            this.a.put(string, d7Var);
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.a.containsKey(string)) {
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        w7 w7Var = (w7) this.a.get(string);
        if (w7Var != null) {
            w7Var.a(jSONObject, str, str2);
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "performWebViewAction fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.a.containsKey(string)) {
            Logger.i(b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        w7 w7Var = (w7) this.a.get(string);
        String string2 = jSONObject.getString(t2.h.v0);
        if (w7Var != null) {
            w7Var.a(string2, str, str2);
        }
    }

    public String c(JSONObject jSONObject) throws JSONException {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.a.containsKey(string)) {
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        w7 w7Var = (w7) this.a.get(string);
        this.a.remove(string);
        if (w7Var != null) {
            w7Var.a(str, str2);
        }
    }

    public void d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = new JSONObject(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.a.containsKey(string)) {
            Logger.i(b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        w7 w7Var = (w7) this.a.get(string);
        if (w7Var != null) {
            w7Var.c(jSONObject, str, str2);
        }
    }
}
