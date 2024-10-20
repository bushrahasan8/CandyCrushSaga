package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: zzgca.class */
public final class zzgca {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            Object next = it.next();
            i = i2 + (next != null ? next.hashCode() : 0);
        }
    }

    public static zzgbz zzb(Set set, Set set2) {
        zzfxe.zzc(set, "set1");
        zzfxe.zzc(set2, "set2");
        return new zzgbu(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzc(Set set, zzfxf zzfxfVar) {
        zzgbw zzgbwVar;
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof zzgbv)) {
                set.getClass();
                return new zzgbv(set, zzfxfVar);
            }
            zzgbv zzgbvVar = (zzgbv) set;
            return new zzgbv(zzgbvVar.zza, zzfxi.zza(zzgbvVar.zzb, zzfxfVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (sortedSet instanceof zzgbv) {
            zzgbv zzgbvVar2 = (zzgbv) sortedSet;
            zzgbwVar = new zzgbw((SortedSet) zzgbvVar2.zza, zzfxi.zza(zzgbvVar2.zzb, zzfxfVar));
        } else {
            sortedSet.getClass();
            zzgbwVar = new zzgbw(sortedSet, zzfxfVar);
        }
        return zzgbwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zze(Set set, Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection instanceof zzgbg) {
            collection2 = ((zzgbg) collection).zza();
        }
        if (!(collection2 instanceof Set) || collection2.size() <= set.size()) {
            return zzf(set, collection2.iterator());
        }
        Iterator it = set.iterator();
        collection2.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection2.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzf(Set set, Iterator it) {
        boolean z = false;
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                return z2;
            }
            z = z2 | set.remove(it.next());
        }
    }
}
