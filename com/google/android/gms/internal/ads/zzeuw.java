package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: zzeuw.class */
public final class zzeuw implements zzexp {
    private final Boolean zza;

    public zzeuw(Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Boolean bool = this.zza;
        Bundle bundle = (Bundle) obj;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
