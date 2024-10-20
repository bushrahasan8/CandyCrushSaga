package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewClientError;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: LoadWebViewError.class */
public final class LoadWebViewError extends AdPlayerError {
    private final List<WebViewClientError> errors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadWebViewError(List<WebViewClientError> errors) {
        super("AdPlayer was not able to load the webview.", null);
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.errors = errors;
    }

    public final List<WebViewClientError> getErrors() {
        return this.errors;
    }
}
