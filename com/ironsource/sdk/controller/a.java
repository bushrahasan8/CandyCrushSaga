package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.e7;
import com.ironsource.ic;
import com.ironsource.ie;
import com.ironsource.n9;
import com.ironsource.qe;
import com.ironsource.t2;
import com.ironsource.x6;
import com.ironsource.z6;
import org.json.JSONObject;

/* loaded from: a.class */
public class a implements z6 {
    public static final String f = "removeAdView";
    public static final String g = "webviewAction";
    public static final String h = "handleGetViewVisibility";
    public static final String m = "errMsg";
    private qe a;
    private e7 b = e7.a();
    private Context c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: a$b.class */
    public static class b {
        String a;
        JSONObject b;
        String c;
        String d;

        private b() {
        }
    }

    public a(Context context) {
        this.c = context;
    }

    private b a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.a = jSONObject.optString(t2.f.b);
        bVar.b = jSONObject.optJSONObject(t2.f.c);
        bVar.c = jSONObject.optString("success");
        bVar.d = jSONObject.optString(t2.f.e);
        return bVar;
    }

    public void a(qe qeVar) {
        this.a = qeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(String str, n9 n9Var) {
        boolean z;
        b a = a(str);
        ic icVar = new ic();
        try {
            String str2 = a.a;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (str2.equals(f)) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 691453791:
                    if (str2.equals(x6.j)) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 842351363:
                    if (str2.equals(x6.h)) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case 1182065477:
                    if (str2.equals("handleGetViewVisibility")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                case 1491535759:
                    if (str2.equals(g)) {
                        z = 4;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            if (!z) {
                this.b.a(this, a.b, this.c, a.c, a.d);
                return;
            }
            if (z) {
                this.b.d(a.b, a.c, a.d);
                return;
            }
            if (z == 2) {
                this.b.c(a.b, a.c, a.d);
            } else if (z == 3) {
                this.b.a(a.b, a.c, a.d);
            } else {
                if (z != 4) {
                    throw new IllegalArgumentException(String.format("%s | unsupported AdViews API", a.a));
                }
                this.b.b(a.b, a.c, a.d);
            }
        } catch (Exception e) {
            icVar.b("errMsg", e.getMessage());
            String c = this.b.c(a.b);
            if (!TextUtils.isEmpty(c)) {
                icVar.b("adViewId", c);
            }
            n9Var.a(false, a.d, icVar);
        }
    }

    @Override // com.ironsource.z6
    public void a(String str, String str2, String str3) {
        a(str, ie.a(str2, str3));
    }

    @Override // com.ironsource.z6
    public void a(String str, JSONObject jSONObject) {
        if (this.a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(str, jSONObject);
    }
}
