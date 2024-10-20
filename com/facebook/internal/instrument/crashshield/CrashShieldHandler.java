package com.facebook.internal.instrument.crashshield;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: CrashShieldHandler.class */
public final class CrashShieldHandler {
    public static final CrashShieldHandler INSTANCE = new CrashShieldHandler();
    private static final Set crashingObjects = Collections.newSetFromMap(new WeakHashMap());
    private static boolean enabled;

    private CrashShieldHandler() {
    }

    public static final void enable() {
        enabled = true;
    }
}
