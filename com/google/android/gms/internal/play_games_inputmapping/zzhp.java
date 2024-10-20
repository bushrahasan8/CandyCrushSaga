package com.google.android.gms.internal.play_games_inputmapping;

/* loaded from: zzhp.class */
final class zzhp extends zzho {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v38, types: [int] */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzho
    final int zzb(int i, byte[] bArr, int i2, int i3) {
        byte b;
        int i4 = 0;
        while (i4 < i3 && bArr[i4] >= 0) {
            i4++;
        }
        int i5 = i4;
        if (i4 >= i3) {
            b = 0;
        } else {
            while (true) {
                int i6 = i5;
                if (i6 >= i3) {
                    b = 0;
                    break;
                }
                int i7 = i6 + 1;
                b = bArr[i6];
                if (b >= 0) {
                    i5 = i7;
                } else if (b >= -32) {
                    if (b >= -16) {
                        if (i7 < i3 - 2) {
                            byte b2 = bArr[i7];
                            if (b2 > -65 || (((b << 28) + (b2 + 112)) >> 30) != 0 || bArr[i6 + 2] > -65) {
                                break;
                            }
                            i5 = i6 + 4;
                            if (bArr[i6 + 3] > -65) {
                                break;
                            }
                        } else {
                            b = zzhr.zze(bArr, i7, i3);
                            break;
                        }
                    } else if (i7 < i3 - 1) {
                        byte b3 = bArr[i7];
                        if (b3 > -65 || ((b == -32 && b3 < -96) || (b == -19 && b3 >= -96))) {
                            break;
                        }
                        i5 = i6 + 3;
                        if (bArr[i6 + 2] > -65) {
                            break;
                        }
                    } else {
                        b = zzhr.zze(bArr, i7, i3);
                        break;
                    }
                } else if (i7 < i3) {
                    if (b < -62) {
                        break;
                    }
                    i5 = i6 + 2;
                    if (bArr[i7] > -65) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return b;
    }
}
