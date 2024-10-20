package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: a1.class */
public interface a1 {

    /* loaded from: a1$a.class */
    public static final class a implements a1 {
        private final JSONObject a;

        public a() {
            this(null, 1, null);
        }

        public a(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        public /* synthetic */ a(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new JSONObject() : jSONObject);
        }

        @Override // com.ironsource.a1
        public com.ironsource.mediationsdk.demandOnly.p a(String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            JSONObject jSONObject = this.a;
            String str = null;
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(instanceId) : null;
            if (optJSONObject != null) {
                str = optJSONObject.optString("plumbus");
            }
            return str != null ? new p.a(str) : new p.b();
        }
    }

    com.ironsource.mediationsdk.demandOnly.p a(String str);
}
