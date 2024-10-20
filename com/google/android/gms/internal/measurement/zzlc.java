package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: zzlc.class */
final class zzlc implements zzkz {
    @Override // com.google.android.gms.internal.measurement.zzkz
    public final int zza(int i, Object obj, Object obj2) {
        zzla zzlaVar = (zzla) obj;
        if (zzlaVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzlaVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final zzkx<?, ?> zza(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final Object zza(Object obj, Object obj2) {
        zzla zzlaVar = (zzla) obj;
        zzla zzlaVar2 = (zzla) obj2;
        zzla zzlaVar3 = zzlaVar;
        if (!zzlaVar2.isEmpty()) {
            zzlaVar3 = zzlaVar;
            if (!zzlaVar.zzd()) {
                zzlaVar3 = zzlaVar.zzb();
            }
            zzlaVar3.zza(zzlaVar2);
        }
        return zzlaVar3;
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final Object zzb(Object obj) {
        return zzla.zza().zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final Object zzc(Object obj) {
        ((zzla) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final Map<?, ?> zzd(Object obj) {
        return (zzla) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final Map<?, ?> zze(Object obj) {
        return (zzla) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final boolean zzf(Object obj) {
        return !((zzla) obj).zzd();
    }
}
