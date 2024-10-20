package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzfyl.class */
public final class zzfyl extends zzfyo implements NavigableSet {
    final zzfyt zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfyl(zzfyt zzfytVar, NavigableMap navigableMap) {
        super(zzfytVar, navigableMap);
        this.zzb = zzfytVar;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new zzfyl(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new zzfyl(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).headMap(obj, z));
    }

    @Override // com.google.android.gms.internal.ads.zzfyo, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.zzd)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return zzgak.zza(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return zzgak.zza(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new zzfyl(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).subMap(obj, z, obj2, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfyo, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new zzfyl(this.zzb, ((NavigableMap) ((SortedMap) this.zzd)).tailMap(obj, z));
    }

    @Override // com.google.android.gms.internal.ads.zzfyo, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // com.google.android.gms.internal.ads.zzfyo
    final /* synthetic */ SortedMap zza() {
        return (NavigableMap) ((SortedMap) this.zzd);
    }
}
