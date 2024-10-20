package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: zzuh.class */
final class zzuh implements zzgw {
    private final zzgw zza;
    private final int zzb;
    private final zzug zzc;
    private final byte[] zzd;
    private int zze;

    public zzuh(zzgw zzgwVar, int i, zzug zzugVar) {
        zzek.zzd(i > 0);
        this.zza = zzgwVar;
        this.zzb = i;
        this.zzc = zzugVar;
        this.zzd = new byte[1];
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zze;
        int i4 = i3;
        if (i3 == 0) {
            int i5 = 0;
            if (this.zza.zza(this.zzd, 0, 1) == -1) {
                return -1;
            }
            int i6 = (this.zzd[0] & 255) << 4;
            if (i6 != 0) {
                byte[] bArr2 = new byte[i6];
                int i7 = i6;
                while (true) {
                    int i8 = i7;
                    int i9 = i6;
                    if (i8 > 0) {
                        int zza = this.zza.zza(bArr2, i5, i8);
                        if (zza == -1) {
                            return -1;
                        }
                        i5 += zza;
                        i7 = i8 - zza;
                    } else {
                        while (i9 > 0) {
                            int i10 = i9 - 1;
                            if (bArr2[i10] != 0) {
                                break;
                            }
                            i9 = i10;
                        }
                        if (i9 > 0) {
                            this.zzc.zza(new zzfp(bArr2, i9));
                        }
                    }
                }
            }
            i4 = this.zzb;
            this.zze = i4;
        }
        int zza2 = this.zza.zza(bArr, i, Math.min(i4, i2));
        if (zza2 != -1) {
            this.zze -= zza2;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final long zzb(zzhb zzhbVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzf(zzhy zzhyVar) {
        zzhyVar.getClass();
        this.zza.zzf(zzhyVar);
    }
}
