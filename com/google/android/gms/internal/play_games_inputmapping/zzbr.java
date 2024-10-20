package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Iterator;
import java.util.Set;

/* loaded from: zzbr.class */
public final class zzbr {
    private static final zzbn zza = new zzbp();
    private static final zzbm zzb = new zzbq();

    public static zzbk zza(Set set) {
        zzbk zzbkVar = new zzbk(zza, null);
        zzbkVar.zza(zzb);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzbkVar.zzb((zzar) it.next());
        }
        return zzbkVar;
    }
}
