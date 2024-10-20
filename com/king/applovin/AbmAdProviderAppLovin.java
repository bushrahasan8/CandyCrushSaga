package com.king.applovin;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.Keep;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.king.amp.sa.AbmAdProviderAdapter;
import com.king.amp.sa.AbmAdProviderAdapterListener;
import com.king.amp.sa.AdProviderNameValuePairs;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Keep
/* loaded from: AbmAdProviderAppLovin.class */
public class AbmAdProviderAppLovin implements AbmAdProviderAdapter {
    private String TAG;
    private boolean isInitialized = false;
    private Activity mActivity;
    private AbmAdProviderAdapterListener mListener;

    public static void setLatencyFix(AdProviderNameValuePairs adProviderNameValuePairs) {
        try {
            if (adProviderNameValuePairs.getValue("enabled_feature_flags", "").toString().contains("enableAppLovinLatencyFix")) {
                Method method = AppLovinMediationAdapter.class.getMethod("enableLatencyFix", null);
                if (method == null) {
                    throw new NoSuchMethodException("AppLovinMediationAdapter.enableLatencyFix(): no such method.");
                }
                method.invoke(null, null);
                return;
            }
            Method method2 = AppLovinMediationAdapter.class.getMethod("disableLatencyFix", null);
            if (method2 == null) {
                throw new NoSuchMethodException("AppLovinMediationAdapter.disableLatencyFix(): no such method.");
            }
            method2.invoke(null, null);
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            Log.w("AppLovinSDK", "Trying to enable/disable AppLovin latency fix without patched mediation adapter: " + e.getMessage());
        }
    }

    public void destroy() {
        this.mListener = null;
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public String getAdapterVersion() {
        return getProviderVersion() + ".0.0";
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public String getBidderToken() {
        return "";
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public String getProperty(String str) {
        return "";
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public String getProviderVersion() {
        return AppLovinSdk.VERSION;
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public boolean hasBidderToken() {
        return true;
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public void initSDK(AdProviderNameValuePairs adProviderNameValuePairs) {
        if (this.isInitialized) {
            Log.d(this.TAG, "Already initialized");
            return;
        }
        Log.i(this.TAG, "Initializing AppLovin");
        setLatencyFix(adProviderNameValuePairs);
        this.isInitialized = true;
        this.mListener.onSDKInitSucceeded();
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public void setActivity(Activity activity) {
        this.mActivity = activity;
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public void setListener(AbmAdProviderAdapterListener abmAdProviderAdapterListener) {
        this.mListener = abmAdProviderAdapterListener;
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public void setLogTag(String str) {
        this.TAG = str;
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public void setProperty(String str, String str2) {
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public void updateConsent(boolean z) {
        AppLovinPrivacySettings.setHasUserConsent(z, this.mActivity.getApplicationContext());
        AppLovinPrivacySettings.setDoNotSell(!z, this.mActivity.getApplicationContext());
    }
}
