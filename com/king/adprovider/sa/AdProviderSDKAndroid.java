package com.king.adprovider.sa;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.Keep;
import com.king.amp.sa.AbmAdProviderAdapter;
import com.king.amp.sa.AbmAdProviderAdapterListener;
import com.king.amp.sa.AdProviderNameValuePairs;
import com.king.amp.sa.Logging;
import java.util.Arrays;

@Keep
/* loaded from: AdProviderSDKAndroid.class */
public class AdProviderSDKAndroid implements AbmAdProviderAdapterListener {
    private final String LOG_TAG;
    private long mAdProviderAddress;
    private AbmAdProviderAdapter mImpl;
    private boolean mIsInitialized = false;
    private String mProviderClassName;

    public AdProviderSDKAndroid(String str, String str2, Activity activity) {
        this.LOG_TAG = "ads_provider_" + str;
        this.mProviderClassName = str2;
        try {
            AbmAdProviderAdapter abmAdProviderAdapter = (AbmAdProviderAdapter) AbmAdProviderAdapter.class.cast(Class.forName(str2).getConstructor(null).newInstance(null));
            this.mImpl = abmAdProviderAdapter;
            abmAdProviderAdapter.setLogTag(str);
            this.mImpl.setActivity(activity);
            this.mImpl.setListener(this);
        } catch (Exception e) {
            Log.i(this.LOG_TAG, "AbmAdProviderSDK: the provider adapter is not available : " + e);
        }
    }

    public static native void onSDKInitializedJNI(long j, boolean z, String str);

    public void destroy() {
        this.mImpl = null;
    }

    public String getProviderBidderToken() {
        AbmAdProviderAdapter abmAdProviderAdapter = this.mImpl;
        return abmAdProviderAdapter != null ? abmAdProviderAdapter.getBidderToken() : "";
    }

    public String getVersion() {
        AbmAdProviderAdapter abmAdProviderAdapter = this.mImpl;
        return abmAdProviderAdapter != null ? abmAdProviderAdapter.getProviderVersion() : "";
    }

    public boolean hasBidderToken() {
        AbmAdProviderAdapter abmAdProviderAdapter = this.mImpl;
        if (abmAdProviderAdapter != null) {
            return abmAdProviderAdapter.hasBidderToken();
        }
        return true;
    }

    public void init(long j, String[] strArr) {
        this.mAdProviderAddress = j;
        Log.d(this.LOG_TAG, "AdProviderSDKAndroid: init " + Arrays.toString(strArr));
        if (this.mImpl == null) {
            onSDKInitFailed("AdProviderSDKAndroid: null Impl!");
            return;
        }
        AdProviderNameValuePairs adProviderNameValuePairs = new AdProviderNameValuePairs();
        for (int i = 0; i < strArr.length; i += 2) {
            adProviderNameValuePairs.add(strArr[i], strArr[i + 1]);
        }
        this.mImpl.initSDK(adProviderNameValuePairs);
    }

    public boolean isInitialized() {
        return this.mIsInitialized;
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapterListener
    public void logBreadcrumb(String str, String str2) {
        Logging.logBreadcrumb(str, str2);
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapterListener
    public void onSDKInitFailed(String str) {
        this.mIsInitialized = false;
        onSDKInitializedJNI(this.mAdProviderAddress, false, str);
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapterListener
    public void onSDKInitSucceeded() {
        this.mIsInitialized = true;
        onSDKInitializedJNI(this.mAdProviderAddress, true, "");
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapterListener
    public void onSDKInitialized(boolean z, String str) {
        this.mIsInitialized = z;
        onSDKInitializedJNI(this.mAdProviderAddress, z, str);
    }

    public void updateConsent(boolean z) {
        AbmAdProviderAdapter abmAdProviderAdapter = this.mImpl;
        if (abmAdProviderAdapter != null) {
            abmAdProviderAdapter.updateConsent(z);
        }
    }
}
