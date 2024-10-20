package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: zzbaa.class */
public final class zzbaa extends zzazr {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzbaa(int i) {
        int i2 = i >> 3;
        this.zzc = (i & 7) > 0 ? i2 + 1 : i2;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzazr
    public final byte[] zzb(String str) {
        synchronized (this.zza) {
            MessageDigest zza = zza();
            this.zzb = zza;
            if (zza == null) {
                return new byte[0];
            }
            zza.reset();
            this.zzb.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] digest = this.zzb.digest();
            int length = digest.length;
            int i = this.zzc;
            int i2 = length;
            if (length > i) {
                i2 = i;
            }
            byte[] bArr = new byte[i2];
            System.arraycopy(digest, 0, bArr, 0, i2);
            if ((this.zzd & 7) > 0) {
                long j = 0;
                for (int i3 = 0; i3 < i2; i3++) {
                    long j2 = j;
                    if (i3 > 0) {
                        j2 = j << 8;
                    }
                    j = j2 + (bArr[i3] & 255);
                }
                long j3 = j >>> (8 - (this.zzd & 7));
                int i4 = this.zzc;
                while (true) {
                    i4--;
                    if (i4 < 0) {
                        break;
                    }
                    bArr[i4] = (byte) (255 & j3);
                    j3 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
