package com.applovin.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: z1.class */
public final class z1 {
    public final int a;
    public final float b;

    public z1(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || z1.class != obj.getClass()) {
            return false;
        }
        z1 z1Var = (z1) obj;
        if (this.a != z1Var.a || Float.compare(z1Var.b, this.b) != 0) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToIntBits(this.b);
    }
}
