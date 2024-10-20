package com.king.adprovider.sa;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.Keep;
import com.king.amp.sa.AbmAdProviderRewardAd;
import com.king.amp.sa.AbmAdProviderRewardedAdListener;
import com.king.amp.sa.AdProviderNameValuePairs;
import com.king.amp.sa.Logging;

@Keep
/* loaded from: AdProviderModuleAndroid.class */
public class AdProviderModuleAndroid implements AbmAdProviderRewardedAdListener {
    private final String LOG_TAG;
    private long mAdProviderAddress;
    private AbmAdProviderRewardAd mImpl;
    private boolean mPlayCompleted = false;
    private String mProviderClassName;

    public AdProviderModuleAndroid(String str, String str2, Activity activity) {
        this.LOG_TAG = "ads_provider_" + str;
        this.mProviderClassName = str2;
        try {
            AbmAdProviderRewardAd abmAdProviderRewardAd = (AbmAdProviderRewardAd) AbmAdProviderRewardAd.class.cast(Class.forName(str2).getConstructor(null).newInstance(null));
            this.mImpl = abmAdProviderRewardAd;
            abmAdProviderRewardAd.setLogTag(str);
            this.mImpl.setActivity(activity);
            this.mImpl.setListener(this);
        } catch (Exception e) {
            Log.d(this.LOG_TAG, "AdProviderModuleAndroid: the provider adapter is not available : " + e);
        }
    }

    public static native void logBreadcrumbx(String str, String str2);

    public static native void onAdLoaded(long j, AdProviderNameValuePairs adProviderNameValuePairs);

    public static native void onAdMetaReceived(long j, AdProviderNameValuePairs adProviderNameValuePairs);

    public static native void onClosed(long j, boolean z);

    public static native void onEndCardInfoClicked(long j);

    public static native void onError(long j, int i, String str);

    public static native void onLoadFailed(long j, int i, String str);

    public static native void onPaidEvent(long j, String str, String str2, int i);

    public static native void onPlayCompleted(long j);

    public static native void onShowFailed(long j, int i, String str);

    public boolean IsMetadataRequired() {
        return this.mImpl.getProperty("isMetadataRequired") == "YES";
    }

    public boolean IsPaidEventRequired() {
        return this.mImpl.getProperty("isPaidEventRequired") == "YES";
    }

    public void load(long j, String[] strArr, String[] strArr2) {
        this.mAdProviderAddress = j;
        int i = 0;
        if (this.mImpl == null) {
            onError(j, 0, this.mProviderClassName + " is not instantiated, please check if it's included.");
            return;
        }
        AdProviderNameValuePairs adProviderNameValuePairs = new AdProviderNameValuePairs();
        while (true) {
            int i2 = i + 1;
            if (i2 >= strArr.length) {
                adProviderNameValuePairs.add("targetingKeyValues", strArr2);
                this.mImpl.load(adProviderNameValuePairs);
                return;
            } else {
                if (strArr[i2].length() > 0) {
                    adProviderNameValuePairs.add(strArr[i], strArr[i2]);
                }
                i += 2;
            }
        }
    }

    @Override // com.king.amp.sa.AbmAdProviderRewardedAdListener
    public void logBreadcrumb(String str, String str2) {
        Logging.logBreadcrumb(str, str2);
    }

    @Override // com.king.amp.sa.AbmAdProviderRewardedAdListener
    public void onAdLoaded(AdProviderNameValuePairs adProviderNameValuePairs) {
        Log.d(this.LOG_TAG, "AdProviderModuleAndroid: onAdLoaded : " + adProviderNameValuePairs.toString());
        synchronized (this) {
            onAdLoaded(this.mAdProviderAddress, adProviderNameValuePairs);
        }
    }

    @Override // com.king.amp.sa.AbmAdProviderRewardedAdListener
    public void onAdMetaReceived(AdProviderNameValuePairs adProviderNameValuePairs) {
        Log.d(this.LOG_TAG, "AdProviderModuleAndroid: onAdMetaReceived : " + adProviderNameValuePairs.toString());
        synchronized (this) {
            onAdMetaReceived(this.mAdProviderAddress, adProviderNameValuePairs);
        }
    }

    @Override // com.king.amp.sa.AbmAdProviderRewardedAdListener
    public void onClosed(boolean z) {
        Log.d(this.LOG_TAG, "AdProviderModuleAndroid: onClosed : " + z);
        synchronized (this) {
            onClosed(this.mAdProviderAddress, z);
        }
    }

    @Override // com.king.amp.sa.AbmAdProviderRewardedAdListener
    public void onEndCardInfoClicked() {
        Log.d(this.LOG_TAG, "AdProviderModuleAndroid: EndCardInfoClicked : ");
        synchronized (this) {
            onEndCardInfoClicked(this.mAdProviderAddress);
        }
    }

    public void onError(int i, String str) {
        Log.d(this.LOG_TAG, "AdProviderModuleAndroid: onError : " + str);
        synchronized (this) {
            onError(this.mAdProviderAddress, i, str);
        }
    }

    @Override // com.king.amp.sa.AbmAdProviderRewardedAdListener
    public void onLoadFailed(int i, String str) {
        Log.d(this.LOG_TAG, "AdProviderModuleAndroid: onLoadFailed : " + str);
        synchronized (this) {
            onLoadFailed(this.mAdProviderAddress, i, str);
        }
    }

    @Override // com.king.amp.sa.AbmAdProviderRewardedAdListener
    public void onPaidEvent(String str, String str2, int i) {
        Log.d(this.LOG_TAG, "AdProviderModuleAndroid: onPaidEvent : ");
        synchronized (this) {
            onPaidEvent(this.mAdProviderAddress, str, str2, i);
        }
    }

    @Override // com.king.amp.sa.AbmAdProviderRewardedAdListener
    public void onPlayCompleted() {
        Log.d(this.LOG_TAG, "AdProviderModuleAndroid: onPlayCompleted : ");
        synchronized (this) {
            onPlayCompleted(this.mAdProviderAddress);
        }
    }

    @Override // com.king.amp.sa.AbmAdProviderRewardedAdListener
    public void onShowFailed(int i, String str) {
        Log.d(this.LOG_TAG, "AdProviderModuleAndroid: onShowFailed : " + str);
        synchronized (this) {
            onShowFailed(this.mAdProviderAddress, i, str);
        }
    }

    public void resetPointerToAdProviderAddress() {
        synchronized (this) {
            Logging.logBreadcrumb(this.LOG_TAG, "reset address");
            this.mAdProviderAddress = 0L;
            this.mImpl = null;
        }
    }

    public void show() {
        Log.d(this.LOG_TAG, "AdProviderModuleAndroid: show ad ");
        AbmAdProviderRewardAd abmAdProviderRewardAd = this.mImpl;
        if (abmAdProviderRewardAd != null) {
            abmAdProviderRewardAd.show();
            return;
        }
        onError(this.mAdProviderAddress, 0, this.mProviderClassName + " is not instantiated, please check if it's included.");
    }
}
