package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: MurmurHash3.class */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(byte[] bArr, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        while (true) {
            i4 = (i2 & (-4)) + i;
            if (i5 >= i4) {
                break;
            }
            int i6 = ((bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | (bArr[i5 + 3] << 24)) * (-862048943);
            int i7 = i3 ^ (((i6 >>> 17) | (i6 << 15)) * 461845907);
            i3 = (((i7 >>> 19) | (i7 << 13)) * 5) - 430675100;
            i5 += 4;
        }
        int i8 = i2 & 3;
        int i9 = 0;
        if (i8 != 1) {
            int i10 = 0;
            if (i8 != 2) {
                if (i8 == 3) {
                    i10 = (bArr[i4 + 2] & 255) << 16;
                }
                int i11 = i3 ^ i2;
                int i12 = (i11 ^ (i11 >>> 16)) * (-2048144789);
                int i13 = (i12 ^ (i12 >>> 13)) * (-1028477387);
                return i13 ^ (i13 >>> 16);
            }
            i9 = i10 | ((bArr[i4 + 1] & 255) << 8);
        }
        int i14 = ((bArr[i4] & 255) | i9) * (-862048943);
        i3 ^= ((i14 >>> 17) | (i14 << 15)) * 461845907;
        int i112 = i3 ^ i2;
        int i122 = (i112 ^ (i112 >>> 16)) * (-2048144789);
        int i132 = (i122 ^ (i122 >>> 13)) * (-1028477387);
        return i132 ^ (i132 >>> 16);
    }
}
