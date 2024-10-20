package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: zzfzg.class */
final class zzfzg extends AbstractSet {
    final zzfzj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzg(zzfzj zzfzjVar) {
        this.zza = zzfzjVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Iterator] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfzj zzfzjVar = this.zza;
        Map zzl = zzfzjVar.zzl();
        return zzl != null ? zzl.keySet().iterator() : new zzfza(zzfzjVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object zzy;
        Object obj2;
        boolean z;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            z = zzl.keySet().remove(obj);
        } else {
            zzy = this.zza.zzy(obj);
            obj2 = zzfzj.zzd;
            if (zzy != obj2) {
                return true;
            }
            z = false;
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
