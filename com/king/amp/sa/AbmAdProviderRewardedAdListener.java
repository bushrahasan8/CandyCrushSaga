package com.king.amp.sa;

/* loaded from: AbmAdProviderRewardedAdListener.class */
public interface AbmAdProviderRewardedAdListener {
    void logBreadcrumb(String str, String str2);

    void onAdLoaded(AdProviderNameValuePairs adProviderNameValuePairs);

    void onAdMetaReceived(AdProviderNameValuePairs adProviderNameValuePairs);

    void onClosed(boolean z);

    void onEndCardInfoClicked();

    void onLoadFailed(int i, String str);

    void onPaidEvent(String str, String str2, int i);

    void onPlayCompleted();

    void onShowFailed(int i, String str);
}
