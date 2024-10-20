package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzhde.class */
public final class zzhde {
    private static final zzhdb zza;

    static {
        if (zzhcz.zzA() && zzhcz.zzB()) {
            int i = zzgxw.zza;
        }
        zza = new zzhdc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    public static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i, int i2) {
        byte b;
        int i3 = i2 - i;
        byte b2 = bArr[i - 1];
        if (i3 == 0) {
            b = b2;
            if (b2 > -12) {
                b = -1;
            }
        } else if (i3 == 1) {
            b = zzk(b2, bArr[i]);
        } else {
            if (i3 != 2) {
                throw new AssertionError();
            }
            b = zzl(b2, bArr[i], bArr[i + 1]);
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt;
        int length = str.length();
        int i7 = 0;
        while (true) {
            i3 = i + i2;
            if (i7 >= length || (i6 = i7 + i) >= i3 || (charAt = str.charAt(i7)) >= 128) {
                break;
            }
            bArr[i6] = (byte) charAt;
            i7++;
        }
        if (i7 != length) {
            int i8 = i + i7;
            int i9 = i7;
            while (true) {
                i4 = i8;
                if (i9 >= length) {
                    break;
                }
                char charAt2 = str.charAt(i9);
                if (charAt2 < 128 && i8 < i3) {
                    bArr[i8] = (byte) charAt2;
                    i8++;
                } else if (charAt2 < 2048 && i8 <= i3 - 2) {
                    bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                    bArr[i8 + 1] = (byte) ((charAt2 & '?') | 128);
                    i8 += 2;
                } else if ((charAt2 < 55296 || charAt2 > 57343) && i8 <= i3 - 3) {
                    bArr[i8] = (byte) ((charAt2 >>> '\f') | 480);
                    bArr[i8 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    bArr[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    i8 += 3;
                } else {
                    if (i8 > i3 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i5 = i9 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i5)))) {
                            throw new zzhdd(i9, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
                    }
                    int i10 = i9 + 1;
                    if (i10 == str.length()) {
                        break;
                    }
                    char charAt3 = str.charAt(i10);
                    if (!Character.isSurrogatePair(charAt2, charAt3)) {
                        i9 = i10;
                        break;
                    }
                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                    bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                    bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                    bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                    bArr[i8 + 3] = (byte) ((codePoint & 63) | 128);
                    i9 = i10;
                    i8 += 4;
                }
                i9++;
            }
            throw new zzhdd(i9 - 1, length);
        }
        i4 = i + length;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(String str) {
        int i;
        int i2;
        int length = str.length();
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            i = i4;
            if (i3 >= length) {
                break;
            }
            char charAt = str.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = str.length();
                int i5 = 0;
                while (i3 < length2) {
                    char charAt2 = str.charAt(i3);
                    if (charAt2 < 2048) {
                        i5 += (127 - charAt2) >>> 31;
                        i2 = i3;
                    } else {
                        int i6 = i5 + 2;
                        i5 = i6;
                        i2 = i3;
                        if (charAt2 >= 55296) {
                            i5 = i6;
                            i2 = i3;
                            if (charAt2 > 57343) {
                                continue;
                            } else {
                                if (Character.codePointAt(str, i3) < 65536) {
                                    throw new zzhdd(i3, length2);
                                }
                                i2 = i3 + 1;
                                i5 = i6;
                            }
                        } else {
                            continue;
                        }
                    }
                    i3 = i2 + 1;
                }
                i = i4 + i5;
            }
        }
        if (i >= length) {
            return i;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i + 4294967296L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(int i, byte[] bArr, int i2, int i3) {
        return zza.zza(i, bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzg(ByteBuffer byteBuffer, int i, int i2) throws zzhag {
        return byteBuffer.hasArray() ? zza.zzb(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2) : byteBuffer.isDirect() ? zzhdb.zzd(byteBuffer, i, i2) : zzhdb.zzd(byteBuffer, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzh(byte[] bArr, int i, int i2) throws zzhag {
        return zza.zzb(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzi(byte[] bArr) {
        return zza.zzc(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzj(byte[] bArr, int i, int i2) {
        return zza.zzc(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
