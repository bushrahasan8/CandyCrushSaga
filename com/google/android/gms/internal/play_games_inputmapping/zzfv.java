package com.google.android.gms.internal.play_games_inputmapping;

/* loaded from: zzfv.class */
final class zzfv implements zzgc {
    private final zzgc[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfv(zzgc... zzgcVarArr) {
        this.zza = zzgcVarArr;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgc
    public final boolean zzb(Class cls) {
        zzgc[] zzgcVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzgcVarArr[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgc
    public final zzgb zzc(Class cls) {
        zzgc[] zzgcVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzgc zzgcVar = zzgcVarArr[i];
            if (zzgcVar.zzb(cls)) {
                return zzgcVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
