package com.ironsource.mediationsdk.utils;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: d.class */
public class d {
    private NetworkSettings b;
    private ArrayList a = new ArrayList();
    private JSONObject c = null;
    private boolean d = false;
    private boolean e = true;

    public static d a() {
        return new d();
    }

    public void a(NetworkSettings networkSettings) {
        this.b = networkSettings;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.add(str);
    }

    public void a(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public JSONObject b() {
        return this.c;
    }

    public void b(boolean z) {
        this.d = z;
    }

    public NetworkSettings c() {
        return this.b;
    }

    public ArrayList<String> d() {
        return this.a;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }
}
