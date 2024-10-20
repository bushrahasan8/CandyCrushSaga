package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* loaded from: m0.class */
public class m0 {
    private NetworkSettings a;
    private JSONObject b;
    private IronSource.AD_UNIT c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;

    public m0(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.a = networkSettings;
        this.b = jSONObject;
        int optInt = jSONObject.optInt("instanceType");
        this.f = optInt;
        this.d = optInt == 2;
        this.e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.g = jSONObject.optInt("maxAdsPerSession", 99);
        this.c = ad_unit;
    }

    public String a() {
        return this.a.getAdSourceNameForEvents();
    }

    public IronSource.AD_UNIT b() {
        return this.c;
    }

    public JSONObject c() {
        return this.b;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.g;
    }

    public String f() {
        return this.a.getProviderName();
    }

    public String g() {
        return this.a.getProviderTypeForReflection();
    }

    public NetworkSettings h() {
        return this.a;
    }

    public String i() {
        return this.a.getSubProviderId();
    }

    public boolean j() {
        return this.d;
    }

    public boolean k() {
        return this.e;
    }
}
