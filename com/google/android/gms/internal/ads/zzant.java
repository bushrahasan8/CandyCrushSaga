package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: zzant.class */
final class zzant {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfw zza = new zzfw(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfp zzb = new zzfp();

    public static long zzc(zzfp zzfpVar) {
        int zzd = zzfpVar.zzd();
        if (zzfpVar.zzb() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzfpVar.zzG(bArr, 0, 9);
        zzfpVar.zzK(zzd);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = bArr[1];
        long j3 = b2;
        return ((j3 & 3) << 13) | ((j2 & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (((248 & j3) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
    }

    private final int zzf(zzacv zzacvVar) {
        byte[] bArr = zzfy.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
        this.zzc = true;
        zzacvVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(zzacv zzacvVar, zzadr zzadrVar) throws IOException {
        long j;
        long j2;
        int i = 1;
        if (!this.zze) {
            long zzd = zzacvVar.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j3 = zzd - min;
            if (zzacvVar.zzf() != j3) {
                zzadrVar.zza = j3;
            } else {
                this.zzb.zzH(min);
                zzacvVar.zzj();
                ((zzack) zzacvVar).zzm(this.zzb.zzM(), 0, min, false);
                zzfp zzfpVar = this.zzb;
                int zzd2 = zzfpVar.zzd();
                int zze = zzfpVar.zze() - 4;
                while (true) {
                    j2 = -9223372036854775807L;
                    if (zze < zzd2) {
                        break;
                    }
                    if (zzg(zzfpVar.zzM(), zze) == 442) {
                        zzfpVar.zzK(zze + 4);
                        j2 = zzc(zzfpVar);
                        if (j2 != -9223372036854775807L) {
                            break;
                        }
                    }
                    zze--;
                }
                this.zzg = j2;
                this.zze = true;
                i = 0;
            }
        } else {
            if (this.zzg == -9223372036854775807L) {
                zzf(zzacvVar);
                return 0;
            }
            if (this.zzd) {
                long j4 = this.zzf;
                if (j4 == -9223372036854775807L) {
                    zzf(zzacvVar);
                    return 0;
                }
                zzfw zzfwVar = this.zza;
                this.zzh = zzfwVar.zzc(this.zzg) - zzfwVar.zzb(j4);
                zzf(zzacvVar);
                return 0;
            }
            int min2 = (int) Math.min(20000L, zzacvVar.zzd());
            if (zzacvVar.zzf() != 0) {
                zzadrVar.zza = 0L;
            } else {
                this.zzb.zzH(min2);
                zzacvVar.zzj();
                ((zzack) zzacvVar).zzm(this.zzb.zzM(), 0, min2, false);
                zzfp zzfpVar2 = this.zzb;
                int zzd3 = zzfpVar2.zzd();
                int zze2 = zzfpVar2.zze();
                while (true) {
                    j = -9223372036854775807L;
                    if (zzd3 >= zze2 - 3) {
                        break;
                    }
                    if (zzg(zzfpVar2.zzM(), zzd3) == 442) {
                        zzfpVar2.zzK(zzd3 + 4);
                        j = zzc(zzfpVar2);
                        if (j != -9223372036854775807L) {
                            break;
                        }
                    }
                    zzd3++;
                }
                this.zzf = j;
                this.zzd = true;
                i = 0;
            }
        }
        return i;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfw zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
