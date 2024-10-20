package com.ironsource;

import org.json.JSONObject;

/* loaded from: sa.class */
public interface sa {
    void getOfferwallCredits();

    void initOfferwall(String str, String str2, JSONObject jSONObject);

    boolean isOfferwallAvailable();

    void setInternalOfferwallListener(i8 i8Var);

    void showOfferwall(String str, JSONObject jSONObject);
}
