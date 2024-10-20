package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: zzgm.class */
public final class zzgm {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        zzek.zzf(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            zzf(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            zzf(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            zzf(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            int i6 = i5;
            if ((b & 254) == 0) {
                i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    zzf(zArr);
                    return i6;
                }
            }
            i5 = i6 + 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 - 2] == 0 && bArr[i4] == 1)) : bArr[i2 - 3] == 0 && bArr[i2 - 2] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 - 2] == 0 && bArr[i4] == 0;
        boolean z = false;
        if (bArr[i4] == 0) {
            z = true;
        }
        zArr[2] = z;
        return i2;
    }

    public static int zzb(byte[] bArr, int i) {
        int i2;
        synchronized (zzc) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = i3;
                if (i3 >= i) {
                    break;
                }
                while (true) {
                    if (i5 >= i - 2) {
                        i5 = i;
                        break;
                    }
                    int i6 = i5 + 1;
                    if (bArr[i5] == 0 && bArr[i6] == 0 && bArr[i5 + 2] == 3) {
                        break;
                    }
                    i5 = i6;
                }
                i3 = i5;
                if (i5 < i) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i4) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i4] = i5;
                    i3 = i5 + 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < i4; i9++) {
                int i10 = zzd[i9] - i7;
                System.arraycopy(bArr, i7, bArr, i8, i10);
                int i11 = i8 + i10;
                bArr[i11] = 0;
                i8 = i11 + 2;
                bArr[i11 + 1] = 0;
                i7 += i10 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i8, i2 - i8);
        }
        return i2;
    }

    public static zzgj zzc(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        zzgn zzgnVar = new zzgn(bArr, i, i2);
        zzgnVar.zze(4);
        int zza2 = zzgnVar.zza(3);
        zzgnVar.zzd();
        int zza3 = zzgnVar.zza(2);
        boolean zzf = zzgnVar.zzf();
        int zza4 = zzgnVar.zza(5);
        int i14 = 0;
        int i15 = 0;
        while (i15 < 32) {
            int i16 = i14;
            if (zzgnVar.zzf()) {
                i16 = i14 | (1 << i15);
            }
            i15++;
            i14 = i16;
        }
        int[] iArr = new int[6];
        for (int i17 = 0; i17 < 6; i17++) {
            iArr[i17] = zzgnVar.zza(8);
        }
        int zza5 = zzgnVar.zza(8);
        int i18 = 0;
        for (int i19 = 0; i19 < zza2; i19++) {
            int i20 = i18;
            if (zzgnVar.zzf()) {
                i20 = i18 + 89;
            }
            i18 = i20;
            if (zzgnVar.zzf()) {
                i18 = i20 + 8;
            }
        }
        zzgnVar.zze(i18);
        if (zza2 > 0) {
            int i21 = 8 - zza2;
            zzgnVar.zze(i21 + i21);
        }
        int zzc2 = zzgnVar.zzc();
        int zzc3 = zzgnVar.zzc();
        int i22 = zzc3;
        if (zzc3 == 3) {
            zzgnVar.zzd();
            i22 = 3;
        }
        int zzc4 = zzgnVar.zzc();
        int zzc5 = zzgnVar.zzc();
        int i23 = i22;
        int i24 = zzc4;
        int i25 = zzc5;
        if (zzgnVar.zzf()) {
            int zzc6 = zzgnVar.zzc();
            int zzc7 = zzgnVar.zzc();
            int zzc8 = zzgnVar.zzc();
            int zzc9 = zzgnVar.zzc();
            if (i22 == 1) {
                i13 = 2;
            } else if (i22 == 2) {
                i22 = 2;
                i13 = 2;
            } else {
                i13 = 1;
            }
            i24 = zzc4 - (i13 * (zzc6 + zzc7));
            i25 = zzc5 - ((i22 == 1 ? 2 : 1) * (zzc8 + zzc9));
            i23 = i22;
        }
        int i26 = i25;
        int zzc10 = zzgnVar.zzc();
        int zzc11 = zzgnVar.zzc();
        int zzc12 = zzgnVar.zzc();
        for (int i27 = true != zzgnVar.zzf() ? zza2 : 0; i27 <= zza2; i27++) {
            zzgnVar.zzc();
            zzgnVar.zzc();
            zzgnVar.zzc();
        }
        zzgnVar.zzc();
        zzgnVar.zzc();
        zzgnVar.zzc();
        zzgnVar.zzc();
        zzgnVar.zzc();
        zzgnVar.zzc();
        if (zzgnVar.zzf() && zzgnVar.zzf()) {
            int i28 = 0;
            while (i28 < 4) {
                int i29 = 0;
                while (true) {
                    int i30 = i29;
                    if (i30 < 6) {
                        if (zzgnVar.zzf()) {
                            int min = Math.min(64, 1 << ((i28 + i28) + 4));
                            if (i28 > 1) {
                                zzgnVar.zzb();
                            }
                            for (int i31 = 0; i31 < min; i31++) {
                                zzgnVar.zzb();
                            }
                        } else {
                            zzgnVar.zzc();
                        }
                        i29 = i30 + (i28 == 3 ? 3 : 1);
                    }
                }
                i28++;
            }
        }
        zzgnVar.zze(2);
        if (zzgnVar.zzf()) {
            zzgnVar.zze(8);
            zzgnVar.zzc();
            zzgnVar.zzc();
            zzgnVar.zzd();
        }
        int zzc13 = zzgnVar.zzc();
        int i32 = 0;
        int[] iArr2 = new int[0];
        int[] iArr3 = new int[0];
        int i33 = -1;
        int i34 = -1;
        int i35 = i23;
        int i36 = i14;
        while (i32 < zzc13) {
            if (i32 == 0 || !zzgnVar.zzf()) {
                int zzc14 = zzgnVar.zzc();
                int zzc15 = zzgnVar.zzc();
                iArr2 = new int[zzc14];
                int i37 = 0;
                while (i37 < zzc14) {
                    iArr2[i37] = (i37 > 0 ? iArr2[i37 - 1] : 0) - (zzgnVar.zzc() + 1);
                    zzgnVar.zzd();
                    i37++;
                }
                iArr3 = new int[zzc15];
                int i38 = 0;
                while (i38 < zzc15) {
                    iArr3[i38] = (i38 > 0 ? iArr3[i38 - 1] : 0) + zzgnVar.zzc() + 1;
                    zzgnVar.zzd();
                    i38++;
                }
                i8 = zzc15;
                i9 = zzc14;
            } else {
                int i39 = i33 + i34;
                boolean zzf2 = zzgnVar.zzf();
                int zzc16 = zzgnVar.zzc();
                int i40 = i39 + 1;
                boolean[] zArr = new boolean[i40];
                for (int i41 = 0; i41 <= i39; i41++) {
                    if (zzgnVar.zzf()) {
                        zArr[i41] = true;
                    } else {
                        zArr[i41] = zzgnVar.zzf();
                    }
                }
                int i42 = i34 - 1;
                int[] iArr4 = new int[i40];
                int[] iArr5 = new int[i40];
                int i43 = 0;
                while (true) {
                    i10 = i43;
                    i11 = (1 - ((zzf2 ? 1 : 0) + (zzf2 ? 1 : 0))) * (zzc16 + 1);
                    if (i42 < 0) {
                        break;
                    }
                    int i44 = iArr3[i42] + i11;
                    int i45 = i10;
                    if (i44 < 0) {
                        i45 = i10;
                        if (zArr[i33 + i42]) {
                            iArr4[i10] = i44;
                            i45 = i10 + 1;
                        }
                    }
                    i42--;
                    i43 = i45;
                }
                int i46 = i10;
                if (i11 < 0) {
                    i46 = i10;
                    if (zArr[i39]) {
                        iArr4[i10] = i11;
                        i46 = i10 + 1;
                    }
                }
                int i47 = i46;
                int i48 = 0;
                while (i48 < i33) {
                    int i49 = iArr2[i48] + i11;
                    int i50 = i47;
                    if (i49 < 0) {
                        i50 = i47;
                        if (zArr[i48]) {
                            iArr4[i47] = i49;
                            i50 = i47 + 1;
                        }
                    }
                    i48++;
                    i47 = i50;
                }
                int[] copyOf = Arrays.copyOf(iArr4, i47);
                int i51 = i33 - 1;
                int i52 = 0;
                while (true) {
                    i12 = i52;
                    if (i51 < 0) {
                        break;
                    }
                    int i53 = iArr2[i51] + i11;
                    int i54 = i12;
                    if (i53 > 0) {
                        i54 = i12;
                        if (zArr[i51]) {
                            iArr5[i12] = i53;
                            i54 = i12 + 1;
                        }
                    }
                    i51--;
                    i52 = i54;
                }
                int i55 = i12;
                if (i11 > 0) {
                    i55 = i12;
                    if (zArr[i39]) {
                        iArr5[i12] = i11;
                        i55 = i12 + 1;
                    }
                }
                int i56 = i55;
                int i57 = 0;
                while (i57 < i34) {
                    int i58 = iArr3[i57] + i11;
                    int i59 = i56;
                    if (i58 > 0) {
                        i59 = i56;
                        if (zArr[i33 + i57]) {
                            iArr5[i56] = i58;
                            i59 = i56 + 1;
                        }
                    }
                    i57++;
                    i56 = i59;
                }
                iArr3 = Arrays.copyOf(iArr5, i56);
                int i60 = i56;
                iArr2 = copyOf;
                i9 = i47;
                i8 = i60;
            }
            i32++;
            i33 = i9;
            i34 = i8;
        }
        if (zzgnVar.zzf()) {
            int zzc17 = zzgnVar.zzc();
            for (int i61 = 0; i61 < zzc17; i61++) {
                zzgnVar.zze(zzc12 + 5);
            }
        }
        zzgnVar.zze(2);
        if (zzgnVar.zzf()) {
            f = 1.0f;
            if (zzgnVar.zzf()) {
                int zza6 = zzgnVar.zza(8);
                if (zza6 == 255) {
                    int zza7 = zzgnVar.zza(16);
                    int zza8 = zzgnVar.zza(16);
                    f = 1.0f;
                    if (zza7 != 0) {
                        f = 1.0f;
                        if (zza8 != 0) {
                            f = zza7 / zza8;
                        }
                    }
                } else if (zza6 < 17) {
                    f = zzb[zza6];
                } else {
                    zzff.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + zza6);
                    f = 1.0f;
                }
            }
            if (zzgnVar.zzf()) {
                zzgnVar.zzd();
            }
            if (zzgnVar.zzf()) {
                zzgnVar.zze(3);
                i6 = true != zzgnVar.zzf() ? 2 : 1;
                if (zzgnVar.zzf()) {
                    int zza9 = zzgnVar.zza(8);
                    int zza10 = zzgnVar.zza(8);
                    zzgnVar.zze(8);
                    i4 = zzt.zza(zza9);
                    i7 = zzt.zzb(zza10);
                } else {
                    i4 = -1;
                    i7 = -1;
                }
            } else {
                i4 = -1;
                i7 = -1;
                i6 = -1;
            }
            if (zzgnVar.zzf()) {
                zzgnVar.zzc();
                zzgnVar.zzc();
            }
            zzgnVar.zzd();
            int i62 = i26;
            if (zzgnVar.zzf()) {
                i62 = i26 + i26;
            }
            i5 = i7;
            i3 = i62;
        } else {
            i3 = i26;
            i4 = -1;
            i5 = -1;
            i6 = -1;
            f = 1.0f;
        }
        return new zzgj(zza3, zzf, zza4, i36, i35, zzc10, zzc11, iArr, zza5, zzc2, i24, i3, f, i4, i6, i5);
    }

    public static zzgk zzd(byte[] bArr, int i, int i2) {
        zzgn zzgnVar = new zzgn(bArr, 4, i2);
        int zzc2 = zzgnVar.zzc();
        int zzc3 = zzgnVar.zzc();
        zzgnVar.zzd();
        return new zzgk(zzc2, zzc3, zzgnVar.zzf());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzgl zze(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgm.zze(byte[], int, int):com.google.android.gms.internal.ads.zzgl");
    }

    public static void zzf(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
