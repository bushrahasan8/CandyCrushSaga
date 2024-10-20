package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: zzajx.class */
final class zzajx {
    private final zzajy zza = new zzajy();
    private final zzfp zzb = new zzfp(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    private final int zzf(int i) {
        int i2;
        int i3;
        int i4 = 0;
        this.zzd = 0;
        do {
            int i5 = this.zzd;
            int i6 = i + i5;
            zzajy zzajyVar = this.zza;
            i2 = i4;
            if (i6 >= zzajyVar.zzc) {
                break;
            }
            this.zzd = i5 + 1;
            i3 = zzajyVar.zzf[i6];
            i2 = i4 + i3;
            i4 = i2;
        } while (i3 == 255);
        return i2;
    }

    public final zzfp zza() {
        return this.zzb;
    }

    public final zzajy zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzH(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzfp zzfpVar = this.zzb;
        if (zzfpVar.zzM().length == 65025) {
            return;
        }
        zzfpVar.zzI(Arrays.copyOf(zzfpVar.zzM(), Math.max(65025, zzfpVar.zze())), this.zzb.zze());
    }

    public final boolean zze(zzacv zzacvVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zzH(0);
        }
        while (true) {
            boolean z = true;
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            int i2 = i;
            if (i < 0) {
                if (!this.zza.zzc(zzacvVar, -1L) || !this.zza.zzb(zzacvVar, true)) {
                    return false;
                }
                zzajy zzajyVar = this.zza;
                int i3 = zzajyVar.zzd;
                if ((zzajyVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    i3 += zzf(0);
                    i2 = this.zzd;
                } else {
                    i2 = 0;
                }
                if (!zzacy.zze(zzacvVar, i3)) {
                    return false;
                }
                this.zzc = i2;
            }
            int zzf = zzf(i2);
            int i4 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzfp zzfpVar = this.zzb;
                zzfpVar.zzE(zzfpVar.zze() + zzf);
                zzfp zzfpVar2 = this.zzb;
                if (!zzacy.zzd(zzacvVar, zzfpVar2.zzM(), zzfpVar2.zze(), zzf)) {
                    return false;
                }
                zzfp zzfpVar3 = this.zzb;
                zzfpVar3.zzJ(zzfpVar3.zze() + zzf);
                if (this.zza.zzf[i4 - 1] == 255) {
                    z = false;
                }
                this.zze = z;
            }
            int i5 = i4;
            if (i4 == this.zza.zzc) {
                i5 = -1;
            }
            this.zzc = i5;
        }
    }
}
