package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.r2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: v3.class */
public final class v3 implements r2 {
    public static final r2.a g = new r2.a() { // from class: com.applovin.impl.v3$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.r2.a
        public final r2 a(Bundle bundle) {
            v3 a;
            a = v3.a(bundle);
            return a;
        }
    };
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    private int f;

    public v3(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
    }

    public static int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static /* synthetic */ v3 a(Bundle bundle) {
        return new v3(bundle.getInt(c(0), -1), bundle.getInt(c(1), -1), bundle.getInt(c(2), -1), bundle.getByteArray(c(3)));
    }

    public static int b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String c(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || v3.class != obj.getClass()) {
            return false;
        }
        v3 v3Var = (v3) obj;
        if (this.a != v3Var.a || this.b != v3Var.b || this.c != v3Var.c || !Arrays.equals(this.d, v3Var.d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = ((((((this.a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
        }
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(")");
        return sb.toString();
    }
}
