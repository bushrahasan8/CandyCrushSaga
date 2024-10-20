package com.ironsource;

import com.ironsource.t2;
import org.json.JSONObject;

/* loaded from: wc.class */
public class wc {
    private final JSONObject a;

    public wc(JSONObject jSONObject) {
        this.a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public boolean a() {
        return this.a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.a.optBoolean(t2.a.n, false);
    }

    public boolean c() {
        return this.a.optBoolean(t2.a.o, false);
    }

    public boolean d() {
        return this.a.optBoolean(t2.a.k, false);
    }

    public boolean e() {
        return this.a.optBoolean(t2.a.m, false);
    }
}
