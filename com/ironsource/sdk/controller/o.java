package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.ic;
import com.ironsource.n9;
import com.ironsource.ra;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.t2;
import org.json.JSONObject;

/* loaded from: o.class */
public class o {
    private static final String c = "o";
    private final Context a;
    private final ra b = new ra();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: o$b.class */
    public static class b {
        String a;
        JSONObject b;
        String c;
        String d;

        private b() {
        }
    }

    public o(Context context) {
        this.a = context;
    }

    private b a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.a = jSONObject.optString("omidFunction");
        bVar.b = jSONObject.optJSONObject("omidParams");
        bVar.c = jSONObject.optString("success");
        bVar.d = jSONObject.optString(t2.f.e);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(String str, n9 n9Var) {
        boolean z;
        b a2 = a(str);
        ic icVar = new ic();
        JSONObject jSONObject = a2.b;
        if (jSONObject != null) {
            String optString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(optString)) {
                icVar.b("adViewId", optString);
            }
        }
        try {
            String str2 = a2.a;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals("activate")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case -984459207:
                    if (str2.equals("getOmidData")) {
                        z = 4;
                        break;
                    }
                    z = -1;
                    break;
                case 70701699:
                    if (str2.equals("finishSession")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 1208109646:
                    if (str2.equals("impressionOccurred")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                case 1850541012:
                    if (str2.equals("startSession")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            if (z) {
                if (z) {
                    this.b.d(a2.b);
                } else if (z == 2) {
                    this.b.b(a2.b);
                } else if (z == 3) {
                    this.b.c(a2.b);
                } else if (z != 4) {
                    throw new IllegalArgumentException(String.format("%s | unsupported OMID API", a2.a));
                }
                ic icVar2 = icVar;
                n9Var.a(true, a2.c, icVar);
            }
            this.b.a(this.a);
            icVar = this.b.a();
            ic icVar22 = icVar;
            n9Var.a(true, a2.c, icVar);
        } catch (Exception e) {
            icVar.b("errMsg", e.getMessage());
            Logger.i(c, "OMIDJSAdapter " + a2.a + " Exception: " + e.getMessage());
            n9Var.a(false, a2.d, icVar);
        }
    }
}
