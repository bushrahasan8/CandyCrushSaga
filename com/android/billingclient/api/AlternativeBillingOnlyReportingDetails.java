package com.android.billingclient.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import org.json.JSONException;
import org.json.JSONObject;

@zzg
@KeepForSdk
/* loaded from: AlternativeBillingOnlyReportingDetails.class */
public final class AlternativeBillingOnlyReportingDetails {
    private final String externalTransactionToken;

    public AlternativeBillingOnlyReportingDetails(String str) throws JSONException {
        this.externalTransactionToken = new JSONObject(str).optString("externalTransactionToken");
    }

    public String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }
}
