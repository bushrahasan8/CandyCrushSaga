package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: r4.class */
public final class r4 {
    private final ArrayList a = new ArrayList(new q4().a());
    private final k5 b = new k5();

    public final JSONObject a() {
        JSONObject a = this.b.a(this.a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
        return a;
    }
}
