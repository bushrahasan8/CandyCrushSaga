package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: NetworkSettings.class */
public class NetworkSettings {
    private String a;
    private String b;
    private JSONObject c;
    private JSONObject d;
    private JSONObject e;
    private JSONObject f;
    private JSONObject g;
    private String h;
    private String i;
    private boolean j;
    private String k;
    private int l;
    private int m;
    private int n;
    private int o;
    private String p;

    public NetworkSettings(NetworkSettings networkSettings) {
        this.a = networkSettings.getProviderName();
        this.k = networkSettings.getProviderName();
        this.b = networkSettings.getProviderTypeForReflection();
        this.d = networkSettings.getRewardedVideoSettings();
        this.e = networkSettings.getInterstitialSettings();
        this.f = networkSettings.getBannerSettings();
        this.g = networkSettings.getNativeAdSettings();
        this.c = networkSettings.getApplicationSettings();
        this.l = networkSettings.getRewardedVideoPriority();
        this.m = networkSettings.getInterstitialPriority();
        this.n = networkSettings.getBannerPriority();
        this.o = networkSettings.getNativeAdPriority();
        this.p = networkSettings.getProviderDefaultInstance();
    }

    public NetworkSettings(String str) {
        this.a = str;
        this.k = str;
        this.b = str;
        this.p = str;
        this.d = new JSONObject();
        this.e = new JSONObject();
        this.f = new JSONObject();
        this.g = new JSONObject();
        this.c = new JSONObject();
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
    }

    public NetworkSettings(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.a = str;
        this.k = str;
        this.b = str2;
        this.p = str3;
        this.d = jSONObject2;
        this.e = jSONObject3;
        this.f = jSONObject4;
        this.g = jSONObject5;
        this.c = jSONObject;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.i;
    }

    public JSONObject getApplicationSettings() {
        return this.c;
    }

    public int getBannerPriority() {
        return this.n;
    }

    public JSONObject getBannerSettings() {
        return this.f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.c;
        return jSONObject != null ? jSONObject.optString(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD) : null;
    }

    public String getCustomNetworkAdapterName(IronSource.AD_UNIT ad_unit) {
        String optString;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObject6;
        if (ad_unit == null && (jSONObject6 = this.c) != null) {
            jSONObject3 = jSONObject6;
        } else if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) && (jSONObject5 = this.d) != null) {
            jSONObject3 = jSONObject5;
        } else if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL) && (jSONObject4 = this.e) != null) {
            jSONObject3 = jSONObject4;
        } else {
            if (!ad_unit.equals(IronSource.AD_UNIT.BANNER) || (jSONObject2 = this.f) == null) {
                optString = (!ad_unit.equals(IronSource.AD_UNIT.NATIVE_AD) || (jSONObject = this.g) == null) ? null : jSONObject.optString("customNetworkAdapterName");
                return optString;
            }
            jSONObject3 = jSONObject2;
        }
        optString = jSONObject3.optString("customNetworkAdapterName");
        return optString;
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.c;
        return jSONObject != null ? jSONObject.optString("customNetworkPackage", "") : "";
    }

    public int getInstanceType(IronSource.AD_UNIT ad_unit) {
        int i;
        JSONObject nativeAdSettings;
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            nativeAdSettings = getRewardedVideoSettings();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            nativeAdSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            nativeAdSettings = getBannerSettings();
        } else {
            if (ad_unit != IronSource.AD_UNIT.NATIVE_AD) {
                i = 1;
                return i;
            }
            nativeAdSettings = getNativeAdSettings();
        }
        i = nativeAdSettings.optInt("instanceType");
        return i;
    }

    public int getInterstitialPriority() {
        return this.m;
    }

    public JSONObject getInterstitialSettings() {
        return this.e;
    }

    public int getMaxAdsPerSession(IronSource.AD_UNIT ad_unit) {
        JSONObject nativeAdSettings;
        int i = 99;
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            nativeAdSettings = getRewardedVideoSettings();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            nativeAdSettings = getInterstitialSettings();
        } else {
            if (ad_unit != IronSource.AD_UNIT.BANNER) {
                if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
                    nativeAdSettings = getNativeAdSettings();
                }
                return i;
            }
            nativeAdSettings = getBannerSettings();
        }
        i = nativeAdSettings.optInt("maxAdsPerSession", 99);
        return i;
    }

    public int getNativeAdPriority() {
        return this.o;
    }

    public JSONObject getNativeAdSettings() {
        return this.g;
    }

    public String getProviderDefaultInstance() {
        return this.p;
    }

    public String getProviderInstanceName() {
        return this.k;
    }

    public String getProviderName() {
        return this.a;
    }

    public String getProviderTypeForReflection() {
        return this.b;
    }

    public int getRewardedVideoPriority() {
        return this.l;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.d;
    }

    public String getSubProviderId() {
        return this.h;
    }

    public boolean isBidder(IronSource.AD_UNIT ad_unit) {
        boolean z = false;
        if (isCustomNetwork()) {
            return false;
        }
        if (getInstanceType(ad_unit) == 2) {
            z = true;
        }
        return z;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
    }

    public boolean isMultipleInstances() {
        return this.j;
    }

    public void setAdSourceNameForEvents(String str) {
        this.i = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public void setBannerPriority(int i) {
        this.n = i;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f = jSONObject;
    }

    public void setInterstitialPriority(int i) {
        this.m = i;
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.e.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z) {
        this.j = z;
    }

    public void setNativeAdPriority(int i) {
        this.o = i;
    }

    public void setNativeAdSettings(String str, Object obj) {
        try {
            this.g.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setNativeAdSettings(JSONObject jSONObject) {
        this.g = jSONObject;
    }

    public void setRewardedVideoPriority(int i) {
        this.l = i;
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.d.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.h = str;
    }

    public boolean shouldEarlyInit() {
        JSONObject jSONObject = this.c;
        if (jSONObject != null) {
            return jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        }
        return false;
    }
}
