package com.king.fan;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.Keep;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.BuildConfig;
import com.king.amp.sa.AbmAdProviderAdapter;
import com.king.amp.sa.AbmAdProviderAdapterListener;
import com.king.amp.sa.AdProviderNameValuePairs;

@Keep
/* loaded from: AbmAdProviderFAN.class */
public class AbmAdProviderFAN implements AbmAdProviderAdapter {
    static boolean isInitializing = false;
    private static String mBidderToken;
    private String TAG;
    private boolean isInitialized = false;
    private Activity mActivity;
    private AbmAdProviderAdapterListener mListener;

    /* renamed from: com.king.fan.AbmAdProviderFAN$1, reason: invalid class name */
    /* loaded from: AbmAdProviderFAN$1.class */
    class AnonymousClass1 implements Runnable {
        final AbmAdProviderFAN this$0;

        AnonymousClass1(AbmAdProviderFAN abmAdProviderFAN) {
            this.this$0 = abmAdProviderFAN;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (AudienceNetworkAds.isInitialized(this.this$0.mActivity.getApplicationContext())) {
                    Log.d(this.this$0.TAG, "onInitialized");
                    AbmAdProviderFAN.isInitializing = false;
                    this.this$0.mListener.onSDKInitSucceeded();
                } else {
                    Log.d(this.this$0.TAG, "AudienceNetworkInitializeHelper: Initialize() called");
                    AudienceNetworkAds.buildInitSettings(this.this$0.mActivity.getApplicationContext()).withInitListener(new AudienceNetworkAds.InitListener(this) { // from class: com.king.fan.AbmAdProviderFAN.1.1
                        final AnonymousClass1 this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // com.facebook.ads.AudienceNetworkAds.InitListener
                        public void onInitialized(AudienceNetworkAds.InitResult initResult) {
                            Log.d(this.this$1.this$0.TAG, "onInitialized");
                            AbmAdProviderFAN.isInitializing = false;
                            this.this$1.this$0.isInitialized = initResult.isSuccess();
                            this.this$1.this$0.mListener.onSDKInitialized(initResult.isSuccess(), initResult.isSuccess() ? "" : initResult.getMessage());
                        }
                    }).initialize();
                    try {
                        AbmAdProviderFAN.mBidderToken = BidderTokenProvider.getBidderToken(this.this$0.mActivity.getApplicationContext());
                    } catch (Exception e) {
                        Log.w(this.this$0.TAG, "Unable to get bidder token from FAN: " + e.toString());
                    }
                }
            } catch (Exception e2) {
                Log.e(this.this$0.TAG, "Exception in MobileAds.initialize ", e2);
                AbmAdProviderFAN.isInitializing = false;
                this.this$0.mListener.onSDKInitFailed(e2.toString());
            }
        }
    }

    public void destroy() {
        this.mListener = null;
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public String getAdapterVersion() {
        return "0.1.6.8.0.1";
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public String getBidderToken() {
        Log.d(this.TAG, "getBidderToken called in AbmAdProviderFAN");
        String str = mBidderToken;
        return (str == null || str.isEmpty()) ? "" : mBidderToken;
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public String getProperty(String str) {
        return "";
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public String getProviderVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public boolean hasBidderToken() {
        return true;
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public void initSDK(AdProviderNameValuePairs adProviderNameValuePairs) {
        String str = (String) adProviderNameValuePairs.getValue("appKey", "");
        Log.d(this.TAG, "init called with appKey:" + str);
        if (this.isInitialized) {
            Log.d(this.TAG, "Already initialized");
        } else if (isInitializing) {
            Log.d(this.TAG, "initializing...");
        } else {
            isInitializing = true;
            new Thread(new AnonymousClass1(this)).start();
        }
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
        String str = this.TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("LDU is set as ");
        sb.append(!z);
        Log.d(str, sb.toString());
        if (z) {
            AdSettings.setDataProcessingOptions(new String[0]);
        } else {
            AdSettings.setDataProcessingOptions(new String[]{"LDU"}, 0, 0);
        }
    }
}
