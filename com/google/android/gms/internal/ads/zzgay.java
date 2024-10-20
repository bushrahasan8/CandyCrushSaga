package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: zzgay.class */
final class zzgay extends zzgbc {
    final Comparator zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgay(Comparator comparator) {
        this.zza = comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgbc
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
