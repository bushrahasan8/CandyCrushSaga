package com.google.android.gms.internal.drive;

/* loaded from: zzni.class */
final class zzni extends zznh {
    @Override // com.google.android.gms.internal.drive.zznh
    final int zzb(int i, byte[] bArr, int i2, int i3) {
        int zzf;
        int zzf2;
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
                    zzf = zznf.zzf(bArr, i6, i3);
                    return zzf;
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
                    zzf2 = zznf.zzf(bArr, i6, i3);
                    return zzf2;
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
    @Override // com.google.android.gms.internal.drive.zznh
    public final int zzb(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char charAt;
        int length = charSequence.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (charAt = charSequence.charAt(i6)) < 128) {
            bArr[i4] = (byte) charAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char charAt2 = charSequence.charAt(i6);
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
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i6 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                            throw new zznj(i6, length);
                        }
                        StringBuilder sb = new StringBuilder(37);
                        sb.append("Failed writing ");
                        sb.append(charAt2);
                        sb.append(" at index ");
                        sb.append(i7);
                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                    }
                    int i8 = i6 + 1;
                    if (i8 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i8);
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
                    throw new zznj(i6 - 1, length);
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
    @Override // com.google.android.gms.internal.drive.zznh
    public final String zzg(byte[] bArr, int i, int i2) throws zzkq {
        boolean zzd;
        boolean zzd2;
        boolean zze;
        boolean zzf;
        boolean zzd3;
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            zzd3 = zzng.zzd(b);
            if (!zzd3) {
                break;
            }
            i++;
            zzng.zza(b, cArr, i4);
            i4++;
        }
        while (true) {
            int i5 = i;
            if (i5 >= i3) {
                return new String(cArr, 0, i4);
            }
            i = i5 + 1;
            byte b2 = bArr[i5];
            zzd = zzng.zzd(b2);
            if (zzd) {
                zzng.zza(b2, cArr, i4);
                i4++;
                while (i < i3) {
                    byte b3 = bArr[i];
                    zzd2 = zzng.zzd(b3);
                    if (zzd2) {
                        i++;
                        zzng.zza(b3, cArr, i4);
                        i4++;
                    }
                }
            } else {
                zze = zzng.zze(b2);
                if (!zze) {
                    zzf = zzng.zzf(b2);
                    if (zzf) {
                        if (i >= i3 - 1) {
                            throw zzkq.zzdn();
                        }
                        byte b4 = bArr[i];
                        i = i5 + 3;
                        zzng.zza(b2, b4, bArr[i5 + 2], cArr, i4);
                        i4++;
                    } else {
                        if (i >= i3 - 2) {
                            throw zzkq.zzdn();
                        }
                        i = i5 + 4;
                        zzng.zza(b2, bArr[i], bArr[i5 + 2], bArr[i5 + 3], cArr, i4);
                        i4 += 2;
                    }
                } else {
                    if (i >= i3) {
                        throw zzkq.zzdn();
                    }
                    zzng.zza(b2, bArr[i], cArr, i4);
                    i4++;
                    i = i5 + 2;
                }
            }
        }
    }
}
