package com.king.usdk.kdid;

import androidx.annotation.Keep;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.ironsource.t2;

@Keep
/* loaded from: IntentField.class */
public enum IntentField {
    KEY(t2.h.W),
    VALUE("value"),
    ACTION(t2.h.h),
    SENDER("sender"),
    TOKEN(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY),
    VERSION("version");

    private String value;

    IntentField(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
