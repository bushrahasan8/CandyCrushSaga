package com.google.android.gms.internal.ads;

/* loaded from: zzhhs.class */
public final class zzhhs implements zzhhm {
    private static final Object zza = new Object();
    private volatile zzhhm zzb;
    private volatile Object zzc = zza;

    private zzhhs(zzhhm zzhhmVar) {
        this.zzb = zzhhmVar;
    }

    public static zzhhm zza(zzhhm zzhhmVar) {
        return ((zzhhmVar instanceof zzhhs) || (zzhhmVar instanceof zzhhc)) ? zzhhmVar : new zzhhs(zzhhmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final Object zzb() {
        Object obj = this.zzc;
        Object obj2 = obj;
        if (obj == zza) {
            zzhhm zzhhmVar = this.zzb;
            if (zzhhmVar == null) {
                obj2 = this.zzc;
            } else {
                obj2 = zzhhmVar.zzb();
                this.zzc = obj2;
                this.zzb = null;
            }
        }
        return obj2;
    }
}
