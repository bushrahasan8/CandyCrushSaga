package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.t2;

/* loaded from: zzerd.class */
public final class zzerd implements zzexp {
    private final boolean zza;

    public zzerd(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.zza ? t2.h : "1");
    }
}
