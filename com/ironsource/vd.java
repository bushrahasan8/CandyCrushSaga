package com.ironsource;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: vd.class */
public final class vd {
    private final String[] a = ud.a.a();
    private final k5 b = new k5();

    private final JSONObject a(JSONObject jSONObject) {
        JSONObject b = l5.b(jSONObject.optJSONObject(i5.r));
        if (b != null) {
            jSONObject.put(i5.r, b);
        }
        return jSONObject;
    }

    public final JSONObject a() {
        JSONObject a = this.b.a(this.a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(a);
    }

    public final JSONObject a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject a = this.b.a(context, this.a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
        return a(a);
    }
}
