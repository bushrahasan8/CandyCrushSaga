package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: zzgdx.class */
abstract class zzgdx extends zzgdm {
    private List zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List] */
    public zzgdx(zzfzv zzfzvVar, boolean z) {
        super(zzfzvVar, z, true);
        ArrayList emptyList = zzfzvVar.isEmpty() ? Collections.emptyList() : zzgao.zza(zzfzvVar.size());
        for (int i = 0; i < zzfzvVar.size(); i++) {
            emptyList.add(null);
        }
        this.zza = emptyList;
    }

    abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzgdm
    final void zzf(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgdw(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdm
    final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgdm
    public final void zzy(int i) {
        super.zzy(i);
        this.zza = null;
    }
}
