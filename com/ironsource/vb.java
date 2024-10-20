package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: vb.class */
public class vb {
    private static vb b;
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    private vb() {
    }

    public static vb b() {
        vb vbVar;
        synchronized (vb.class) {
            try {
                if (b == null) {
                    b = new vb();
                }
                vbVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vbVar;
    }

    public HashSet<String> a(String str, String str2) {
        HashSet<String> hashSet = new HashSet<>();
        try {
            for (NetworkSettings networkSettings : this.a.values()) {
                if (networkSettings.getProviderTypeForReflection().equals(str)) {
                    if (networkSettings.getRewardedVideoSettings() != null && networkSettings.getRewardedVideoSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getRewardedVideoSettings().optString(str2))) {
                        hashSet.add(networkSettings.getRewardedVideoSettings().optString(str2));
                    }
                    if (networkSettings.getInterstitialSettings() != null && networkSettings.getInterstitialSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getInterstitialSettings().optString(str2))) {
                        hashSet.add(networkSettings.getInterstitialSettings().optString(str2));
                    }
                    if (networkSettings.getBannerSettings() != null && networkSettings.getBannerSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getBannerSettings().optString(str2))) {
                        hashSet.add(networkSettings.getBannerSettings().optString(str2));
                    }
                    if (networkSettings.getNativeAdSettings() != null && networkSettings.getNativeAdSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getNativeAdSettings().optString(str2))) {
                        hashSet.add(networkSettings.getNativeAdSettings().optString(str2));
                    }
                }
            }
        } catch (Exception e) {
        }
        return hashSet;
    }

    public void a() {
        for (NetworkSettings networkSettings : this.a.values()) {
            if (networkSettings.isMultipleInstances() && !TextUtils.isEmpty(networkSettings.getProviderTypeForReflection())) {
                NetworkSettings b2 = b(networkSettings.getProviderDefaultInstance());
                networkSettings.setApplicationSettings(IronSourceUtils.mergeJsons(networkSettings.getApplicationSettings(), b2.getApplicationSettings()));
                networkSettings.setInterstitialSettings(IronSourceUtils.mergeJsons(networkSettings.getInterstitialSettings(), b2.getInterstitialSettings()));
                networkSettings.setRewardedVideoSettings(IronSourceUtils.mergeJsons(networkSettings.getRewardedVideoSettings(), b2.getRewardedVideoSettings()));
                networkSettings.setBannerSettings(IronSourceUtils.mergeJsons(networkSettings.getBannerSettings(), b2.getBannerSettings()));
                networkSettings.setNativeAdSettings(IronSourceUtils.mergeJsons(networkSettings.getNativeAdSettings(), b2.getNativeAdSettings()));
            }
        }
    }

    public void a(NetworkSettings networkSettings) {
        if (networkSettings == null || TextUtils.isEmpty(networkSettings.getProviderName())) {
            return;
        }
        this.a.put(networkSettings.getProviderName(), networkSettings);
    }

    public boolean a(String str) {
        return this.a.containsKey(str);
    }

    public NetworkSettings b(String str) {
        NetworkSettings networkSettings = (NetworkSettings) this.a.get(str);
        NetworkSettings networkSettings2 = networkSettings;
        if (networkSettings == null) {
            networkSettings2 = new NetworkSettings(str);
            a(networkSettings2);
        }
        return networkSettings2;
    }

    public NetworkSettings c(String str) {
        for (NetworkSettings networkSettings : this.a.values()) {
            if (IronSourceConstants.IRONSOURCE_CONFIG_NAME.equals(networkSettings.getProviderTypeForReflection()) && str.equalsIgnoreCase(networkSettings.getSubProviderId())) {
                return networkSettings;
            }
        }
        return new NetworkSettings(str);
    }

    public ConcurrentHashMap<String, NetworkSettings> c() {
        return this.a;
    }
}
