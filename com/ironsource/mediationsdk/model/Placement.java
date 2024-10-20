package com.ironsource.mediationsdk.model;

import com.ironsource.ob;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: Placement.class */
public final class Placement extends BasePlacement {
    private String e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Placement(int i, String placementName, boolean z, String rewardName, int i2, ob obVar) {
        super(i, placementName, z, obVar);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f = i2;
        this.e = rewardName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Placement(BasePlacement placement) {
        super(placement.getPlacementId(), placement.getPlacementName(), placement.isDefault(), placement.getPlacementAvailabilitySettings());
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.e = "";
    }

    public final int getRewardAmount() {
        return this.f;
    }

    public final String getRewardName() {
        return this.e;
    }

    @Override // com.ironsource.mediationsdk.model.BasePlacement
    public String toString() {
        return super.toString() + ", reward name: " + this.e + " , amount: " + this.f;
    }
}
