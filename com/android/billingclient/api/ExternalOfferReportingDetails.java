package com.android.billingclient.api;

import org.json.JSONException;
import org.json.JSONObject;

@zzh
/* loaded from: ExternalOfferReportingDetails.class */
public final class ExternalOfferReportingDetails {
    private final String externalTransactionToken;

    public ExternalOfferReportingDetails(String str) throws JSONException {
        this.externalTransactionToken = new JSONObject(str).optString("externalTransactionToken");
    }

    public String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }
}
