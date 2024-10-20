package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: zzeuo.class */
public final class zzeuo implements zzexp {
    public final String zza;
    public final boolean zzb;

    public zzeuo(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString("de", "1");
        }
    }
}
