package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: zzgyc.class */
final class zzgyc implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int compareTo;
        zzgyl zzgylVar = (zzgyl) obj;
        zzgyl zzgylVar2 = (zzgyl) obj2;
        zzgyf it = zzgylVar.iterator();
        zzgyf it2 = zzgylVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            compareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (compareTo != 0) {
                break;
            }
        }
        compareTo = Integer.valueOf(zzgylVar.zzd()).compareTo(Integer.valueOf(zzgylVar2.zzd()));
        return compareTo;
    }
}
