package com.google.android.gms.ads.mediation.rtb;

import com.google.android.gms.ads.AdError;

/* loaded from: SignalCallbacks.class */
public interface SignalCallbacks {
    void onFailure(AdError adError);

    @Deprecated
    void onFailure(String str);

    void onSuccess(String str);
}
