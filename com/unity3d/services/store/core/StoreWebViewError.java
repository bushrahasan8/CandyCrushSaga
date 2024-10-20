package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.WebViewAdsError;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: StoreWebViewError.class */
public final class StoreWebViewError extends WebViewAdsError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreWebViewError(Enum<?> r7, String str, Object... errorArguments) {
        super(r7, str, Arrays.copyOf(errorArguments, errorArguments.length));
        Intrinsics.checkNotNullParameter(errorArguments, "errorArguments");
    }

    @Override // com.unity3d.scar.adapter.common.WebViewAdsError
    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
