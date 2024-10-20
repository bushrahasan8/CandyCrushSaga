package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: zzgaa.class */
public abstract class zzgaa<E> extends zzfzv<E> implements List<E>, RandomAccess {
    private static final zzgcf zza = new zzfzy(zzgbk.zza, 0);
    public static final int zzd = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgaa zzi(Object[] objArr, int i) {
        return i == 0 ? zzgbk.zza : new zzgbk(objArr, i);
    }

    public static zzgaa zzj(Collection collection) {
        if (!(collection instanceof zzfzv)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzgbi.zzb(array, length);
            return zzi(array, length);
        }
        zzgaa zzd2 = ((zzfzv) collection).zzd();
        zzgaa zzgaaVar = zzd2;
        if (zzd2.zzf()) {
            Object[] array2 = zzd2.toArray();
            zzgaaVar = zzi(array2, array2.length);
        }
        return zzgaaVar;
    }

    public static zzgaa zzk(Object[] objArr) {
        zzgaa zzi;
        if (objArr.length == 0) {
            zzi = zzgbk.zza;
        } else {
            Object[] objArr2 = (Object[]) objArr.clone();
            int length = objArr2.length;
            zzgbi.zzb(objArr2, length);
            zzi = zzi(objArr2, length);
        }
        return zzi;
    }

    public static zzgaa zzl() {
        return zzgbk.zza;
    }

    public static zzgaa zzm(Object obj) {
        Object[] objArr = {obj};
        zzgbi.zzb(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzgaa zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzgbi.zzb(objArr, 2);
        return zzi(objArr, 2);
    }

    public static zzgaa zzo(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzgbi.zzb(objArr, 3);
        return zzi(objArr, 3);
    }

    public static zzgaa zzp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzgbi.zzb(objArr, 5);
        return zzi(objArr, 5);
    }

    public static zzgaa zzq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzgbi.zzb(objArr, 6);
        return zzi(objArr, 6);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            z = true;
        } else {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        int i = 0;
                        while (true) {
                            z = true;
                            if (i >= size) {
                                break;
                            }
                            if (!zzfwy.zza(get(i), list.get(i))) {
                                break;
                            }
                            i++;
                        }
                    } else {
                        Iterator<E> it = iterator();
                        Iterator<E> it2 = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!it2.hasNext() || !zzfwy.zza(it.next(), it2.next())) {
                                    break;
                                }
                            } else if (!it2.hasNext()) {
                                z = true;
                            }
                        }
                    }
                }
            }
            z = false;
        }
        return z;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i;
        if (obj == null) {
            return -1;
        }
        int size = size();
        int i2 = 0;
        while (true) {
            i = -1;
            if (i2 >= size) {
                break;
            }
            if (obj.equals(get(i2))) {
                i = i2;
                break;
            }
            i2++;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj == null) {
            return -1;
        }
        int size = size() - 1;
        while (true) {
            i = -1;
            if (size < 0) {
                break;
            }
            if (obj.equals(get(size))) {
                i = size;
                break;
            }
            size--;
        }
        return i;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    @Deprecated
    public final zzgaa zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    /* renamed from: zze */
    public final zzgce iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzgaa subList(int i, int i2) {
        zzfxe.zzh(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzgbk.zza : new zzfzz(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public final zzgcf listIterator(int i) {
        zzfxe.zzb(i, size(), "index");
        return isEmpty() ? zza : new zzfzy(this, i);
    }
}
