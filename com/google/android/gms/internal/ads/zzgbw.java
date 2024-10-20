package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzgbw.class */
public final class zzgbw extends zzgbv implements SortedSet {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbw(SortedSet sortedSet, zzfxf zzfxfVar) {
        super(sortedSet, zzfxfVar);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.zza).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.zza.iterator();
        it.getClass();
        zzfxf zzfxfVar = this.zzb;
        zzfxfVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (zzfxfVar.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new zzgbw(((SortedSet) this.zza).headSet(obj), this.zzb);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.zza;
        while (true) {
            SortedSet sortedSet2 = sortedSet;
            zzfxf zzfxfVar = this.zzb;
            Object last = sortedSet2.last();
            if (zzfxfVar.zza(last)) {
                return last;
            }
            sortedSet = sortedSet2.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new zzgbw(((SortedSet) this.zza).subSet(obj, obj2), this.zzb);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new zzgbw(((SortedSet) this.zza).tailSet(obj), this.zzb);
    }
}
