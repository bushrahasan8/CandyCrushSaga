package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: zzgag.class */
public final class zzgag {
    public static Object zza(Iterable iterable, Object obj) {
        zzgbt zzgbtVar = new zzgbt((zzgbu) iterable);
        return zzgbtVar.hasNext() ? zzgbtVar.next() : obj;
    }

    public static boolean zzb(Iterable iterable, zzfxf zzfxfVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzfxfVar.getClass();
            return zzd((List) iterable, zzfxfVar);
        }
        Iterator it = iterable.iterator();
        zzfxfVar.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (zzfxfVar.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    private static void zzc(List list, zzfxf zzfxfVar, int i, int i2) {
        int i3;
        int size = list.size();
        while (true) {
            int i4 = size - 1;
            i3 = i2;
            if (i4 <= i2) {
                break;
            }
            size = i4;
            if (zzfxfVar.zza(list.get(i4))) {
                list.remove(i4);
                size = i4;
            }
        }
        while (true) {
            i3--;
            if (i3 < i) {
                return;
            } else {
                list.remove(i3);
            }
        }
    }

    private static boolean zzd(List list, zzfxf zzfxfVar) {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = i3;
            if (i2 >= list.size()) {
                break;
            }
            Object obj = list.get(i2);
            int i4 = i;
            if (!zzfxfVar.zza(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException e) {
                        zzc(list, zzfxfVar, i, i2);
                        return true;
                    } catch (UnsupportedOperationException e2) {
                        zzc(list, zzfxfVar, i, i2);
                        return true;
                    }
                }
                i4 = i + 1;
            }
            i2++;
            i3 = i4;
        }
        list.subList(i, list.size()).clear();
        return i2 != i;
    }
}
