package com.ironsource;

import org.json.JSONObject;

/* loaded from: r5.class */
public final class r5 implements n5 {
    private final JSONObject a;

    /* loaded from: r5$a.class */
    public static final class a {
        public static final boolean b = false;
        public static final int d = 24;
        public static final a a = new a();
        private static final int c = s5.SendEvent.b();

        private a() {
        }

        public final int a() {
            return c;
        }
    }

    public r5(JSONObject jSONObject) {
        this.a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.n5
    public long a() {
        return this.a.optInt("timeout", 24) * 1000;
    }

    @Override // com.ironsource.n5
    public s5 b() {
        return s5.b.a(this.a.optInt("strategy", a.a.a()));
    }

    @Override // com.ironsource.n5, com.ironsource.y4
    public boolean c() {
        return this.a.optBoolean(com.ironsource.mediationsdk.metadata.a.i, false);
    }
}
