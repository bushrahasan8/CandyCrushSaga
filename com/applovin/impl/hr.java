package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.r2;

/* loaded from: hr.class */
public final class hr implements r2 {
    public static final hr f = new hr(0, 0);
    public static final r2.a g = new r2.a() { // from class: com.applovin.impl.hr$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.r2.a
        public final r2 a(Bundle bundle) {
            hr a;
            a = hr.a(bundle);
            return a;
        }
    };
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    public hr(int i, int i2) {
        this(i, i2, 0, 1.0f);
    }

    public hr(int i, int i2, int i3, float f2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f2;
    }

    public static /* synthetic */ hr a(Bundle bundle) {
        return new hr(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0), bundle.getFloat(a(3), 1.0f));
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr)) {
            return false;
        }
        hr hrVar = (hr) obj;
        if (this.a != hrVar.a || this.b != hrVar.b || this.c != hrVar.c || this.d != hrVar.d) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((this.a + 217) * 31) + this.b) * 31) + this.c) * 31) + Float.floatToRawIntBits(this.d);
    }
}
