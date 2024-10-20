package com.applovin.impl;

/* loaded from: j8.class */
public final class j8 extends RuntimeException {
    public final int a;

    public j8(int i) {
        super(a(i));
        this.a = i;
    }

    private static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
