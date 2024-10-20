package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* loaded from: zzmx.class */
final class zzmx implements ListIterator<String> {
    private ListIterator<String> zza;
    private final int zzb;
    private final zzmy zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmx(zzmy zzmyVar, int i) {
        zzkm zzkmVar;
        this.zzb = i;
        this.zzc = zzmyVar;
        zzkmVar = zzmyVar.zza;
        this.zza = zzkmVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
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
    public final /* synthetic */ Object next() {
        return this.zza.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.zza.previous();
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
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
