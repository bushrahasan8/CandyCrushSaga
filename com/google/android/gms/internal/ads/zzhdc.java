package com.google.android.gms.internal.ads;

/* loaded from: zzhdc.class */
final class zzhdc extends zzhdb {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v39, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzhdb
    public final int zza(int i, byte[] bArr, int i2, int i3) {
        byte b;
        int i4;
        int i5;
        int zzl;
        int zzk;
        int zzk2;
        int i6 = i2;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 >= -32) {
                int i7 = (i >> 8) ^ (-1);
                if (b2 < -16) {
                    byte b3 = (byte) i7;
                    byte b4 = b3;
                    int i8 = i2;
                    if (b3 == 0) {
                        i8 = i2 + 1;
                        b4 = bArr[i2];
                        if (i8 >= i3) {
                            zzk2 = zzhde.zzk(b2, b4);
                            return zzk2;
                        }
                    }
                    if (b4 > -65) {
                        return -1;
                    }
                    if (b2 == -32 && b4 < -96) {
                        return -1;
                    }
                    if (b2 == -19 && b4 >= -96) {
                        return -1;
                    }
                    i5 = i8 + 1;
                    if (bArr[i8] > -65) {
                        return -1;
                    }
                } else {
                    byte b5 = (byte) i7;
                    if (b5 == 0) {
                        int i9 = i2 + 1;
                        b5 = bArr[i2];
                        if (i9 >= i3) {
                            zzk = zzhde.zzk(b2, b5);
                            return zzk;
                        }
                        i2 = i9;
                        i4 = 0;
                    } else {
                        i4 = i >> 16;
                    }
                    int i10 = i4;
                    int i11 = i2;
                    if (i4 == 0) {
                        i11 = i2 + 1;
                        i10 = bArr[i2];
                        if (i11 >= i3) {
                            zzl = zzhde.zzl(b2, b5, i10);
                            return zzl;
                        }
                    }
                    if (b5 > -65 || (((b2 << 28) + (b5 + 112)) >> 30) != 0 || i10 > -65) {
                        return -1;
                    }
                    i5 = i11 + 1;
                    if (bArr[i11] > -65) {
                        return -1;
                    }
                }
            } else {
                if (b2 < -62) {
                    return -1;
                }
                i5 = i2 + 1;
                if (bArr[i2] > -65) {
                    return -1;
                }
            }
            i6 = i5;
        }
        while (i6 < i3 && bArr[i6] >= 0) {
            i6++;
        }
        int i12 = i6;
        if (i6 >= i3) {
            b = 0;
        } else {
            while (true) {
                int i13 = i12;
                if (i13 >= i3) {
                    b = 0;
                    break;
                }
                int i14 = i13 + 1;
                b = bArr[i13];
                if (b >= 0) {
                    i12 = i14;
                } else if (b >= -32) {
                    if (b >= -16) {
                        if (i14 < i3 - 2) {
                            byte b6 = bArr[i14];
                            if (b6 > -65 || (((b << 28) + (b6 + 112)) >> 30) != 0 || bArr[i13 + 2] > -65) {
                                break;
                            }
                            i12 = i13 + 4;
                            if (bArr[i13 + 3] > -65) {
                                break;
                            }
                        } else {
                            b = zzhde.zzc(bArr, i14, i3);
                            break;
                        }
                    } else if (i14 < i3 - 1) {
                        byte b7 = bArr[i14];
                        if (b7 > -65 || ((b == -32 && b7 < -96) || (b == -19 && b7 >= -96))) {
                            break;
                        }
                        i12 = i13 + 3;
                        if (bArr[i13 + 2] > -65) {
                            break;
                        }
                    } else {
                        b = zzhde.zzc(bArr, i14, i3);
                        break;
                    }
                } else {
                    if (i14 >= i3) {
                        break;
                    }
                    if (b < -62) {
                        break;
                    }
                    i12 = i13 + 2;
                    if (bArr[i14] > -65) {
                        break;
                    }
                }
            }
            b = -1;
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzhdb
    public final String zzb(byte[] bArr, int i, int i2) throws zzhag {
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!zzhda.zzd(b)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (zzhda.zzd(b2)) {
                cArr[i4] = (char) b2;
                int i6 = i4 + 1;
                while (true) {
                    i4 = i6;
                    i = i5;
                    if (i5 < i3) {
                        byte b3 = bArr[i5];
                        i4 = i6;
                        i = i5;
                        if (zzhda.zzd(b3)) {
                            i5++;
                            cArr[i6] = (char) b3;
                            i6++;
                        }
                    }
                }
            } else if (zzhda.zzf(b2)) {
                if (i5 >= i3) {
                    throw zzhag.zzd();
                }
                i += 2;
                zzhda.zzc(b2, bArr[i5], cArr, i4);
                i4++;
            } else if (zzhda.zze(b2)) {
                if (i5 >= i3 - 1) {
                    throw zzhag.zzd();
                }
                zzhda.zzb(b2, bArr[i5], bArr[i + 2], cArr, i4);
                i4++;
                i += 3;
            } else {
                if (i5 >= i3 - 2) {
                    throw zzhag.zzd();
                }
                zzhda.zza(b2, bArr[i5], bArr[i + 2], bArr[i + 3], cArr, i4);
                i4 += 2;
                i += 4;
            }
        }
        return new String(cArr, 0, i4);
    }
}
