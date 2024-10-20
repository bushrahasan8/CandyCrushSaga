package com.google.android.gms.internal.play_games_inputmapping;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzdd.class */
public final class zzdd extends AbstractMap {
    private static final Comparator zza = new zzda();
    private final Object[] zzb;
    private final int[] zzc;
    private final Set zzd = new zzdc(this, -1);
    private Integer zze = null;
    private String zzf = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdd(zzdd zzddVar, zzdd zzddVar2) {
        int i;
        Object zza2;
        int i2;
        Comparator comparator;
        Object[] objArr;
        int i3 = -1;
        int size = zzddVar.size() + zzddVar2.size();
        int i4 = zzddVar.zzc[zzddVar.size()] + zzddVar2.zzc[zzddVar2.size()];
        Object[] objArr2 = new Object[i4];
        int i5 = size + 1;
        int[] iArr = new int[i5];
        int i6 = 0;
        iArr[0] = size;
        Map.Entry zzg = zzddVar.zzg(0);
        Map.Entry zzg2 = zzddVar2.zzg(0);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (zzg == null && zzg2 == null) {
                break;
            }
            int i10 = zzg == null ? 1 : zzg2 == null ? i3 : i6;
            int i11 = i10;
            if (i10 == 0) {
                int compareTo = ((String) zzg.getKey()).compareTo((String) zzg2.getKey());
                i11 = compareTo;
                if (compareTo == 0) {
                    objArr2[i7] = zzf((String) zzg.getKey(), i7);
                    int i12 = i7 + 1;
                    zzdc zzdcVar = (zzdc) zzg.getValue();
                    zzdc zzdcVar2 = (zzdc) zzg2.getValue();
                    int i13 = i6;
                    int i14 = i13;
                    int i15 = i6;
                    int i16 = i3;
                    int i17 = i13;
                    while (true) {
                        if (i17 >= zzdcVar.zzc() - zzdcVar.zzb() && i14 >= zzdcVar2.zzc() - zzdcVar2.zzb()) {
                            break;
                        }
                        if (i17 == zzdcVar.zzc() - zzdcVar.zzb()) {
                            i16 = 1;
                        } else if (i14 != zzdcVar2.zzc() - zzdcVar2.zzb()) {
                            i16 = i15;
                        }
                        int i18 = i16;
                        if (i16 == 0) {
                            comparator = zzdf.zza;
                            i18 = comparator.compare(zzdcVar.zza(i17), zzdcVar2.zza(i14));
                        }
                        if (i18 < 0) {
                            i2 = i17 + 1;
                            zza2 = zzdcVar.zza(i17);
                        } else {
                            zza2 = zzdcVar2.zza(i14);
                            i2 = i18 == 0 ? i17 + 1 : i17;
                            i14++;
                        }
                        objArr2[size] = zza2;
                        size++;
                        i15 = 0;
                        i17 = i2;
                        i16 = -1;
                    }
                    iArr[i12] = size;
                    i8++;
                    zzg = zzddVar.zzg(i8);
                    i9++;
                    zzg2 = zzddVar2.zzg(i9);
                    i7 = i12;
                    i3 = i16;
                    i6 = i15;
                }
            }
            if (i11 < 0) {
                i = i7 + 1;
                size = zzd(zzg, i7, size, objArr2, iArr);
                i8++;
                zzg = zzddVar.zzg(i8);
            } else {
                i = i7 + 1;
                size = zzd(zzg2, i7, size, objArr2, iArr);
                i9++;
                zzg2 = zzddVar2.zzg(i9);
            }
            i3 = -1;
            i7 = i;
            i6 = 0;
        }
        int i19 = iArr[i6];
        int i20 = i19 - i7;
        if (i20 == 0) {
            objArr = objArr2;
        } else {
            for (int i21 = i6; i21 <= i7; i21++) {
                iArr[i21] = iArr[i21] - i20;
            }
            int i22 = iArr[i7];
            if (zze(i4, i22)) {
                objArr = new Object[i22];
                System.arraycopy(objArr2, i6, objArr, i6, i7);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i19, objArr, i7, i22 - i7);
        }
        this.zzb = objArr;
        int i23 = iArr[i6] + 1;
        this.zzc = zze(i5, i23) ? Arrays.copyOf(iArr, i23) : iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdd(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            zzcz.zza((zzcz) it.next());
            throw null;
        }
        int size = list.size();
        Object[] objArr = new Object[size];
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            zzcz.zza((zzcz) it2.next());
            throw null;
        }
        this.zzb = zze(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
        this.zzc = new int[]{0};
    }

    private final int zzd(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        zzdc zzdcVar = (zzdc) entry.getValue();
        int zzc = zzdcVar.zzc() - zzdcVar.zzb();
        System.arraycopy(zzdcVar.zzb.zzb, zzdcVar.zzb(), objArr, i2, zzc);
        objArr[i] = zzf((String) entry.getKey(), i);
        int i3 = i2 + zzc;
        iArr[i + 1] = i3;
        return i3;
    }

    private static boolean zze(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    private final Map.Entry zzf(String str, int i) {
        return new AbstractMap.SimpleImmutableEntry(str, new zzdc(this, i));
    }

    private final Map.Entry zzg(int i) {
        if (i < this.zzc[0]) {
            return (Map.Entry) this.zzb[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.zze == null) {
            this.zze = Integer.valueOf(super.hashCode());
        }
        return this.zze.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.zzf == null) {
            this.zzf = super.toString();
        }
        return this.zzf;
    }
}
