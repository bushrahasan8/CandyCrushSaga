package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: t0.class */
public final class t0 {
    private final JSONObject a;
    private final boolean b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final int i;

    public t0(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = config;
        this.b = config.optBoolean("isExternalArmEventsEnabled", true);
        String optString = config.optString("externalArmEventsUrl", x4.j);
        Intrinsics.checkNotNullExpressionValue(optString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.c = optString;
        this.d = config.optBoolean(i5.E0, true);
        this.e = config.optBoolean("radvid", false);
        this.f = config.optInt("uaeh", 0);
        this.g = config.optBoolean("sharedThreadPool", false);
        this.h = config.optBoolean("sharedThreadPoolADP", true);
        this.i = config.optInt(i5.u0, -1);
    }

    public static /* synthetic */ t0 a(t0 t0Var, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = t0Var.a;
        }
        return t0Var.a(jSONObject);
    }

    public final t0 a(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new t0(config);
    }

    public final JSONObject a() {
        return this.a;
    }

    public final int b() {
        return this.i;
    }

    public final JSONObject c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && Intrinsics.areEqual(this.a, ((t0) obj).a);
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final int i() {
        return this.f;
    }

    public final boolean j() {
        return this.b;
    }

    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.a + ')';
    }
}
