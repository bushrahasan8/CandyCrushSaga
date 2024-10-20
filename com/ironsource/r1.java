package com.ironsource;

import com.ironsource.mediationsdk.model.BasePlacement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: r1.class */
public class r1 extends BasePlacement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(int i, String placementName, boolean z, ob obVar) {
        super(i, placementName, z, obVar);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
    }

    @Override // com.ironsource.mediationsdk.model.BasePlacement
    public String toString() {
        return super.toString() + ", placementId: " + getPlacementId();
    }
}
