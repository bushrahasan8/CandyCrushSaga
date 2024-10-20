package com.google.android.gms.internal.ads;

/* loaded from: zzaip.class */
final class zzaip {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzfp zzf;
    private final zzfp zzg;
    private int zzh;
    private int zzi;

    public zzaip(zzfp zzfpVar, zzfp zzfpVar2, boolean z) throws zzcc {
        this.zzg = zzfpVar;
        this.zzf = zzfpVar2;
        this.zze = z;
        zzfpVar2.zzK(12);
        this.zza = zzfpVar2.zzp();
        zzfpVar.zzK(12);
        this.zzi = zzfpVar.zzp();
        zzacy.zzb(zzfpVar.zzg() != 1 ? false : true, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzv() : this.zzf.zzu();
        if (this.zzb != this.zzh) {
            return true;
        }
        this.zzc = this.zzg.zzp();
        this.zzg.zzL(4);
        int i2 = -1;
        int i3 = this.zzi - 1;
        this.zzi = i3;
        if (i3 > 0) {
            i2 = (-1) + this.zzg.zzp();
        }
        this.zzh = i2;
        return true;
    }
}
