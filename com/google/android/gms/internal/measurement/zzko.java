package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: zzko.class */
final class zzko extends zzkl {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzko() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j, int i) {
        List<L> list;
        zzkj zzkjVar;
        List<L> zzc = zzc(obj, j);
        if (zzc.isEmpty()) {
            list = zzc instanceof zzkm ? new zzkj(i) : ((zzc instanceof zzls) && (zzc instanceof zzkc)) ? ((zzkc) zzc).zza(i) : new ArrayList(i);
            zzmz.zza(obj, j, list);
        } else {
            if (zza.isAssignableFrom(zzc.getClass())) {
                ArrayList arrayList = new ArrayList(zzc.size() + i);
                arrayList.addAll(zzc);
                zzmz.zza(obj, j, arrayList);
                zzkjVar = arrayList;
            } else if (zzc instanceof zzmy) {
                zzkj zzkjVar2 = new zzkj(zzc.size() + i);
                zzkjVar2.addAll((zzmy) zzc);
                zzmz.zza(obj, j, zzkjVar2);
                zzkjVar = zzkjVar2;
            } else {
                list = zzc;
                if (zzc instanceof zzls) {
                    list = zzc;
                    if (zzc instanceof zzkc) {
                        zzkc zzkcVar = (zzkc) zzc;
                        list = zzc;
                        if (!zzkcVar.zzc()) {
                            list = zzkcVar.zza(zzc.size() + i);
                            zzmz.zza(obj, j, list);
                        }
                    }
                }
            }
            list = zzkjVar;
        }
        return list;
    }

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zzmz.zze(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkl
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkl
    public final <E> void zza(Object obj, Object obj2, long j) {
        List zzc = zzc(obj2, j);
        List zza2 = zza(obj, j, zzc.size());
        int size = zza2.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza2.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza2;
        }
        zzmz.zza(obj, j, zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkl
    public final void zzb(Object obj, long j) {
        List unmodifiableList;
        List list = (List) zzmz.zze(obj, j);
        if (list instanceof zzkm) {
            unmodifiableList = ((zzkm) list).zzd();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzls) && (list instanceof zzkc)) {
                zzkc zzkcVar = (zzkc) list;
                if (zzkcVar.zzc()) {
                    zzkcVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzmz.zza(obj, j, unmodifiableList);
    }
}
