package com.google.android.gms.internal.play_games_inputmapping;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: zzai.class */
public abstract class zzai {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();

    protected abstract Object zza();

    public final Object zzb(zzag zzagVar, zzbg zzbgVar) {
        zzah zzahVar;
        Object obj = this.zza.get(zzagVar);
        if (obj != null) {
            return obj;
        }
        Object zza = zza();
        Object putIfAbsent = this.zza.putIfAbsent(zzagVar, zza);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        int zza2 = zzbgVar.zza();
        zzah zzahVar2 = null;
        int i = 0;
        while (i < zza2) {
            if (zzaa.zzd.equals(zzbgVar.zzb(i))) {
                Object zzc = zzbgVar.zzc(i);
                zzahVar = zzahVar2;
                if (zzc instanceof zzap) {
                    zzahVar = zzahVar2;
                    if (zzahVar2 == null) {
                        zzahVar = new zzah(this, zzagVar);
                    }
                    ((zzap) zzc).zza();
                }
            } else {
                zzahVar = zzahVar2;
            }
            i++;
            zzahVar2 = zzahVar;
        }
        return zza;
    }
}
