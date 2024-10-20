package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: AppLovinInitializer.class */
public class AppLovinInitializer {
    private static final String TAG = "AppLovinInitializer";
    private static AppLovinInitializer instance;
    private AtomicBoolean mEnable = new AtomicBoolean(true);
    private final HashMap initializationStatus = new HashMap();
    private final HashMap initializerListeners = new HashMap();
    private final AppLovinSdkWrapper appLovinSdkWrapper = new AppLovinSdkWrapper();

    /* loaded from: AppLovinInitializer$OnInitializeSuccessListener.class */
    public interface OnInitializeSuccessListener {
        void onInitializeSuccess(String str);
    }

    private AppLovinInitializer() {
    }

    public static AppLovinInitializer getInstance() {
        if (instance == null) {
            instance = new AppLovinInitializer();
        }
        return instance;
    }

    public void disable() {
        Log.i(TAG, "Disable AppLovin Adapter");
        this.mEnable.set(false);
    }

    public void initialize(Context context, String str, OnInitializeSuccessListener onInitializeSuccessListener) {
        if (!this.initializationStatus.containsKey(str)) {
            this.initializationStatus.put(str, 0);
            this.initializerListeners.put(str, new ArrayList());
        }
        Integer num = 2;
        if (num.equals(this.initializationStatus.get(str))) {
            onInitializeSuccessListener.onInitializeSuccess(str);
            return;
        }
        ((ArrayList) this.initializerListeners.get(str)).add(onInitializeSuccessListener);
        Integer num2 = 1;
        if (num2.equals(this.initializationStatus.get(str))) {
            return;
        }
        if (!this.mEnable.get()) {
            Log.i(TAG, "AppLovin adapter is disabled. Skipping initialization.");
            return;
        }
        this.initializationStatus.put(str, 1);
        Log.d(TAG, String.format("Attempting to initialize SDK with SDK Key: %s", str));
        AppLovinSdk appLovinSdkWrapper = this.appLovinSdkWrapper.getInstance(str, this.appLovinSdkWrapper.getSdkSettings(context), context);
        appLovinSdkWrapper.setPluginVersion("12.4.2.0");
        appLovinSdkWrapper.setMediationProvider("admob");
        appLovinSdkWrapper.initializeSdk(new AppLovinSdk.SdkInitializationListener(this, str) { // from class: com.google.ads.mediation.applovin.AppLovinInitializer.1
            final AppLovinInitializer this$0;
            final String val$sdkKey;

            {
                this.this$0 = this;
                this.val$sdkKey = str;
            }

            public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                this.this$0.initializationStatus.put(this.val$sdkKey, 2);
                ArrayList arrayList = (ArrayList) this.this$0.initializerListeners.get(this.val$sdkKey);
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((OnInitializeSuccessListener) it.next()).onInitializeSuccess(this.val$sdkKey);
                    }
                    arrayList.clear();
                }
            }
        });
    }

    public AppLovinSdk retrieveSdk(Bundle bundle, Context context) {
        String string = bundle != null ? bundle.getString("sdkKey") : null;
        AppLovinSdkSettings sdkSettings = this.appLovinSdkWrapper.getSdkSettings(context);
        AppLovinSdk appLovinSdkWrapper = !TextUtils.isEmpty(string) ? this.appLovinSdkWrapper.getInstance(string, sdkSettings, context) : this.appLovinSdkWrapper.getInstance(sdkSettings, context);
        appLovinSdkWrapper.setPluginVersion("12.4.2.0");
        appLovinSdkWrapper.setMediationProvider("admob");
        return appLovinSdkWrapper;
    }
}
