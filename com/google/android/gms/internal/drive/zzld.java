package com.google.android.gms.internal.drive;

/* loaded from: zzld.class */
final class zzld extends zzla {
    private zzld() {
        super();
    }

    private static <E> zzkp<E> zzc(Object obj, long j) {
        return (zzkp) zznd.zzo(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.drive.zzla
    public final void zza(Object obj, long j) {
        zzc(obj, j).zzbp();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.drive.zzla
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzkp zzc = zzc(obj, j);
        zzkp zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        zzkp zzkpVar = zzc;
        if (size > 0) {
            zzkpVar = zzc;
            if (size2 > 0) {
                zzkpVar = zzc;
                if (!zzc.zzbo()) {
                    zzkpVar = zzc.zzr(size2 + size);
                }
                zzkpVar.addAll(zzc2);
            }
        }
        zzkp zzkpVar2 = zzc2;
        if (size > 0) {
            zzkpVar2 = zzkpVar;
        }
        zznd.zza(obj, j, zzkpVar2);
    }
}
