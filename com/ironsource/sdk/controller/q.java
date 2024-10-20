package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.ic;
import com.ironsource.n9;
import com.ironsource.p0;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.t2;
import org.json.JSONObject;

/* loaded from: q.class */
public class q {
    private static final String b = "q";
    private Context a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: q$b.class */
    public static class b {
        String a;
        JSONObject b;
        String c;
        String d;

        private b() {
        }
    }

    public q(Context context) {
        this.a = context;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, n9 n9Var) {
        b a2 = a(str);
        if ("getPermissions".equals(a2.a)) {
            a(a2.b, a2, n9Var);
            return;
        }
        if ("isPermissionGranted".equals(a2.a)) {
            b(a2.b, a2, n9Var);
            return;
        }
        Logger.i(b, "PermissionsJSAdapter unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, b bVar, n9 n9Var) {
        ic icVar = new ic();
        try {
            icVar.a("permissions", p0.a(this.a, jSONObject.getJSONArray("permissions")));
            n9Var.a(true, bVar.c, icVar);
        } catch (Exception e) {
            e.printStackTrace();
            Logger.i(b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e.getMessage());
            icVar.b("errMsg", e.getMessage());
            n9Var.a(false, bVar.d, icVar);
        }
    }

    public void b(JSONObject jSONObject, b bVar, n9 n9Var) {
        String str;
        boolean z;
        ic icVar = new ic();
        try {
            String string = jSONObject.getString("permission");
            icVar.b("permission", string);
            if (p0.d(this.a, string)) {
                icVar.b("status", String.valueOf(p0.c(this.a, string)));
                str = bVar.c;
                z = true;
            } else {
                icVar.b("status", "unhandledPermission");
                str = bVar.d;
                z = false;
            }
            n9Var.a(z, str, icVar);
        } catch (Exception e) {
            e.printStackTrace();
            icVar.b("errMsg", e.getMessage());
            n9Var.a(false, bVar.d, icVar);
        }
    }
}
