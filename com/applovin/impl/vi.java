package com.applovin.impl;

/* loaded from: vi.class */
public abstract class vi {
    public static int a(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (b(i4, i2)) {
                return i4;
            }
        }
        return i;
    }

    public static boolean b(int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                return (i2 & 2) != 0;
            }
            z = (i2 & 1) != 0;
        }
        return z;
    }
}
