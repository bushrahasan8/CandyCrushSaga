package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.model.Placement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: InterstitialAdInternal.class */
public final class InterstitialAdInternal extends FullscreenAdInternal {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAdInternal(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(Placement placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return placement.isInterstitial();
    }
}
