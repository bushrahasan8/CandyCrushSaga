package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: zzmy.class */
public final class zzmy extends AbstractList<String> implements zzkm, RandomAccess {
    private final zzkm zza;

    public zzmy(zzkm zzkmVar) {
        this.zza = zzkmVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.zza.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzna(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new zzmx(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final void zza(zzij zzijVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final Object zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final zzkm zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final List<?> zze() {
        return this.zza.zze();
    }
}
