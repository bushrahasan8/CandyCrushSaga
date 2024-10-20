package com.google.android.gms.internal.drive;

import java.util.ListIterator;

/* loaded from: zznb.class */
final class zznb implements ListIterator<String> {
    private ListIterator<String> zzvu;
    private final int zzvv;
    private final zzna zzvw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zznb(zzna zznaVar, int i) {
        zzkz zzkzVar;
        this.zzvw = zznaVar;
        this.zzvv = i;
        zzkzVar = zznaVar.zzvt;
        this.zzvu = zzkzVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zzvu.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzvu.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.zzvu.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzvu.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.zzvu.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzvu.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
