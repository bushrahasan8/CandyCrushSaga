package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: p3.class */
public interface p3 {

    /* loaded from: p3$a.class */
    public static final class a {
        private final Map a;

        public a(String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            this.a = MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_PROVIDER, providerName), TuplesKt.to("isDemandOnly", 1));
        }

        public final Map<String, Object> a() {
            return MapsKt.toMutableMap(this.a);
        }

        public final void a(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.a.put(key, value);
        }
    }

    /* loaded from: p3$b.class */
    public static final class b implements p3 {
        private final e6 a;
        private final a b;

        public b(e6 eventManager, a eventBaseData) {
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
            this.a = eventManager;
            this.b = eventBaseData;
        }

        @Override // com.ironsource.p3
        public void a(int i, String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Map<String, Object> a = this.b.a();
            a.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, instanceId);
            this.a.a(new l4(i, new JSONObject(MapsKt.toMap(a))));
        }
    }

    void a(int i, String str);
}
