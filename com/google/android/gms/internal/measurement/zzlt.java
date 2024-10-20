package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: zzlt.class */
final class zzlt<E> extends zzid<E> implements RandomAccess {
    private static final zzlt<Object> zza = new zzlt<>(new Object[0], 0, false);
    private E[] zzb;
    private int zzc;

    zzlt() {
        this(new Object[10], 0, true);
    }

    private zzlt(E[] eArr, int i, boolean z) {
        super(z);
        this.zzb = eArr;
        this.zzc = i;
    }

    private final String zzb(int i) {
        return "Index:" + i + ", Size:" + this.zzc;
    }

    private final void zzc(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zzb(i));
        }
    }

    public static <E> zzlt<E> zzd() {
        return (zzlt<E>) zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzid, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzb(i));
        }
        E[] eArr = this.zzb;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.zzb, i, eArr2, i + 1, this.zzc - i);
            this.zzb = eArr2;
        }
        this.zzb[i] = e;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzid, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        zza();
        int i = this.zzc;
        E[] eArr = this.zzb;
        if (i == eArr.length) {
            this.zzb = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        zzc(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzid, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        zza();
        zzc(i);
        E[] eArr = this.zzb;
        E e = eArr[i];
        int i2 = this.zzc;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // com.google.android.gms.internal.measurement.zzid, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zza();
        zzc(i);
        E[] eArr = this.zzb;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    public final /* synthetic */ zzkc zza(int i) {
        if (i >= this.zzc) {
            return new zzlt(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }
}
