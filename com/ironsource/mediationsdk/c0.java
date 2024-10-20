package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.b6;
import com.ironsource.ca;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.td;
import com.ironsource.x7;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: c0.class */
class c0 {
    private static c0 d;
    private final x7 b = ca.h().d();
    private final b6 c = ca.h().c();
    private JSONObject a = new JSONObject();

    /* loaded from: c0$a.class */
    class a implements Runnable {
        final c0 a;

        a(c0 c0Var) {
            this.a = c0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c0 c0Var = this.a;
                c0Var.a(c0Var.c());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private c0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            a(next, jSONObject.opt(next));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject c() {
        String str;
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            try {
                String p = this.c.p(applicationContext);
                String a2 = this.c.a(applicationContext);
                if (TextUtils.isEmpty(p)) {
                    p = this.c.J(applicationContext);
                    str = !TextUtils.isEmpty(p) ? IronSourceConstants.TYPE_UUID : "";
                } else {
                    str = IronSourceConstants.TYPE_GAID;
                }
                if (!TextUtils.isEmpty(p)) {
                    jSONObject.put(td.b, p);
                    jSONObject.put(td.D, str);
                }
                if (!TextUtils.isEmpty(a2)) {
                    jSONObject.put(td.E, Boolean.parseBoolean(a2));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    public static c0 f() {
        c0 c0Var;
        synchronized (c0.class) {
            try {
                if (d == null) {
                    d = new c0();
                }
                c0Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        try {
            new Thread(new a(this)).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void a(String str, Object obj) {
        synchronized (this) {
            try {
                this.a.put(str, obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
