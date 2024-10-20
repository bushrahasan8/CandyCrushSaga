package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: zzgxm.class */
public final class zzgxm implements zzgse {
    private final ThreadLocal zza;
    private final String zzb;
    private final Key zzc;
    private final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public zzgxm(String str, Key key) throws GeneralSecurityException {
        boolean z;
        int i;
        zzgxl zzgxlVar = new zzgxl(this);
        this.zza = zzgxlVar;
        if (!zzgmv.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = str;
        this.zzc = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    z = 4;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        if (!z) {
            i = 20;
        } else if (z) {
            i = 28;
        } else if (z == 2) {
            i = 32;
        } else if (z == 3) {
            i = 48;
        } else {
            if (z != 4) {
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            i = 64;
        }
        this.zzd = i;
        zzgxlVar.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgse
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > this.zzd) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.zza.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.zza.get()).doFinal(), i);
    }
}
