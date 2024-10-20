package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

/* loaded from: zzgaf.class */
public abstract class zzgaf extends zzfzv implements Set {
    private transient zzgaa zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            zzfxe.zzf(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzgae zzj(int i) {
        return new zzgae(i);
    }

    public static zzgaf zzl(Collection collection) {
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzgaf zzm(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? zzv(length, (Object[]) objArr.clone()) : new zzgcb(objArr[0]) : zzgbq.zza;
    }

    public static zzgaf zzn() {
        return zzgbq.zza;
    }

    public static zzgaf zzo(Object obj) {
        return new zzgcb(obj);
    }

    public static zzgaf zzp(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzgaf zzq(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzgaf zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzgaf zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return zzv(12, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgaf zzv(int i, Object... objArr) {
        int i2;
        int i3;
        int i4;
        if (i == 0) {
            return zzgbq.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzgcb(obj);
        }
        int zzh = zzh(i);
        Object[] objArr2 = new Object[zzh];
        int i5 = zzh - 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i2 = i8;
            if (i6 >= i) {
                break;
            }
            Object obj2 = objArr[i6];
            zzgbi.zza(obj2, i6);
            int hashCode = obj2.hashCode();
            int zza = zzfzs.zza(hashCode);
            while (true) {
                int i9 = zza & i5;
                Object obj3 = objArr2[i9];
                if (obj3 == null) {
                    objArr[i2] = obj2;
                    objArr2[i9] = obj2;
                    i3 = i7 + hashCode;
                    i4 = i2 + 1;
                    break;
                }
                i3 = i7;
                i4 = i2;
                if (!obj3.equals(obj2)) {
                    zza++;
                }
            }
            i6++;
            i7 = i3;
            i8 = i4;
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgcb(obj4);
        }
        if (zzh(i2) < zzh / 2) {
            return zzv(i2, objArr);
        }
        Object[] objArr3 = objArr;
        if (zzw(i2, objArr.length)) {
            objArr3 = Arrays.copyOf(objArr, i2);
        }
        return new zzgbq(objArr3, i7, objArr2, i5, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgaf) && zzu() && ((zzgaf) obj).zzu() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgca.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgca.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public zzgaa zzd() {
        zzgaa zzgaaVar = this.zza;
        zzgaa zzgaaVar2 = zzgaaVar;
        if (zzgaaVar == null) {
            zzgaaVar2 = zzi();
            this.zza = zzgaaVar2;
        }
        return zzgaaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzfzv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzgce iterator();

    zzgaa zzi() {
        Object[] array = toArray();
        int i = zzgaa.zzd;
        return zzgaa.zzi(array, array.length);
    }

    boolean zzu() {
        return false;
    }
}
