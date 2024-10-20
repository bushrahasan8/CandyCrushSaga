package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: zzdm.class */
final class zzdm extends zzdq {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzdm() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdm(zzdl zzdlVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzdq
    public final void zza(Object obj, long j) {
        List unmodifiableList;
        List list = (List) zzfp.zzf(obj, j);
        if (list instanceof zzdk) {
            unmodifiableList = ((zzdk) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzek) && (list instanceof zzcz)) {
                zzcz zzczVar = (zzcz) list;
                if (zzczVar.zzc()) {
                    zzczVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzfp.zzs(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // com.google.android.gms.internal.play_billing.zzdq
    public final void zzb(Object obj, Object obj2, long j) {
        ?? r7;
        List list = (List) zzfp.zzf(obj2, j);
        int size = list.size();
        List list2 = (List) zzfp.zzf(obj, j);
        if (list2.isEmpty()) {
            RandomAccess zzdjVar = list2 instanceof zzdk ? new zzdj(size) : ((list2 instanceof zzek) && (list2 instanceof zzcz)) ? ((zzcz) list2).zzd(size) : new ArrayList(size);
            zzfp.zzs(obj, j, zzdjVar);
            r7 = zzdjVar;
        } else if (zza.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + size);
            arrayList.addAll(list2);
            zzfp.zzs(obj, j, arrayList);
            r7 = arrayList;
        } else if (list2 instanceof zzfk) {
            zzdj zzdjVar2 = new zzdj(list2.size() + size);
            zzdjVar2.addAll(zzdjVar2.size(), (zzfk) list2);
            zzfp.zzs(obj, j, zzdjVar2);
            r7 = zzdjVar2;
        } else {
            r7 = list2;
            if (list2 instanceof zzek) {
                r7 = list2;
                if (list2 instanceof zzcz) {
                    zzcz zzczVar = (zzcz) list2;
                    r7 = list2;
                    if (!zzczVar.zzc()) {
                        zzcz zzd = zzczVar.zzd(list2.size() + size);
                        zzfp.zzs(obj, j, zzd);
                        r7 = zzd;
                    }
                }
            }
        }
        int size2 = (r7 == true ? 1 : 0).size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            (r7 == true ? 1 : 0).addAll(list);
        }
        List list3 = r7;
        if (size2 <= 0) {
            list3 = list;
        }
        zzfp.zzs(obj, j, list3);
    }
}
