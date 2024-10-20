package com.applovin.sdk;

import android.app.Activity;

/* loaded from: AppLovinCmpService.class */
public interface AppLovinCmpService {

    /* loaded from: AppLovinCmpService$OnCompletedListener.class */
    public interface OnCompletedListener {
        void onCompleted(AppLovinCmpError appLovinCmpError);
    }

    boolean hasSupportedCmp();

    void showCmpForExistingUser(Activity activity, OnCompletedListener onCompletedListener);
}
