package com.ironsource.mediationsdk.model;

import com.ironsource.ob;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: BasePlacement.class */
public abstract class BasePlacement {
    private final int a;
    private final String b;
    private final boolean c;
    private final ob d;

    public BasePlacement(int i, String placementName, boolean z, ob obVar) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.a = i;
        this.b = placementName;
        this.c = z;
        this.d = obVar;
    }

    public /* synthetic */ BasePlacement(int i, String str, boolean z, ob obVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : obVar);
    }

    public final ob getPlacementAvailabilitySettings() {
        return this.d;
    }

    public final int getPlacementId() {
        return this.a;
    }

    public final String getPlacementName() {
        return this.b;
    }

    public final boolean isDefault() {
        return this.c;
    }

    public final boolean isPlacementId(int i) {
        return this.a == i;
    }

    public String toString() {
        return "placement name: " + this.b;
    }
}
