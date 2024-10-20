package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: d.class */
public class d {
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4581(byte[] bArr, byte b, long j) {
        for (int i = 0; i < bArr.length; i++) {
            if (((1 << i) & j) != 0) {
                bArr[i] = (byte) (bArr[i] ^ b);
            }
        }
    }
}
