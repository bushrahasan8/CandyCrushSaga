package com.google.android.gms.internal.ads;

/* loaded from: zzkx.class */
public final class zzkx {
    public zzly zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public int zzf;
    private boolean zzg;

    public zzkx(zzly zzlyVar) {
        this.zza = zzlyVar;
    }

    public final void zza(int i) {
        boolean z = true;
        if (1 != ((this.zzg ? 1 : 0) | i)) {
            z = false;
        }
        this.zzg = z;
        this.zzb += i;
    }

    public final void zzb(int i) {
        this.zzg = true;
        this.zze = true;
        this.zzf = i;
    }

    public final void zzc(zzly zzlyVar) {
        this.zzg |= this.zza != zzlyVar;
        this.zza = zzlyVar;
    }

    public final void zzd(int i) {
        boolean z = true;
        if (!this.zzc || this.zzd == 5) {
            this.zzg = true;
            this.zzc = true;
            this.zzd = i;
        } else {
            if (i != 5) {
                z = false;
            }
            zzek.zzd(z);
        }
    }
}
