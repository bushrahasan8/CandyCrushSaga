package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Comparator;

/* loaded from: zzcx.class */
final class zzcx implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareTo;
        zzde zza = zzde.zza(obj);
        zzde zza2 = zzde.zza(obj2);
        if (zza == zza2) {
            int ordinal = zza.ordinal();
            if (ordinal == 0) {
                compareTo = ((Boolean) obj).compareTo((Boolean) obj2);
            } else if (ordinal == 1) {
                compareTo = ((String) obj).compareTo((String) obj2);
            } else if (ordinal == 2) {
                compareTo = ((Long) obj).compareTo((Long) obj2);
            } else {
                if (ordinal != 3) {
                    throw null;
                }
                compareTo = ((Double) obj).compareTo((Double) obj2);
            }
        } else {
            compareTo = zza.compareTo(zza2);
        }
        return compareTo;
    }
}
