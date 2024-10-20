package com.ironsource;

import com.ironsource.mediationsdk.model.BasePlacement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: va.class */
public final class va extends BasePlacement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(int i, String placementName, boolean z) {
        super(i, placementName, z, null);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
    }

    @Override // com.ironsource.mediationsdk.model.BasePlacement
    public String toString() {
        return super.toString() + ", placement id: " + getPlacementId();
    }
}
