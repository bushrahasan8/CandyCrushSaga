package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: zzkq.class */
final class zzkq extends zzkl {
    private zzkq() {
        super();
    }

    private static <E> zzkc<E> zzc(Object obj, long j) {
        return (zzkc) zzmz.zze(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkl
    public final <L> List<L> zza(Object obj, long j) {
        zzkc zzc = zzc(obj, j);
        zzkc zzkcVar = zzc;
        if (!zzc.zzc()) {
            int size = zzc.size();
            zzkcVar = zzc.zza(size == 0 ? 10 : size << 1);
            zzmz.zza(obj, j, zzkcVar);
        }
        return zzkcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkl
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzkc zzc = zzc(obj, j);
        zzkc zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        zzkc zzkcVar = zzc;
        if (size > 0) {
            zzkcVar = zzc;
            if (size2 > 0) {
                zzkcVar = zzc;
                if (!zzc.zzc()) {
                    zzkcVar = zzc.zza(size2 + size);
                }
                zzkcVar.addAll(zzc2);
            }
        }
        zzkc zzkcVar2 = zzc2;
        if (size > 0) {
            zzkcVar2 = zzkcVar;
        }
        zzmz.zza(obj, j, zzkcVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkl
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzb();
    }
}
