package com.google.android.gms.internal.ads;

/* loaded from: zzhhc.class */
public final class zzhhc implements zzhhm, zzhgx {
    private static final Object zza = new Object();
    private volatile zzhhm zzb;
    private volatile Object zzc = zza;

    private zzhhc(zzhhm zzhhmVar) {
        this.zzb = zzhhmVar;
    }

    public static zzhgx zza(zzhhm zzhhmVar) {
        return zzhhmVar instanceof zzhgx ? (zzhgx) zzhhmVar : new zzhhc(zzhhmVar);
    }

    public static zzhhm zzc(zzhhm zzhhmVar) {
        return zzhhmVar instanceof zzhhc ? zzhhmVar : new zzhhc(zzhhmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final Object zzb() {
        Object obj = this.zzc;
        Object obj2 = zza;
        Object obj3 = obj;
        if (obj == obj2) {
            synchronized (this) {
                Object obj4 = this.zzc;
                obj3 = obj4;
                if (obj4 == obj2) {
                    obj3 = this.zzb.zzb();
                    Object obj5 = this.zzc;
                    if (obj5 != obj2 && obj5 != obj3) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj5 + " & " + obj3 + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = obj3;
                    this.zzb = null;
                }
            }
        }
        return obj3;
    }
}
