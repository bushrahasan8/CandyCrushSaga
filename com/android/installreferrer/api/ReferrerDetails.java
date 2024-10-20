package com.android.installreferrer.api;

import android.os.Bundle;

/* loaded from: ReferrerDetails.class */
public class ReferrerDetails {
    private final Bundle mOriginalBundle;

    public ReferrerDetails(Bundle bundle) {
        this.mOriginalBundle = bundle;
    }

    public String getInstallReferrer() {
        return this.mOriginalBundle.getString("install_referrer");
    }
}
