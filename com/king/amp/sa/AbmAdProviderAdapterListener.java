package com.king.amp.sa;

import androidx.annotation.Keep;

@Keep
/* loaded from: AbmAdProviderAdapterListener.class */
public interface AbmAdProviderAdapterListener {
    void logBreadcrumb(String str, String str2);

    void onSDKInitFailed(String str);

    void onSDKInitSucceeded();

    void onSDKInitialized(boolean z, String str);
}
