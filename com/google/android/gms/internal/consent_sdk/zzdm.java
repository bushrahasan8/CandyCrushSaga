package com.google.android.gms.internal.consent_sdk;

/* loaded from: zzdm.class */
public final class zzdm implements zzdq {
    private static final Object zza = new Object();
    private volatile zzdq zzb;
    private volatile Object zzc = zza;

    private zzdm(zzdq zzdqVar) {
        this.zzb = zzdqVar;
    }

    public static zzdq zzb(zzdq zzdqVar) {
        return zzdqVar instanceof zzdm ? zzdqVar : new zzdm(zzdqVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        Object obj = this.zzc;
        Object obj2 = zza;
        Object obj3 = obj;
        if (obj == obj2) {
            synchronized (this) {
                Object obj4 = this.zzc;
                obj3 = obj4;
                if (obj4 == obj2) {
                    obj3 = this.zzb.zza();
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
