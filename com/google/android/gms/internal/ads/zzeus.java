package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: zzeus.class */
public final class zzeus implements zzexp {
    private final boolean zza;

    public zzeus(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.zza);
    }
}
