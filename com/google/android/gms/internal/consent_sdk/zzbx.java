package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: zzbx.class */
public final class zzbx implements zzdn {
    private final zzdr zza;

    public zzbx(zzdr zzdrVar) {
        this.zza = zzdrVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdr
    public final /* bridge */ /* synthetic */ Object zza() {
        return new zzbw((Application) this.zza.zza());
    }
}
