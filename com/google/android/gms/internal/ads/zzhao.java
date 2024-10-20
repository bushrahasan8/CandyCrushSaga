package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: zzhao.class */
final class zzhao extends zzhas {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzhao() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhao(zzhan zzhanVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i) {
        List list;
        zzhal zzhalVar;
        List list2 = (List) zzhcz.zzh(obj, j);
        if (list2.isEmpty()) {
            list = list2 instanceof zzham ? new zzhal(i) : ((list2 instanceof zzhbm) && (list2 instanceof zzhad)) ? ((zzhad) list2).zzd(i) : new ArrayList(i);
            zzhcz.zzv(obj, j, list);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + i);
                arrayList.addAll(list2);
                zzhcz.zzv(obj, j, arrayList);
                zzhalVar = arrayList;
            } else if (list2 instanceof zzhcu) {
                zzhal zzhalVar2 = new zzhal(list2.size() + i);
                zzhalVar2.addAll(zzhalVar2.size(), (zzhcu) list2);
                zzhcz.zzv(obj, j, zzhalVar2);
                zzhalVar = zzhalVar2;
            } else {
                list = list2;
                if (list2 instanceof zzhbm) {
                    list = list2;
                    if (list2 instanceof zzhad) {
                        zzhad zzhadVar = (zzhad) list2;
                        if (!zzhadVar.zzc()) {
                            zzhad zzd = zzhadVar.zzd(list2.size() + i);
                            zzhcz.zzv(obj, j, zzd);
                            return zzd;
                        }
                        list = list2;
                    }
                }
            }
            list = zzhalVar;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhas
    public final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhas
    public final void zzb(Object obj, long j) {
        List unmodifiableList;
        List list = (List) zzhcz.zzh(obj, j);
        if (list instanceof zzham) {
            unmodifiableList = ((zzham) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzhbm) && (list instanceof zzhad)) {
                zzhad zzhadVar = (zzhad) list;
                if (zzhadVar.zzc()) {
                    zzhadVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzhcz.zzv(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhas
    public final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzhcz.zzh(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzhcz.zzv(obj, j, list);
    }
}
