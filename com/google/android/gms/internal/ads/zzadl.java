package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: zzadl.class */
public final class zzadl {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final String zzi;

    private zzadl(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = f;
        this.zzi = str;
    }

    public static zzadl zza(zzfp zzfpVar) throws zzcc {
        try {
            zzfpVar.zzL(21);
            int zzm = zzfpVar.zzm();
            int zzm2 = zzfpVar.zzm();
            int zzd = zzfpVar.zzd();
            int i = 0;
            for (int i2 = 0; i2 < zzm2; i2++) {
                zzfpVar.zzL(1);
                int zzq = zzfpVar.zzq();
                for (int i3 = 0; i3 < zzq; i3++) {
                    int zzq2 = zzfpVar.zzq();
                    i += zzq2 + 4;
                    zzfpVar.zzL(zzq2);
                }
            }
            zzfpVar.zzK(zzd);
            byte[] bArr = new byte[i];
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            String str = null;
            float f = 1.0f;
            int i10 = 0;
            int i11 = -1;
            int i12 = 0;
            while (i12 < zzm2) {
                int zzm3 = zzfpVar.zzm() & 63;
                int zzq3 = zzfpVar.zzq();
                int i13 = i8;
                int i14 = i7;
                int i15 = i6;
                int i16 = 0;
                while (i16 < zzq3) {
                    int zzq4 = zzfpVar.zzq();
                    System.arraycopy(zzgm.zza, 0, bArr, i10, 4);
                    int i17 = i10 + 4;
                    System.arraycopy(zzfpVar.zzM(), zzfpVar.zzd(), bArr, i17, zzq4);
                    int i18 = i17 + zzq4;
                    if (zzm3 == 33 && i16 == 0) {
                        zzgj zzc = zzgm.zzc(bArr, i10 + 6, i18);
                        i4 = zzc.zzi;
                        i5 = zzc.zzj;
                        i15 = zzc.zze + 8;
                        i11 = zzc.zzf + 8;
                        i14 = zzc.zzl;
                        i13 = zzc.zzm;
                        i9 = zzc.zzn;
                        f = zzc.zzk;
                        str = zzem.zzb(zzc.zza, zzc.zzb, zzc.zzc, zzc.zzd, zzc.zzg, zzc.zzh);
                        i16 = 0;
                    }
                    zzfpVar.zzL(zzq4);
                    i16++;
                    i10 = i18;
                }
                i12++;
                i6 = i15;
                i7 = i14;
                i8 = i13;
            }
            return new zzadl(i == 0 ? Collections.emptyList() : Collections.singletonList(bArr), (zzm & 3) + 1, i4, i5, i6, i11, i7, i8, i9, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzcc.zza("Error parsing HEVC config", e);
        }
    }
}
