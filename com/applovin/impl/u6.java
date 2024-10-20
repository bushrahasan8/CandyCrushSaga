package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.r2;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: u6.class */
public final class u6 implements r2 {
    public static final u6 d = new u6(0, 0, 0);
    public static final r2.a f = new r2.a() { // from class: com.applovin.impl.u6$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.r2.a
        public final r2 a(Bundle bundle) {
            u6 a;
            a = u6.a(bundle);
            return a;
        }
    };
    public final int a;
    public final int b;
    public final int c;

    public u6(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static /* synthetic */ u6 a(Bundle bundle) {
        return new u6(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0));
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj;
        if (this.a != u6Var.a || this.b != u6Var.b || this.c != u6Var.c) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c;
    }
}
