package com.google.android.gms.internal.play_billing;

/* loaded from: zzdo.class */
final class zzdo extends zzdq {
    private zzdo() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdo(zzdn zzdnVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzdq
    public final void zza(Object obj, long j) {
        ((zzcz) zzfp.zzf(obj, j)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzdq
    public final void zzb(Object obj, Object obj2, long j) {
        zzcz zzczVar = (zzcz) zzfp.zzf(obj, j);
        zzcz zzczVar2 = (zzcz) zzfp.zzf(obj2, j);
        int size = zzczVar.size();
        int size2 = zzczVar2.size();
        zzcz zzczVar3 = zzczVar;
        if (size > 0) {
            zzczVar3 = zzczVar;
            if (size2 > 0) {
                zzczVar3 = zzczVar;
                if (!zzczVar.zzc()) {
                    zzczVar3 = zzczVar.zzd(size2 + size);
                }
                zzczVar3.addAll(zzczVar2);
            }
        }
        if (size <= 0) {
            zzczVar3 = zzczVar2;
        }
        zzfp.zzs(obj, j, zzczVar3);
    }
}
