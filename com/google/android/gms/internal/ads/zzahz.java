package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: zzahz.class */
final class zzahz {
    private final zzfp zza = new zzfp(8);
    private int zzb;

    private final long zzb(zzacv zzacvVar) throws IOException {
        int i;
        int i2;
        zzack zzackVar = (zzack) zzacvVar;
        int i3 = 0;
        zzackVar.zzm(this.zza.zzM(), 0, 1, false);
        int i4 = this.zza.zzM()[0] & 255;
        if (i4 == 0) {
            return Long.MIN_VALUE;
        }
        int i5 = 128;
        int i6 = 0;
        while (true) {
            i = i6;
            i2 = i + 1;
            if ((i4 & i5) != 0) {
                break;
            }
            i5 >>= 1;
            i6 = i2;
        }
        int i7 = i4 & (i5 ^ (-1));
        zzackVar.zzm(this.zza.zzM(), 1, i, false);
        while (i3 < i) {
            i3++;
            i7 = (this.zza.zzM()[i3] & 255) + (i7 << 8);
        }
        this.zzb += i2;
        return i7;
    }

    public final boolean zza(zzacv zzacvVar) throws IOException {
        long zzd = zzacvVar.zzd();
        long j = 1024;
        if (zzd != -1) {
            j = zzd > 1024 ? 1024L : zzd;
        }
        zzack zzackVar = (zzack) zzacvVar;
        zzackVar.zzm(this.zza.zzM(), 0, 4, false);
        long zzu = this.zza.zzu();
        this.zzb = 4;
        while (zzu != 440786851) {
            int i = (int) j;
            int i2 = this.zzb + 1;
            this.zzb = i2;
            if (i2 == i) {
                return false;
            }
            zzackVar.zzm(this.zza.zzM(), 0, 1, false);
            zzu = ((zzu << 8) & (-256)) | (this.zza.zzM()[0] & 255);
        }
        long zzb = zzb(zzacvVar);
        long j2 = this.zzb;
        if (zzb == Long.MIN_VALUE) {
            return false;
        }
        long j3 = j2 + zzb;
        if (zzd != -1 && j3 >= zzd) {
            return false;
        }
        while (true) {
            long j4 = this.zzb;
            if (j4 >= j3) {
                return j4 == j3;
            }
            if (zzb(zzacvVar) == Long.MIN_VALUE) {
                return false;
            }
            long zzb2 = zzb(zzacvVar);
            if (zzb2 < 0) {
                return false;
            }
            if (zzb2 != 0) {
                int i3 = (int) zzb2;
                zzackVar.zzl(i3, false);
                this.zzb += i3;
            }
        }
    }
}
