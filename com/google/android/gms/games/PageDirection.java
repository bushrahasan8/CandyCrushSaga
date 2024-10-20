package com.google.android.gms.games;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: PageDirection.class */
public final class PageDirection {
    public static final int NEXT = 0;
    public static final int NONE = -1;
    public static final int PREV = 1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: PageDirection$Direction.class */
    public @interface Direction {
    }

    private PageDirection() {
        throw new AssertionError("Uninstantiable");
    }
}
