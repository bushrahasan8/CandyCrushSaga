package com.ironsource.adqualitysdk.sdk.i;

import org.json.JSONObject;

/* loaded from: au.class */
public class au {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private az f394;

    /* renamed from: ｋ, reason: contains not printable characters */
    private JSONObject f395;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public final az m3311() {
        return this.f394;
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final JSONObject m3312() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f395;
        }
        return jSONObject;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public void mo3313(JSONObject jSONObject) {
        synchronized (this) {
            this.f395 = jSONObject;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m3314(az azVar) {
        this.f394 = azVar;
    }
}
