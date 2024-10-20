package com.king.amp.sa;

import android.app.Activity;
import androidx.annotation.Keep;

@Keep
/* loaded from: AbmAdProviderAdapter.class */
public interface AbmAdProviderAdapter {
    String getAdapterVersion();

    String getBidderToken();

    String getProperty(String str);

    String getProviderVersion();

    boolean hasBidderToken();

    void initSDK(AdProviderNameValuePairs adProviderNameValuePairs);

    void setActivity(Activity activity);

    void setListener(AbmAdProviderAdapterListener abmAdProviderAdapterListener);

    void setLogTag(String str);

    void setProperty(String str, String str2);

    void updateConsent(boolean z);
}
