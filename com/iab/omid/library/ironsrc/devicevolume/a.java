package com.iab.omid.library.ironsrc.devicevolume;

/* loaded from: a.class */
public class a {
    public float a(int i, int i2) {
        if (i2 <= 0 || i <= 0) {
            return 0.0f;
        }
        float f = i / i2;
        float f2 = f;
        if (f > 1.0f) {
            f2 = 1.0f;
        }
        return f2;
    }
}
