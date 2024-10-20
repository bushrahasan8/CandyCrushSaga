package com.google.android.gms.internal.play_games_inputmapping;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzhr.class */
public final class zzhr {
    private static final zzho zza;

    static {
        if (zzhn.zza() && zzhn.zzb()) {
            int i = zzea.zza;
        }
        zza = new zzhp();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(byte[] bArr) {
        return zza.zza(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzb(byte[] bArr, int i, int i2) {
        return zza.zza(bArr, 0, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(CharSequence charSequence) {
        int i;
        int i2;
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            i = i4;
            if (i3 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                int i5 = 0;
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
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
                                if (Character.codePointAt(charSequence, i3) < 65536) {
                                    throw new zzhq(i3, length2);
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
        long j = i + 4294967296L;
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 34);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = charSequence.length();
        int i6 = i2 + i;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) charAt;
            i7++;
        }
        if (i7 != length) {
            int i8 = i + i7;
            while (true) {
                i3 = i8;
                if (i7 >= length) {
                    break;
                }
                char charAt2 = charSequence.charAt(i7);
                if (charAt2 < 128 && i8 < i6) {
                    bArr[i8] = (byte) charAt2;
                    i8++;
                } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                    bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                    bArr[i8 + 1] = (byte) ((charAt2 & '?') | 128);
                    i8 += 2;
                } else if ((charAt2 < 55296 || charAt2 > 57343) && i8 <= i6 - 3) {
                    bArr[i8] = (byte) ((charAt2 >>> '\f') | 480);
                    bArr[i8 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    bArr[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    i8 += 3;
                } else {
                    if (i8 > i6 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                            throw new zzhq(i7, length);
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(charAt2).length() + 25 + String.valueOf(i8).length());
                        sb.append("Failed writing ");
                        sb.append(charAt2);
                        sb.append(" at index ");
                        sb.append(i8);
                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                    }
                    int i9 = i7 + 1;
                    if (i9 == charSequence.length()) {
                        break;
                    }
                    char charAt3 = charSequence.charAt(i9);
                    if (!Character.isSurrogatePair(charAt2, charAt3)) {
                        i7 = i9;
                        break;
                    }
                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                    bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                    bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                    bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                    bArr[i8 + 3] = (byte) ((codePoint & 63) | 128);
                    i7 = i9;
                    i8 += 4;
                }
                i7++;
            }
            throw new zzhq(i7 - 1, length);
        }
        i3 = i + length;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r0 > (-12)) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ int zze(byte[] r4, int r5, int r6) {
        /*
            r0 = r4
            r1 = r5
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r7 = r0
            r0 = r6
            r1 = r5
            int r0 = r0 - r1
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L6d
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L50
            r0 = r6
            r1 = 2
            if (r0 != r1) goto L48
            r0 = r4
            r1 = r5
            r0 = r0[r1]
            r6 = r0
            r0 = r4
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r5 = r0
            r0 = r7
            r1 = -12
            if (r0 > r1) goto L34
            r0 = r6
            r1 = -65
            if (r0 > r1) goto L34
            r0 = r5
            r1 = -65
            if (r0 <= r1) goto L39
        L34:
            r0 = -1
            r5 = r0
            goto L78
        L39:
            r0 = r6
            r1 = 8
            int r0 = r0 << r1
            r1 = r7
            r0 = r0 ^ r1
            r1 = r5
            r2 = 16
            int r1 = r1 << r2
            r0 = r0 ^ r1
            r5 = r0
            goto L78
        L48:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L50:
            r0 = r4
            r1 = r5
            r0 = r0[r1]
            r5 = r0
            r0 = r7
            r1 = -12
            if (r0 > r1) goto L34
            r0 = r5
            r1 = -65
            if (r0 <= r1) goto L63
            goto L34
        L63:
            r0 = r7
            r1 = r5
            r2 = 8
            int r1 = r1 << r2
            r0 = r0 ^ r1
            r5 = r0
            goto L78
        L6d:
            r0 = r7
            r5 = r0
            r0 = r7
            r1 = -12
            if (r0 <= r1) goto L78
            goto L34
        L78:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_games_inputmapping.zzhr.zze(byte[], int, int):int");
    }
}
