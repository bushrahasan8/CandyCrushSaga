package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: zzkl.class */
abstract class zzkl {
    private static final zzkl zza = new zzko();
    private static final zzkl zzb = new zzkq();

    private zzkl() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzkl zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzkl zzb() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void zza(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j);
}
