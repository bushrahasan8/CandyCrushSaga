package com.google.android.gms.internal.drive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: zzlc.class */
final class zzlc extends zzla {
    private static final Class<?> zzto = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzlc() {
        super();
    }

    private static <E> List<E> zzb(Object obj, long j) {
        return (List) zznd.zzo(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.drive.zzla
    public final void zza(Object obj, long j) {
        List unmodifiableList;
        List list = (List) zznd.zzo(obj, j);
        if (list instanceof zzkz) {
            unmodifiableList = ((zzkz) list).zzds();
        } else {
            if (zzto.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzmc) && (list instanceof zzkp)) {
                zzkp zzkpVar = (zzkp) list;
                if (zzkpVar.zzbo()) {
                    zzkpVar.zzbp();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zznd.zza(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.drive.zzla
    public final <E> void zza(Object obj, Object obj2, long j) {
        List list;
        List zzb = zzb(obj2, j);
        int size = zzb.size();
        List zzb2 = zzb(obj, j);
        if (zzb2.isEmpty()) {
            List zzkyVar = zzb2 instanceof zzkz ? new zzky(size) : ((zzb2 instanceof zzmc) && (zzb2 instanceof zzkp)) ? ((zzkp) zzb2).zzr(size) : new ArrayList(size);
            zznd.zza(obj, j, zzkyVar);
            list = zzkyVar;
        } else if (zzto.isAssignableFrom(zzb2.getClass())) {
            ArrayList arrayList = new ArrayList(zzb2.size() + size);
            arrayList.addAll(zzb2);
            zznd.zza(obj, j, arrayList);
            list = arrayList;
        } else if (zzb2 instanceof zzna) {
            zzky zzkyVar2 = new zzky(zzb2.size() + size);
            zzkyVar2.addAll((zzna) zzb2);
            zznd.zza(obj, j, zzkyVar2);
            list = zzkyVar2;
        } else {
            list = zzb2;
            if (zzb2 instanceof zzmc) {
                list = zzb2;
                if (zzb2 instanceof zzkp) {
                    zzkp zzkpVar = (zzkp) zzb2;
                    list = zzb2;
                    if (!zzkpVar.zzbo()) {
                        zzkp<E> zzr = zzkpVar.zzr(zzb2.size() + size);
                        zznd.zza(obj, j, zzr);
                        list = zzr;
                    }
                }
            }
        }
        int size2 = list.size();
        int size3 = zzb.size();
        if (size2 > 0 && size3 > 0) {
            list.addAll(zzb);
        }
        if (size2 > 0) {
            zzb = list;
        }
        zznd.zza(obj, j, zzb);
    }
}
