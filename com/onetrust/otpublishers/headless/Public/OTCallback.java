package com.onetrust.otpublishers.headless.Public;

import com.onetrust.otpublishers.headless.Public.Response.OTResponse;

/* loaded from: OTCallback.class */
public interface OTCallback {
    void onFailure(OTResponse oTResponse);

    void onSuccess(OTResponse oTResponse);
}
