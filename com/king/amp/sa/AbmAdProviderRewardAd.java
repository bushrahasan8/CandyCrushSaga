package com.king.amp.sa;

import android.app.Activity;
import androidx.annotation.Keep;

@Keep
/* loaded from: AbmAdProviderRewardAd.class */
public interface AbmAdProviderRewardAd {
    String getProperty(String str);

    void load(AdProviderNameValuePairs adProviderNameValuePairs);

    void setActivity(Activity activity);

    void setListener(AbmAdProviderRewardedAdListener abmAdProviderRewardedAdListener);

    void setLogTag(String str);

    void setProperty(String str, String str2);

    void show();
}
