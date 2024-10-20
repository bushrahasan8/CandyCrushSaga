package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* loaded from: AdCantPlayWithoutWebView.class */
public final class AdCantPlayWithoutWebView extends VungleError {
    public AdCantPlayWithoutWebView() {
        super(Integer.valueOf(VungleError.AD_UNABLE_TO_PLAY), Sdk$SDKError.Reason.AD_HTML_FAILED_TO_LOAD, "No WebView when playing ads.", null, null, null, 56, null);
    }
}
