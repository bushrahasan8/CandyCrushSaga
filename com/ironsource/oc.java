package com.ironsource;

import org.json.JSONObject;

/* loaded from: oc.class */
public class oc {
    private String a;
    private String b;
    private JSONObject c;

    public oc(String str, String str2, JSONObject jSONObject) {
        this.a = str;
        this.b = str2;
        this.c = jSONObject;
    }

    public JSONObject a() {
        return this.c;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }
}
