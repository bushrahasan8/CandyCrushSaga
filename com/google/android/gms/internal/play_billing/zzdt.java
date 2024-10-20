package com.google.android.gms.internal.play_billing;

/* loaded from: zzdt.class */
final class zzdt implements zzea {
    private final zzea[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdt(zzea... zzeaVarArr) {
        this.zza = zzeaVarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzea
    public final zzdz zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzea zzeaVar = this.zza[i];
            if (zzeaVar.zzc(cls)) {
                return zzeaVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.zzea
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
