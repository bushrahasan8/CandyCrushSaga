package com.google.android.gms.internal.ads;

/* loaded from: zzach.class */
public final class zzach {
    public static void zza(long j, zzfp zzfpVar, zzaea[] zzaeaVarArr) {
        int zze;
        int i;
        while (zzfpVar.zzb() > 1) {
            int zzc = zzc(zzfpVar);
            int zzc2 = zzc(zzfpVar);
            int zzd = zzfpVar.zzd() + zzc2;
            if (zzc2 == -1 || zzc2 > zzfpVar.zzb()) {
                zzff.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zze = zzfpVar.zze();
            } else {
                zze = zzd;
                if (zzc == 4) {
                    zze = zzd;
                    if (zzc2 >= 8) {
                        int zzm = zzfpVar.zzm();
                        int zzq = zzfpVar.zzq();
                        if (zzq == 49) {
                            i = zzfpVar.zzg();
                            zzq = 49;
                        } else {
                            i = 0;
                        }
                        int zzm2 = zzfpVar.zzm();
                        int i2 = zzq;
                        if (zzq == 47) {
                            zzfpVar.zzL(1);
                            i2 = 47;
                        }
                        boolean z = zzm == 181 && (i2 == 49 || i2 == 47) && zzm2 == 3;
                        boolean z2 = z;
                        if (i2 == 49) {
                            z2 = z & (i == 1195456820);
                        }
                        zze = zzd;
                        if (z2) {
                            zzb(j, zzfpVar, zzaeaVarArr);
                            zze = zzd;
                        }
                    }
                }
            }
            zzfpVar.zzK(zze);
        }
    }

    public static void zzb(long j, zzfp zzfpVar, zzaea[] zzaeaVarArr) {
        int zzm = zzfpVar.zzm();
        if ((zzm & 64) != 0) {
            zzfpVar.zzL(1);
            int zzd = zzfpVar.zzd();
            for (zzaea zzaeaVar : zzaeaVarArr) {
                int i = (zzm & 31) * 3;
                zzfpVar.zzK(zzd);
                zzaeaVar.zzr(zzfpVar, i);
                zzek.zzf(j != -9223372036854775807L);
                zzaeaVar.zzt(j, 1, i, 0, null);
            }
        }
    }

    private static int zzc(zzfp zzfpVar) {
        int i = 0;
        while (zzfpVar.zzb() != 0) {
            int zzm = zzfpVar.zzm();
            int i2 = i + zzm;
            i = i2;
            if (zzm != 255) {
                return i2;
            }
        }
        return -1;
    }
}
