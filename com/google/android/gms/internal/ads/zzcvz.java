package com.google.android.gms.internal.ads;

/* loaded from: zzcvz.class */
public final class zzcvz {
    private final zzddm zza;
    private final zzdft zzb;

    public zzcvz(zzddm zzddmVar, zzdft zzdftVar) {
        this.zza = zzddmVar;
        this.zzb = zzdftVar;
    }

    public final zzddm zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdft zzb() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdim zzc() {
        zzdft zzdftVar = this.zzb;
        return zzdftVar != null ? new zzdim(zzdftVar, zzcep.zzf) : new zzdim(new zzcvy(this), zzcep.zzf);
    }
}
