package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: zzh.class */
public final class zzh {
    private final zzh zza;
    private zzbb zzb;
    private Map<String, zzaq> zzc = new HashMap();
    private Map<String, Boolean> zzd = new HashMap();

    public zzh(zzh zzhVar, zzbb zzbbVar) {
        this.zza = zzhVar;
        this.zzb = zzbbVar;
    }

    public final zzaq zza(zzaf zzafVar) {
        zzaq zzaqVar = zzaq.zzc;
        Iterator<Integer> zzg = zzafVar.zzg();
        while (true) {
            if (!zzg.hasNext()) {
                break;
            }
            zzaq zza = this.zzb.zza(this, zzafVar.zza(zzg.next().intValue()));
            zzaqVar = zza;
            if (zza instanceof zzaj) {
                zzaqVar = zza;
                break;
            }
        }
        return zzaqVar;
    }

    public final zzaq zza(zzaq zzaqVar) {
        return this.zzb.zza(this, zzaqVar);
    }

    public final zzaq zza(String str) {
        zzh zzhVar = this;
        while (!zzhVar.zzc.containsKey(str)) {
            zzhVar = zzhVar.zza;
            if (zzhVar == null) {
                throw new IllegalArgumentException(String.format("%s is not defined", str));
            }
        }
        return zzhVar.zzc.get(str);
    }

    public final zzh zza() {
        return new zzh(this, this.zzb);
    }

    public final void zza(String str, zzaq zzaqVar) {
        if (this.zzd.containsKey(str)) {
            return;
        }
        if (zzaqVar == null) {
            this.zzc.remove(str);
        } else {
            this.zzc.put(str, zzaqVar);
        }
    }

    public final void zzb(String str, zzaq zzaqVar) {
        zza(str, zzaqVar);
        this.zzd.put(str, Boolean.TRUE);
    }

    public final boolean zzb(String str) {
        zzh zzhVar = this;
        while (!zzhVar.zzc.containsKey(str)) {
            zzhVar = zzhVar.zza;
            if (zzhVar == null) {
                return false;
            }
        }
        return true;
    }

    public final void zzc(String str, zzaq zzaqVar) {
        zzh zzhVar;
        zzh zzhVar2;
        zzh zzhVar3 = this;
        while (true) {
            zzhVar = zzhVar3;
            if (zzhVar.zzc.containsKey(str) || (zzhVar2 = zzhVar.zza) == null || !zzhVar2.zzb(str)) {
                break;
            } else {
                zzhVar3 = zzhVar.zza;
            }
        }
        if (zzhVar.zzd.containsKey(str)) {
            return;
        }
        if (zzaqVar == null) {
            zzhVar.zzc.remove(str);
        } else {
            zzhVar.zzc.put(str, zzaqVar);
        }
    }
}
