package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: zzhaq.class */
final class zzhaq extends zzhas {
    private zzhaq() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhaq(zzhap zzhapVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhas
    public final List zza(Object obj, long j) {
        zzhad zzhadVar = (zzhad) zzhcz.zzh(obj, j);
        zzhad zzhadVar2 = zzhadVar;
        if (!zzhadVar.zzc()) {
            int size = zzhadVar.size();
            zzhadVar2 = zzhadVar.zzd(size == 0 ? 10 : size + size);
            zzhcz.zzv(obj, j, zzhadVar2);
        }
        return zzhadVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhas
    public final void zzb(Object obj, long j) {
        ((zzhad) zzhcz.zzh(obj, j)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhas
    public final void zzc(Object obj, Object obj2, long j) {
        zzhad zzhadVar = (zzhad) zzhcz.zzh(obj, j);
        zzhad zzhadVar2 = (zzhad) zzhcz.zzh(obj2, j);
        int size = zzhadVar.size();
        int size2 = zzhadVar2.size();
        zzhad zzhadVar3 = zzhadVar;
        if (size > 0) {
            zzhadVar3 = zzhadVar;
            if (size2 > 0) {
                zzhadVar3 = zzhadVar;
                if (!zzhadVar.zzc()) {
                    zzhadVar3 = zzhadVar.zzd(size2 + size);
                }
                zzhadVar3.addAll(zzhadVar2);
            }
        }
        if (size <= 0) {
            zzhadVar3 = zzhadVar2;
        }
        zzhcz.zzv(obj, j, zzhadVar3);
    }
}
