package com.google.android.gms.internal.play_games_inputmapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: zzfq.class */
final class zzfq extends zzfs {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzfq() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfq(byte[] bArr) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfs
    public final void zza(Object obj, long j) {
        List unmodifiableList;
        List list = (List) zzhn.zzn(obj, j);
        if (list instanceof zzfp) {
            unmodifiableList = ((zzfp) list).zzg();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzgl) && (list instanceof zzfh)) {
                zzfh zzfhVar = (zzfh) list;
                if (zzfhVar.zza()) {
                    zzfhVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzhn.zzo(obj, j, unmodifiableList);
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
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfs
    public final void zzb(Object obj, Object obj2, long j) {
        ?? r7;
        List list = (List) zzhn.zzn(obj2, j);
        int size = list.size();
        List list2 = (List) zzhn.zzn(obj, j);
        if (list2.isEmpty()) {
            RandomAccess zzfoVar = list2 instanceof zzfp ? new zzfo(size) : ((list2 instanceof zzgl) && (list2 instanceof zzfh)) ? ((zzfh) list2).zzh(size) : new ArrayList(size);
            zzhn.zzo(obj, j, zzfoVar);
            r7 = zzfoVar;
        } else if (zza.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + size);
            arrayList.addAll(list2);
            zzhn.zzo(obj, j, arrayList);
            r7 = arrayList;
        } else if (list2 instanceof zzhi) {
            zzfo zzfoVar2 = new zzfo(list2.size() + size);
            zzfoVar2.addAll(zzfoVar2.size(), (zzhi) list2);
            zzhn.zzo(obj, j, zzfoVar2);
            r7 = zzfoVar2;
        } else {
            r7 = list2;
            if (list2 instanceof zzgl) {
                r7 = list2;
                if (list2 instanceof zzfh) {
                    zzfh zzfhVar = (zzfh) list2;
                    r7 = list2;
                    if (!zzfhVar.zza()) {
                        zzfh zzh = zzfhVar.zzh(list2.size() + size);
                        zzhn.zzo(obj, j, zzh);
                        r7 = zzh;
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
        zzhn.zzo(obj, j, list3);
    }
}
