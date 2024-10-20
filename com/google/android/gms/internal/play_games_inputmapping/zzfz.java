package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Iterator;
import java.util.Map;

/* loaded from: zzfz.class */
final class zzfz {
    public static final int zza(int i, Object obj, Object obj2) {
        zzfy zzfyVar = (zzfy) obj;
        if (zzfyVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzfyVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }
}
