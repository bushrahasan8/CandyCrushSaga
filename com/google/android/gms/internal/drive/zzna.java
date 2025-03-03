package com.google.android.gms.internal.drive;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: zzna.class */
public final class zzna extends AbstractList<String> implements zzkz, RandomAccess {
    private final zzkz zzvt;

    public zzna(zzkz zzkzVar) {
        this.zzvt = zzkzVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.zzvt.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zznc(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new zznb(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzvt.size();
    }

    @Override // com.google.android.gms.internal.drive.zzkz
    public final Object zzao(int i) {
        return this.zzvt.zzao(i);
    }

    @Override // com.google.android.gms.internal.drive.zzkz
    public final List<?> zzdr() {
        return this.zzvt.zzdr();
    }

    @Override // com.google.android.gms.internal.drive.zzkz
    public final zzkz zzds() {
        return this;
    }
}
