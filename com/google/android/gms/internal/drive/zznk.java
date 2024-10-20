package com.google.android.gms.internal.drive;

/* loaded from: zznk.class */
final class zznk extends zznh {
    private static int zza(byte[] bArr, int i, long j, int i2) {
        int zzay;
        int zzr;
        int zzc;
        if (i2 == 0) {
            zzay = zznf.zzay(i);
            return zzay;
        }
        if (i2 == 1) {
            zzr = zznf.zzr(i, zznd.zza(bArr, j));
            return zzr;
        }
        if (i2 != 2) {
            throw new AssertionError();
        }
        zzc = zznf.zzc(i, zznd.zza(bArr, j), zznd.zza(bArr, j + 1));
        return zzc;
    }

    @Override // com.google.android.gms.internal.drive.zznh
    final int zzb(int i, byte[] bArr, int i2, int i3) {
        int i4;
        long j;
        if ((i2 | i3 | (bArr.length - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        long j2 = i2;
        int i5 = (int) (i3 - j2);
        if (i5 >= 16) {
            i4 = 0;
            long j3 = j2;
            while (true) {
                long j4 = j3;
                if (i4 >= i5) {
                    i4 = i5;
                    break;
                }
                if (zznd.zza(bArr, j4) < 0) {
                    break;
                }
                i4++;
                j3 = j4 + 1;
            }
        } else {
            i4 = 0;
        }
        long j5 = j2 + i4;
        int i6 = i5 - i4;
        while (true) {
            byte b = 0;
            while (true) {
                j = j5;
                if (i6 <= 0) {
                    break;
                }
                j = j5 + 1;
                b = zznd.zza(bArr, j5);
                if (b < 0) {
                    break;
                }
                i6--;
                j5 = j;
            }
            if (i6 == 0) {
                return 0;
            }
            int i7 = i6 - 1;
            if (b < -32) {
                if (i7 == 0) {
                    return b;
                }
                i6 -= 2;
                if (b < -62 || zznd.zza(bArr, j) > -65) {
                    return -1;
                }
                j5 = j + 1;
            } else if (b < -16) {
                if (i7 < 2) {
                    return zza(bArr, b, j, i7);
                }
                i6 -= 3;
                byte zza = zznd.zza(bArr, j);
                if (zza > -65) {
                    return -1;
                }
                if (b == -32 && zza < -96) {
                    return -1;
                }
                if (b == -19 && zza >= -96) {
                    return -1;
                }
                j5 = j + 2;
                if (zznd.zza(bArr, j + 1) > -65) {
                    return -1;
                }
            } else {
                if (i7 < 3) {
                    return zza(bArr, b, j, i7);
                }
                i6 -= 4;
                byte zza2 = zznd.zza(bArr, j);
                if (zza2 > -65 || (((b << 28) + (zza2 + 112)) >> 30) != 0 || zznd.zza(bArr, j + 1) > -65) {
                    return -1;
                }
                j5 = j + 3;
                if (zznd.zza(bArr, j + 2) > -65) {
                    return -1;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.drive.zznh
    public final int zzb(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        long j2;
        int i3;
        char charAt;
        long j3 = i;
        long j4 = i2 + j3;
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            j = 1;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            zznd.zza(bArr, j3, (byte) charAt);
            i4++;
            j3 = 1 + j3;
        }
        int i5 = i4;
        long j5 = j3;
        if (i4 == length) {
            return (int) j3;
        }
        while (i5 < length) {
            char charAt3 = charSequence.charAt(i5);
            if (charAt3 >= 128 || j5 >= j4) {
                if (charAt3 < 2048 && j5 <= j4 - 2) {
                    zznd.zza(bArr, j5, (byte) ((charAt3 >>> 6) | 960));
                    j2 = j5 + 2;
                    zznd.zza(bArr, j5 + j, (byte) ((charAt3 & '?') | 128));
                } else {
                    if ((charAt3 >= 55296 && 57343 >= charAt3) || j5 > j4 - 3) {
                        if (j5 > j4 - 4) {
                            if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i5 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                                throw new zznj(i5, length);
                            }
                            StringBuilder sb2 = new StringBuilder(46);
                            sb2.append("Failed writing ");
                            sb2.append(charAt3);
                            sb2.append(" at index ");
                            sb2.append(j5);
                            throw new ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                        int i6 = i5 + 1;
                        if (i6 != length) {
                            char charAt4 = charSequence.charAt(i6);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                j = 1;
                                zznd.zza(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                zznd.zza(bArr, j5 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                zznd.zza(bArr, j5 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j2 = j5 + 4;
                                zznd.zza(bArr, j5 + 3, (byte) ((codePoint & 63) | 128));
                                i5 = i6;
                            } else {
                                i5 = i6;
                            }
                        }
                        throw new zznj(i5 - 1, length);
                    }
                    zznd.zza(bArr, j5, (byte) ((charAt3 >>> '\f') | 480));
                    zznd.zza(bArr, j5 + 1, (byte) (((charAt3 >>> 6) & 63) | 128));
                    j2 = j5 + 3;
                    zznd.zza(bArr, j5 + 2, (byte) ((charAt3 & '?') | 128));
                }
                j = 1;
            } else {
                zznd.zza(bArr, j5, (byte) charAt3);
                j2 = j5 + j;
                j = j;
            }
            i5++;
            j5 = j2;
        }
        return (int) j5;
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
            byte zza = zznd.zza(bArr, i);
            zzd3 = zzng.zzd(zza);
            if (!zzd3) {
                break;
            }
            i++;
            zzng.zza(zza, cArr, i4);
            i4++;
        }
        while (true) {
            int i5 = i;
            if (i5 >= i3) {
                return new String(cArr, 0, i4);
            }
            i = i5 + 1;
            byte zza2 = zznd.zza(bArr, i5);
            zzd = zzng.zzd(zza2);
            if (zzd) {
                zzng.zza(zza2, cArr, i4);
                i4++;
                while (i < i3) {
                    byte zza3 = zznd.zza(bArr, i);
                    zzd2 = zzng.zzd(zza3);
                    if (zzd2) {
                        i++;
                        zzng.zza(zza3, cArr, i4);
                        i4++;
                    }
                }
            } else {
                zze = zzng.zze(zza2);
                if (!zze) {
                    zzf = zzng.zzf(zza2);
                    if (zzf) {
                        if (i >= i3 - 1) {
                            throw zzkq.zzdn();
                        }
                        byte zza4 = zznd.zza(bArr, i);
                        i = i5 + 3;
                        zzng.zza(zza2, zza4, zznd.zza(bArr, i5 + 2), cArr, i4);
                        i4++;
                    } else {
                        if (i >= i3 - 2) {
                            throw zzkq.zzdn();
                        }
                        i = i5 + 4;
                        zzng.zza(zza2, zznd.zza(bArr, i), zznd.zza(bArr, i5 + 2), zznd.zza(bArr, i5 + 3), cArr, i4);
                        i4 += 2;
                    }
                } else {
                    if (i >= i3) {
                        throw zzkq.zzdn();
                    }
                    zzng.zza(zza2, zznd.zza(bArr, i), cArr, i4);
                    i4++;
                    i = i5 + 2;
                }
            }
        }
    }
}
