package com.android.billingclient.api;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zzct.class */
public final class zzct {
    private final String zza;
    private final String zzb;

    public zzct(JSONObject jSONObject) throws JSONException {
        this.zza = jSONObject.getString("rentalPeriod");
        String optString = jSONObject.optString("rentalExpirationPeriod");
        this.zzb = true == optString.isEmpty() ? null : optString;
    }
}
