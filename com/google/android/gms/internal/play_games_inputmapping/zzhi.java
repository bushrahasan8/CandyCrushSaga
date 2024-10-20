package com.google.android.gms.internal.play_games_inputmapping;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: zzhi.class */
public final class zzhi extends AbstractList implements RandomAccess, zzfp {
    private final zzfp zza;

    public zzhi(zzfp zzfpVar) {
        this.zza = zzfpVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((zzfo) this.zza).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzhh(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new zzhg(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfp
    public final Object zze(int i) {
        return this.zza.zze(i);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfp
    public final List zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfp
    public final zzfp zzg() {
        return this;
    }
}
