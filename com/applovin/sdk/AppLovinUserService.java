package com.applovin.sdk;

import android.app.Activity;

/* loaded from: AppLovinUserService.class */
public interface AppLovinUserService {

    /* loaded from: AppLovinUserService$OnConsentDialogDismissListener.class */
    public interface OnConsentDialogDismissListener {
        void onDismiss();
    }

    void preloadConsentDialog();

    void showConsentDialog(Activity activity, OnConsentDialogDismissListener onConsentDialogDismissListener);
}
