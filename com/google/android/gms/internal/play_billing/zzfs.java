package com.google.android.gms.internal.play_billing;

/* loaded from: zzfs.class */
final class zzfs extends zzfr {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    @Override // com.google.android.gms.internal.play_billing.zzfr
    final int zza(int i, byte[] bArr, int i2, int i3) {
        byte b;
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        int i4 = i2;
        if (i2 >= i3) {
            b = 0;
        } else {
            while (true) {
                int i5 = i4;
                if (i5 >= i3) {
                    b = 0;
                    break;
                }
                int i6 = i5 + 1;
                b = bArr[i5];
                if (b >= 0) {
                    i4 = i6;
                } else if (b >= -32) {
                    if (b >= -16) {
                        if (i6 < i3 - 2) {
                            byte b2 = bArr[i6];
                            if (b2 > -65 || (((b << 28) + (b2 + 112)) >> 30) != 0 || bArr[i5 + 2] > -65) {
                                break;
                            }
                            i4 = i5 + 4;
                            if (bArr[i5 + 3] > -65) {
                                break;
                            }
                        } else {
                            b = zzfu.zza(bArr, i6, i3);
                            break;
                        }
                    } else if (i6 < i3 - 1) {
                        byte b3 = bArr[i6];
                        if (b3 > -65 || ((b == -32 && b3 < -96) || (b == -19 && b3 >= -96))) {
                            break;
                        }
                        i4 = i5 + 3;
                        if (bArr[i5 + 2] > -65) {
                            break;
                        }
                    } else {
                        b = zzfu.zza(bArr, i6, i3);
                        break;
                    }
                } else {
                    if (i6 >= i3) {
                        break;
                    }
                    if (b < -62) {
                        break;
                    }
                    i4 = i5 + 2;
                    if (bArr[i6] > -65) {
                        break;
                    }
                }
            }
        }
        return b;
    }
}
