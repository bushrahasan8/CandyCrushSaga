package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* loaded from: zzale.class */
final class zzale {
    private final zzfp zza = new zzfp();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(zzale zzaleVar, zzfp zzfpVar, int i) {
        int zzo;
        if (i < 4) {
            return;
        }
        zzfpVar.zzL(3);
        int i2 = i - 4;
        int i3 = i2;
        if ((zzfpVar.zzm() & 128) != 0) {
            if (i2 < 7 || (zzo = zzfpVar.zzo()) < 4) {
                return;
            }
            zzaleVar.zzh = zzfpVar.zzq();
            zzaleVar.zzi = zzfpVar.zzq();
            zzaleVar.zza.zzH(zzo - 4);
            i3 = i - 11;
        }
        zzfp zzfpVar2 = zzaleVar.zza;
        int zzd = zzfpVar2.zzd();
        int zze = zzfpVar2.zze();
        if (zzd >= zze || i3 <= 0) {
            return;
        }
        int min = Math.min(i3, zze - zzd);
        zzfpVar.zzG(zzfpVar2.zzM(), zzd, min);
        zzaleVar.zza.zzK(zzd + min);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(zzale zzaleVar, zzfp zzfpVar, int i) {
        if (i < 19) {
            return;
        }
        zzaleVar.zzd = zzfpVar.zzq();
        zzaleVar.zze = zzfpVar.zzq();
        zzfpVar.zzL(11);
        zzaleVar.zzf = zzfpVar.zzq();
        zzaleVar.zzg = zzfpVar.zzq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzd(zzale zzaleVar, zzfp zzfpVar, int i) {
        if (i % 5 != 2) {
            return;
        }
        zzfpVar.zzL(2);
        Arrays.fill(zzaleVar.zzb, 0);
        int i2 = i / 5;
        for (int i3 = 0; i3 < i2; i3++) {
            int zzm = zzfpVar.zzm();
            int zzm2 = zzfpVar.zzm();
            int zzm3 = zzfpVar.zzm();
            int zzm4 = zzfpVar.zzm();
            int zzm5 = zzfpVar.zzm();
            double d = zzm2;
            int[] iArr = zzaleVar.zzb;
            double d2 = zzm3 - 128;
            int max = Math.max(0, Math.min((int) ((1.402d * d2) + d), 255));
            double d3 = zzm4 - 128;
            iArr[zzm] = Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)) | (zzm5 << 24) | (max << 16) | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8);
        }
        zzaleVar.zzc = true;
    }

    public final zzec zza() {
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzfp zzfpVar = this.zza;
        if (zzfpVar.zze() == 0 || zzfpVar.zzd() != zzfpVar.zze() || !this.zzc) {
            return null;
        }
        zzfpVar.zzK(0);
        int i = this.zzh * this.zzi;
        int[] iArr = new int[i];
        int i2 = 0;
        while (i2 < i) {
            int zzm = this.zza.zzm();
            if (zzm != 0) {
                iArr[i2] = this.zzb[zzm];
                i2++;
            } else {
                int zzm2 = this.zza.zzm();
                if (zzm2 != 0) {
                    int i3 = zzm2 & 63;
                    int i4 = i3;
                    if ((zzm2 & 64) != 0) {
                        i4 = (i3 << 8) | this.zza.zzm();
                    }
                    int i5 = (zzm2 & 128) == 0 ? 0 : this.zzb[this.zza.zzm()];
                    int i6 = i4 + i2;
                    Arrays.fill(iArr, i2, i6, i5);
                    i2 = i6;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzea zzeaVar = new zzea();
        zzeaVar.zzc(createBitmap);
        zzeaVar.zzh(this.zzf / this.zzd);
        zzeaVar.zzi(0);
        zzeaVar.zze(this.zzg / this.zze, 0);
        zzeaVar.zzf(0);
        zzeaVar.zzk(this.zzh / this.zzd);
        zzeaVar.zzd(this.zzi / this.zze);
        return zzeaVar.zzp();
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzH(0);
        this.zzc = false;
    }
}
