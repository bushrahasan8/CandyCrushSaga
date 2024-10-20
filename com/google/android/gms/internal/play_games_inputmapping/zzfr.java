package com.google.android.gms.internal.play_games_inputmapping;

/* loaded from: zzfr.class */
final class zzfr extends zzfs {
    private zzfr() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfr(byte[] bArr) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfs
    public final void zza(Object obj, long j) {
        ((zzfh) zzhn.zzn(obj, j)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfs
    public final void zzb(Object obj, Object obj2, long j) {
        zzfh zzfhVar = (zzfh) zzhn.zzn(obj, j);
        zzfh zzfhVar2 = (zzfh) zzhn.zzn(obj2, j);
        int size = zzfhVar.size();
        int size2 = zzfhVar2.size();
        zzfh zzfhVar3 = zzfhVar;
        if (size > 0) {
            zzfhVar3 = zzfhVar;
            if (size2 > 0) {
                zzfhVar3 = zzfhVar;
                if (!zzfhVar.zza()) {
                    zzfhVar3 = zzfhVar.zzh(size2 + size);
                }
                zzfhVar3.addAll(zzfhVar2);
            }
        }
        if (size <= 0) {
            zzfhVar3 = zzfhVar2;
        }
        zzhn.zzo(obj, j, zzfhVar3);
    }
}
