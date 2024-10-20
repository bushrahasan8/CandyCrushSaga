package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzgne.class */
public final class zzgne extends zzgnh {
    final zzgnf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgne(zzgxq zzgxqVar, Class cls, zzgnf zzgnfVar) {
        super(zzgxqVar, cls, null);
        this.zza = zzgnfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgnh
    public final zzggc zza(zzgpc zzgpcVar, zzghc zzghcVar) throws GeneralSecurityException {
        return this.zza.zza(zzgpcVar, zzghcVar);
    }
}
