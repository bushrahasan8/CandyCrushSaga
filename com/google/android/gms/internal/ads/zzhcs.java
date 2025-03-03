package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: zzhcs.class */
final class zzhcs implements ListIterator {
    final ListIterator zza;
    final int zzb;
    final zzhcu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhcs(zzhcu zzhcuVar, int i) {
        zzham zzhamVar;
        this.zzb = i;
        this.zzc = zzhcuVar;
        zzhamVar = zzhcuVar.zza;
        this.zza = zzhamVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.zza.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zza.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
