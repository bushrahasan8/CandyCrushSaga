package com.king.vungle;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.Keep;
import com.king.amp.sa.AbmAdProviderAdapter;
import com.king.amp.sa.AbmAdProviderAdapterListener;
import com.king.amp.sa.AdProviderNameValuePairs;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleError;
import com.vungle.ads.VunglePrivacySettings;

@Keep
/* loaded from: AbmAdProviderVungle.class */
public class AbmAdProviderVungle implements AbmAdProviderAdapter {
    private Activity mActivity;
    private AbmAdProviderAdapterListener mListener;
    private String TAG = "AbmAdProviderVungle";
    private boolean mInitInProgress = false;
    private boolean mInitialized = false;

    public void destroy() {
        this.mListener = null;
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public String getAdapterVersion() {
        try {
            return VungleAds.getSdkVersion() + ".0";
        } catch (Exception e) {
            Log.e(this.TAG, "exception in getAdapterVersion ", e);
            return "";
        }
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public String getBidderToken() {
        return VungleAds.getBiddingToken(this.mActivity.getApplicationContext());
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public String getProperty(String str) {
        return "";
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public String getProviderVersion() {
        try {
            return VungleAds.getSdkVersion();
        } catch (Exception e) {
            Log.e(this.TAG, "exception in getProviderVersion ", e);
            return "";
        }
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public boolean hasBidderToken() {
        return true;
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public void initSDK(AdProviderNameValuePairs adProviderNameValuePairs) {
        String str = (String) adProviderNameValuePairs.getValue("liftoff_game_id", "");
        String str2 = (String) adProviderNameValuePairs.getValue("liftoff_integration_version", "");
        if (str.isEmpty() || str2.isEmpty()) {
            this.mListener.onSDKInitialized(false, String.format("Skipping Liftoff Init: liftoff_game_id (%s) or liftoff_integration_version (%s) is empty", str, str2));
            return;
        }
        if (VungleAds.isInitialized()) {
            if (this.mInitialized) {
                Log.d(this.TAG, "Already initialized");
                return;
            }
            Log.d(this.TAG, "Vungle SDK init by Google onSuccess()");
            this.mInitialized = true;
            VungleAds.setIntegrationName(VungleAds.WrapperFramework.vunglehbs, str2);
            this.mListener.onSDKInitSucceeded();
            return;
        }
        if (this.mInitInProgress) {
            return;
        }
        this.mInitInProgress = true;
        Log.d(this.TAG, "init called with game id:" + str + " integration version:" + str2);
        VungleAds.setIntegrationName(VungleAds.WrapperFramework.vunglehbs, str2);
        VungleAds.init(this.mActivity.getApplicationContext(), str, new InitializationListener(this) { // from class: com.king.vungle.AbmAdProviderVungle.1
            final AbmAdProviderVungle this$0;

            {
                this.this$0 = this;
            }

            @Override // com.vungle.ads.InitializationListener
            public void onError(VungleError vungleError) {
                this.this$0.mInitInProgress = false;
                String str3 = "Liftoff Ads SDK init Failed:" + vungleError.getErrorMessage();
                Log.e(this.this$0.TAG, str3);
                this.this$0.mListener.onSDKInitFailed(str3);
            }

            @Override // com.vungle.ads.InitializationListener
            public void onSuccess() {
                this.this$0.mInitInProgress = false;
                this.this$0.mInitialized = true;
                Log.d(this.this$0.TAG, "Vungle SDK init onSuccess()");
                this.this$0.mListener.onSDKInitSucceeded();
            }
        });
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
        VunglePrivacySettings.setCCPAStatus(z);
        VunglePrivacySettings.setGDPRStatus(z, "1.0.0");
    }
}
