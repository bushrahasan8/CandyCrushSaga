package com.google.android.gms.internal.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: zzag.class */
public abstract class zzag extends zzac implements List, RandomAccess {
    private static final zzak zza = new zzae(zzai.zza, 0);

    static zzag zzi(Object[] objArr, int i) {
        return i == 0 ? zzai.zza : new zzai(objArr, i);
    }

    public static zzag zzj(Iterable iterable) {
        zzag zzi;
        iterable.getClass();
        if (iterable instanceof Collection) {
            zzi = zzk((Collection) iterable);
        } else {
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    zzad zzadVar = new zzad(4);
                    zzadVar.zzb(next);
                    zzadVar.zzc(it);
                    zzadVar.zzc = true;
                    zzi = zzi(zzadVar.zza, zzadVar.zzb);
                } else {
                    zzi = zzm(next);
                }
            } else {
                zzi = zzai.zza;
            }
        }
        return zzi;
    }

    public static zzag zzk(Collection collection) {
        if (!(collection instanceof zzac)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzah.zza(array, length);
            return zzi(array, length);
        }
        zzag zzd = ((zzac) collection).zzd();
        zzag zzagVar = zzd;
        if (zzd.zzf()) {
            Object[] array2 = zzd.toArray();
            zzagVar = zzi(array2, array2.length);
        }
        return zzagVar;
    }

    public static zzag zzl() {
        return zzai.zza;
    }

    public static zzag zzm(Object obj) {
        Object[] objArr = {obj};
        zzah.zza(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzag zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzah.zza(objArr, 2);
        return zzi(objArr, 2);
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
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
                            if (!zzr.zza(get(i), list.get(i))) {
                                break;
                            }
                            i++;
                        }
                    } else {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!it2.hasNext() || !zzr.zza(it.next(), it2.next())) {
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

    @Override // com.google.android.gms.internal.common.zzac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // com.google.android.gms.internal.common.zzac
    int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.common.zzac
    @Deprecated
    public final zzag zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: zze */
    public final zzaj iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzag subList(int i, int i2) {
        zzs.zzc(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zzai.zza : new zzaf(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final zzak listIterator(int i) {
        zzs.zzb(i, size(), "index");
        return isEmpty() ? zza : new zzae(this, i);
    }
}
