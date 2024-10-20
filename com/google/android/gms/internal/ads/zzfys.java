package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzfys.class */
public class zzfys extends zzfyq implements List {
    final zzfyt zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfys(zzfyt zzfytVar, Object obj, List list, zzfyq zzfyqVar) {
        super(zzfytVar, obj, list, zzfyqVar);
        this.zzf = zzfytVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzfyt zzfytVar = this.zzf;
        i2 = zzfytVar.zzb;
        zzfytVar.zzb = i2 + 1;
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i, collection);
        boolean z = addAll;
        if (addAll) {
            int size2 = this.zzb.size();
            zzfyt zzfytVar = this.zzf;
            i2 = zzfytVar.zzb;
            zzfytVar.zzb = i2 + (size2 - size);
            z = addAll;
            if (size == 0) {
                zza();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzfyr(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new zzfyr(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        zzb();
        Object remove = ((List) this.zzb).remove(i);
        zzfyt zzfytVar = this.zzf;
        i2 = zzfytVar.zzb;
        zzfytVar.zzb = i2 - 1;
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.zzb).set(i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.zzfyq] */
    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        List subList = ((List) this.zzb).subList(i, i2);
        ?? r0 = this.zzc;
        zzfys zzfysVar = r0;
        if (r0 == 0) {
            zzfysVar = this;
        }
        return this.zzf.zzh(this.zza, subList, zzfysVar);
    }
}
