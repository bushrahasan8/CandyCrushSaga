package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzp.class */
public final class zzp extends zzal {
    private final zzo zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzp(zzm zzmVar, String str, zzo zzoVar) {
        super(str);
        this.zzk = zzoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        zzg.zza("getValue", 2, list);
        zzaq zza = zzhVar.zza(list.get(0));
        zzaq zza2 = zzhVar.zza(list.get(1));
        String zza3 = this.zzk.zza(zza.zzf());
        if (zza3 != null) {
            zza2 = new zzas(zza3);
        }
        return zza2;
    }
}
