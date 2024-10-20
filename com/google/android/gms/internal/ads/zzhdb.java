package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: zzhdb.class */
abstract class zzhdb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String zzd(ByteBuffer byteBuffer, int i, int i2) throws zzhag {
        if ((((byteBuffer.limit() - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!zzhda.zzd(b)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (zzhda.zzd(b2)) {
                cArr[i4] = (char) b2;
                int i6 = i4 + 1;
                while (true) {
                    i4 = i6;
                    i = i5;
                    if (i5 < i3) {
                        byte b3 = byteBuffer.get(i5);
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
                zzhda.zzc(b2, byteBuffer.get(i5), cArr, i4);
                i4++;
            } else if (zzhda.zze(b2)) {
                if (i5 >= i3 - 1) {
                    throw zzhag.zzd();
                }
                zzhda.zzb(b2, byteBuffer.get(i5), byteBuffer.get(i + 2), cArr, i4);
                i4++;
                i += 3;
            } else {
                if (i5 >= i3 - 2) {
                    throw zzhag.zzd();
                }
                zzhda.zza(b2, byteBuffer.get(i5), byteBuffer.get(i + 2), byteBuffer.get(i + 3), cArr, i4);
                i4 += 2;
                i += 4;
            }
        }
        return new String(cArr, 0, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String zzb(byte[] bArr, int i, int i2) throws zzhag;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzc(byte[] bArr, int i, int i2) {
        return zza(0, bArr, i, i2) == 0;
    }
}
