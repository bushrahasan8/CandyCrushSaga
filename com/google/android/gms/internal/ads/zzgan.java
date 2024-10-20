package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: zzgan.class */
final class zzgan extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzfws zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgan(List list, zzfws zzfwsVar) {
        this.zza = list;
        this.zzb = zzfwsVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new zzgam(this, this.zza.listIterator(i));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        this.zza.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
