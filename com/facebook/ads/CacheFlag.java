package com.facebook.ads;

import androidx.annotation.Keep;
import java.util.EnumSet;

@Keep
/* loaded from: CacheFlag.class */
public enum CacheFlag {
    NONE,
    ICON,
    IMAGE,
    VIDEO;

    public static final EnumSet<CacheFlag> ALL = EnumSet.allOf(CacheFlag.class);
}
