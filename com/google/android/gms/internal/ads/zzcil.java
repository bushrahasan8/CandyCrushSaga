package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: zzcil.class */
final class zzcil implements zzgw {
    private final zzgw zza;
    private final long zzb;
    private final zzgw zzc;
    private long zzd;
    private Uri zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcil(zzgw zzgwVar, int i, zzgw zzgwVar2) {
        this.zza = zzgwVar;
        this.zzb = i;
        this.zzc = zzgwVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            i3 = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            j = this.zzd + i3;
            this.zzd = j;
        } else {
            i3 = 0;
        }
        int i4 = i3;
        if (j >= this.zzb) {
            int zza = this.zzc.zza(bArr, i + i3, i2 - i3);
            i4 = i3 + zza;
            this.zzd += zza;
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final long zzb(zzhb zzhbVar) throws IOException {
        zzhb zzhbVar2;
        this.zze = zzhbVar.zza;
        long j = this.zzb;
        long j2 = zzhbVar.zzf;
        zzhb zzhbVar3 = null;
        if (j2 >= j) {
            zzhbVar2 = null;
        } else {
            long j3 = zzhbVar.zzg;
            long j4 = j - j2;
            long j5 = j4;
            if (j3 != -1) {
                j5 = Math.min(j3, j4);
            }
            zzhbVar2 = new zzhb(zzhbVar.zza, null, j2, j2, j5, null, 0);
        }
        long j6 = zzhbVar.zzg;
        if (j6 == -1 || zzhbVar.zzf + j6 > this.zzb) {
            long max = Math.max(this.zzb, zzhbVar.zzf);
            long j7 = zzhbVar.zzg;
            zzhbVar3 = new zzhb(zzhbVar.zza, null, max, max, j7 != -1 ? Math.min(j7, (zzhbVar.zzf + j7) - this.zzb) : -1L, null, 0);
        }
        long j8 = 0;
        long zzb = zzhbVar2 != null ? this.zza.zzb(zzhbVar2) : 0L;
        if (zzhbVar3 != null) {
            j8 = this.zzc.zzb(zzhbVar3);
        }
        this.zzd = zzhbVar.zzf;
        if (zzb == -1 || j8 == -1) {
            return -1L;
        }
        return zzb + j8;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Map zze() {
        return zzgad.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzf(zzhy zzhyVar) {
    }
}
