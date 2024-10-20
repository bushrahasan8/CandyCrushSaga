package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.ironsource.t2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: g.class */
public final class g {
    private static final String c = "com.ironsource.sdk.controller.g";
    private final b a;
    private final s b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(b bVar, s sVar) {
        this.a = bVar;
        this.b = sVar;
    }

    private String a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(t2.f.b, SDKUtils.encodeString(str));
            jSONObject.put("params", SDKUtils.encodeString(str2));
            jSONObject.put("hash", SDKUtils.encodeString(str3));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    private void a(Exception exc) {
        exc.printStackTrace();
        Logger.i(c, "messageHandler failed with exception " + exc.getMessage());
    }

    private void a(String str, String str2) {
        this.a.a(str, str2);
    }

    private void b(String str, String str2, String str3) {
        this.a.a(a(str, str2, str3));
    }

    @JavascriptInterface
    public void messageHandler(String str, String str2, String str3) {
        try {
            Logger.i(c, "messageHandler(" + str + " " + str3 + ")");
            if (this.b.a(str, str2, str3)) {
                a(str, str2);
            } else {
                b(str, str2, str3);
            }
        } catch (Exception e) {
            a(e);
        }
    }
}
