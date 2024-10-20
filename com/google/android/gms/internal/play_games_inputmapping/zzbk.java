package com.google.android.gms.internal.play_games_inputmapping;

import com.ironsource.t2;
import java.util.HashMap;
import java.util.Map;

/* loaded from: zzbk.class */
public final class zzbk {
    private static final zzbn zza = new zzbi();
    private static final zzbm zzb = new zzbj();
    private final zzbn zze;
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzbm zzf = null;

    public final zzbk zza(zzbm zzbmVar) {
        this.zzf = zzbmVar;
        return this;
    }

    public final void zzb(zzar zzarVar) {
        zzds.zza(zzarVar, t2.h.W);
        if (!zzarVar.zzf()) {
            zzbn zzbnVar = zza;
            zzds.zza(zzarVar, t2.h.W);
            this.zzd.remove(zzarVar);
            this.zzc.put(zzarVar, zzbnVar);
            return;
        }
        zzbm zzbmVar = zzb;
        zzds.zza(zzarVar, t2.h.W);
        zzds.zzb(zzarVar.zzf(), "key must be repeating");
        this.zzc.remove(zzarVar);
        this.zzd.put(zzarVar, zzbmVar);
    }

    public final zzbo zzc() {
        return new zzbl(this, null);
    }
}
