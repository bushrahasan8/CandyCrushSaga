package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: zzeuk.class */
public final class zzeuk implements zzexp {
    public final Bundle zza;

    public zzeuk(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        ((Bundle) obj).putBundle("content_info", this.zza);
    }
}
