package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: zzgbh.class */
final class zzgbh extends zzgbj implements Serializable {
    static final zzgbh zza = new zzgbh();

    private zzgbh() {
    }

    @Override // com.google.android.gms.internal.ads.zzgbj, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzgbj
    public final zzgbj zza() {
        return zzgbr.zza;
    }
}
