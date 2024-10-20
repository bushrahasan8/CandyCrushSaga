package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: zzgav.class */
public final class zzgav {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zza(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException e) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzb(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
