package com.google.android.gms.internal.measurement;

/* loaded from: zzkv.class */
final class zzkv implements zzld {
    private zzld[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkv(zzld... zzldVarArr) {
        this.zza = zzldVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final zzle zza(Class<?> cls) {
        for (zzld zzldVar : this.zza) {
            if (zzldVar.zzb(cls)) {
                return zzldVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final boolean zzb(Class<?> cls) {
        for (zzld zzldVar : this.zza) {
            if (zzldVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
