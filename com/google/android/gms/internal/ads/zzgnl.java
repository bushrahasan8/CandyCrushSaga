package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: zzgnl.class */
public abstract class zzgnl {
    private final Class zza;
    private final Class zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgnl(Class cls, Class cls2, zzgnk zzgnkVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgnl zzb(zzgnj zzgnjVar, Class cls, Class cls2) {
        return new zzgni(cls, cls2, zzgnjVar);
    }

    public abstract zzgpc zza(zzggc zzggcVar, zzghc zzghcVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
