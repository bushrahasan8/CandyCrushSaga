package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: zzgbj.class */
public abstract class zzgbj implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.zzgbj] */
    public static zzgbj zzb(Comparator comparator) {
        return comparator instanceof zzgbj ? (zzgbj) comparator : new zzfzl(comparator);
    }

    public static zzgbj zzc() {
        return zzgbh.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzgbj zza() {
        return new zzgbs(this);
    }
}
