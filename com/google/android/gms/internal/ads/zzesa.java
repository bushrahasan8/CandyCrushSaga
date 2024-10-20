package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: zzesa.class */
final class zzesa implements zzexq {
    private final Set zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzesa(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final ListenableFuture zzb() {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzgen.zzh(new zzexp(arrayList) { // from class: com.google.android.gms.internal.ads.zzerz
            public final ArrayList zza;

            {
                this.zza = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzexp
            public final void zzj(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", this.zza);
            }
        });
    }
}
