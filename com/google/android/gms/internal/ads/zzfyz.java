package com.google.android.gms.internal.ads;

import java.util.Collection;

/* loaded from: zzfyz.class */
public final class zzfyz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }
}
