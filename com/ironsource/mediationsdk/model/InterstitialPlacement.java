package com.ironsource.mediationsdk.model;

import com.ironsource.ob;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: InterstitialPlacement.class */
public final class InterstitialPlacement extends BasePlacement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialPlacement(int i, String placementName, boolean z, ob obVar) {
        super(i, placementName, z, obVar);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
    }
}
