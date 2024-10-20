package com.google.android.gms.internal.ads;

/* loaded from: zzajn.class */
public final class zzajn {
    public final boolean zza;
    public final String zzb;
    public final zzadz zzc;
    public final int zzd;
    public final byte[] zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public zzajn(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2;
        int i4;
        zzek.zzd((i == 0) ^ (bArr2 == null));
        this.zza = z;
        this.zzb = str;
        this.zzd = i;
        this.zze = bArr2;
        if (str == null) {
            i4 = 1;
        } else {
            switch (str.hashCode()) {
                case 3046605:
                    if (str.equals("cbc1")) {
                        z2 = 2;
                        break;
                    }
                    z2 = -1;
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        z2 = 3;
                        break;
                    }
                    z2 = -1;
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        z2 = false;
                        break;
                    }
                    z2 = -1;
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        z2 = true;
                        break;
                    }
                    z2 = -1;
                    break;
                default:
                    z2 = -1;
                    break;
            }
            i4 = 1;
            if (z2) {
                i4 = 1;
                if (!z2) {
                    if (z2 == 2 || z2 == 3) {
                        i4 = 2;
                    } else {
                        zzff.zzf("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                        i4 = 1;
                    }
                }
            }
        }
        this.zzc = new zzadz(i4, bArr, i2, i3);
    }
}
