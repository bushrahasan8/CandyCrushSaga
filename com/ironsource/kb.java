package com.ironsource;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: kb.class */
public final class kb {
    private final String a;

    public kb(String baseControllerUrl) {
        Intrinsics.checkNotNullParameter(baseControllerUrl, "baseControllerUrl");
        this.a = baseControllerUrl;
    }

    public final String a() {
        String str = this.a;
        String substring = str.substring(0, StringsKt.lastIndexOf$default((CharSequence) str, UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
