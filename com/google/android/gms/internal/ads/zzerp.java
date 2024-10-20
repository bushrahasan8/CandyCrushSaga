package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: zzerp.class */
public final class zzerp implements zzexp {
    private final String zza;

    public zzerp(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        String str = this.zza;
        Bundle bundle = (Bundle) obj;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
