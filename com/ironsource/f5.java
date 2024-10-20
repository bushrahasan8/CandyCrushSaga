package com.ironsource;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: f5.class */
public class f5 {
    public static final String b = "userId";
    private static f5 c;
    private JSONObject a = new JSONObject();

    private f5() {
    }

    public static f5 a() {
        f5 f5Var;
        synchronized (f5.class) {
            try {
                if (c == null) {
                    c = new f5();
                }
                f5Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f5Var;
    }

    public String a(String str) {
        String optString;
        synchronized (this) {
            optString = this.a.optString(str);
        }
        return optString;
    }

    public void a(String str, Object obj) {
        synchronized (this) {
            try {
                this.a.put(str, obj);
            } catch (Exception e) {
            }
        }
    }

    public void a(Map<String, Object> map) {
        synchronized (this) {
            if (map != null) {
                for (String str : map.keySet()) {
                    a(str, map.get(str));
                }
            }
        }
    }

    public JSONObject b() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.a;
        }
        return jSONObject;
    }
}
