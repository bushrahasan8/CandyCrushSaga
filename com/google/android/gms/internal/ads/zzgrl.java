package com.google.android.gms.internal.ads;

/* loaded from: zzgrl.class */
public final class zzgrl {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 16) {
                bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
                return bArr2;
            }
            int i3 = i2 + 1;
            byte b = bArr[i2];
            byte b2 = (byte) ((b + b) & 254);
            bArr2[i2] = b2;
            if (i2 < 15) {
                bArr2[i2] = (byte) (((bArr[i3] >> 7) & 1) | b2);
            }
            i = i3;
        }
    }
}
