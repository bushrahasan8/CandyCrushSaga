package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzat.class */
public final class zzat extends zzal {
    static final zzal zza = new zzat(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzat(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v125, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v172, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v174 */
    /* JADX WARN: Type inference failed for: r0v181 */
    /* JADX WARN: Type inference failed for: r0v183 */
    /* JADX WARN: Type inference failed for: r0v21, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object[]] */
    public static zzat zzg(int i, Object[] objArr, zzak zzakVar) {
        int i2;
        if (i == 0) {
            return (zzat) zza;
        }
        short[] sArr = null;
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            zzad.zza(obj, obj2);
            return new zzat(null, objArr, 1);
        }
        zzaa.zzb(i, objArr.length >> 1, "index");
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
                i2 = highestOneBit;
            } while (highestOneBit * 0.7d < max);
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArr[1];
            Objects.requireNonNull(obj4);
            zzad.zza(obj3, obj4);
            i = 1;
        } else {
            int i3 = i2 - 1;
            if (i2 <= 128) {
                byte[] bArr = new byte[i2];
                Arrays.fill(bArr, (byte) -1);
                int i4 = 0;
                zzaj zzajVar = null;
                for (int i5 = 0; i5 < i; i5++) {
                    int i6 = i4 + i4;
                    int i7 = i5 + i5;
                    Object obj5 = objArr[i7];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArr[i7 ^ 1];
                    Objects.requireNonNull(obj6);
                    zzad.zza(obj5, obj6);
                    int zza2 = zzae.zza(obj5.hashCode());
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
                                zzajVar = new zzaj(obj5, obj6, obj7);
                                objArr[i10] = obj6;
                                break;
                            }
                            zza2 = i8 + 1;
                        }
                    }
                }
                sArr = i4 == i ? bArr : new Object[]{bArr, Integer.valueOf(i4), zzajVar};
            } else if (i2 <= 32768) {
                short[] sArr2 = new short[i2];
                Arrays.fill(sArr2, (short) -1);
                int i11 = 0;
                zzaj zzajVar2 = null;
                for (int i12 = 0; i12 < i; i12++) {
                    int i13 = i11 + i11;
                    int i14 = i12 + i12;
                    Object obj8 = objArr[i14];
                    Objects.requireNonNull(obj8);
                    Object obj9 = objArr[i14 ^ 1];
                    Objects.requireNonNull(obj9);
                    zzad.zza(obj8, obj9);
                    int zza3 = zzae.zza(obj8.hashCode());
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
                                zzajVar2 = new zzaj(obj8, obj9, obj10);
                                objArr[i16] = obj9;
                                break;
                            }
                            zza3 = i15 + 1;
                        }
                    }
                }
                sArr = i11 == i ? sArr2 : new Object[]{sArr2, Integer.valueOf(i11), zzajVar2};
            } else {
                ?? r0 = new int[i2];
                Arrays.fill((int[]) r0, -1);
                int i17 = 0;
                zzaj zzajVar3 = null;
                for (int i18 = 0; i18 < i; i18++) {
                    int i19 = i17 + i17;
                    int i20 = i18 + i18;
                    Object obj11 = objArr[i20];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArr[i20 ^ 1];
                    Objects.requireNonNull(obj12);
                    zzad.zza(obj11, obj12);
                    int zza4 = zzae.zza(obj11.hashCode());
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
                                zzajVar3 = new zzaj(obj11, obj12, obj13);
                                objArr[i22] = obj12;
                                break;
                            }
                            zza4 = i21 + 1;
                        }
                    }
                }
                sArr = i17 == i ? r0 : new Object[]{r0, Integer.valueOf(i17), zzajVar3};
            }
        }
        Object[] objArr2 = objArr;
        short[] sArr3 = sArr;
        if (sArr instanceof Object[]) {
            ?? r03 = (Object[]) sArr;
            zzaj zzajVar4 = (zzaj) r03[2];
            if (zzakVar == null) {
                throw zzajVar4.zza();
            }
            zzakVar.zzc = zzajVar4;
            sArr3 = r03[0];
            i = ((Integer) r03[1]).intValue();
            objArr2 = Arrays.copyOf(objArr, i + i);
        }
        return new zzat(sArr3, objArr2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x012d  */
    @Override // com.google.android.gms.internal.play_billing.zzal, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzat.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzal
    final zzaf zza() {
        return new zzas(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzal
    final zzam zzd() {
        return new zzaq(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzal
    final zzam zze() {
        return new zzar(this, new zzas(this.zzb, 0, this.zzd));
    }
}
