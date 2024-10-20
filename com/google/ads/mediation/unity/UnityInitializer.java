package com.google.ads.mediation.unity;

import android.content.Context;
import android.util.Log;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: UnityInitializer.class */
public class UnityInitializer {
    private static UnityInitializer unityInitializerInstance;
    final String TAG = "UnityInitializer";
    private AtomicBoolean mEnable = new AtomicBoolean(true);
    private final UnityAdsWrapper unityAdsWrapper = new UnityAdsWrapper();

    private UnityInitializer() {
    }

    public static UnityInitializer getInstance() {
        UnityInitializer unityInitializer;
        synchronized (UnityInitializer.class) {
            try {
                if (unityInitializerInstance == null) {
                    unityInitializerInstance = new UnityInitializer();
                }
                unityInitializer = unityInitializerInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return unityInitializer;
    }

    public void disable() {
        Log.i("UnityInitializer", "disable Unity Adapter");
        this.mEnable.set(false);
    }

    public void initializeUnityAds(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (!this.mEnable.get() || this.unityAdsWrapper.isInitialized()) {
            Log.i("UnityInitializer", "Unity Adapter is disabled or initialized.");
            iUnityAdsInitializationListener.onInitializationComplete();
            return;
        }
        Log.i("UnityInitializer", "Unity Adapter initializing ... ... ...");
        MediationMetaData mediationMetaData = this.unityAdsWrapper.getMediationMetaData(context);
        mediationMetaData.setName("AdMob");
        mediationMetaData.setVersion(this.unityAdsWrapper.getVersion());
        mediationMetaData.set("adapter_version", "4.12.1.0");
        mediationMetaData.commit();
        this.unityAdsWrapper.initialize(context, str, iUnityAdsInitializationListener);
    }
}
