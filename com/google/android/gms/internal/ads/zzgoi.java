package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: zzgoi.class */
public abstract class zzgoi {
    private final zzgxq zza;
    private final Class zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgoi(zzgxq zzgxqVar, Class cls, zzgoh zzgohVar) {
        this.zza = zzgxqVar;
        this.zzb = cls;
    }

    public static zzgoi zzb(zzgog zzgogVar, zzgxq zzgxqVar, Class cls) {
        return new zzgof(zzgxqVar, cls, zzgogVar);
    }

    public abstract zzggq zza(zzgpc zzgpcVar) throws GeneralSecurityException;

    public final zzgxq zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
