package com.google.android.gms.internal.ads;

/* loaded from: zzyp.class */
public final class zzyp {
    public final int zza;
    public final zzmi[] zzb;
    public final zzyi[] zzc;
    public final zzdk zzd;
    public final Object zze;

    public zzyp(zzmi[] zzmiVarArr, zzyi[] zzyiVarArr, zzdk zzdkVar, Object obj) {
        this.zzb = zzmiVarArr;
        this.zzc = (zzyi[]) zzyiVarArr.clone();
        this.zzd = zzdkVar;
        this.zze = obj;
        this.zza = zzmiVarArr.length;
    }

    public final boolean zza(zzyp zzypVar, int i) {
        return zzypVar != null && zzfy.zzF(this.zzb[i], zzypVar.zzb[i]) && zzfy.zzF(this.zzc[i], zzypVar.zzc[i]);
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}
