package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.AdInternal;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: FullscreenAdInternal.class */
public abstract class FullscreenAdInternal extends AdInternal {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenAdInternal(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.vungle.ads.internal.AdInternal
    public String getAdSizeForAdRequest() {
        return "unknown";
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(String adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return true;
    }
}
