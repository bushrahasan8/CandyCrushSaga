package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzfyq.class */
public class zzfyq extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzfyq zzc;
    final Collection zzd;
    final zzfyt zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyq(zzfyt zzfytVar, Object obj, Collection collection, zzfyq zzfyqVar) {
        this.zze = zzfytVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzfyqVar;
        this.zzd = zzfyqVar == null ? null : zzfyqVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        boolean add = this.zzb.add(obj);
        if (add) {
            zzfyt zzfytVar = this.zze;
            i = zzfytVar.zzb;
            zzfytVar.zzb = i + 1;
            if (isEmpty) {
                zza();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.zzb.addAll(collection);
        boolean z = addAll;
        if (addAll) {
            int size2 = this.zzb.size();
            zzfyt zzfytVar = this.zze;
            i = zzfytVar.zzb;
            zzfytVar.zzb = i + (size2 - size);
            z = addAll;
            if (size == 0) {
                zza();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i;
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzfyt zzfytVar = this.zze;
        i = zzfytVar.zzb;
        zzfytVar.zzb = i - size;
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzfyp(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        zzb();
        boolean remove = this.zzb.remove(obj);
        if (remove) {
            zzfyt zzfytVar = this.zze;
            i = zzfytVar.zzb;
            zzfytVar.zzb = i - 1;
            zzc();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.zzb.removeAll(collection);
        if (removeAll) {
            int size2 = this.zzb.size();
            zzfyt zzfytVar = this.zze;
            i = zzfytVar.zzb;
            zzfytVar.zzb = i + (size2 - size);
            zzc();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        int size = size();
        boolean retainAll = this.zzb.retainAll(collection);
        if (retainAll) {
            int size2 = this.zzb.size();
            zzfyt zzfytVar = this.zze;
            i = zzfytVar.zzb;
            zzfytVar.zzb = i + (size2 - size);
            zzc();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        Map map;
        zzfyq zzfyqVar = this.zzc;
        if (zzfyqVar != null) {
            zzfyqVar.zza();
            return;
        }
        zzfyt zzfytVar = this.zze;
        Object obj = this.zza;
        map = zzfytVar.zza;
        map.put(obj, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Map map;
        zzfyq zzfyqVar = this.zzc;
        if (zzfyqVar != null) {
            zzfyqVar.zzb();
            zzfyq zzfyqVar2 = this.zzc;
            if (zzfyqVar2.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.zzb.isEmpty()) {
            zzfyt zzfytVar = this.zze;
            Object obj = this.zza;
            map = zzfytVar.zza;
            Collection collection = (Collection) map.get(obj);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        Map map;
        zzfyq zzfyqVar = this.zzc;
        if (zzfyqVar != null) {
            zzfyqVar.zzc();
        } else if (this.zzb.isEmpty()) {
            zzfyt zzfytVar = this.zze;
            Object obj = this.zza;
            map = zzfytVar.zza;
            map.remove(obj);
        }
    }
}
