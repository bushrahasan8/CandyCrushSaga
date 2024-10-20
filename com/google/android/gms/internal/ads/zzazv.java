package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.MurmurHash3;
import java.io.UnsupportedEncodingException;

/* loaded from: zzazv.class */
public final class zzazv {
    public static int zza(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            bytes = str.getBytes();
        }
        return MurmurHash3.murmurhash3_x86_32(bytes, 0, bytes.length, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x016a, code lost:
    
        if (true != r12) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016d, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016f, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0193, code lost:
    
        if (true != r12) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String[] zzb(java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazv.zzb(java.lang.String, boolean):java.lang.String[]");
    }
}
