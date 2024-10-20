package com.vungle.ads.internal.util;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: CollectionsConcurrencyUtil.class */
public final class CollectionsConcurrencyUtil {
    public static final CollectionsConcurrencyUtil INSTANCE = new CollectionsConcurrencyUtil();

    private CollectionsConcurrencyUtil() {
    }

    public static final void addToSet(HashSet<String> hashset, String set) {
        synchronized (CollectionsConcurrencyUtil.class) {
            try {
                Intrinsics.checkNotNullParameter(hashset, "hashset");
                Intrinsics.checkNotNullParameter(set, "set");
                hashset.add(set);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final HashSet<String> getNewHashSet(HashSet<String> hashSet) {
        HashSet<String> hashSet2;
        synchronized (CollectionsConcurrencyUtil.class) {
            try {
                hashSet2 = new HashSet<>(hashSet);
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashSet2;
    }
}
