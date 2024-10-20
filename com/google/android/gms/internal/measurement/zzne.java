package com.google.android.gms.internal.measurement;

/* loaded from: zzne.class */
final class zzne extends zznf {
    @Override // com.google.android.gms.internal.measurement.zznf
    final int zza(int i, byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        int i4 = i2;
        if (i2 >= i3) {
            return 0;
        }
        while (true) {
            int i5 = i4;
            if (i5 >= i3) {
                return 0;
            }
            int i6 = i5 + 1;
            byte b = bArr[i5];
            if (b >= 0) {
                i4 = i6;
            } else if (b < -32) {
                if (i6 >= i3) {
                    return b;
                }
                if (b < -62) {
                    return -1;
                }
                i4 = i5 + 2;
                if (bArr[i6] > -65) {
                    return -1;
                }
            } else if (b < -16) {
                if (i6 >= i3 - 1) {
                    return zznd.zza(bArr, i6, i3);
                }
                byte b2 = bArr[i6];
                if (b2 > -65) {
                    return -1;
                }
                if (b == -32 && b2 < -96) {
                    return -1;
                }
                if (b == -19 && b2 >= -96) {
                    return -1;
                }
                i4 = i5 + 3;
                if (bArr[i5 + 2] > -65) {
                    return -1;
                }
            } else {
                if (i6 >= i3 - 2) {
                    return zznd.zza(bArr, i6, i3);
                }
                byte b3 = bArr[i6];
                if (b3 > -65 || (((b << 28) + (b3 + 112)) >> 30) != 0 || bArr[i5 + 2] > -65) {
                    return -1;
                }
                i4 = i5 + 4;
                if (bArr[i5 + 3] > -65) {
                    return -1;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zznf
    public final int zza(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char charAt;
        int length = str.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (charAt = str.charAt(i6)) < 128) {
            bArr[i4] = (byte) charAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char charAt2 = str.charAt(i6);
            if (charAt2 < 128 && i7 < i5) {
                bArr[i7] = (byte) charAt2;
                i7++;
            } else if (charAt2 < 2048 && i7 <= i5 - 2) {
                bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                i7 += 2;
            } else {
                if ((charAt2 >= 55296 && 57343 >= charAt2) || i7 > i5 - 3) {
                    if (i7 > i5 - 4) {
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i3)))) {
                            throw new zznh(i6, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i7);
                    }
                    int i8 = i6 + 1;
                    if (i8 != str.length()) {
                        char charAt3 = str.charAt(i8);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            bArr[i7 + 3] = (byte) ((codePoint & 63) | 128);
                            i6 = i8;
                            i7 += 4;
                        } else {
                            i6 = i8;
                        }
                    }
                    throw new zznh(i6 - 1, length);
                }
                bArr[i7] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i7 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i7 + 2] = (byte) ((charAt2 & '?') | 128);
                i7 += 3;
            }
            i6++;
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zznf
    public final String zza(byte[] bArr, int i, int i2) throws zzkb {
        byte b;
        byte b2;
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3 && (b2 = bArr[i]) >= 0) {
            i++;
            zznc.zza(b2, cArr, i4);
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b3 = bArr[i];
            if (b3 >= 0) {
                int i6 = i4 + 1;
                zznc.zza(b3, cArr, i4);
                int i7 = i5;
                while (i7 < i3 && (b = bArr[i7]) >= 0) {
                    i7++;
                    zznc.zza(b, cArr, i6);
                    i6++;
                }
                int i8 = i7;
                i4 = i6;
                i = i8;
            } else if (b3 < -32) {
                if (i5 >= i3) {
                    throw zzkb.zzd();
                }
                i += 2;
                zznc.zza(b3, bArr[i5], cArr, i4);
                i4++;
            } else if (b3 < -16) {
                if (i5 >= i3 - 1) {
                    throw zzkb.zzd();
                }
                zznc.zza(b3, bArr[i5], bArr[i + 2], cArr, i4);
                i4++;
                i += 3;
            } else {
                if (i5 >= i3 - 2) {
                    throw zzkb.zzd();
                }
                zznc.zza(b3, bArr[i5], bArr[i + 2], bArr[i + 3], cArr, i4);
                i4 += 2;
                i += 4;
            }
        }
        return new String(cArr, 0, i4);
    }
}
