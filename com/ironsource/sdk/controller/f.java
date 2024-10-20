package com.ironsource.sdk.controller;

import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: f.class */
public interface f {

    /* loaded from: f$a.class */
    public static final class a {
        public static final C0046a c = new C0046a(null);
        private final String a;
        private final JSONObject b;

        /* renamed from: com.ironsource.sdk.controller.f$a$a, reason: collision with other inner class name */
        /* loaded from: f$a$a.class */
        public static final class C0046a {
            private C0046a() {
            }

            public /* synthetic */ C0046a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String jsonStr) throws JSONException {
                Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
                JSONObject jSONObject = new JSONObject(jsonStr);
                String id = jSONObject.getString(b.b);
                JSONObject optJSONObject = jSONObject.optJSONObject("params");
                Intrinsics.checkNotNullExpressionValue(id, "id");
                return new a(id, optJSONObject);
            }
        }

        public a(String msgId, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            this.a = msgId;
            this.b = jSONObject;
        }

        public static /* synthetic */ a a(a aVar, String str, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            if ((i & 2) != 0) {
                jSONObject = aVar.b;
            }
            return aVar.a(str, jSONObject);
        }

        public static final a a(String str) throws JSONException {
            return c.a(str);
        }

        public final a a(String msgId, JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            return new a(msgId, jSONObject);
        }

        public final String a() {
            return this.a;
        }

        public final JSONObject b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final JSONObject d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            JSONObject jSONObject = this.b;
            return (hashCode * 31) + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        public String toString() {
            return "CallbackToNative(msgId=" + this.a + ", params=" + this.b + ')';
        }
    }

    /* loaded from: f$b.class */
    public static final class b {
        public static final b a = new b();
        public static final String b = "msgId";
        public static final String c = "adId";
        public static final String d = "params";
        public static final String e = "success";
        public static final String f = "reason";
        public static final String g = "command";

        private b() {
        }
    }

    /* loaded from: f$c.class */
    public static final class c {
        private final String a;
        private final String b;
        private final JSONObject c;
        private String d;

        public c(String adId, String command, JSONObject params) {
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(params, "params");
            this.a = adId;
            this.b = command;
            this.c = params;
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            this.d = uuid;
        }

        public static /* synthetic */ c a(c cVar, String str, String str2, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.a;
            }
            if ((i & 2) != 0) {
                str2 = cVar.b;
            }
            if ((i & 4) != 0) {
                jSONObject = cVar.c;
            }
            return cVar.a(str, str2, jSONObject);
        }

        public final c a(String adId, String command, JSONObject params) {
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(params, "params");
            return new c(adId, command, params);
        }

        public final String a() {
            return this.a;
        }

        public final void a(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.d = str;
        }

        public final String b() {
            return this.b;
        }

        public final JSONObject c() {
            return this.c;
        }

        public final String d() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar == null) {
                return false;
            }
            if (this == cVar) {
                return true;
            }
            boolean z = false;
            if (Intrinsics.areEqual(this.d, cVar.d)) {
                z = false;
                if (Intrinsics.areEqual(this.a, cVar.a)) {
                    z = false;
                    if (Intrinsics.areEqual(this.b, cVar.b)) {
                        z = false;
                        if (Intrinsics.areEqual(this.c.toString(), cVar.c.toString())) {
                            z = true;
                        }
                    }
                }
            }
            return z;
        }

        public final String f() {
            return this.d;
        }

        public final JSONObject g() {
            return this.c;
        }

        public final String h() {
            String jSONObject = new JSONObject().put(b.b, this.d).put(b.c, this.a).put("params", this.c).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n\t\t\t\t.put(Co…, params)\n\t\t\t\t.toString()");
            return jSONObject;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return "MessageToController(adId=" + this.a + ", command=" + this.b + ", params=" + this.c + ')';
        }
    }
}
