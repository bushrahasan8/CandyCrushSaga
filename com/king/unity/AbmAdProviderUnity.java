package com.king.unity;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.Keep;
import com.ironsource.mediationsdk.metadata.a;
import com.king.amp.sa.AbmAdProviderAdapter;
import com.king.amp.sa.AbmAdProviderAdapterListener;
import com.king.amp.sa.AdProviderNameValuePairs;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MetaData;
import java.util.LinkedList;
import java.util.Queue;

@Keep
/* loaded from: AbmAdProviderUnity.class */
public class AbmAdProviderUnity implements AbmAdProviderAdapter, IUnityAdsInitializationListener, IUnityAdsTokenListener {
    private boolean isInitialized;
    private Activity mActivity;
    private AbmAdProviderAdapterListener mListener;
    private int mMaxTokenNum;
    private String TAG = "AbmAdProviderUnity";
    private boolean mInitStarted = false;
    private boolean mTestMode = false;
    Queue<String> mTokenQueue = new LinkedList();

    public AbmAdProviderUnity() {
        this.isInitialized = false;
        this.isInitialized = false;
    }

    private void genBidderToken() {
        new Thread(new Runnable(this, this) { // from class: com.king.unity.AbmAdProviderUnity.1
            final AbmAdProviderUnity this$0;
            final AbmAdProviderUnity val$instance;

            {
                this.this$0 = this;
                this.val$instance = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                UnityAds.getToken(this.val$instance);
            }
        }).start();
    }

    private void genMultiBidderTokens() {
        for (int i = 0; i < this.mMaxTokenNum; i++) {
            genBidderToken();
        }
    }

    public void destroy() {
        this.mListener = null;
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public String getAdapterVersion() {
        return "0.1.4.0.1.1";
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public String getBidderToken() {
        String str;
        synchronized (this.mTokenQueue) {
            str = "";
            if (this.mInitStarted) {
                str = "";
                if (this.mTokenQueue.size() > 0) {
                    str = this.mTokenQueue.poll();
                    genBidderToken();
                }
            }
        }
        return str;
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public String getProperty(String str) {
        return "";
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public String getProviderVersion() {
        try {
            return UnityAds.getVersion();
        } catch (Exception e) {
            Log.e(this.TAG, "exception in getVersion ", e);
            return "";
        }
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public boolean hasBidderToken() {
        return true;
    }

    @Override // com.king.amp.sa.AbmAdProviderAdapter
    public void initSDK(AdProviderNameValuePairs adProviderNameValuePairs) {
        Log.i(this.TAG, "start print config:");
        for (int numEntries = adProviderNameValuePairs.getNumEntries() - 1; numEntries >= 0; numEntries += -1) {
            String keyAtIndex = adProviderNameValuePairs.getKeyAtIndex(numEntries);
            Object value = adProviderNameValuePairs.getValue(keyAtIndex);
            Log.e(this.TAG, keyAtIndex + " " + value.toString());
        }
        if (this.isInitialized) {
            Log.d(this.TAG, "Already initialized");
            return;
        }
        String str = (String) adProviderNameValuePairs.getValue("unityGameId", "");
        String str2 = (String) adProviderNameValuePairs.getValue("unity_max_token_num", "10");
        String str3 = (String) adProviderNameValuePairs.getValue("test_mode", "false");
        Log.d(this.TAG, "init called with appKey:" + str + " " + str2);
        this.mMaxTokenNum = Integer.parseInt(str2);
        this.mTestMode = str3.equals(a.g);
        UnityAds.initialize(this.mActivity.getApplicationContext(), str, this.mTestMode, this);
        this.mInitStarted = true;
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public void onInitializationComplete() {
        Log.d(this.TAG, "Unity Ads SDK onInitializationComplete");
        genMultiBidderTokens();
        this.mListener.onSDKInitSucceeded();
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        Log.e(this.TAG, "Unity Ads SDK onInitializationFailed:" + str);
        this.mListener.onSDKInitFailed(str);
    }

    @Override // com.unity3d.ads.IUnityAdsTokenListener
    public void onUnityAdsTokenReady(String str) {
        Log.d(this.TAG, "onUnityAdsTokenReady is called by unityads");
        synchronized (this.mTokenQueue) {
            this.mTokenQueue.offer(str);
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
        MetaData metaData = new MetaData(this.mActivity.getApplicationContext());
        if (z) {
            Boolean bool = Boolean.TRUE;
            metaData.set("privacy.consent", bool);
            metaData.set("gdpr.consent", bool);
        } else {
            Boolean bool2 = Boolean.FALSE;
            metaData.set("privacy.consent", bool2);
            metaData.set("gdpr.consent", bool2);
        }
        metaData.commit();
    }
}
