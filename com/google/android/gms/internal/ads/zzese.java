package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: zzese.class */
public final class zzese implements zzexp {
    private final Bundle zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzese(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zza.isEmpty()) {
            return;
        }
        bundle.putBundle("installed_adapter_data", this.zza);
    }
}
