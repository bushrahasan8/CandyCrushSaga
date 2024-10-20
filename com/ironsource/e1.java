package com.ironsource;

import com.ironsource.i5;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: e1.class */
public final class e1 {
    private final i5.a a;
    private final ArrayList b = new ArrayList(new c1().a());
    private final k5 c = new k5();

    public e1(i5.a aVar) {
        this.a = aVar;
    }

    private final JSONObject a(JSONObject jSONObject) {
        JSONObject b = l5.b(jSONObject.optJSONObject(i5.r));
        if (b != null) {
            jSONObject.put(i5.r, b);
        }
        return jSONObject;
    }

    public final JSONObject a() {
        i5.a aVar = this.a;
        JSONObject a = aVar != null ? this.c.a(this.b, aVar) : null;
        JSONObject jSONObject = a;
        if (a == null) {
            jSONObject = this.c.a(this.b);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
        return a(jSONObject);
    }
}
