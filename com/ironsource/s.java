package com.ironsource;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: s.class */
public final class s {
    private final List a = CollectionsKt.listOf((Object[]) new String[]{i5.r0, "auid"});
    private final k5 b = new k5();

    public final JSONObject a() {
        JSONObject a = this.b.a(this.a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(keys)");
        return a;
    }
}
