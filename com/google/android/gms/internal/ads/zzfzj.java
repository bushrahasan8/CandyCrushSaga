package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzfzj.class */
public final class zzfzj extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    zzfzj() {
        zzp(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzj(int i) {
        zzp(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzg(zzfzj zzfzjVar, int i) {
        return zzfzjVar.zzB()[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzi(zzfzj zzfzjVar) {
        Object obj = zzfzjVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzj(zzfzj zzfzjVar, int i) {
        return zzfzjVar.zzC()[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzn(zzfzj zzfzjVar, int i, Object obj) {
        zzfzjVar.zzC()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(Object obj) {
        int i;
        if (zzr()) {
            return -1;
        }
        int zzb = zzfzs.zzb(obj);
        int zzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int zzc = zzfzk.zzc(obj2, zzb & zzv);
        if (zzc == 0) {
            return -1;
        }
        int i2 = zzv ^ (-1);
        do {
            int i3 = zzc - 1;
            int i4 = zzA()[i3];
            if ((i4 & i2) == (zzb & i2) && zzfwy.zza(obj, zzB()[i3])) {
                return i3;
            }
            i = i4 & zzv;
            zzc = i;
        } while (i != 0);
        return -1;
    }

    private final int zzx(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object zzd2 = zzfzk.zzd(i2);
        if (i4 != 0) {
            zzfzk.zze(zzd2, i3 & i5, i4 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzA = zzA();
        for (int i6 = 0; i6 <= i; i6++) {
            int zzc = zzfzk.zzc(obj, i6);
            while (true) {
                int i7 = zzc;
                if (i7 != 0) {
                    int i8 = i7 - 1;
                    int i9 = zzA[i8];
                    int i10 = ((i ^ (-1)) & i9) | i6;
                    int i11 = i10 & i5;
                    int zzc2 = zzfzk.zzc(zzd2, i11);
                    zzfzk.zze(zzd2, i11, i7);
                    zzA[i8] = ((i5 ^ (-1)) & i10) | (zzc2 & i5);
                    zzc = i9 & i;
                }
            }
        }
        this.zze = zzd2;
        zzz(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj) {
        if (!zzr()) {
            int zzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int zzb = zzfzk.zzb(obj, null, zzv, obj2, zzA(), zzB(), null);
            if (zzb != -1) {
                Object obj3 = zzC()[zzb];
                zzq(zzb, zzv);
                this.zzg--;
                zzo();
                return obj3;
            }
        }
        return zzd;
    }

    private final void zzz(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map zzl = zzl();
        if (zzl != null) {
            this.zzf = zzgcu.zzb(size(), 3, 1073741823);
            zzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        boolean z;
        Map zzl = zzl();
        if (zzl != null) {
            z = zzl.containsKey(obj);
        } else {
            if (zzw(obj) != -1) {
                return true;
            }
            z = false;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (zzfwy.zza(obj, zzC()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        Set set2 = set;
        if (set == null) {
            set2 = new zzfzd(this);
            this.zzi = set2;
        }
        return set2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int zzw = zzw(obj);
        if (zzw == -1) {
            return null;
        }
        return zzC()[zzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        Set set2 = set;
        if (set == null) {
            set2 = new zzfzg(this);
            this.zzh = set2;
        }
        return set2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int min;
        if (zzr()) {
            zzfxe.zzj(zzr(), "Arrays already allocated");
            int i4 = this.zzf;
            int max = Math.max(i4 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            int i5 = highestOneBit;
            if (max > highestOneBit) {
                int i6 = highestOneBit + highestOneBit;
                i5 = i6;
                if (i6 <= 0) {
                    i5 = 1073741824;
                }
            }
            int max2 = Math.max(4, i5);
            this.zze = zzfzk.zzd(max2);
            zzz(max2 - 1);
            this.zza = new int[i4];
            this.zzb = new Object[i4];
            this.zzc = new Object[i4];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj, obj2);
        }
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int i7 = this.zzg;
        int i8 = i7 + 1;
        int zzb = zzfzs.zzb(obj);
        int zzv = zzv();
        int i9 = zzb & zzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int zzc = zzfzk.zzc(obj3, i9);
        if (zzc != 0) {
            int i10 = zzv ^ (-1);
            int i11 = 0;
            do {
                i = zzc - 1;
                int i12 = zzA[i];
                i2 = i12 & i10;
                if (i2 == (zzb & i10) && zzfwy.zza(obj, zzB[i])) {
                    Object obj4 = zzC[i];
                    zzC[i] = obj2;
                    return obj4;
                }
                zzc = i12 & zzv;
                i11++;
            } while (zzc != 0);
            if (i11 >= 9) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                int zze = zze();
                while (true) {
                    int i13 = zze;
                    if (i13 < 0) {
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzo();
                        return linkedHashMap.put(obj, obj2);
                    }
                    linkedHashMap.put(zzB()[i13], zzC()[i13]);
                    zze = zzf(i13);
                }
            } else if (i8 > zzv) {
                i3 = zzx(zzv, zzfzk.zza(zzv), zzb, i7);
            } else {
                zzA[i] = (i8 & zzv) | i2;
                i3 = zzv;
            }
        } else if (i8 > zzv) {
            i3 = zzx(zzv, zzfzk.zza(zzv), zzb, i7);
        } else {
            Object obj5 = this.zze;
            Objects.requireNonNull(obj5);
            zzfzk.zze(obj5, i9, i8);
            i3 = zzv;
        }
        int length = zzA().length;
        if (i8 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzA(), min);
            this.zzb = Arrays.copyOf(zzB(), min);
            this.zzc = Arrays.copyOf(zzC(), min);
        }
        zzA()[i7] = (i3 ^ (-1)) & zzb;
        zzB()[i7] = obj;
        zzC()[i7] = obj2;
        this.zzg = i8;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.remove(obj);
        }
        Object zzy = zzy(obj);
        Object obj2 = zzy;
        if (zzy == zzd) {
            obj2 = null;
        }
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzl = zzl();
        return zzl != null ? zzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        Collection collection2 = collection;
        if (collection == null) {
            collection2 = new zzfzi(this);
            this.zzj = collection2;
        }
        return collection2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzf(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzo() {
        this.zzf += 32;
    }

    final void zzp(int i) {
        this.zzf = zzgcu.zzb(8, 1, 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzq(int i, int i2) {
        int i3;
        int i4;
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int size = size();
        int i5 = size - 1;
        if (i >= i5) {
            zzB[i] = null;
            zzC[i] = null;
            zzA[i] = 0;
            return;
        }
        int i6 = i + 1;
        Object obj2 = zzB[i5];
        zzB[i] = obj2;
        zzC[i] = zzC[i5];
        zzB[i5] = null;
        zzC[i5] = null;
        zzA[i] = zzA[i5];
        zzA[i5] = 0;
        int zzb = zzfzs.zzb(obj2) & i2;
        int zzc = zzfzk.zzc(obj, zzb);
        if (zzc == size) {
            zzfzk.zze(obj, zzb, i6);
            return;
        }
        do {
            i3 = zzc - 1;
            i4 = zzA[i3];
            zzc = i4 & i2;
        } while (zzc != size);
        zzA[i3] = (i4 & (i2 ^ (-1))) | (i2 & i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzr() {
        return this.zze == null;
    }
}
