package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Set;

/* loaded from: zzau.class */
public final class zzau {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            Object next = it.next();
            i = i2 + (next != null ? next.hashCode() : 0);
        }
    }
}
