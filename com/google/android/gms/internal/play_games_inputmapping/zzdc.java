package com.google.android.gms.internal.play_games_inputmapping;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzdc.class */
public final class zzdc extends AbstractSet {
    final int zza;
    final zzdd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdc(zzdd zzddVar, int i) {
        this.zzb = zzddVar;
        this.zza = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr;
        Comparator comparator;
        Comparator comparator2;
        Comparator comparator3;
        objArr = this.zzb.zzb;
        int zzb = zzb();
        int zzc = zzc();
        if (this.zza == -1) {
            comparator3 = zzdd.zza;
            comparator2 = comparator3;
        } else {
            comparator = zzdf.zza;
            comparator2 = comparator;
        }
        return Arrays.binarySearch(objArr, zzb, zzc, obj, comparator2) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzdb(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zzc() - zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object zza(int i) {
        Object[] objArr;
        objArr = this.zzb.zzb;
        return objArr[zzb() + i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzb() {
        int[] iArr;
        int i = this.zza;
        if (i == -1) {
            return 0;
        }
        iArr = this.zzb.zzc;
        return iArr[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzc() {
        int[] iArr;
        iArr = this.zzb.zzc;
        return iArr[this.zza + 1];
    }
}
