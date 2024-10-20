package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzgbp.class */
public final class zzgbp extends zzgad {
    static final zzgad zza = new zzgbp(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzgbp(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v132, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v179, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v181 */
    /* JADX WARN: Type inference failed for: r0v188 */
    /* JADX WARN: Type inference failed for: r0v190 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object[]] */
    public static zzgbp zzj(int i, Object[] objArr, zzgac zzgacVar) {
        int i2;
        if (i == 0) {
            return (zzgbp) zza;
        }
        short[] sArr = null;
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            zzfyx.zzb(obj, obj2);
            return new zzgbp(null, objArr, 1);
        }
        zzfxe.zzb(i, objArr.length >> 1, "index");
        int zzh = zzgaf.zzh(i);
        if (i == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArr[1];
            Objects.requireNonNull(obj4);
            zzfyx.zzb(obj3, obj4);
            i2 = 1;
        } else {
            int i3 = zzh - 1;
            if (zzh <= 128) {
                byte[] bArr = new byte[zzh];
                Arrays.fill(bArr, (byte) -1);
                int i4 = 0;
                zzgab zzgabVar = null;
                for (int i5 = 0; i5 < i; i5++) {
                    int i6 = i4 + i4;
                    int i7 = i5 + i5;
                    Object obj5 = objArr[i7];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArr[i7 ^ 1];
                    Objects.requireNonNull(obj6);
                    zzfyx.zzb(obj5, obj6);
                    int zza2 = zzfzs.zza(obj5.hashCode());
                    while (true) {
                        int i8 = zza2 & i3;
                        int i9 = bArr[i8] & 255;
                        if (i9 == 255) {
                            bArr[i8] = (byte) i6;
                            if (i4 < i5) {
                                objArr[i6] = obj5;
                                objArr[i6 ^ 1] = obj6;
                            }
                            i4++;
                        } else {
                            if (obj5.equals(objArr[i9])) {
                                int i10 = i9 ^ 1;
                                Object obj7 = objArr[i10];
                                Objects.requireNonNull(obj7);
                                zzgabVar = new zzgab(obj5, obj6, obj7);
                                objArr[i10] = obj6;
                                break;
                            }
                            zza2 = i8 + 1;
                        }
                    }
                }
                sArr = i4 == i ? bArr : new Object[]{bArr, Integer.valueOf(i4), zzgabVar};
            } else if (zzh <= 32768) {
                short[] sArr2 = new short[zzh];
                Arrays.fill(sArr2, (short) -1);
                int i11 = 0;
                zzgab zzgabVar2 = null;
                for (int i12 = 0; i12 < i; i12++) {
                    int i13 = i11 + i11;
                    int i14 = i12 + i12;
                    Object obj8 = objArr[i14];
                    Objects.requireNonNull(obj8);
                    Object obj9 = objArr[i14 ^ 1];
                    Objects.requireNonNull(obj9);
                    zzfyx.zzb(obj8, obj9);
                    int zza3 = zzfzs.zza(obj8.hashCode());
                    while (true) {
                        int i15 = zza3 & i3;
                        char c = (char) sArr2[i15];
                        if (c == 65535) {
                            sArr2[i15] = (short) i13;
                            if (i11 < i12) {
                                objArr[i13] = obj8;
                                objArr[i13 ^ 1] = obj9;
                            }
                            i11++;
                        } else {
                            if (obj8.equals(objArr[c])) {
                                int i16 = c ^ 1;
                                Object obj10 = objArr[i16];
                                Objects.requireNonNull(obj10);
                                zzgabVar2 = new zzgab(obj8, obj9, obj10);
                                objArr[i16] = obj9;
                                break;
                            }
                            zza3 = i15 + 1;
                        }
                    }
                }
                if (i11 == i) {
                    sArr = sArr2;
                } else {
                    sArr = new Object[]{sArr2, Integer.valueOf(i11), zzgabVar2};
                    i2 = i;
                }
            } else {
                ?? r0 = new int[zzh];
                Arrays.fill((int[]) r0, -1);
                int i17 = 0;
                zzgab zzgabVar3 = null;
                for (int i18 = 0; i18 < i; i18++) {
                    int i19 = i17 + i17;
                    int i20 = i18 + i18;
                    Object obj11 = objArr[i20];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr[i20 ^ 1];
                    Objects.requireNonNull(obj12);
                    zzfyx.zzb(obj11, obj12);
                    int zza4 = zzfzs.zza(obj11.hashCode());
                    while (true) {
                        int i21 = zza4 & i3;
                        ?? r02 = r0[i21];
                        if (r02 == -1) {
                            r0[i21] = i19;
                            if (i17 < i18) {
                                objArr[i19] = obj11;
                                objArr[i19 ^ 1] = obj12;
                            }
                            i17++;
                        } else {
                            if (obj11.equals(objArr[r02])) {
                                int i22 = r02 ^ 1;
                                Object obj13 = objArr[i22];
                                Objects.requireNonNull(obj13);
                                zzgabVar3 = new zzgab(obj11, obj12, obj13);
                                objArr[i22] = obj12;
                                break;
                            }
                            zza4 = i21 + 1;
                        }
                    }
                }
                if (i17 == i) {
                    sArr = r0;
                } else {
                    sArr = new Object[]{r0, Integer.valueOf(i17), zzgabVar3};
                    i2 = i;
                }
            }
            i2 = i;
        }
        Object[] objArr2 = objArr;
        short[] sArr3 = sArr;
        if (sArr instanceof Object[]) {
            ?? r03 = (Object[]) sArr;
            zzgab zzgabVar4 = (zzgab) r03[2];
            if (zzgacVar == null) {
                throw zzgabVar4.zza();
            }
            zzgacVar.zzc = zzgabVar4;
            sArr3 = r03[0];
            i2 = ((Integer) r03[1]).intValue();
            objArr2 = Arrays.copyOf(objArr, i2 + i2);
        }
        return new zzgbp(sArr3, objArr2, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x012b  */
    @Override // com.google.android.gms.internal.ads.zzgad, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgbp.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    final zzfzv zza() {
        return new zzgbo(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    final zzgaf zzf() {
        return new zzgbm(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    final zzgaf zzg() {
        return new zzgbn(this, new zzgbo(this.zzb, 0, this.zzd));
    }
}
