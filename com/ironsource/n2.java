package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.t2;
import org.json.JSONObject;

/* loaded from: n2.class */
public abstract class n2 implements y5 {
    private x5 a;

    /* JADX INFO: Access modifiers changed from: protected */
    public n2(JSONObject jSONObject, Context context) {
        this.a = a(jSONObject, context);
        Logger.i(n2.class.getSimpleName(), "created ConnectivityAdapter with strategy " + this.a.getClass().getSimpleName());
    }

    private x5 a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(t2.i.f0) != 1 && p0.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return new oa(this);
        }
        return new BroadcastReceiverStrategy(this);
    }

    public JSONObject a(Context context) {
        return this.a.c(context);
    }

    @Override // com.ironsource.y5
    public void a() {
    }

    @Override // com.ironsource.y5
    public void a(String str, JSONObject jSONObject) {
    }

    public void b() {
        this.a.a();
    }

    public void b(Context context) {
        this.a.b(context);
    }

    @Override // com.ironsource.y5
    public void b(String str, JSONObject jSONObject) {
    }

    public void c(Context context) {
        this.a.a(context);
    }
}
