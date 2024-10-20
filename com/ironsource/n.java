package com.ironsource;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: n.class */
public final class n {
    public static final n a = new n();
    private static final HashMap b = new HashMap();

    private n() {
    }

    public final HashMap<String, Long> a() {
        return b;
    }

    public final boolean a(String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        HashMap hashMap = b;
        if (((Long) hashMap.get(instance)) == null) {
            return false;
        }
        hashMap.remove(instance);
        return true;
    }

    public final boolean a(String instance, long j) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (instance.length() == 0) {
            return false;
        }
        HashMap hashMap = b;
        if (hashMap.containsKey(instance)) {
            return false;
        }
        hashMap.put(instance, Long.valueOf(j));
        return true;
    }

    public final long b(String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Long l = (Long) b.get(instance);
        if (l != null) {
            return System.currentTimeMillis() - l.longValue();
        }
        return -1L;
    }

    public final long c(String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Long l = (Long) b.get(instance);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }
}
