package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: q.class */
public interface q {

    /* loaded from: q$a.class */
    public static final class a implements q {
        private final JSONObject a;

        public a(JSONObject applicationConfig) {
            Intrinsics.checkNotNullParameter(applicationConfig, "applicationConfig");
            this.a = applicationConfig;
        }

        @Override // com.ironsource.q
        public JSONObject a() {
            JSONObject optJSONObject = this.a.optJSONObject("controllerConfig");
            JSONObject jSONObject = optJSONObject;
            if (optJSONObject == null) {
                jSONObject = new JSONObject();
            }
            return jSONObject;
        }

        @Override // com.ironsource.q
        public int b() {
            int optInt = this.a.optInt("debugMode", 0);
            if (this.a.optBoolean(b.e, false)) {
                optInt = 3;
            }
            return optInt;
        }

        @Override // com.ironsource.q
        public String c() {
            String optString = this.a.optString("controllerUrl");
            String str = optString;
            if (optString == null) {
                str = "";
            }
            return str;
        }
    }

    /* loaded from: q$b.class */
    public static final class b {
        public static final b a = new b();
        public static final String b = "controllerUrl";
        public static final String c = "controllerConfig";
        public static final String d = "debugMode";
        public static final String e = "adptDebugMode";

        private b() {
        }
    }

    JSONObject a();

    int b();

    String c();
}
