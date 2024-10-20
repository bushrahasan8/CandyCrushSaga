package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: zzfzi.class */
final class zzfzi extends AbstractCollection {
    final zzfzj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzi(zzfzj zzfzjVar) {
        this.zza = zzfzjVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Iterator] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfzj zzfzjVar = this.zza;
        Map zzl = zzfzjVar.zzl();
        return zzl != null ? zzl.values().iterator() : new zzfzc(zzfzjVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
